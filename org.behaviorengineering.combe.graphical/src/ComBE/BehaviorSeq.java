/**
 */
package ComBE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ComBE.BehaviorSeq#getBehaviortype <em>Behaviortype</em>}</li>
 *   <li>{@link ComBE.BehaviorSeq#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see ComBE.ComBEPackage#getBehaviorSeq()
 * @model annotation="spoofax.term2feature 0='behaviortype' 1='behavior'"
 * @generated
 */
public interface BehaviorSeq extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviortype</b></em>' attribute.
	 * The literals are from the enumeration {@link ComBE.BehaviorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviortype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviortype</em>' attribute.
	 * @see ComBE.BehaviorType
	 * @see #setBehaviortype(BehaviorType)
	 * @see ComBE.ComBEPackage#getBehaviorSeq_Behaviortype()
	 * @model required="true"
	 * @generated
	 */
	BehaviorType getBehaviortype();

	/**
	 * Sets the value of the '{@link ComBE.BehaviorSeq#getBehaviortype <em>Behaviortype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviortype</em>' attribute.
	 * @see ComBE.BehaviorType
	 * @see #getBehaviortype()
	 * @generated
	 */
	void setBehaviortype(BehaviorType value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link ComBE.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference list.
	 * @see ComBE.ComBEPackage#getBehaviorSeq_Behavior()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehavior();

} // BehaviorSeq
