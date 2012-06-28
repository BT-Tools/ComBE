package ComBE.diagram.customCode;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Color;

import ComBE.BehaviorSeq;
import ComBE.BehaviorType;
import ComBE.StandardNode;
import ComBE.TracibilityStatus;

public class CustomPainting {

	/**
	 * Add symbols to BehaviorLabels, depending on the BehaviorType enumeration.
	 * 
	 * This is a bit of a hack and this functionality should actually be added to gmfmap (as label expression).
	 * It should be possible to define this in OCL, but the method 'oclContainer()' is not yet supported which makes it hard.
	 * That's why I put it here.
	 */
	public static void setBehaviorLabel(WrappingLabel label, StandardNode node) {
		if (node.getBehavior() == null) {
			return;
		}
		
		BehaviorSeq behaviorSeq = (BehaviorSeq) node.getBehavior().eContainer();
		
		String prefix = "";
		String suffix = "";
		
		switch (behaviorSeq.getBehaviortype().getValue()) {
		case BehaviorType.ASSERTION_VALUE:
			prefix = "-";
			suffix = "-";
			break;
		case BehaviorType.EI_EVENT_VALUE:
			prefix = "--";
			suffix = "--";
			break;
		case BehaviorType.EO_EVENT_VALUE:
			prefix = "+";
			suffix = "+";
			break;
		case BehaviorType.EVENT_VALUE:
			prefix = "++";
			suffix = "++";
			break;
		case BehaviorType.GUARD_VALUE:
			prefix = "<";
			suffix = ">";
			break;
		case BehaviorType.II_EVENT_VALUE:
			prefix = "<<";
			suffix = ">>";
			break;
		case BehaviorType.IO_EVENT_VALUE:
			prefix = ">";
			suffix = "<";
			break;
		case BehaviorType.SELECTION_VALUE:
			prefix = ">>";
			suffix = "<<";
			break;
		case BehaviorType.STATE_REALISATION_VALUE:
			prefix = "^";
			suffix = "^";
			break;
		default:
			break;
		}
		
		if (! (label.getText().startsWith(prefix) && label.getText().endsWith(suffix))) {
			label.setText(prefix + " " + label.getText() + " " + suffix);
		}
	}
		
	/**
	 * Change color of Nodes, depending on the TracibilityStatus enumeration.
	 * 
	 * Couldn't find a way to model this in gmfgraph. This may not be the nicest solution.
	 */
	public static void setNodeColor(Figure figure, StandardNode node) {
		Color color = null;
		
		switch (node.getTracibilitystatus().getValue()) {
		case TracibilityStatus.DELETED_VALUE:
			color = ColorConstants.blue;
			break;
		case TracibilityStatus.IMPLIED_VALUE:
			color = ColorConstants.yellow;
			break;
		case TracibilityStatus.MISSING_VALUE:
			color = ColorConstants.red;
			break;
		case TracibilityStatus.REFINEMENT_VALUE:
			color = ColorConstants.orange;
			break;
		case TracibilityStatus.UPDATED_VALUE:
			color = ColorConstants.cyan;
			break;
		default:
			color = ColorConstants.green;
			break;
		}
		
		figure.setBackgroundColor(color);
	}
}
