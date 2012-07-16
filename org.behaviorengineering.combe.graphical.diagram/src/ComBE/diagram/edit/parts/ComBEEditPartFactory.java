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

			case ComBE.diagram.edit.parts.StandardNodeTracibilitystatusEditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeTracibilitystatusEditPart(view);

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

			case ComBE.diagram.edit.parts.StandardNodeTracibilitystatus2EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeTracibilitystatus2EditPart(view);

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

			case ComBE.diagram.edit.parts.StandardNodeTracibilitystatus3EditPart.VISUAL_ID:
				return new ComBE.diagram.edit.parts.StandardNodeTracibilitystatus3EditPart(view);

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
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	* @generated
	*/
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		* @generated
		*/
		private WrappingLabel wrapLabel;

		/**
		* @generated
		*/
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		* @generated
		*/
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		* @generated
		*/
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn() && getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	* @generated
	*/
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		* @generated
		*/
		private Label label;

		/**
		* @generated
		*/
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		* @generated
		*/
		public Label getLabel() {
			return label;
		}

		/**
		* @generated
		*/
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
