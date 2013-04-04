package ComBE.diagram.edit.parts;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;

import org.eclipse.draw2d.FocusEvent;
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
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import ComBE.StandardNode;
import ComBE.diagram.customCode.ComBESelectionEditPolicy;
import ComBE.diagram.customCode.CustomPainting;

/**
 * @generated
 */
public class StandardNode3EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;
	/**
	 * @generated
	 */
	protected IFigure contentPane;
	/**
	 * @generated
	 */
	protected IFigure primaryShape;
	/**
	 * @generated NOT
	 */
	private View view;

	/**
	 * @generated NOT
	 */
	public StandardNode3EditPart(View view) {
		super(view);
		this.view = view;
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ComBE.diagram.edit.policies.StandardNode3ItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new ComBE.diagram.edit.policies.StandardNode3CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		// BEGIN non-generated code
		installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE,
				new ComBESelectionEditPolicy());
		// END non-generated code
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
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
		return primaryShape = new NodeFigure();
	}

	/**
	 * @generated
	 */
	public NodeFigure getPrimaryShape() {
		return (NodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComBE.diagram.edit.parts.WrappingLabel13EditPart) {
			((ComBE.diagram.edit.parts.WrappingLabel13EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureNodeRequirementLabelFigure());
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.WrappingLabel14EditPart) {
			((ComBE.diagram.edit.parts.WrappingLabel14EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureNodeComponentLabelFigure());
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.WrappingLabel15EditPart) {
			((ComBE.diagram.edit.parts.WrappingLabel15EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureNodeBehaviorLabelFigure());
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.StandardNodeLabel3EditPart) {
			((ComBE.diagram.edit.parts.StandardNodeLabel3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureNodeLabelLabelFigure());
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.WrappingLabel16EditPart) {
			((ComBE.diagram.edit.parts.WrappingLabel16EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureNodeTraceabilityStatusLabelFigure());
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.WrappingLabel17EditPart) {
			((ComBE.diagram.edit.parts.WrappingLabel17EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureNodeOperatorLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComBE.diagram.edit.parts.WrappingLabel13EditPart) {
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.WrappingLabel14EditPart) {
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.WrappingLabel15EditPart) {
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.StandardNodeLabel3EditPart) {
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.WrappingLabel16EditPart) {
			return true;
		}
		if (childEditPart instanceof ComBE.diagram.edit.parts.WrappingLabel17EditPart) {
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
	protected org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure createNodePlate() {
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
	protected org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure createNodeFigure() {
		org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure figure = createNodePlate();
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
		return getChildBySemanticHint(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class NodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeRequirementLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeTraceabilityStatusLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeComponentLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeBehaviorLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeOperatorLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeLabelLabelFigure;

		/**
		 * @generated
		 */
		public NodeFigure() {

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
			left0.setPreferredSize(new Dimension(getMapMode().DPtoLP(54),
					getMapMode().DPtoLP(60)));

			this.add(left0);

			GridLayout layoutLeft0 = new GridLayout();
			layoutLeft0.numColumns = 1;
			layoutLeft0.makeColumnsEqualWidth = true;
			layoutLeft0.horizontalSpacing = 0;
			layoutLeft0.verticalSpacing = 0;
			layoutLeft0.marginWidth = 0;
			layoutLeft0.marginHeight = 0;
			left0.setLayoutManager(layoutLeft0);

			RectangleFigure leftLeft1 = new RectangleFigure();

			leftLeft1.setFill(false);
			leftLeft1.setOutline(false);
			leftLeft1.setLineWidth(0);

			leftLeft1.setBorder(new MarginBorder(getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(0)));

			GridData constraintLeftLeft1 = new GridData();
			constraintLeftLeft1.verticalAlignment = GridData.CENTER;
			constraintLeftLeft1.horizontalAlignment = GridData.CENTER;
			constraintLeftLeft1.horizontalIndent = 0;
			constraintLeftLeft1.horizontalSpan = 1;
			constraintLeftLeft1.verticalSpan = 1;
			constraintLeftLeft1.grabExcessHorizontalSpace = true;
			constraintLeftLeft1.grabExcessVerticalSpace = true;
			left0.add(leftLeft1, constraintLeftLeft1);

			BorderLayout layoutLeftLeft1 = new BorderLayout();
			leftLeft1.setLayoutManager(layoutLeftLeft1);

			RectangleFigure requirementRectangle2 = new RectangleFigure();

			requirementRectangle2.setFill(false);
			requirementRectangle2.setOutline(false);
			requirementRectangle2.setLineWidth(0);

			leftLeft1.add(requirementRectangle2, BorderLayout.TOP);

			GridLayout layoutRequirementRectangle2 = new GridLayout();
			layoutRequirementRectangle2.numColumns = 1;
			layoutRequirementRectangle2.makeColumnsEqualWidth = true;
			requirementRectangle2.setLayoutManager(layoutRequirementRectangle2);

			fFigureNodeRequirementLabelFigure = new WrappingLabel();

			fFigureNodeRequirementLabelFigure.setText("");

			GridData constraintFFigureNodeRequirementLabelFigure = new GridData();
			constraintFFigureNodeRequirementLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureNodeRequirementLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureNodeRequirementLabelFigure.horizontalIndent = 0;
			constraintFFigureNodeRequirementLabelFigure.horizontalSpan = 1;
			constraintFFigureNodeRequirementLabelFigure.verticalSpan = 1;
			constraintFFigureNodeRequirementLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureNodeRequirementLabelFigure.grabExcessVerticalSpace = true;
			requirementRectangle2.add(fFigureNodeRequirementLabelFigure,
					constraintFFigureNodeRequirementLabelFigure);

			RectangleFigure traceabilityStatusRectangle2 = new RectangleFigure();

			traceabilityStatusRectangle2.setFill(false);
			traceabilityStatusRectangle2.setOutline(false);
			traceabilityStatusRectangle2.setLineWidth(0);

			leftLeft1.add(traceabilityStatusRectangle2, BorderLayout.BOTTOM);

			GridLayout layoutTraceabilityStatusRectangle2 = new GridLayout();
			layoutTraceabilityStatusRectangle2.numColumns = 1;
			layoutTraceabilityStatusRectangle2.makeColumnsEqualWidth = true;
			traceabilityStatusRectangle2
					.setLayoutManager(layoutTraceabilityStatusRectangle2);

			fFigureNodeTraceabilityStatusLabelFigure = new WrappingLabel();

			fFigureNodeTraceabilityStatusLabelFigure.setText(" ");

			GridData constraintFFigureNodeTraceabilityStatusLabelFigure = new GridData();
			constraintFFigureNodeTraceabilityStatusLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureNodeTraceabilityStatusLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureNodeTraceabilityStatusLabelFigure.horizontalIndent = 0;
			constraintFFigureNodeTraceabilityStatusLabelFigure.horizontalSpan = 1;
			constraintFFigureNodeTraceabilityStatusLabelFigure.verticalSpan = 1;
			constraintFFigureNodeTraceabilityStatusLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureNodeTraceabilityStatusLabelFigure.grabExcessVerticalSpace = true;
			traceabilityStatusRectangle2.add(
					fFigureNodeTraceabilityStatusLabelFigure,
					constraintFFigureNodeTraceabilityStatusLabelFigure);

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
			right0.setPreferredSize(new Dimension(getMapMode().DPtoLP(125),
					getMapMode().DPtoLP(60)));

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

			rightLeft1.setBorder(new MarginBorder(getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(0)));

			GridData constraintRightLeft1 = new GridData();
			constraintRightLeft1.verticalAlignment = GridData.CENTER;
			constraintRightLeft1.horizontalAlignment = GridData.CENTER;
			constraintRightLeft1.horizontalIndent = 0;
			constraintRightLeft1.horizontalSpan = 1;
			constraintRightLeft1.verticalSpan = 1;
			constraintRightLeft1.grabExcessHorizontalSpace = true;
			constraintRightLeft1.grabExcessVerticalSpace = true;
			right0.add(rightLeft1, constraintRightLeft1);

			BorderLayout layoutRightLeft1 = new BorderLayout();
			rightLeft1.setLayoutManager(layoutRightLeft1);

			RectangleFigure componentRectangle2 = new RectangleFigure();

			componentRectangle2.setFill(false);
			componentRectangle2.setOutline(false);
			componentRectangle2.setLineWidth(0);

			rightLeft1.add(componentRectangle2, BorderLayout.TOP);

			GridLayout layoutComponentRectangle2 = new GridLayout();
			layoutComponentRectangle2.numColumns = 1;
			layoutComponentRectangle2.makeColumnsEqualWidth = true;
			componentRectangle2.setLayoutManager(layoutComponentRectangle2);

			fFigureNodeComponentLabelFigure = new WrappingLabel();

			fFigureNodeComponentLabelFigure.setText("");

			GridData constraintFFigureNodeComponentLabelFigure = new GridData();
			constraintFFigureNodeComponentLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureNodeComponentLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureNodeComponentLabelFigure.horizontalIndent = 0;
			constraintFFigureNodeComponentLabelFigure.horizontalSpan = 1;
			constraintFFigureNodeComponentLabelFigure.verticalSpan = 1;
			constraintFFigureNodeComponentLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureNodeComponentLabelFigure.grabExcessVerticalSpace = true;
			componentRectangle2.add(fFigureNodeComponentLabelFigure,
					constraintFFigureNodeComponentLabelFigure);

			RectangleFigure behaviorRectangle2 = new RectangleFigure();

			behaviorRectangle2.setFill(false);
			behaviorRectangle2.setOutline(false);
			behaviorRectangle2.setLineWidth(0);

			rightLeft1.add(behaviorRectangle2, BorderLayout.BOTTOM);

			GridLayout layoutBehaviorRectangle2 = new GridLayout();
			layoutBehaviorRectangle2.numColumns = 1;
			layoutBehaviorRectangle2.makeColumnsEqualWidth = true;
			behaviorRectangle2.setLayoutManager(layoutBehaviorRectangle2);

			fFigureNodeBehaviorLabelFigure = new WrappingLabel();

			fFigureNodeBehaviorLabelFigure.setText("");

			GridData constraintFFigureNodeBehaviorLabelFigure = new GridData();
			constraintFFigureNodeBehaviorLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureNodeBehaviorLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureNodeBehaviorLabelFigure.horizontalIndent = 0;
			constraintFFigureNodeBehaviorLabelFigure.horizontalSpan = 1;
			constraintFFigureNodeBehaviorLabelFigure.verticalSpan = 1;
			constraintFFigureNodeBehaviorLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureNodeBehaviorLabelFigure.grabExcessVerticalSpace = true;
			behaviorRectangle2.add(fFigureNodeBehaviorLabelFigure,
					constraintFFigureNodeBehaviorLabelFigure);

			RectangleFigure rightRight1 = new RectangleFigure();

			rightRight1.setFill(false);
			rightRight1.setOutline(false);
			rightRight1.setLineWidth(0);

			rightRight1.setBorder(new MarginBorder(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(20),
					getMapMode().DPtoLP(0)));

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

			fFigureNodeOperatorLabelFigure = new WrappingLabel();

			fFigureNodeOperatorLabelFigure.setText(" ");

			GridData constraintFFigureNodeOperatorLabelFigure = new GridData();
			constraintFFigureNodeOperatorLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureNodeOperatorLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureNodeOperatorLabelFigure.horizontalIndent = 0;
			constraintFFigureNodeOperatorLabelFigure.horizontalSpan = 1;
			constraintFFigureNodeOperatorLabelFigure.verticalSpan = 1;
			constraintFFigureNodeOperatorLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureNodeOperatorLabelFigure.grabExcessVerticalSpace = true;
			operatorRectangle2.add(fFigureNodeOperatorLabelFigure,
					constraintFFigureNodeOperatorLabelFigure);

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

			fFigureNodeLabelLabelFigure = new WrappingLabel();

			fFigureNodeLabelLabelFigure.setText(" ");

			GridData constraintFFigureNodeLabelLabelFigure = new GridData();
			constraintFFigureNodeLabelLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureNodeLabelLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureNodeLabelLabelFigure.horizontalIndent = 0;
			constraintFFigureNodeLabelLabelFigure.horizontalSpan = 1;
			constraintFFigureNodeLabelLabelFigure.verticalSpan = 1;
			constraintFFigureNodeLabelLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureNodeLabelLabelFigure.grabExcessVerticalSpace = true;
			labelRectangle2.add(fFigureNodeLabelLabelFigure,
					constraintFFigureNodeLabelLabelFigure);

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
		public WrappingLabel getFigureNodeRequirementLabelFigure() {
			return fFigureNodeRequirementLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeTraceabilityStatusLabelFigure() {
			return fFigureNodeTraceabilityStatusLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeComponentLabelFigure() {
			return fFigureNodeComponentLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeBehaviorLabelFigure() {
			return fFigureNodeBehaviorLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeOperatorLabelFigure() {
			return fFigureNodeOperatorLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeLabelLabelFigure() {
			return fFigureNodeLabelLabelFigure;
		}

		/**
		 * @generated NOT
		 */
		public void paint(Graphics graphics) {
			CustomPainting.setNodeColor(this, (StandardNode) view.getElement(),
					hasFocus);
			CustomPainting.setBehaviorLabel(fFigureNodeBehaviorLabelFigure,
					(StandardNode) view.getElement());
			super.paint(graphics);
		}

		private boolean hasFocus;

		/**
		 * @override
		 */
		public void handleFocusGained(FocusEvent event) {
			hasFocus = true;
			repaint();
		}

		/**
		 * @override
		 */
		public void handleFocusLost(FocusEvent event) {
			hasFocus = false;
			repaint();
		}
	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 179, 211, 69);
	/**
	 * @generated
	 */
	static final Font THIS_FONT = new Font(Display.getCurrent(), "ComBEFont",
			11, SWT.NORMAL);
}
