package ComBE.diagram.customCode;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

public class CustomCreateNodePlate {
	
	public static NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40) {
			public PointList getPolygonPoints() {
				PointList points = new PointList(6);
				Rectangle anchRect = getHandleBounds();
				final int space = 10;
				Point topLeft = new Point(anchRect.x + space, anchRect.y + space); // top-left
				points.addPoint(topLeft); 
				points.addPoint(anchRect.x + anchRect.width - space, anchRect.y + space); // top-right
				points.addPoint(anchRect.x + anchRect.width - space, anchRect.y + anchRect.height - space); // bottom-right
				points.addPoint(anchRect.x + space, anchRect.y + anchRect.height - space); // bottom-left
				points.addPoint(topLeft); 
				return points;
			}
		};
		return result;
	}
}
