package ComBE.diagram.customCode;

import org.eclipse.draw2d.Figure;
import org.eclipse.gef.editpolicies.SelectionEditPolicy;

public class ComBESelectionEditPolicy extends SelectionEditPolicy {
	
	@Override
	protected void hideSelection() {
		Figure figure = (Figure) getHostFigure().getChildren().get(0);
		figure.handleFocusLost(null);		
	}

	@Override
	protected void showSelection() {
		Figure figure = (Figure) getHostFigure().getChildren().get(0);
		figure.handleFocusGained(null);
	}
}
