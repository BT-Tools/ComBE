package ComBE.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class SpecificationItemSemanticEditPolicy extends ComBE.diagram.edit.policies.ComBEBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SpecificationItemSemanticEditPolicy() {
		super(ComBE.diagram.providers.ComBEElementTypes.Specification_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComBE.diagram.providers.ComBEElementTypes.AlternativeBranch_2001 == req.getElementType()) {
			return getGEFWrapper(new ComBE.diagram.edit.commands.AlternativeBranchCreateCommand(req));
		}
		if (ComBE.diagram.providers.ComBEElementTypes.ParallelBranch_2002 == req.getElementType()) {
			return getGEFWrapper(new ComBE.diagram.edit.commands.ParallelBranchCreateCommand(req));
		}
		if (ComBE.diagram.providers.ComBEElementTypes.AtomicSequence_2003 == req.getElementType()) {
			return getGEFWrapper(new ComBE.diagram.edit.commands.AtomicSequenceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
