/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ComBE.BehaviorTree#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ComBE.ComBEPackage#getBehaviorTree()
 * @model abstract="true"
 * @generated
 */
public interface BehaviorTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link ComBE.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see ComBE.ComBEPackage#getBehaviorTree_Nodes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // BehaviorTree
