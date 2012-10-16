package ComBE.diagram.customCode;

import org.eclipse.draw2d.Figure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Color;

import ComBE.BehaviorSeq;
import ComBE.BehaviorType;
import ComBE.StandardNode;
import ComBE.TraceabilityStatus;

public class CustomPainting {

	/**
	 * Add symbols to BehaviorLabels, depending on the BehaviorType enumeration.
	 * 
	 * This is a bit of a hack and this functionality should actually be added to gmfmap (as label expression).
	 * It should be possible to define this in OCL, but the method 'oclContainer()' (which is needed) is not yet supported which makes it hard.
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
			prefix = "!";
			suffix = "!";
			break;
		case BehaviorType.EI_EVENT_VALUE:
			prefix = ">>";
			suffix = "<<";
			break;
		case BehaviorType.EO_EVENT_VALUE:
			prefix = "<<";
			suffix = ">>";
			break;
		case BehaviorType.EVENT_VALUE:
			prefix = "??";
			suffix = "??";
			break;
		case BehaviorType.GUARD_VALUE:
			prefix = "???";
			suffix = "???";
			break;
		case BehaviorType.II_EVENT_VALUE:
			prefix = ">";
			suffix = "<";
			break;
		case BehaviorType.IO_EVENT_VALUE:
			prefix = "<";
			suffix = ">";
			break;
		case BehaviorType.SELECTION_VALUE:
			prefix = "?";
			suffix = "?";
			break;
		case BehaviorType.STATE_REALISATION_VALUE:
			prefix = "[";
			suffix = "]";
			break;
		default:
			break;
		}

		if (!(label.getText().startsWith(prefix) && label.getText().endsWith(suffix))) {
			label.setText(prefix + "  " + label.getText() + "  " + suffix);
		}
	}

	/**
	 * Change color of Nodes, depending on the TraceabilityStatus enumeration.
	 * 
	 * Couldn't find a way to model this in gmfgraph. This may not be the nicest solution.
	 * @param hasFocus 
	 */
	public static void setNodeColor(Figure figure, StandardNode node, boolean hasFocus) {
		int red = 179;
		int green = 211;
		int blue = 69;

		switch (node.getTraceabilitystatus().getValue()) {
		case TraceabilityStatus.DELETED_VALUE:
			red = 221;
			green = 221;
			blue = 221;
			break;
		case TraceabilityStatus.IMPLIED_VALUE:
			red = 251;
			green = 245;
			blue = 173;
			break;
		case TraceabilityStatus.MISSING_VALUE:
			red = 247;
			green = 168;
			blue = 170;
			break;
		case TraceabilityStatus.REFINEMENT_VALUE:
			red = 255;
			green = 255;
			blue = 255;
			break;
		case TraceabilityStatus.UPDATED_VALUE:
			red = 69;
			green = 179;
			blue = 211;
			break;
		default:
			break;
		}

		if (hasFocus) {
			final int darkest = Math.min(red, Math.min(green, blue));
			red = brighten(red, darkest);
			green = brighten(green, darkest);
			blue = brighten(blue, darkest);
		}

		figure.setBackgroundColor(new Color(null, red, green, blue));
	}


	private final static int colorDiff = 40;
	
	private static int brighten(int color, int darkest) {
		if (255-darkest < colorDiff) {
			if (color + darkest/2 <= 255) {
				return color + darkest/2;
			}
			else {
				return 255;
			}
		}
		else if (color + colorDiff <= 255) {
			return color + colorDiff;
		}
		else {
			return 255;
		}
	}

}
