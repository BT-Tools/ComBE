package ComBE.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
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
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;
import ComBE.diagram.customCode.CustomCreateNodePlate;

/**
 * @generated
 */
public class AtomicSequenceEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;
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
	public AtomicSequenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(
				EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						ComBE.diagram.part.ComBEVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ComBE.diagram.edit.policies.AtomicSequenceItemSemanticEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new ComBE.diagram.edit.policies.AtomicSequenceCanonicalEditPolicy());
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
		return primaryShape = new AtomicSequenceFigure();
	}

	/**
	 * @generated
	 */
	public AtomicSequenceFigure getPrimaryShape() {
		return (AtomicSequenceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getAtomicSequenceNodesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getAtomicSequenceNodesCompartmentFigure();
			pane.remove(((ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart) childEditPart)
					.getFigure());
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
		if (editPart instanceof ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart) {
			return getPrimaryShape().getAtomicSequenceNodesCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated NOT
	 */
	protected NodeFigure createNodePlate() {
		return CustomCreateNodePlate.createNodePlate();
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
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ComBE.diagram.providers.ComBEElementTypes.AtomicSequenceChild_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ComBE.diagram.edit.parts.AlternativeBranchEditPart) {
			types.add(ComBE.diagram.providers.ComBEElementTypes.AtomicSequenceChild_4003);
		}
		if (targetEditPart instanceof ComBE.diagram.edit.parts.ParallelBranchEditPart) {
			types.add(ComBE.diagram.providers.ComBEElementTypes.AtomicSequenceChild_4003);
		}
		if (targetEditPart instanceof ComBE.diagram.edit.parts.AtomicSequenceEditPart) {
			types.add(ComBE.diagram.providers.ComBEElementTypes.AtomicSequenceChild_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ComBE.diagram.providers.ComBEElementTypes.AtomicSequenceChild_4003) {
			types.add(ComBE.diagram.providers.ComBEElementTypes.AlternativeBranch_2001);
			types.add(ComBE.diagram.providers.ComBEElementTypes.ParallelBranch_2002);
			types.add(ComBE.diagram.providers.ComBEElementTypes.AtomicSequence_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ComBE.diagram.providers.ComBEElementTypes.AlternativeBranchChildren_4001);
		types.add(ComBE.diagram.providers.ComBEElementTypes.ParallelBranchChildren_4002);
		types.add(ComBE.diagram.providers.ComBEElementTypes.AtomicSequenceChild_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ComBE.diagram.providers.ComBEElementTypes.AlternativeBranchChildren_4001) {
			types.add(ComBE.diagram.providers.ComBEElementTypes.AlternativeBranch_2001);
		} else if (relationshipType == ComBE.diagram.providers.ComBEElementTypes.ParallelBranchChildren_4002) {
			types.add(ComBE.diagram.providers.ComBEElementTypes.ParallelBranch_2002);
		} else if (relationshipType == ComBE.diagram.providers.ComBEElementTypes.AtomicSequenceChild_4003) {
			types.add(ComBE.diagram.providers.ComBEElementTypes.AtomicSequence_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == ComBE.diagram.providers.ComBEElementTypes.StandardNode_3005) {
				return getChildBySemanticHint(ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart.VISUAL_ID));
			}
			if (type == ComBE.diagram.providers.ComBEElementTypes.EmptyNode_3006) {
				return getChildBySemanticHint(ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class AtomicSequenceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fAtomicSequenceNodesCompartmentFigure;

		/**
		 * @generated
		 */
		public AtomicSequenceFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.horizontalSpacing = 0;
			layoutThis.verticalSpacing = 0;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 8;
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			this.setLineWidth(0);
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(202),
					getMapMode().DPtoLP(83)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fAtomicSequenceNodesCompartmentFigure = new RectangleFigure();

			fAtomicSequenceNodesCompartmentFigure.setLineWidth(0);
			fAtomicSequenceNodesCompartmentFigure
					.setForegroundColor(ColorConstants.black);
			fAtomicSequenceNodesCompartmentFigure
					.setBackgroundColor(ColorConstants.black);

			GridData constraintFAtomicSequenceNodesCompartmentFigure = new GridData();
			constraintFAtomicSequenceNodesCompartmentFigure.verticalAlignment = GridData.CENTER;
			constraintFAtomicSequenceNodesCompartmentFigure.horizontalAlignment = GridData.CENTER;
			constraintFAtomicSequenceNodesCompartmentFigure.horizontalIndent = 0;
			constraintFAtomicSequenceNodesCompartmentFigure.horizontalSpan = 1;
			constraintFAtomicSequenceNodesCompartmentFigure.verticalSpan = 1;
			constraintFAtomicSequenceNodesCompartmentFigure.grabExcessHorizontalSpace = true;
			constraintFAtomicSequenceNodesCompartmentFigure.grabExcessVerticalSpace = true;
			this.add(fAtomicSequenceNodesCompartmentFigure,
					constraintFAtomicSequenceNodesCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getAtomicSequenceNodesCompartmentFigure() {
			return fAtomicSequenceNodesCompartmentFigure;
		}

	}
}
