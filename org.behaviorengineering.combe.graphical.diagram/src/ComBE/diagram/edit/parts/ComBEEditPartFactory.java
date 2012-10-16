package ComBE.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class ComBEEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(view)) {

			case ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.SpecificationEditPart(view);

			case ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.AlternativeBranchEditPart(view);

			case ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.ParallelBranchEditPart(view);

			case ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.AtomicSequenceEditPart(view);

			case ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeEditPart(view);

			case ComBE.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.WrappingLabelEditPart(view);

			case ComBE.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.WrappingLabel2EditPart(view);

			case ComBE.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.WrappingLabel3EditPart(view);

			case ComBE.diagram.edit.parts.StandardNodeTraceabilitystatusEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeTraceabilitystatusEditPart(view);

			case ComBE.diagram.edit.parts.StandardNodeOperatorEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeOperatorEditPart(view);

			case ComBE.diagram.edit.parts.StandardNodeLabelEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeLabelEditPart(view);

			case ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.EmptyNodeEditPart(view);

			case ComBE.diagram.edit.parts.EmptyNodeLabel2EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.EmptyNodeLabel2EditPart(view);

			case ComBE.diagram.edit.parts.EmptyNodeOperator2EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.EmptyNodeOperator2EditPart(view);

			case ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNode2EditPart(view);

			case ComBE.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.WrappingLabel4EditPart(view);

			case ComBE.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.WrappingLabel5EditPart(view);

			case ComBE.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.WrappingLabel6EditPart(view);

			case ComBE.diagram.edit.parts.StandardNodeTraceabilitystatus2EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeTraceabilitystatus2EditPart(view);

			case ComBE.diagram.edit.parts.StandardNodeOperator2EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeOperator2EditPart(view);

			case ComBE.diagram.edit.parts.StandardNodeLabel2EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeLabel2EditPart(view);

			case ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.EmptyNode2EditPart(view);

			case ComBE.diagram.edit.parts.EmptyNodeLabel3EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.EmptyNodeLabel3EditPart(view);

			case ComBE.diagram.edit.parts.EmptyNodeOperator3EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.EmptyNodeOperator3EditPart(view);

			case ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNode3EditPart(view);

			case ComBE.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.WrappingLabel7EditPart(view);

			case ComBE.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.WrappingLabel8EditPart(view);

			case ComBE.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.WrappingLabel9EditPart(view);

			case ComBE.diagram.edit.parts.StandardNodeTraceabilitystatus3EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeTraceabilitystatus3EditPart(view);

			case ComBE.diagram.edit.parts.StandardNodeOperator3EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeOperator3EditPart(view);

			case ComBE.diagram.edit.parts.StandardNodeLabel3EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeLabel3EditPart(view);

			case ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.EmptyNode3EditPart(view);

			case ComBE.diagram.edit.parts.EmptyNodeLabelEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.EmptyNodeLabelEditPart(view);

			case ComBE.diagram.edit.parts.EmptyNodeOperatorEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.EmptyNodeOperatorEditPart(view);

			case ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart(view);

			case ComBE.diagram.edit.parts.AlternativeBranchAlternativeBranchNodesCompartmentEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.AlternativeBranchAlternativeBranchNodesCompartmentEditPart(view);

			case ComBE.diagram.edit.parts.ParallelBranchParallelBranchNodesCompartmentEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.ParallelBranchParallelBranchNodesCompartmentEditPart(view);

			case ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart(view);

			case ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart(view);

			case ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.AtomicSequenceChildEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}
}
