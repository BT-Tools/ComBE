package ComBE.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AtomicSequenceAtomicSequenceNodesCompartmentItemSemanticEditPolicy extends ComBE.diagram.edit.policies.ComBEBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AtomicSequenceAtomicSequenceNodesCompartmentItemSemanticEditPolicy() {
		super(ComBE.diagram.providers.ComBEElementTypes.AlternativeBranch_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComBE.diagram.providers.ComBEElementTypes.StandardNode_3001 == req.getElementType()) {
			return getGEFWrapper(new ComBE.diagram.edit.commands.StandardNodeCreateCommand(req));
		}
		if (ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3002 == req.getElementType()) {
			return getGEFWrapper(new ComBE.diagram.edit.commands.EmptyNodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
