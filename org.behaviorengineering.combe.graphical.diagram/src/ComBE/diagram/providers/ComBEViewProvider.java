package ComBE.diagram.providers;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation;
import org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.TitleStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;

/**
 * @generated
 */
public class ComBEViewProvider extends AbstractProvider implements
		IViewProvider {

	/**
	 * @generated
	 */
	public final boolean provides(IOperation operation) {
		if (operation instanceof CreateViewForKindOperation) {
			return provides((CreateViewForKindOperation) operation);
		}
		assert operation instanceof CreateViewOperation;
		if (operation instanceof CreateDiagramViewOperation) {
			return provides((CreateDiagramViewOperation) operation);
		} else if (operation instanceof CreateEdgeViewOperation) {
			return provides((CreateEdgeViewOperation) operation);
		} else if (operation instanceof CreateNodeViewOperation) {
			return provides((CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateViewForKindOperation op) {
		/*
		 if (op.getViewKind() == Node.class)
		 return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 if (op.getViewKind() == Edge.class)
		 return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		 */
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateDiagramViewOperation op) {
		return ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID
				.equals(op.getSemanticHint())
				&& ComBE.diagram.part.ComBEVisualIDRegistry
						.getDiagramVisualID(getSemanticElement(op
								.getSemanticAdapter())) != -1;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = ComBE.diagram.part.ComBEVisualIDRegistry
					.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(op
					.getSemanticHint());
			if (elementType != null) {
				if (!ComBE.diagram.providers.ComBEElementTypes
						.isKnownElementType(elementType)
						|| (!(elementType instanceof IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType)
						.getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null
						&& visualID != ComBE.diagram.part.ComBEVisualIDRegistry
								.getNodeVisualID(op.getContainerView(),
										domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID
						.equals(ComBE.diagram.part.ComBEVisualIDRegistry
								.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
				case ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID:
				case ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID:
				case ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID:
				case ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID:
				case ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID:
				case ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID:
				case ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID:
				case ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID:
				case ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID:
					if (domainElement == null
							|| visualID != ComBE.diagram.part.ComBEVisualIDRegistry
									.getNodeVisualID(op.getContainerView(),
											domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
				default:
					return false;
				}
			}
		}
		return ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID == visualID
				|| ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID == visualID
				|| ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID == visualID
				|| ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID == visualID
				|| ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID == visualID
				|| ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID == visualID
				|| ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID == visualID
				|| ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID == visualID
				|| ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID == visualID;
	}

	/**
	 * @generated
	 */
	protected boolean provides(CreateEdgeViewOperation op) {
		IElementType elementType = getSemanticElementType(op
				.getSemanticAdapter());
		if (!ComBE.diagram.providers.ComBEElementTypes
				.isKnownElementType(elementType)
				|| (!(elementType instanceof IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null
				|| (op.getSemanticHint() != null && !elementTypeHint.equals(op
						.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = ComBE.diagram.part.ComBEVisualIDRegistry
				.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null
				&& visualID != ComBE.diagram.part.ComBEVisualIDRegistry
						.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true;
	}

	/**
	 * @generated
	 */
	public Diagram createDiagram(IAdaptable semanticAdapter,
			String diagramKind, PreferencesHint preferencesHint) {
		Diagram diagram = NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(NotationFactory.eINSTANCE.createDiagramStyle());
		diagram.setType(ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
	 * @generated
	 */
	public Node createNode(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		final EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = ComBE.diagram.part.ComBEVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = ComBE.diagram.part.ComBEVisualIDRegistry
					.getVisualID(semanticHint);
		}
		switch (visualID) {
		case ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID:
			return createAlternativeBranch_2001(domainElement, containerView,
					index, persisted, preferencesHint);
		case ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID:
			return createParallelBranch_2002(domainElement, containerView,
					index, persisted, preferencesHint);
		case ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID:
			return createAtomicSequence_2003(domainElement, containerView,
					index, persisted, preferencesHint);
		case ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID:
			return createStandardNode_3001(domainElement, containerView, index,
					persisted, preferencesHint);
		case ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID:
			return createEmptyNode_3002(domainElement, containerView, index,
					persisted, preferencesHint);
		case ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID:
			return createStandardNode_3003(domainElement, containerView, index,
					persisted, preferencesHint);
		case ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID:
			return createEmptyNode_3004(domainElement, containerView, index,
					persisted, preferencesHint);
		case ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID:
			return createStandardNode_3005(domainElement, containerView, index,
					persisted, preferencesHint);
		case ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID:
			return createEmptyNode_3006(domainElement, containerView, index,
					persisted, preferencesHint);
		}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Edge createEdge(IAdaptable semanticAdapter, View containerView,
			String semanticHint, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		switch (ComBE.diagram.part.ComBEVisualIDRegistry
				.getVisualID(elementTypeHint)) {
		case ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID:
			return createAlternativeBranchChildren_4001(containerView, index,
					persisted, preferencesHint);
		case ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID:
			return createParallelBranchChildren_4002(containerView, index,
					persisted, preferencesHint);
		case ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID:
			return createAtomicSequenceChild_4003(containerView, index,
					persisted, preferencesHint);
		}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
	 * @generated
	 */
	public Node createAlternativeBranch_2001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		createCompartment(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.AlternativeBranchAlternativeBranchNodesCompartmentEditPart.VISUAL_ID),
				false, false, true, true);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createParallelBranch_2002(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		createCompartment(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.ParallelBranchParallelBranchNodesCompartmentEditPart.VISUAL_ID),
				false, false, true, true);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createAtomicSequence_2003(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Shape node = NotationFactory.eINSTANCE.createShape();
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();

		org.eclipse.swt.graphics.RGB lineRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_LINE_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getLineStyle_LineColor(),
				FigureUtilities.RGBToInteger(lineRGB));
		FontStyle nodeFontStyle = (FontStyle) node
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (nodeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			nodeFontStyle.setFontName(fontData.getName());
			nodeFontStyle.setFontHeight(fontData.getHeight());
			nodeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			nodeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			nodeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		org.eclipse.swt.graphics.RGB fillRGB = PreferenceConverter.getColor(
				prefStore, IPreferenceConstants.PREF_FILL_COLOR);
		ViewUtil.setStructuralFeatureValue(node,
				NotationPackage.eINSTANCE.getFillStyle_FillColor(),
				FigureUtilities.RGBToInteger(fillRGB));
		createCompartment(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart.VISUAL_ID),
				false, false, true, true);
		return node;
	}

	/**
	 * @generated
	 */
	public Node createStandardNode_3001(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		Node label5001 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID));
		Node label5002 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID));
		Node label5003 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID));
		Node label5004 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.StandardNodeLabelEditPart.VISUAL_ID));
		Node label5005 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID));
		Node label5006 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createEmptyNode_3002(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		Node label5007 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.EmptyNodeLabelEditPart.VISUAL_ID));
		Node label5008 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createStandardNode_3003(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		Node label5009 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID));
		Node label5010 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID));
		Node label5011 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID));
		Node label5012 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.StandardNodeLabel2EditPart.VISUAL_ID));
		Node label5013 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel10EditPart.VISUAL_ID));
		Node label5014 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel11EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createEmptyNode_3004(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		Node label5015 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.EmptyNodeLabel2EditPart.VISUAL_ID));
		Node label5016 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel12EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createStandardNode_3005(EObject domainElement,
			View containerView, int index, boolean persisted,
			PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		Node label5017 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel13EditPart.VISUAL_ID));
		Node label5018 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel14EditPart.VISUAL_ID));
		Node label5019 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel15EditPart.VISUAL_ID));
		Node label5020 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.StandardNodeLabel3EditPart.VISUAL_ID));
		Node label5021 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel16EditPart.VISUAL_ID));
		Node label5022 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel17EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Node createEmptyNode_3006(EObject domainElement, View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Node node = NotationFactory.eINSTANCE.createNode();
		node.getStyles()
				.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		node.setLayoutConstraint(NotationFactory.eINSTANCE.createBounds());
		node.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID));
		ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		Node label5023 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.EmptyNodeLabel3EditPart.VISUAL_ID));
		Node label5024 = createLabel(
				node,
				ComBE.diagram.part.ComBEVisualIDRegistry
						.getType(ComBE.diagram.edit.parts.WrappingLabel18EditPart.VISUAL_ID));
		return node;
	}

	/**
	 * @generated
	 */
	public Edge createAlternativeBranchChildren_4001(View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createParallelBranchChildren_4002(View containerView,
			int index, boolean persisted, PreferencesHint preferencesHint) {
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		return edge;
	}

	/**
	 * @generated
	 */
	public Edge createAtomicSequenceChild_4003(View containerView, int index,
			boolean persisted, PreferencesHint preferencesHint) {
		Edge edge = NotationFactory.eINSTANCE.createEdge();
		edge.getStyles().add(NotationFactory.eINSTANCE.createRoutingStyle());
		edge.getStyles().add(NotationFactory.eINSTANCE.createFontStyle());
		RelativeBendpoints bendpoints = NotationFactory.eINSTANCE
				.createRelativeBendpoints();
		ArrayList<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>(
				2);
		points.add(new RelativeBendpoint());
		points.add(new RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(ComBE.diagram.part.ComBEVisualIDRegistry
				.getType(ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final IPreferenceStore prefStore = (IPreferenceStore) preferencesHint
				.getPreferenceStore();
		FontStyle edgeFontStyle = (FontStyle) edge
				.getStyle(NotationPackage.Literals.FONT_STYLE);
		if (edgeFontStyle != null) {
			FontData fontData = PreferenceConverter.getFontData(prefStore,
					IPreferenceConstants.PREF_DEFAULT_FONT);
			edgeFontStyle.setFontName(fontData.getName());
			edgeFontStyle.setFontHeight(fontData.getHeight());
			edgeFontStyle.setBold((fontData.getStyle() & SWT.BOLD) != 0);
			edgeFontStyle.setItalic((fontData.getStyle() & SWT.ITALIC) != 0);
			org.eclipse.swt.graphics.RGB fontRGB = PreferenceConverter
					.getColor(prefStore, IPreferenceConstants.PREF_FONT_COLOR);
			edgeFontStyle.setFontColor(FigureUtilities.RGBToInteger(fontRGB)
					.intValue());
		}
		Routing routing = Routing.get(prefStore
				.getInt(IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			ViewUtil.setStructuralFeatureValue(edge,
					NotationPackage.eINSTANCE.getRoutingStyle_Routing(),
					routing);
		}
		return edge;
	}

	/**
	 * @generated
	 */
	private void stampShortcut(View containerView, Node target) {
		if (!ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID
				.equals(ComBE.diagram.part.ComBEVisualIDRegistry
						.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation
					.getDetails()
					.put("modelID", ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID); //$NON-NLS-1$
			target.getEAnnotations().add(shortcutAnnotation);
		}
	}

	/**
	 * @generated
	 */
	private Node createLabel(View owner, String hint) {
		DecorationNode rv = NotationFactory.eINSTANCE.createDecorationNode();
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private Node createCompartment(View owner, String hint,
			boolean canCollapse, boolean hasTitle, boolean canSort,
			boolean canFilter) {
		//SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
		//rv.setShowTitle(showTitle);
		//rv.setCollapsed(isCollapsed);
		Node rv;
		if (canCollapse) {
			rv = NotationFactory.eINSTANCE.createBasicCompartment();
		} else {
			rv = NotationFactory.eINSTANCE.createDecorationNode();
		}
		if (hasTitle) {
			TitleStyle ts = NotationFactory.eINSTANCE.createTitleStyle();
			ts.setShowTitle(true);
			rv.getStyles().add(ts);
		}
		if (canSort) {
			rv.getStyles().add(NotationFactory.eINSTANCE.createSortingStyle());
		}
		if (canFilter) {
			rv.getStyles()
					.add(NotationFactory.eINSTANCE.createFilteringStyle());
		}
		rv.setType(hint);
		ViewUtil.insertChildView(owner, rv, ViewUtil.APPEND, true);
		return rv;
	}

	/**
	 * @generated
	 */
	private EObject getSemanticElement(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			return EMFCoreUtil.resolve(
					TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}
}
