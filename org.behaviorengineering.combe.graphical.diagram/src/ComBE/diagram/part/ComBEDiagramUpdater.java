package ComBE.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class ComBEDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBENodeDescriptor> getSemanticChildren(
			View view) {
		switch (ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(view)) {
		case ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID:
			return getSpecification_1000SemanticChildren(view);
		case ComBE.diagram.edit.parts.AlternativeBranchAlternativeBranchNodesCompartmentEditPart.VISUAL_ID:
			return getAlternativeBranchAlternativeBranchNodesCompartment_7001SemanticChildren(view);
		case ComBE.diagram.edit.parts.ParallelBranchParallelBranchNodesCompartmentEditPart.VISUAL_ID:
			return getParallelBranchParallelBranchNodesCompartment_7002SemanticChildren(view);
		case ComBE.diagram.edit.parts.AtomicSequenceAtomicSequenceNodesCompartmentEditPart.VISUAL_ID:
			return getAtomicSequenceAtomicSequenceNodesCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBENodeDescriptor> getSpecification_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComBE.Specification modelElement = (ComBE.Specification) view
				.getElement();
		LinkedList<ComBE.diagram.part.ComBENodeDescriptor> result = new LinkedList<ComBE.diagram.part.ComBENodeDescriptor>();
		Resource resource = modelElement.eResource();
		for (Iterator<EObject> it = getPhantomNodesIterator(resource); it
				.hasNext();) {
			EObject childElement = it.next();
			if (childElement == modelElement) {
				continue;
			}
			if (ComBE.diagram.part.ComBEVisualIDRegistry.getNodeVisualID(view,
					childElement) == ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID) {
				result.add(new ComBE.diagram.part.ComBENodeDescriptor(
						childElement,
						ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID));
				continue;
			}
			if (ComBE.diagram.part.ComBEVisualIDRegistry.getNodeVisualID(view,
					childElement) == ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID) {
				result.add(new ComBE.diagram.part.ComBENodeDescriptor(
						childElement,
						ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID));
				continue;
			}
			if (ComBE.diagram.part.ComBEVisualIDRegistry.getNodeVisualID(view,
					childElement) == ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID) {
				result.add(new ComBE.diagram.part.ComBENodeDescriptor(
						childElement,
						ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBENodeDescriptor> getAlternativeBranchAlternativeBranchNodesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComBE.AlternativeBranch modelElement = (ComBE.AlternativeBranch) containerView
				.getElement();
		LinkedList<ComBE.diagram.part.ComBENodeDescriptor> result = new LinkedList<ComBE.diagram.part.ComBENodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			ComBE.Node childElement = (ComBE.Node) it.next();
			int visualID = ComBE.diagram.part.ComBEVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID) {
				result.add(new ComBE.diagram.part.ComBENodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID) {
				result.add(new ComBE.diagram.part.ComBENodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBENodeDescriptor> getParallelBranchParallelBranchNodesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComBE.ParallelBranch modelElement = (ComBE.ParallelBranch) containerView
				.getElement();
		LinkedList<ComBE.diagram.part.ComBENodeDescriptor> result = new LinkedList<ComBE.diagram.part.ComBENodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			ComBE.Node childElement = (ComBE.Node) it.next();
			int visualID = ComBE.diagram.part.ComBEVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID) {
				result.add(new ComBE.diagram.part.ComBENodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID) {
				result.add(new ComBE.diagram.part.ComBENodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBENodeDescriptor> getAtomicSequenceAtomicSequenceNodesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ComBE.AtomicSequence modelElement = (ComBE.AtomicSequence) containerView
				.getElement();
		LinkedList<ComBE.diagram.part.ComBENodeDescriptor> result = new LinkedList<ComBE.diagram.part.ComBENodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			ComBE.Node childElement = (ComBE.Node) it.next();
			int visualID = ComBE.diagram.part.ComBEVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID) {
				result.add(new ComBE.diagram.part.ComBENodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID) {
				result.add(new ComBE.diagram.part.ComBENodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator<EObject> getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getContainedLinks(
			View view) {
		switch (ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(view)) {
		case ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID:
			return getSpecification_1000ContainedLinks(view);
		case ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID:
			return getAlternativeBranch_2001ContainedLinks(view);
		case ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID:
			return getParallelBranch_2002ContainedLinks(view);
		case ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID:
			return getAtomicSequence_2003ContainedLinks(view);
		case ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID:
			return getStandardNode_3001ContainedLinks(view);
		case ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID:
			return getEmptyNode_3002ContainedLinks(view);
		case ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID:
			return getStandardNode_3003ContainedLinks(view);
		case ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID:
			return getEmptyNode_3004ContainedLinks(view);
		case ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID:
			return getStandardNode_3005ContainedLinks(view);
		case ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID:
			return getEmptyNode_3006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getIncomingLinks(
			View view) {
		switch (ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(view)) {
		case ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID:
			return getAlternativeBranch_2001IncomingLinks(view);
		case ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID:
			return getParallelBranch_2002IncomingLinks(view);
		case ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID:
			return getAtomicSequence_2003IncomingLinks(view);
		case ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID:
			return getStandardNode_3001IncomingLinks(view);
		case ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID:
			return getEmptyNode_3002IncomingLinks(view);
		case ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID:
			return getStandardNode_3003IncomingLinks(view);
		case ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID:
			return getEmptyNode_3004IncomingLinks(view);
		case ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID:
			return getStandardNode_3005IncomingLinks(view);
		case ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID:
			return getEmptyNode_3006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getOutgoingLinks(
			View view) {
		switch (ComBE.diagram.part.ComBEVisualIDRegistry.getVisualID(view)) {
		case ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID:
			return getAlternativeBranch_2001OutgoingLinks(view);
		case ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID:
			return getParallelBranch_2002OutgoingLinks(view);
		case ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID:
			return getAtomicSequence_2003OutgoingLinks(view);
		case ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID:
			return getStandardNode_3001OutgoingLinks(view);
		case ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID:
			return getEmptyNode_3002OutgoingLinks(view);
		case ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID:
			return getStandardNode_3003OutgoingLinks(view);
		case ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID:
			return getEmptyNode_3004OutgoingLinks(view);
		case ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID:
			return getStandardNode_3005OutgoingLinks(view);
		case ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID:
			return getEmptyNode_3006OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getSpecification_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getAlternativeBranch_2001ContainedLinks(
			View view) {
		ComBE.AlternativeBranch modelElement = (ComBE.AlternativeBranch) view
				.getElement();
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AlternativeBranch_Children_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getParallelBranch_2002ContainedLinks(
			View view) {
		ComBE.ParallelBranch modelElement = (ComBE.ParallelBranch) view
				.getElement();
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ParallelBranch_Children_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getAtomicSequence_2003ContainedLinks(
			View view) {
		ComBE.AtomicSequence modelElement = (ComBE.AtomicSequence) view
				.getElement();
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AtomicSequence_Child_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getStandardNode_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getEmptyNode_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getStandardNode_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getEmptyNode_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getStandardNode_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getEmptyNode_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getAlternativeBranch_2001IncomingLinks(
			View view) {
		ComBE.AlternativeBranch modelElement = (ComBE.AlternativeBranch) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AlternativeBranch_Children_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ParallelBranch_Children_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AtomicSequence_Child_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getParallelBranch_2002IncomingLinks(
			View view) {
		ComBE.ParallelBranch modelElement = (ComBE.ParallelBranch) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AlternativeBranch_Children_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ParallelBranch_Children_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AtomicSequence_Child_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getAtomicSequence_2003IncomingLinks(
			View view) {
		ComBE.AtomicSequence modelElement = (ComBE.AtomicSequence) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AlternativeBranch_Children_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ParallelBranch_Children_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AtomicSequence_Child_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getStandardNode_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getEmptyNode_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getStandardNode_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getEmptyNode_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getStandardNode_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getEmptyNode_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getAlternativeBranch_2001OutgoingLinks(
			View view) {
		ComBE.AlternativeBranch modelElement = (ComBE.AlternativeBranch) view
				.getElement();
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AlternativeBranch_Children_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getParallelBranch_2002OutgoingLinks(
			View view) {
		ComBE.ParallelBranch modelElement = (ComBE.ParallelBranch) view
				.getElement();
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ParallelBranch_Children_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getAtomicSequence_2003OutgoingLinks(
			View view) {
		ComBE.AtomicSequence modelElement = (ComBE.AtomicSequence) view
				.getElement();
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AtomicSequence_Child_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getStandardNode_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getEmptyNode_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getStandardNode_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getEmptyNode_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getStandardNode_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComBE.diagram.part.ComBELinkDescriptor> getEmptyNode_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ComBE.diagram.part.ComBELinkDescriptor> getIncomingFeatureModelFacetLinks_AlternativeBranch_Children_4001(
			ComBE.BehaviorTree target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ComBE.ComBEPackage.eINSTANCE
					.getAlternativeBranch_Children()) {
				result.add(new ComBE.diagram.part.ComBELinkDescriptor(
						setting.getEObject(),
						target,
						ComBE.diagram.providers.ComBEElementTypes.AlternativeBranchChildren_4001,
						ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComBE.diagram.part.ComBELinkDescriptor> getIncomingFeatureModelFacetLinks_ParallelBranch_Children_4002(
			ComBE.BehaviorTree target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ComBE.ComBEPackage.eINSTANCE
					.getParallelBranch_Children()) {
				result.add(new ComBE.diagram.part.ComBELinkDescriptor(
						setting.getEObject(),
						target,
						ComBE.diagram.providers.ComBEElementTypes.ParallelBranchChildren_4002,
						ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComBE.diagram.part.ComBELinkDescriptor> getIncomingFeatureModelFacetLinks_AtomicSequence_Child_4003(
			ComBE.BehaviorTree target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ComBE.ComBEPackage.eINSTANCE
					.getAtomicSequence_Child()) {
				result.add(new ComBE.diagram.part.ComBELinkDescriptor(
						setting.getEObject(),
						target,
						ComBE.diagram.providers.ComBEElementTypes.AtomicSequenceChild_4003,
						ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComBE.diagram.part.ComBELinkDescriptor> getOutgoingFeatureModelFacetLinks_AlternativeBranch_Children_4001(
			ComBE.AlternativeBranch source) {
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		for (Iterator<?> destinations = source.getChildren().iterator(); destinations
				.hasNext();) {
			ComBE.BehaviorTree destination = (ComBE.BehaviorTree) destinations
					.next();
			result.add(new ComBE.diagram.part.ComBELinkDescriptor(
					source,
					destination,
					ComBE.diagram.providers.ComBEElementTypes.AlternativeBranchChildren_4001,
					ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComBE.diagram.part.ComBELinkDescriptor> getOutgoingFeatureModelFacetLinks_ParallelBranch_Children_4002(
			ComBE.ParallelBranch source) {
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		for (Iterator<?> destinations = source.getChildren().iterator(); destinations
				.hasNext();) {
			ComBE.BehaviorTree destination = (ComBE.BehaviorTree) destinations
					.next();
			result.add(new ComBE.diagram.part.ComBELinkDescriptor(
					source,
					destination,
					ComBE.diagram.providers.ComBEElementTypes.ParallelBranchChildren_4002,
					ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComBE.diagram.part.ComBELinkDescriptor> getOutgoingFeatureModelFacetLinks_AtomicSequence_Child_4003(
			ComBE.AtomicSequence source) {
		LinkedList<ComBE.diagram.part.ComBELinkDescriptor> result = new LinkedList<ComBE.diagram.part.ComBELinkDescriptor>();
		ComBE.BehaviorTree destination = source.getChild();
		if (destination == null) {
			return result;
		}
		result.add(new ComBE.diagram.part.ComBELinkDescriptor(
				source,
				destination,
				ComBE.diagram.providers.ComBEElementTypes.AtomicSequenceChild_4003,
				ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ComBE.diagram.part.ComBENodeDescriptor> getSemanticChildren(
				View view) {
			return ComBEDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ComBE.diagram.part.ComBELinkDescriptor> getContainedLinks(
				View view) {
			return ComBEDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ComBE.diagram.part.ComBELinkDescriptor> getIncomingLinks(
				View view) {
			return ComBEDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ComBE.diagram.part.ComBELinkDescriptor> getOutgoingLinks(
				View view) {
			return ComBEDiagramUpdater.getOutgoingLinks(view);
		}
	};
}
