package ComBE.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
* This registry is used to determine which type of visual object should be
* created for the corresponding Diagram, Node, ChildNode or Link represented
* by a domain model object.
* 
* @generated
*/
public class ComBEVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.behaviorengineering.combe.graphical.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID.equals(view.getType())) {
				return ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ComBE.diagram.part.ComBEDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComBE.ComBEPackage.eINSTANCE.getSpecification().isSuperTypeOf(domainElement.eClass()) && isDiagram((ComBE.Specification) domainElement)) {
			return ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ComBE.diagram.part.ComBEVisualIDRegistry.getModelID(containerView);
		if (!ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID:
			if (ComBE.ComBEPackage.eINSTANCE.getAlternativeBranch().isSuperTypeOf(domainElement.eClass())) {
				return ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID;
			}
			if (ComBE.ComBEPackage.eINSTANCE.getParallelBranch().isSuperTypeOf(domainElement.eClass())) {
				return ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID;
			}
			if (ComBE.ComBEPackage.eINSTANCE.getAtomicSequence().isSuperTypeOf(domainElement.eClass())) {
				return ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID;
			}
			break;
		case ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart.VISUAL_ID:
			if (ComBE.ComBEPackage.eINSTANCE.getStandardNode().isSuperTypeOf(domainElement.eClass())) {
				return ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID;
			}
			if (ComBE.ComBEPackage.eINSTANCE.getEmptyNode().isSuperTypeOf(domainElement.eClass())) {
				return ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID;
			}
			break;
		case ComBE.diagram.edit.parts.AlternativeBranchAlternativeBranchNodesCompartmentEditPart.VISUAL_ID:
			if (ComBE.ComBEPackage.eINSTANCE.getStandardNode().isSuperTypeOf(domainElement.eClass())) {
				return ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID;
			}
			if (ComBE.ComBEPackage.eINSTANCE.getEmptyNode().isSuperTypeOf(domainElement.eClass())) {
				return ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID;
			}
			break;
		case ComBE.diagram.edit.parts.ParallelBranchParallelBranchNodesCompartmentEditPart.VISUAL_ID:
			if (ComBE.ComBEPackage.eINSTANCE.getStandardNode().isSuperTypeOf(domainElement.eClass())) {
				return ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID;
			}
			if (ComBE.ComBEPackage.eINSTANCE.getEmptyNode().isSuperTypeOf(domainElement.eClass())) {
				return ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ComBE.diagram.part.ComBEVisualIDRegistry.getModelID(containerView);
		if (!ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ComBE.diagram.edit.parts.SpecificationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.AlternativeBranchAlternativeBranchNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.ParallelBranchParallelBranchNodesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.StandardNodeTracibilitystatusEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.StandardNodeOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.StandardNodeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.EmptyNodeLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.EmptyNodeOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.StandardNodeTracibilitystatus2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.StandardNodeOperator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.StandardNodeLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.EmptyNodeLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.EmptyNodeOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.WrappingLabel9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.StandardNodeTracibilitystatus3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.StandardNodeOperator3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.StandardNodeLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.EmptyNodeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.EmptyNodeOperatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.AlternativeBranchAlternativeBranchNodesCompartmentEditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComBE.diagram.edit.parts.ParallelBranchParallelBranchNodesCompartmentEditPart.VISUAL_ID:
			if (ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ComBE.Specification element) {
		return true;
	}

}
