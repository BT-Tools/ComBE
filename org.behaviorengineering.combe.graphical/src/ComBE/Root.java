/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ComBE.Root#getBehaviortree <em>Behaviortree</em>}</li>
 * </ul>
 * </p>
 *
 * @see ComBE.ComBEPackage#getRoot()
 * @model annotation="StrategoTerm.index 0='behaviortree'"
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviortree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviortree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviortree</em>' containment reference.
	 * @see #setBehaviortree(BehaviorTree)
	 * @see ComBE.ComBEPackage#getRoot_Behaviortree()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BehaviorTree getBehaviortree();

	/**
	 * Sets the value of the '{@link ComBE.Root#getBehaviortree <em>Behaviortree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviortree</em>' containment reference.
	 * @see #getBehaviortree()
	 * @generated
	 */
	void setBehaviortree(BehaviorTree value);

} // Root
