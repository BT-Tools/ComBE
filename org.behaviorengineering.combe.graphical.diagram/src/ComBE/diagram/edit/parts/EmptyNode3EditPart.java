package ComBE.diagram.edit.parts;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * @generated
 */
public class EmptyNode3EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public EmptyNode3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ComBE.diagram.edit.policies.EmptyNode3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ComBE.diagram.edit.policies.EmptyNode3CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new EmptyNodeFigure();
	}

	/**
	 * @generated
	 */
	public EmptyNodeFigure getPrimaryShape() {
		return (EmptyNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComBE.diagram.edit.parts.EmptyNodeLabelEditPart) {
			((ComBE.diagram.edit.parts.EmptyNodeLabelEditPart) childEditPart).setLabel(getPrimaryShape().getFigureEmptyNodeLabelLabelFigure());
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.EmptyNodeOperatorEditPart) {
			((ComBE.diagram.edit.parts.EmptyNodeOperatorEditPart) childEditPart).setLabel(getPrimaryShape().getFigureEmptyNodeOperatorLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComBE.diagram.edit.parts.EmptyNodeLabelEditPart) {
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.EmptyNodeOperatorEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ComBE.diagram.part.ComBEVisualIDRegistry.getType(ComBE.diagram.edit.parts.EmptyNodeLabelEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class EmptyNodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEmptyNodeLabelLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEmptyNodeOperatorLabelFigure;

		/**
		 * @generated
		 */
		public EmptyNodeFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 3;
			layoutThis.makeColumnsEqualWidth = false;
			layoutThis.horizontalSpacing = 0;
			layoutThis.verticalSpacing = 0;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 0;
			this.setLayoutManager(layoutThis);

			this.setOutline(false);
			this.setLineWidth(0);
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(THIS_BACK);

			this.setFont(THIS_FONT);

			this.setBorder(createBorder0());
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure left0 = new RectangleFigure();

			left0.setOutline(false);
			left0.setLineWidth(0);
			left0.setPreferredSize(new Dimension(getMapMode().DPtoLP(54), getMapMode().DPtoLP(60)));

			GridData constraintLeft0 = new GridData();
			constraintLeft0.verticalAlignment = GridData.CENTER;
			constraintLeft0.horizontalAlignment = GridData.CENTER;
			constraintLeft0.horizontalIndent = 0;
			constraintLeft0.horizontalSpan = 1;
			constraintLeft0.verticalSpan = 1;
			constraintLeft0.grabExcessHorizontalSpace = true;
			constraintLeft0.grabExcessVerticalSpace = true;
			this.add(left0, constraintLeft0);

			RectangleFigure line0 = new RectangleFigure();

			line0.setOutline(false);
			line0.setLineWidth(0);
			line0.setBackgroundColor(ColorConstants.black);

			GridData constraintLine0 = new GridData();
			constraintLine0.verticalAlignment = GridData.CENTER;
			constraintLine0.horizontalAlignment = GridData.CENTER;
			constraintLine0.horizontalIndent = 0;
			constraintLine0.horizontalSpan = 1;
			constraintLine0.verticalSpan = 1;
			constraintLine0.grabExcessHorizontalSpace = false;
			constraintLine0.grabExcessVerticalSpace = false;
			constraintLine0.widthHint = 1;
			constraintLine0.heightHint = 60;
			this.add(line0, constraintLine0);

			RectangleFigure right0 = new RectangleFigure();

			right0.setOutline(false);
			right0.setLineWidth(0);
			right0.setPreferredSize(new Dimension(getMapMode().DPtoLP(125), getMapMode().DPtoLP(60)));

			GridData constraintRight0 = new GridData();
			constraintRight0.verticalAlignment = GridData.CENTER;
			constraintRight0.horizontalAlignment = GridData.CENTER;
			constraintRight0.horizontalIndent = 0;
			constraintRight0.horizontalSpan = 1;
			constraintRight0.verticalSpan = 1;
			constraintRight0.grabExcessHorizontalSpace = true;
			constraintRight0.grabExcessVerticalSpace = true;
			this.add(right0, constraintRight0);

			GridLayout layoutRight0 = new GridLayout();
			layoutRight0.numColumns = 2;
			layoutRight0.makeColumnsEqualWidth = false;
			layoutRight0.horizontalSpacing = 0;
			layoutRight0.verticalSpacing = 0;
			layoutRight0.marginWidth = 0;
			layoutRight0.marginHeight = 0;
			right0.setLayoutManager(layoutRight0);

			RectangleFigure rightLeft1 = new RectangleFigure();

			rightLeft1.setFill(false);
			rightLeft1.setOutline(false);
			rightLeft1.setLineWidth(0);

			GridData constraintRightLeft1 = new GridData();
			constraintRightLeft1.verticalAlignment = GridData.CENTER;
			constraintRightLeft1.horizontalAlignment = GridData.CENTER;
			constraintRightLeft1.horizontalIndent = 0;
			constraintRightLeft1.horizontalSpan = 1;
			constraintRightLeft1.verticalSpan = 1;
			constraintRightLeft1.grabExcessHorizontalSpace = true;
			constraintRightLeft1.grabExcessVerticalSpace = true;
			right0.add(rightLeft1, constraintRightLeft1);

			RectangleFigure rightRight1 = new RectangleFigure();

			rightRight1.setFill(false);
			rightRight1.setOutline(false);
			rightRight1.setLineWidth(0);

			rightRight1.setBorder(new MarginBorder(getMapMode().DPtoLP(1), getMapMode().DPtoLP(0), getMapMode().DPtoLP(20), getMapMode().DPtoLP(0)));

			GridData constraintRightRight1 = new GridData();
			constraintRightRight1.verticalAlignment = GridData.CENTER;
			constraintRightRight1.horizontalAlignment = GridData.CENTER;
			constraintRightRight1.horizontalIndent = 0;
			constraintRightRight1.horizontalSpan = 1;
			constraintRightRight1.verticalSpan = 1;
			constraintRightRight1.grabExcessHorizontalSpace = true;
			constraintRightRight1.grabExcessVerticalSpace = true;
			right0.add(rightRight1, constraintRightRight1);

			BorderLayout layoutRightRight1 = new BorderLayout();
			rightRight1.setLayoutManager(layoutRightRight1);

			RectangleFigure operatorRectangle2 = new RectangleFigure();

			operatorRectangle2.setFill(false);
			operatorRectangle2.setOutline(false);
			operatorRectangle2.setLineWidth(0);

			rightRight1.add(operatorRectangle2, BorderLayout.TOP);

			GridLayout layoutOperatorRectangle2 = new GridLayout();
			layoutOperatorRectangle2.numColumns = 1;
			layoutOperatorRectangle2.makeColumnsEqualWidth = true;
			layoutOperatorRectangle2.horizontalSpacing = 0;
			layoutOperatorRectangle2.verticalSpacing = 0;
			layoutOperatorRectangle2.marginWidth = 0;
			layoutOperatorRectangle2.marginHeight = 0;
			operatorRectangle2.setLayoutManager(layoutOperatorRectangle2);

			fFigureEmptyNodeOperatorLabelFigure = new WrappingLabel();

			fFigureEmptyNodeOperatorLabelFigure.setText(" ");

			GridData constraintFFigureEmptyNodeOperatorLabelFigure = new GridData();
			constraintFFigureEmptyNodeOperatorLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureEmptyNodeOperatorLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureEmptyNodeOperatorLabelFigure.horizontalIndent = 0;
			constraintFFigureEmptyNodeOperatorLabelFigure.horizontalSpan = 1;
			constraintFFigureEmptyNodeOperatorLabelFigure.verticalSpan = 1;
			constraintFFigureEmptyNodeOperatorLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureEmptyNodeOperatorLabelFigure.grabExcessVerticalSpace = true;
			operatorRectangle2.add(fFigureEmptyNodeOperatorLabelFigure, constraintFFigureEmptyNodeOperatorLabelFigure);

			RectangleFigure labelRectangle2 = new RectangleFigure();

			labelRectangle2.setFill(false);
			labelRectangle2.setOutline(false);
			labelRectangle2.setLineWidth(0);

			rightRight1.add(labelRectangle2, BorderLayout.BOTTOM);

			GridLayout layoutLabelRectangle2 = new GridLayout();
			layoutLabelRectangle2.numColumns = 1;
			layoutLabelRectangle2.makeColumnsEqualWidth = true;
			layoutLabelRectangle2.horizontalSpacing = 0;
			layoutLabelRectangle2.verticalSpacing = 0;
			layoutLabelRectangle2.marginWidth = 0;
			layoutLabelRectangle2.marginHeight = 0;
			labelRectangle2.setLayoutManager(layoutLabelRectangle2);

			fFigureEmptyNodeLabelLabelFigure = new WrappingLabel();

			fFigureEmptyNodeLabelLabelFigure.setText(" ");

			GridData constraintFFigureEmptyNodeLabelLabelFigure = new GridData();
			constraintFFigureEmptyNodeLabelLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureEmptyNodeLabelLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureEmptyNodeLabelLabelFigure.horizontalIndent = 0;
			constraintFFigureEmptyNodeLabelLabelFigure.horizontalSpan = 1;
			constraintFFigureEmptyNodeLabelLabelFigure.verticalSpan = 1;
			constraintFFigureEmptyNodeLabelLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureEmptyNodeLabelLabelFigure.grabExcessVerticalSpace = true;
			labelRectangle2.add(fFigureEmptyNodeLabelLabelFigure, constraintFFigureEmptyNodeLabelLabelFigure);

		}

		/**
		 * @generated
		 */
		private Border createBorder0() {
			ComBE.diagram.customCode.CustomLineBorder result = new ComBE.diagram.customCode.CustomLineBorder();

			return result;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEmptyNodeLabelLabelFigure() {
			return fFigureEmptyNodeLabelLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEmptyNodeOperatorLabelFigure() {
			return fFigureEmptyNodeOperatorLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 179, 211, 69);

	/**
	 * @generated
	 */
	static final Font THIS_FONT = new Font(Display.getCurrent(), "ComBEFont", 6, SWT.BOLD);

}
