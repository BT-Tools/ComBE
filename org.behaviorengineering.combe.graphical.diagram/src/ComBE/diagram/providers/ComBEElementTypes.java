package ComBE.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ComBEElementTypes {

	/**
	 * @generated
	 */
	private ComBEElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Specification_1000 = getElementType("org.behaviorengineering.combe.graphical.diagram.Specification_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AlternativeBranch_2001 = getElementType("org.behaviorengineering.combe.graphical.diagram.AlternativeBranch_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ParallelBranch_2002 = getElementType("org.behaviorengineering.combe.graphical.diagram.ParallelBranch_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicSequence_2003 = getElementType("org.behaviorengineering.combe.graphical.diagram.AtomicSequence_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StandardNode_3001 = getElementType("org.behaviorengineering.combe.graphical.diagram.StandardNode_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EmptyNode_3002 = getElementType("org.behaviorengineering.combe.graphical.diagram.EmptyNode_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StandardNode_3003 = getElementType("org.behaviorengineering.combe.graphical.diagram.StandardNode_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EmptyNode_3004 = getElementType("org.behaviorengineering.combe.graphical.diagram.EmptyNode_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StandardNode_3005 = getElementType("org.behaviorengineering.combe.graphical.diagram.StandardNode_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EmptyNode_3006 = getElementType("org.behaviorengineering.combe.graphical.diagram.EmptyNode_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AlternativeBranchChildren_4001 = getElementType("org.behaviorengineering.combe.graphical.diagram.AlternativeBranchChildren_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ParallelBranchChildren_4002 = getElementType("org.behaviorengineering.combe.graphical.diagram.ParallelBranchChildren_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicSequenceChild_4003 = getElementType("org.behaviorengineering.combe.graphical.diagram.AtomicSequenceChild_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ComBE.diagram.part.ComBEDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Specification_1000,
					ComBE.ComBEPackage.eINSTANCE.getSpecification());

			elements.put(AlternativeBranch_2001,
					ComBE.ComBEPackage.eINSTANCE.getAlternativeBranch());

			elements.put(ParallelBranch_2002,
					ComBE.ComBEPackage.eINSTANCE.getParallelBranch());

			elements.put(AtomicSequence_2003,
					ComBE.ComBEPackage.eINSTANCE.getAtomicSequence());

			elements.put(StandardNode_3001,
					ComBE.ComBEPackage.eINSTANCE.getStandardNode());

			elements.put(EmptyNode_3002,
					ComBE.ComBEPackage.eINSTANCE.getEmptyNode());

			elements.put(StandardNode_3003,
					ComBE.ComBEPackage.eINSTANCE.getStandardNode());

			elements.put(EmptyNode_3004,
					ComBE.ComBEPackage.eINSTANCE.getEmptyNode());

			elements.put(StandardNode_3005,
					ComBE.ComBEPackage.eINSTANCE.getStandardNode());

			elements.put(EmptyNode_3006,
					ComBE.ComBEPackage.eINSTANCE.getEmptyNode());

			elements.put(AlternativeBranchChildren_4001,
					ComBE.ComBEPackage.eINSTANCE
							.getAlternativeBranch_Children());

			elements.put(ParallelBranchChildren_4002,
					ComBE.ComBEPackage.eINSTANCE.getParallelBranch_Children());

			elements.put(AtomicSequenceChild_4003,
					ComBE.ComBEPackage.eINSTANCE.getAtomicSequence_Child());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Specification_1000);
			KNOWN_ELEMENT_TYPES.add(AlternativeBranch_2001);
			KNOWN_ELEMENT_TYPES.add(ParallelBranch_2002);
			KNOWN_ELEMENT_TYPES.add(AtomicSequence_2003);
			KNOWN_ELEMENT_TYPES.add(StandardNode_3001);
			KNOWN_ELEMENT_TYPES.add(EmptyNode_3002);
			KNOWN_ELEMENT_TYPES.add(StandardNode_3003);
			KNOWN_ELEMENT_TYPES.add(EmptyNode_3004);
			KNOWN_ELEMENT_TYPES.add(StandardNode_3005);
			KNOWN_ELEMENT_TYPES.add(EmptyNode_3006);
			KNOWN_ELEMENT_TYPES.add(AlternativeBranchChildren_4001);
			KNOWN_ELEMENT_TYPES.add(ParallelBranchChildren_4002);
			KNOWN_ELEMENT_TYPES.add(AtomicSequenceChild_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ComBE.diagram.edit.parts.SpecificationEditPart.VISUAL_ID:
			return Specification_1000;
		case ComBE.diagram.edit.parts.AlternativeBranchEditPart.VISUAL_ID:
			return AlternativeBranch_2001;
		case ComBE.diagram.edit.parts.ParallelBranchEditPart.VISUAL_ID:
			return ParallelBranch_2002;
		case ComBE.diagram.edit.parts.AtomicSequenceEditPart.VISUAL_ID:
			return AtomicSequence_2003;
		case ComBE.diagram.edit.parts.StandardNodeEditPart.VISUAL_ID:
			return StandardNode_3001;
		case ComBE.diagram.edit.parts.EmptyNodeEditPart.VISUAL_ID:
			return EmptyNode_3002;
		case ComBE.diagram.edit.parts.StandardNode2EditPart.VISUAL_ID:
			return StandardNode_3003;
		case ComBE.diagram.edit.parts.EmptyNode2EditPart.VISUAL_ID:
			return EmptyNode_3004;
		case ComBE.diagram.edit.parts.StandardNode3EditPart.VISUAL_ID:
			return StandardNode_3005;
		case ComBE.diagram.edit.parts.EmptyNode3EditPart.VISUAL_ID:
			return EmptyNode_3006;
		case ComBE.diagram.edit.parts.AlternativeBranchChildrenEditPart.VISUAL_ID:
			return AlternativeBranchChildren_4001;
		case ComBE.diagram.edit.parts.ParallelBranchChildrenEditPart.VISUAL_ID:
			return ParallelBranchChildren_4002;
		case ComBE.diagram.edit.parts.AtomicSequenceChildEditPart.VISUAL_ID:
			return AtomicSequenceChild_4003;
		}
		return null;
	}

}
