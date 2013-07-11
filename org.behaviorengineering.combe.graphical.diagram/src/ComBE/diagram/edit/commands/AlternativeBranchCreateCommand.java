package ComBE.diagram.edit.commands;

/**
 * @generated
 */
public class AlternativeBranchCreateCommand extends EditElementCommand {

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		Resource resource = getElementToEdit().eResource();
		ComBE.AlternativeBranch newElement = ComBE.ComBEFactory.eINSTANCE
				.createAlternativeBranch();

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
