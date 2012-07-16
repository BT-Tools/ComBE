/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE.impl;

import ComBE.AlternativeBranch;
import ComBE.AtomicSequence;
import ComBE.Behavior;
import ComBE.BehaviorSeq;
import ComBE.BehaviorTree;
import ComBE.BehaviorType;
import ComBE.ComBEFactory;
import ComBE.ComBEPackage;
import ComBE.Component;
import ComBE.EmptyNode;
import ComBE.Node;
import ComBE.Operator;
import ComBE.ParallelBranch;
import ComBE.Requirement;
import ComBE.Root;
import ComBE.Specification;
import ComBE.StandardComponent;
import ComBE.StandardNode;
import ComBE.SystemComponent;
import ComBE.TracibilityStatus;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComBEPackageImpl extends EPackageImpl implements ComBEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum behaviorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tracibilityStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ComBE.ComBEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComBEPackageImpl() {
		super(eNS_URI, ComBEFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComBEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComBEPackage init() {
		if (isInited) return (ComBEPackage)EPackage.Registry.INSTANCE.getEPackage(ComBEPackage.eNS_URI);

		// Obtain or create and register package
		ComBEPackageImpl theComBEPackage = (ComBEPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComBEPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComBEPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theComBEPackage.createPackageContents();

		// Initialize created meta-data
		theComBEPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComBEPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComBEPackage.eNS_URI, theComBEPackage);
		return theComBEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Requirements() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Components() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Root() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Id() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Label() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorSeq() {
		return behaviorSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorSeq_Behaviortype() {
		return (EAttribute)behaviorSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorSeq_Behavior() {
		return (EReference)behaviorSeqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_Int() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_Label() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Behaviortree() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Id() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Label() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Behaviorseqs() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardComponent() {
		return standardComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemComponent() {
		return systemComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorTree() {
		return behaviorTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorTree_Nodes() {
		return (EReference)behaviorTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicSequence() {
		return atomicSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicSequence_Child() {
		return (EReference)atomicSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeBranch() {
		return alternativeBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeBranch_Children() {
		return (EReference)alternativeBranchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelBranch() {
		return parallelBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelBranch_Children() {
		return (EReference)parallelBranchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Label() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Operator() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardNode() {
		return standardNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandardNode_Requirement() {
		return (EReference)standardNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardNode_Tracibilitystatus() {
		return (EAttribute)standardNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandardNode_Component() {
		return (EReference)standardNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandardNode_Behavior() {
		return (EReference)standardNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyNode() {
		return emptyNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBehaviorType() {
		return behaviorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTracibilityStatus() {
		return tracibilityStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComBEFactory getComBEFactory() {
		return (ComBEFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__REQUIREMENTS);
		createEReference(specificationEClass, SPECIFICATION__COMPONENTS);
		createEReference(specificationEClass, SPECIFICATION__ROOT);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__ID);
		createEAttribute(requirementEClass, REQUIREMENT__LABEL);

		behaviorSeqEClass = createEClass(BEHAVIOR_SEQ);
		createEAttribute(behaviorSeqEClass, BEHAVIOR_SEQ__BEHAVIORTYPE);
		createEReference(behaviorSeqEClass, BEHAVIOR_SEQ__BEHAVIOR);

		behaviorEClass = createEClass(BEHAVIOR);
		createEAttribute(behaviorEClass, BEHAVIOR__INT);
		createEAttribute(behaviorEClass, BEHAVIOR__LABEL);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__BEHAVIORTREE);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__ID);
		createEAttribute(componentEClass, COMPONENT__LABEL);
		createEReference(componentEClass, COMPONENT__BEHAVIORSEQS);

		standardComponentEClass = createEClass(STANDARD_COMPONENT);

		systemComponentEClass = createEClass(SYSTEM_COMPONENT);

		behaviorTreeEClass = createEClass(BEHAVIOR_TREE);
		createEReference(behaviorTreeEClass, BEHAVIOR_TREE__NODES);

		atomicSequenceEClass = createEClass(ATOMIC_SEQUENCE);
		createEReference(atomicSequenceEClass, ATOMIC_SEQUENCE__CHILD);

		alternativeBranchEClass = createEClass(ALTERNATIVE_BRANCH);
		createEReference(alternativeBranchEClass, ALTERNATIVE_BRANCH__CHILDREN);

		parallelBranchEClass = createEClass(PARALLEL_BRANCH);
		createEReference(parallelBranchEClass, PARALLEL_BRANCH__CHILDREN);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__LABEL);
		createEAttribute(nodeEClass, NODE__OPERATOR);

		standardNodeEClass = createEClass(STANDARD_NODE);
		createEReference(standardNodeEClass, STANDARD_NODE__REQUIREMENT);
		createEAttribute(standardNodeEClass, STANDARD_NODE__TRACIBILITYSTATUS);
		createEReference(standardNodeEClass, STANDARD_NODE__COMPONENT);
		createEReference(standardNodeEClass, STANDARD_NODE__BEHAVIOR);

		emptyNodeEClass = createEClass(EMPTY_NODE);

		// Create enums
		behaviorTypeEEnum = createEEnum(BEHAVIOR_TYPE);
		tracibilityStatusEEnum = createEEnum(TRACIBILITY_STATUS);
		operatorEEnum = createEEnum(OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		standardComponentEClass.getESuperTypes().add(this.getComponent());
		systemComponentEClass.getESuperTypes().add(this.getComponent());
		atomicSequenceEClass.getESuperTypes().add(this.getBehaviorTree());
		alternativeBranchEClass.getESuperTypes().add(this.getBehaviorTree());
		parallelBranchEClass.getESuperTypes().add(this.getBehaviorTree());
		standardNodeEClass.getESuperTypes().add(this.getNode());
		emptyNodeEClass.getESuperTypes().add(this.getNode());

		// Initialize classes and features; add operations and parameters
		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Components(), this.getComponent(), null, "components", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_Root(), this.getRoot(), null, "root", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Id(), ecorePackage.getEString(), "id", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Label(), ecorePackage.getEString(), "label", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorSeqEClass, BehaviorSeq.class, "BehaviorSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehaviorSeq_Behaviortype(), this.getBehaviorType(), "behaviortype", null, 1, 1, BehaviorSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorSeq_Behavior(), this.getBehavior(), null, "behavior", null, 0, -1, BehaviorSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehavior_Int(), ecorePackage.getEInt(), "int", null, 1, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehavior_Label(), ecorePackage.getEString(), "label", null, 1, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Behaviortree(), this.getBehaviorTree(), null, "behaviortree", null, 1, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Id(), ecorePackage.getEString(), "id", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Label(), ecorePackage.getEString(), "label", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Behaviorseqs(), this.getBehaviorSeq(), null, "behaviorseqs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardComponentEClass, StandardComponent.class, "StandardComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemComponentEClass, SystemComponent.class, "SystemComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(behaviorTreeEClass, BehaviorTree.class, "BehaviorTree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorTree_Nodes(), this.getNode(), null, "nodes", null, 1, -1, BehaviorTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicSequenceEClass, AtomicSequence.class, "AtomicSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicSequence_Child(), this.getBehaviorTree(), null, "child", null, 0, 1, AtomicSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeBranchEClass, AlternativeBranch.class, "AlternativeBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternativeBranch_Children(), this.getBehaviorTree(), null, "children", null, 0, -1, AlternativeBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelBranchEClass, ParallelBranch.class, "ParallelBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallelBranch_Children(), this.getBehaviorTree(), null, "children", null, 0, -1, ParallelBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Label(), ecorePackage.getEString(), "label", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Operator(), this.getOperator(), "operator", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardNodeEClass, StandardNode.class, "StandardNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStandardNode_Requirement(), this.getRequirement(), null, "requirement", null, 1, 1, StandardNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardNode_Tracibilitystatus(), this.getTracibilityStatus(), "tracibilitystatus", null, 1, 1, StandardNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStandardNode_Component(), this.getComponent(), null, "component", null, 1, 1, StandardNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStandardNode_Behavior(), this.getBehavior(), null, "behavior", null, 1, 1, StandardNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyNodeEClass, EmptyNode.class, "EmptyNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(behaviorTypeEEnum, BehaviorType.class, "BehaviorType");
		addEEnumLiteral(behaviorTypeEEnum, BehaviorType.STATE_REALISATION);
		addEEnumLiteral(behaviorTypeEEnum, BehaviorType.SELECTION);
		addEEnumLiteral(behaviorTypeEEnum, BehaviorType.EVENT);
		addEEnumLiteral(behaviorTypeEEnum, BehaviorType.GUARD);
		addEEnumLiteral(behaviorTypeEEnum, BehaviorType.II_EVENT);
		addEEnumLiteral(behaviorTypeEEnum, BehaviorType.IO_EVENT);
		addEEnumLiteral(behaviorTypeEEnum, BehaviorType.EI_EVENT);
		addEEnumLiteral(behaviorTypeEEnum, BehaviorType.EO_EVENT);
		addEEnumLiteral(behaviorTypeEEnum, BehaviorType.ASSERTION);

		initEEnum(tracibilityStatusEEnum, TracibilityStatus.class, "TracibilityStatus");
		addEEnumLiteral(tracibilityStatusEEnum, TracibilityStatus.NONE);
		addEEnumLiteral(tracibilityStatusEEnum, TracibilityStatus.IMPLIED);
		addEEnumLiteral(tracibilityStatusEEnum, TracibilityStatus.MISSING);
		addEEnumLiteral(tracibilityStatusEEnum, TracibilityStatus.UPDATED);
		addEEnumLiteral(tracibilityStatusEEnum, TracibilityStatus.DELETED);
		addEEnumLiteral(tracibilityStatusEEnum, TracibilityStatus.REFINEMENT);

		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.NONE);
		addEEnumLiteral(operatorEEnum, Operator.BRANCH_KILL);
		addEEnumLiteral(operatorEEnum, Operator.CONJUNCTION);
		addEEnumLiteral(operatorEEnum, Operator.DISJUNCTION);
		addEEnumLiteral(operatorEEnum, Operator.MAY);
		addEEnumLiteral(operatorEEnum, Operator.REFERENCE);
		addEEnumLiteral(operatorEEnum, Operator.REVERSION);
		addEEnumLiteral(operatorEEnum, Operator.START_NEW);
		addEEnumLiteral(operatorEEnum, Operator.SYNCHRONISATION);
		addEEnumLiteral(operatorEEnum, Operator.XOR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// StrategoTerm.index
		createStrategoTermAnnotations();
	}

	/**
	 * Initializes the annotations for <b>StrategoTerm.index</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createStrategoTermAnnotations() {
		String source = "StrategoTerm.index";		
		addAnnotation
		  (specificationEClass, 
		   source, 
		   new String[] {
			 "0", "requirements",
			 "1", "components",
			 "2", "root"
		   });		
		addAnnotation
		  (requirementEClass, 
		   source, 
		   new String[] {
			 "0", "id",
			 "1", "label"
		   });		
		addAnnotation
		  (behaviorSeqEClass, 
		   source, 
		   new String[] {
			 "0", "behaviortype",
			 "1", "behavior"
		   });		
		addAnnotation
		  (behaviorEClass, 
		   source, 
		   new String[] {
			 "0", "int",
			 "1", "label"
		   });		
		addAnnotation
		  (rootEClass, 
		   source, 
		   new String[] {
			 "0", "behaviortree"
		   });		
		addAnnotation
		  (standardComponentEClass, 
		   source, 
		   new String[] {
			 "0", "id",
			 "1", "label",
			 "2", "behaviorseqs"
		   });		
		addAnnotation
		  (systemComponentEClass, 
		   source, 
		   new String[] {
			 "0", "id",
			 "1", "label",
			 "2", "behaviorseqs"
		   });		
		addAnnotation
		  (atomicSequenceEClass, 
		   source, 
		   new String[] {
			 "0", "nodes",
			 "1", "child"
		   });		
		addAnnotation
		  (alternativeBranchEClass, 
		   source, 
		   new String[] {
			 "0", "nodes",
			 "1", "children"
		   });		
		addAnnotation
		  (parallelBranchEClass, 
		   source, 
		   new String[] {
			 "0", "nodes",
			 "1", "children"
		   });		
		addAnnotation
		  (standardNodeEClass, 
		   source, 
		   new String[] {
			 "0", "requirement",
			 "1", "tracibilitystatus",
			 "2", "component",
			 "3", "behavior",
			 "4", "label",
			 "5", "operator"
		   });		
		addAnnotation
		  (emptyNodeEClass, 
		   source, 
		   new String[] {
			 "0", "label",
			 "1", "operator"
		   });
	}

} //ComBEPackageImpl
