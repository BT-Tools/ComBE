package ComBE.diagram.edit.commands;

/**
 * @generated
 */
public class ParallelBranchCreateCommand extends EditElementCommand {

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		Resource resource = getElementToEdit().eResource();
		ComBE.ParallelBranch newElement = ComBE.ComBEFactory.eINSTANCE
				.createParallelBranch();

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
