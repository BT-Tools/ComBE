package ComBE.diagram.edit.parts;

import org.eclipse.draw2d.geometry.Insets;

/**
 * @generated
 */
public class ParallelBranchParallelBranchNodesCompartmentEditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated NOT
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);

		// START non-generated code: remove standard {5,5,5,5} Insets of compartment
		Insets insets = result.getContentPane().getInsets();
		insets.top = 0;
		insets.bottom = 0;
		insets.left = 0;
		insets.right = 0;
		// END non-generated code

		return result;
	}
}
