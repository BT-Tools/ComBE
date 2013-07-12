package ComBE.diagram.edit.policies;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Delete parent if the EObject that is to be deleted is the last EObject in the compartment that it resides in.
 * Otherwise, delete the EObject.
 * 
 * @author Oskar van Rest
 */
public class CustomDestroyElementCommand {
	
	public static Command getCommand(ComBEBaseItemSemanticEditPolicy sep, DestroyElementRequest req) {		
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(sep.getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);

		EObject parent = req.getElementToDestroy().eContainer();
		EStructuralFeature eStructuralFeature = req.getElementToDestroy().eContainingFeature();
		int numberOfNodes = ((EList<?>) parent.eGet(eStructuralFeature)).size();
		
		if (numberOfNodes == 1) {
			req.setElementToDestroy(parent);
			cmd.add(new DestroyElementCommand(req));
			cmd.add(new DeleteCommand(sep.getEditingDomain(), (View) sep.getHost().getParent().getParent().getModel()));
		}
		else {
			cmd.add(new DestroyElementCommand(req));
		}
		
		return sep.getGEFWrapper(cmd.reduce());
	}
}
