package ComBE.diagram.edit.policies;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class StandardNode3ItemSemanticEditPolicy extends ComBE.diagram.edit.policies.ComBEBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StandardNode3ItemSemanticEditPolicy() {
		super(ComBE.diagram.providers.ComBEElementTypes.StandardNode_3005);
	}

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return CustomDestroyElementCommand.getCommand(this, req);
	}
}
