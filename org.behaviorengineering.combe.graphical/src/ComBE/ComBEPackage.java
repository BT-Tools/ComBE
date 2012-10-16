/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ComBE.ComBEFactory
 * @model kind="package"
 * @generated
 */
public interface ComBEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComBE";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ComBE";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComBE";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComBEPackage eINSTANCE = ComBE.impl.ComBEPackageImpl.init();

	/**
	 * The meta object id for the '{@link ComBE.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.SpecificationImpl
	 * @see ComBE.impl.ComBEPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__REQUIREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ROOT = 2;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ComBE.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.RequirementImpl
	 * @see ComBE.impl.ComBEPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ComBE.impl.BehaviorSeqImpl <em>Behavior Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.BehaviorSeqImpl
	 * @see ComBE.impl.ComBEPackageImpl#getBehaviorSeq()
	 * @generated
	 */
	int BEHAVIOR_SEQ = 2;

	/**
	 * The feature id for the '<em><b>Behaviortype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SEQ__BEHAVIORTYPE = 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SEQ__BEHAVIOR = 1;

	/**
	 * The number of structural features of the '<em>Behavior Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SEQ_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ComBE.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.BehaviorImpl
	 * @see ComBE.impl.ComBEPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 3;

	/**
	 * The feature id for the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__INT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ComBE.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.RootImpl
	 * @see ComBE.impl.ComBEPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 4;

	/**
	 * The feature id for the '<em><b>Behaviortree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__BEHAVIORTREE = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ComBE.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.ComponentImpl
	 * @see ComBE.impl.ComBEPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Behaviorseqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BEHAVIORSEQS = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ComBE.impl.StandardComponentImpl <em>Standard Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.StandardComponentImpl
	 * @see ComBE.impl.ComBEPackageImpl#getStandardComponent()
	 * @generated
	 */
	int STANDARD_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COMPONENT__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COMPONENT__LABEL = COMPONENT__LABEL;

	/**
	 * The feature id for the '<em><b>Behaviorseqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COMPONENT__BEHAVIORSEQS = COMPONENT__BEHAVIORSEQS;

	/**
	 * The number of structural features of the '<em>Standard Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ComBE.impl.SystemComponentImpl <em>System Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.SystemComponentImpl
	 * @see ComBE.impl.ComBEPackageImpl#getSystemComponent()
	 * @generated
	 */
	int SYSTEM_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__LABEL = COMPONENT__LABEL;

	/**
	 * The feature id for the '<em><b>Behaviorseqs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT__BEHAVIORSEQS = COMPONENT__BEHAVIORSEQS;

	/**
	 * The number of structural features of the '<em>System Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ComBE.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.BehaviorTreeImpl
	 * @see ComBE.impl.ComBEPackageImpl#getBehaviorTree()
	 * @generated
	 */
	int BEHAVIOR_TREE = 8;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE__NODES = 0;

	/**
	 * The number of structural features of the '<em>Behavior Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ComBE.impl.AtomicSequenceImpl <em>Atomic Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.AtomicSequenceImpl
	 * @see ComBE.impl.ComBEPackageImpl#getAtomicSequence()
	 * @generated
	 */
	int ATOMIC_SEQUENCE = 9;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SEQUENCE__NODES = BEHAVIOR_TREE__NODES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SEQUENCE__CHILD = BEHAVIOR_TREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SEQUENCE_FEATURE_COUNT = BEHAVIOR_TREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ComBE.impl.AlternativeBranchImpl <em>Alternative Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.AlternativeBranchImpl
	 * @see ComBE.impl.ComBEPackageImpl#getAlternativeBranch()
	 * @generated
	 */
	int ALTERNATIVE_BRANCH = 10;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_BRANCH__NODES = BEHAVIOR_TREE__NODES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_BRANCH__CHILDREN = BEHAVIOR_TREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_BRANCH_FEATURE_COUNT = BEHAVIOR_TREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ComBE.impl.ParallelBranchImpl <em>Parallel Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.ParallelBranchImpl
	 * @see ComBE.impl.ComBEPackageImpl#getParallelBranch()
	 * @generated
	 */
	int PARALLEL_BRANCH = 11;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_BRANCH__NODES = BEHAVIOR_TREE__NODES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_BRANCH__CHILDREN = BEHAVIOR_TREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_BRANCH_FEATURE_COUNT = BEHAVIOR_TREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ComBE.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.NodeImpl
	 * @see ComBE.impl.ComBEPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ComBE.impl.StandardNodeImpl <em>Standard Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.StandardNodeImpl
	 * @see ComBE.impl.ComBEPackageImpl#getStandardNode()
	 * @generated
	 */
	int STANDARD_NODE = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__OPERATOR = NODE__OPERATOR;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__REQUIREMENT = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Traceabilitystatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__TRACEABILITYSTATUS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__COMPONENT = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE__BEHAVIOR = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Standard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ComBE.impl.EmptyNodeImpl <em>Empty Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.impl.EmptyNodeImpl
	 * @see ComBE.impl.ComBEPackageImpl#getEmptyNode()
	 * @generated
	 */
	int EMPTY_NODE = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE__OPERATOR = NODE__OPERATOR;

	/**
	 * The number of structural features of the '<em>Empty Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ComBE.BehaviorType <em>Behavior Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.BehaviorType
	 * @see ComBE.impl.ComBEPackageImpl#getBehaviorType()
	 * @generated
	 */
	int BEHAVIOR_TYPE = 15;

	/**
	 * The meta object id for the '{@link ComBE.TraceabilityStatus <em>Traceability Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.TraceabilityStatus
	 * @see ComBE.impl.ComBEPackageImpl#getTraceabilityStatus()
	 * @generated
	 */
	int TRACEABILITY_STATUS = 16;

	/**
	 * The meta object id for the '{@link ComBE.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComBE.Operator
	 * @see ComBE.impl.ComBEPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 17;


	/**
	 * Returns the meta object for class '{@link ComBE.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see ComBE.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link ComBE.Specification#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see ComBE.Specification#getRequirements()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link ComBE.Specification#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see ComBE.Specification#getComponents()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Components();

	/**
	 * Returns the meta object for the containment reference '{@link ComBE.Specification#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see ComBE.Specification#getRoot()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Root();

	/**
	 * Returns the meta object for class '{@link ComBE.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see ComBE.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link ComBE.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ComBE.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the attribute '{@link ComBE.Requirement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see ComBE.Requirement#getLabel()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Label();

	/**
	 * Returns the meta object for class '{@link ComBE.BehaviorSeq <em>Behavior Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Seq</em>'.
	 * @see ComBE.BehaviorSeq
	 * @generated
	 */
	EClass getBehaviorSeq();

	/**
	 * Returns the meta object for the attribute '{@link ComBE.BehaviorSeq#getBehaviortype <em>Behaviortype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behaviortype</em>'.
	 * @see ComBE.BehaviorSeq#getBehaviortype()
	 * @see #getBehaviorSeq()
	 * @generated
	 */
	EAttribute getBehaviorSeq_Behaviortype();

	/**
	 * Returns the meta object for the containment reference list '{@link ComBE.BehaviorSeq#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior</em>'.
	 * @see ComBE.BehaviorSeq#getBehavior()
	 * @see #getBehaviorSeq()
	 * @generated
	 */
	EReference getBehaviorSeq_Behavior();

	/**
	 * Returns the meta object for class '{@link ComBE.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see ComBE.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link ComBE.Behavior#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int</em>'.
	 * @see ComBE.Behavior#getInt()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Int();

	/**
	 * Returns the meta object for the attribute '{@link ComBE.Behavior#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see ComBE.Behavior#getLabel()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Label();

	/**
	 * Returns the meta object for class '{@link ComBE.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see ComBE.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link ComBE.Root#getBehaviortree <em>Behaviortree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviortree</em>'.
	 * @see ComBE.Root#getBehaviortree()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Behaviortree();

	/**
	 * Returns the meta object for class '{@link ComBE.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see ComBE.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link ComBE.Component#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ComBE.Component#getId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link ComBE.Component#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see ComBE.Component#getLabel()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link ComBE.Component#getBehaviorseqs <em>Behaviorseqs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviorseqs</em>'.
	 * @see ComBE.Component#getBehaviorseqs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Behaviorseqs();

	/**
	 * Returns the meta object for class '{@link ComBE.StandardComponent <em>Standard Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Component</em>'.
	 * @see ComBE.StandardComponent
	 * @generated
	 */
	EClass getStandardComponent();

	/**
	 * Returns the meta object for class '{@link ComBE.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Component</em>'.
	 * @see ComBE.SystemComponent
	 * @generated
	 */
	EClass getSystemComponent();

	/**
	 * Returns the meta object for class '{@link ComBE.BehaviorTree <em>Behavior Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Tree</em>'.
	 * @see ComBE.BehaviorTree
	 * @generated
	 */
	EClass getBehaviorTree();

	/**
	 * Returns the meta object for the containment reference list '{@link ComBE.BehaviorTree#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see ComBE.BehaviorTree#getNodes()
	 * @see #getBehaviorTree()
	 * @generated
	 */
	EReference getBehaviorTree_Nodes();

	/**
	 * Returns the meta object for class '{@link ComBE.AtomicSequence <em>Atomic Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Sequence</em>'.
	 * @see ComBE.AtomicSequence
	 * @generated
	 */
	EClass getAtomicSequence();

	/**
	 * Returns the meta object for the containment reference '{@link ComBE.AtomicSequence#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see ComBE.AtomicSequence#getChild()
	 * @see #getAtomicSequence()
	 * @generated
	 */
	EReference getAtomicSequence_Child();

	/**
	 * Returns the meta object for class '{@link ComBE.AlternativeBranch <em>Alternative Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Branch</em>'.
	 * @see ComBE.AlternativeBranch
	 * @generated
	 */
	EClass getAlternativeBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link ComBE.AlternativeBranch#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see ComBE.AlternativeBranch#getChildren()
	 * @see #getAlternativeBranch()
	 * @generated
	 */
	EReference getAlternativeBranch_Children();

	/**
	 * Returns the meta object for class '{@link ComBE.ParallelBranch <em>Parallel Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Branch</em>'.
	 * @see ComBE.ParallelBranch
	 * @generated
	 */
	EClass getParallelBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link ComBE.ParallelBranch#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see ComBE.ParallelBranch#getChildren()
	 * @see #getParallelBranch()
	 * @generated
	 */
	EReference getParallelBranch_Children();

	/**
	 * Returns the meta object for class '{@link ComBE.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see ComBE.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link ComBE.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see ComBE.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Label();

	/**
	 * Returns the meta object for the attribute '{@link ComBE.Node#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ComBE.Node#getOperator()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Operator();

	/**
	 * Returns the meta object for class '{@link ComBE.StandardNode <em>Standard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Node</em>'.
	 * @see ComBE.StandardNode
	 * @generated
	 */
	EClass getStandardNode();

	/**
	 * Returns the meta object for the reference '{@link ComBE.StandardNode#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see ComBE.StandardNode#getRequirement()
	 * @see #getStandardNode()
	 * @generated
	 */
	EReference getStandardNode_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link ComBE.StandardNode#getTraceabilitystatus <em>Traceabilitystatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traceabilitystatus</em>'.
	 * @see ComBE.StandardNode#getTraceabilitystatus()
	 * @see #getStandardNode()
	 * @generated
	 */
	EAttribute getStandardNode_Traceabilitystatus();

	/**
	 * Returns the meta object for the reference '{@link ComBE.StandardNode#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see ComBE.StandardNode#getComponent()
	 * @see #getStandardNode()
	 * @generated
	 */
	EReference getStandardNode_Component();

	/**
	 * Returns the meta object for the reference '{@link ComBE.StandardNode#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see ComBE.StandardNode#getBehavior()
	 * @see #getStandardNode()
	 * @generated
	 */
	EReference getStandardNode_Behavior();

	/**
	 * Returns the meta object for class '{@link ComBE.EmptyNode <em>Empty Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Node</em>'.
	 * @see ComBE.EmptyNode
	 * @generated
	 */
	EClass getEmptyNode();

	/**
	 * Returns the meta object for enum '{@link ComBE.BehaviorType <em>Behavior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behavior Type</em>'.
	 * @see ComBE.BehaviorType
	 * @generated
	 */
	EEnum getBehaviorType();

	/**
	 * Returns the meta object for enum '{@link ComBE.TraceabilityStatus <em>Traceability Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Traceability Status</em>'.
	 * @see ComBE.TraceabilityStatus
	 * @generated
	 */
	EEnum getTraceabilityStatus();

	/**
	 * Returns the meta object for enum '{@link ComBE.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see ComBE.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComBEFactory getComBEFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ComBE.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.SpecificationImpl
		 * @see ComBE.impl.ComBEPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__REQUIREMENTS = eINSTANCE.getSpecification_Requirements();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__COMPONENTS = eINSTANCE.getSpecification_Components();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__ROOT = eINSTANCE.getSpecification_Root();

		/**
		 * The meta object literal for the '{@link ComBE.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.RequirementImpl
		 * @see ComBE.impl.ComBEPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__LABEL = eINSTANCE.getRequirement_Label();

		/**
		 * The meta object literal for the '{@link ComBE.impl.BehaviorSeqImpl <em>Behavior Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.BehaviorSeqImpl
		 * @see ComBE.impl.ComBEPackageImpl#getBehaviorSeq()
		 * @generated
		 */
		EClass BEHAVIOR_SEQ = eINSTANCE.getBehaviorSeq();

		/**
		 * The meta object literal for the '<em><b>Behaviortype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_SEQ__BEHAVIORTYPE = eINSTANCE.getBehaviorSeq_Behaviortype();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_SEQ__BEHAVIOR = eINSTANCE.getBehaviorSeq_Behavior();

		/**
		 * The meta object literal for the '{@link ComBE.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.BehaviorImpl
		 * @see ComBE.impl.ComBEPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__INT = eINSTANCE.getBehavior_Int();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__LABEL = eINSTANCE.getBehavior_Label();

		/**
		 * The meta object literal for the '{@link ComBE.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.RootImpl
		 * @see ComBE.impl.ComBEPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Behaviortree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__BEHAVIORTREE = eINSTANCE.getRoot_Behaviortree();

		/**
		 * The meta object literal for the '{@link ComBE.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.ComponentImpl
		 * @see ComBE.impl.ComBEPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__LABEL = eINSTANCE.getComponent_Label();

		/**
		 * The meta object literal for the '<em><b>Behaviorseqs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BEHAVIORSEQS = eINSTANCE.getComponent_Behaviorseqs();

		/**
		 * The meta object literal for the '{@link ComBE.impl.StandardComponentImpl <em>Standard Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.StandardComponentImpl
		 * @see ComBE.impl.ComBEPackageImpl#getStandardComponent()
		 * @generated
		 */
		EClass STANDARD_COMPONENT = eINSTANCE.getStandardComponent();

		/**
		 * The meta object literal for the '{@link ComBE.impl.SystemComponentImpl <em>System Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.SystemComponentImpl
		 * @see ComBE.impl.ComBEPackageImpl#getSystemComponent()
		 * @generated
		 */
		EClass SYSTEM_COMPONENT = eINSTANCE.getSystemComponent();

		/**
		 * The meta object literal for the '{@link ComBE.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.BehaviorTreeImpl
		 * @see ComBE.impl.ComBEPackageImpl#getBehaviorTree()
		 * @generated
		 */
		EClass BEHAVIOR_TREE = eINSTANCE.getBehaviorTree();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE__NODES = eINSTANCE.getBehaviorTree_Nodes();

		/**
		 * The meta object literal for the '{@link ComBE.impl.AtomicSequenceImpl <em>Atomic Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.AtomicSequenceImpl
		 * @see ComBE.impl.ComBEPackageImpl#getAtomicSequence()
		 * @generated
		 */
		EClass ATOMIC_SEQUENCE = eINSTANCE.getAtomicSequence();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_SEQUENCE__CHILD = eINSTANCE.getAtomicSequence_Child();

		/**
		 * The meta object literal for the '{@link ComBE.impl.AlternativeBranchImpl <em>Alternative Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.AlternativeBranchImpl
		 * @see ComBE.impl.ComBEPackageImpl#getAlternativeBranch()
		 * @generated
		 */
		EClass ALTERNATIVE_BRANCH = eINSTANCE.getAlternativeBranch();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_BRANCH__CHILDREN = eINSTANCE.getAlternativeBranch_Children();

		/**
		 * The meta object literal for the '{@link ComBE.impl.ParallelBranchImpl <em>Parallel Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.ParallelBranchImpl
		 * @see ComBE.impl.ComBEPackageImpl#getParallelBranch()
		 * @generated
		 */
		EClass PARALLEL_BRANCH = eINSTANCE.getParallelBranch();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_BRANCH__CHILDREN = eINSTANCE.getParallelBranch_Children();

		/**
		 * The meta object literal for the '{@link ComBE.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.NodeImpl
		 * @see ComBE.impl.ComBEPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__OPERATOR = eINSTANCE.getNode_Operator();

		/**
		 * The meta object literal for the '{@link ComBE.impl.StandardNodeImpl <em>Standard Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.StandardNodeImpl
		 * @see ComBE.impl.ComBEPackageImpl#getStandardNode()
		 * @generated
		 */
		EClass STANDARD_NODE = eINSTANCE.getStandardNode();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_NODE__REQUIREMENT = eINSTANCE.getStandardNode_Requirement();

		/**
		 * The meta object literal for the '<em><b>Traceabilitystatus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_NODE__TRACEABILITYSTATUS = eINSTANCE.getStandardNode_Traceabilitystatus();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_NODE__COMPONENT = eINSTANCE.getStandardNode_Component();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_NODE__BEHAVIOR = eINSTANCE.getStandardNode_Behavior();

		/**
		 * The meta object literal for the '{@link ComBE.impl.EmptyNodeImpl <em>Empty Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.impl.EmptyNodeImpl
		 * @see ComBE.impl.ComBEPackageImpl#getEmptyNode()
		 * @generated
		 */
		EClass EMPTY_NODE = eINSTANCE.getEmptyNode();

		/**
		 * The meta object literal for the '{@link ComBE.BehaviorType <em>Behavior Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.BehaviorType
		 * @see ComBE.impl.ComBEPackageImpl#getBehaviorType()
		 * @generated
		 */
		EEnum BEHAVIOR_TYPE = eINSTANCE.getBehaviorType();

		/**
		 * The meta object literal for the '{@link ComBE.TraceabilityStatus <em>Traceability Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.TraceabilityStatus
		 * @see ComBE.impl.ComBEPackageImpl#getTraceabilityStatus()
		 * @generated
		 */
		EEnum TRACEABILITY_STATUS = eINSTANCE.getTraceabilityStatus();

		/**
		 * The meta object literal for the '{@link ComBE.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComBE.Operator
		 * @see ComBE.impl.ComBEPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //ComBEPackage
