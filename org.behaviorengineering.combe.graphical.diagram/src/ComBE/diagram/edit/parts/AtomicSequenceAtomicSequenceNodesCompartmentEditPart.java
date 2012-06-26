package ComBE.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;

/**
 * @generated
 */
public class AtomicSequenceAtomicSequenceNodesCompartmentEditPart extends ListCompartmentEditPart {

	/**
	* @generated NOT
	*/
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
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
