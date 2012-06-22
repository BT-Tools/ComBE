package ComBE.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class StandardNode2ItemSemanticEditPolicy extends ComBE.diagram.edit.policies.ComBEBaseItemSemanticEditPolicy {

	/**
	* @generated NOT
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return CustomDestroyElementCommand.getCommand(this, req);
	}
}
