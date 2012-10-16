package ComBE.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ParallelBranchParallelBranchNodesCompartmentItemSemanticEditPolicy extends ComBE.diagram.edit.policies.ComBEBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ParallelBranchParallelBranchNodesCompartmentItemSemanticEditPolicy() {
		super(ComBE.diagram.providers.ComBEElementTypes.ParallelBranch_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComBE.diagram.providers.ComBEElementTypes.StandardNode_3003 == req.getElementType()) {
			return getGEFWrapper(new ComBE.diagram.edit.commands.StandardNode2CreateCommand(req));
		}
		if (ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3004 == req.getElementType()) {
			return getGEFWrapper(new ComBE.diagram.edit.commands.EmptyNode2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
