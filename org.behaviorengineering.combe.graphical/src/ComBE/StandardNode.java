/**
 */
package ComBE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ComBE.StandardNode#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link ComBE.StandardNode#getTraceabilitystatus <em>Traceabilitystatus</em>}</li>
 *   <li>{@link ComBE.StandardNode#getComponent <em>Component</em>}</li>
 *   <li>{@link ComBE.StandardNode#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see ComBE.ComBEPackage#getStandardNode()
 * @model annotation="spoofax.term2feature 0='requirement' 1='traceabilitystatus' 2='component' 3='behavior' 4='label' 5='operator'"
 * @generated
 */
public interface StandardNode extends Node {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(Requirement)
	 * @see ComBE.ComBEPackage#getStandardNode_Requirement()
	 * @model required="true"
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link ComBE.StandardNode#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

	/**
	 * Returns the value of the '<em><b>Traceabilitystatus</b></em>' attribute.
	 * The literals are from the enumeration {@link ComBE.TraceabilityStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traceabilitystatus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceabilitystatus</em>' attribute.
	 * @see ComBE.TraceabilityStatus
	 * @see #setTraceabilitystatus(TraceabilityStatus)
	 * @see ComBE.ComBEPackage#getStandardNode_Traceabilitystatus()
	 * @model required="true"
	 * @generated
	 */
	TraceabilityStatus getTraceabilitystatus();

	/**
	 * Sets the value of the '{@link ComBE.StandardNode#getTraceabilitystatus <em>Traceabilitystatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traceabilitystatus</em>' attribute.
	 * @see ComBE.TraceabilityStatus
	 * @see #getTraceabilitystatus()
	 * @generated
	 */
	void setTraceabilitystatus(TraceabilityStatus value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see ComBE.ComBEPackage#getStandardNode_Component()
	 * @model required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link ComBE.StandardNode#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see ComBE.ComBEPackage#getStandardNode_Behavior()
	 * @model required="true"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link ComBE.StandardNode#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

} // StandardNode
