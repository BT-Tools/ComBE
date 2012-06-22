package ComBE.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import ComBE.AlternativeBranch;

/**
 * @generated
 */
public class AlternativeBranchCreateCommand extends EditElementCommand {

	/**
	* @generated NOT
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		Resource resource = getElementToEdit().eResource();
		ComBE.AlternativeBranch newElement = ComBE.ComBEFactory.eINSTANCE.createAlternativeBranch();

		// Begin non-generated code
		ComBE.Node newNode = ComBE.ComBEFactory.eINSTANCE.createStandardNode();
		newElement.getNodes().add(newNode);
		// End non-generated code

		resource.getContents().add(newElement);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}
}
