/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE.impl;

import ComBE.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComBEFactoryImpl extends EFactoryImpl implements ComBEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComBEFactory init() {
		try {
			ComBEFactory theComBEFactory = (ComBEFactory)EPackage.Registry.INSTANCE.getEFactory("ComBE"); 
			if (theComBEFactory != null) {
				return theComBEFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComBEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComBEFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComBEPackage.SPECIFICATION: return createSpecification();
			case ComBEPackage.REQUIREMENT: return createRequirement();
			case ComBEPackage.BEHAVIOR_SEQ: return createBehaviorSeq();
			case ComBEPackage.BEHAVIOR: return createBehavior();
			case ComBEPackage.ROOT: return createRoot();
			case ComBEPackage.STANDARD_COMPONENT: return createStandardComponent();
			case ComBEPackage.SYSTEM_COMPONENT: return createSystemComponent();
			case ComBEPackage.ATOMIC_SEQUENCE: return createAtomicSequence();
			case ComBEPackage.ALTERNATIVE_BRANCH: return createAlternativeBranch();
			case ComBEPackage.PARALLEL_BRANCH: return createParallelBranch();
			case ComBEPackage.STANDARD_NODE: return createStandardNode();
			case ComBEPackage.EMPTY_NODE: return createEmptyNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ComBEPackage.BEHAVIOR_TYPE:
				return createBehaviorTypeFromString(eDataType, initialValue);
			case ComBEPackage.TRACIBILITY_STATUS:
				return createTracibilityStatusFromString(eDataType, initialValue);
			case ComBEPackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ComBEPackage.BEHAVIOR_TYPE:
				return convertBehaviorTypeToString(eDataType, instanceValue);
			case ComBEPackage.TRACIBILITY_STATUS:
				return convertTracibilityStatusToString(eDataType, instanceValue);
			case ComBEPackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorSeq createBehaviorSeq() {
		BehaviorSeqImpl behaviorSeq = new BehaviorSeqImpl();
		return behaviorSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createBehavior() {
		BehaviorImpl behavior = new BehaviorImpl();
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardComponent createStandardComponent() {
		StandardComponentImpl standardComponent = new StandardComponentImpl();
		return standardComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponent createSystemComponent() {
		SystemComponentImpl systemComponent = new SystemComponentImpl();
		return systemComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicSequence createAtomicSequence() {
		AtomicSequenceImpl atomicSequence = new AtomicSequenceImpl();
		return atomicSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeBranch createAlternativeBranch() {
		AlternativeBranchImpl alternativeBranch = new AlternativeBranchImpl();
		return alternativeBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelBranch createParallelBranch() {
		ParallelBranchImpl parallelBranch = new ParallelBranchImpl();
		return parallelBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardNode createStandardNode() {
		StandardNodeImpl standardNode = new StandardNodeImpl();
		return standardNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyNode createEmptyNode() {
		EmptyNodeImpl emptyNode = new EmptyNodeImpl();
		return emptyNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorType createBehaviorTypeFromString(EDataType eDataType, String initialValue) {
		BehaviorType result = BehaviorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBehaviorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracibilityStatus createTracibilityStatusFromString(EDataType eDataType, String initialValue) {
		TracibilityStatus result = TracibilityStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTracibilityStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComBEPackage getComBEPackage() {
		return (ComBEPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComBEPackage getPackage() {
		return ComBEPackage.eINSTANCE;
	}

} //ComBEFactoryImpl
