/**
 */
package ComBE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ComBE.AtomicSequence#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see ComBE.ComBEPackage#getAtomicSequence()
 * @model annotation="spoofax.term2feature 0='nodes' 1='child'"
 * @generated
 */
public interface AtomicSequence extends BehaviorTree {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(BehaviorTree)
	 * @see ComBE.ComBEPackage#getAtomicSequence_Child()
	 * @model containment="true"
	 * @generated
	 */
	BehaviorTree getChild();

	/**
	 * Sets the value of the '{@link ComBE.AtomicSequence#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(BehaviorTree value);

} // AtomicSequence
