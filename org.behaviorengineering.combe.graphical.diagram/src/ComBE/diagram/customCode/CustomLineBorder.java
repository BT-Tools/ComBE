package ComBE.diagram.customCode;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Insets;

public class CustomLineBorder extends LineBorder {

	/**
	 * @override
	 */
	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		tempRect.setBounds(getPaintRectangle(figure, insets));
		if (getWidth() % 2 == 1) {
			tempRect.width--;
			tempRect.height--;
		}
		tempRect.shrink(getWidth() / 2, getWidth() / 2);
		graphics.setLineWidth(getWidth());
		graphics.setLineStyle(getStyle());
		if (getColor() != null)
			graphics.setForegroundColor(getColor());
		graphics.drawLine(tempRect.getTopLeft(), tempRect.getBottomLeft());
		graphics.drawLine(tempRect.getTopRight(), tempRect.getBottomRight());
		graphics.drawLine(tempRect.getBottomLeft(), tempRect.getBottomRight());
	}
}
