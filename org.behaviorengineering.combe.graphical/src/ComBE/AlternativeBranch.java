/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ComBE.AlternativeBranch#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see ComBE.ComBEPackage#getAlternativeBranch()
 * @model annotation="StrategoTerm.index 0='nodes' 1='children'"
 * @generated
 */
public interface AlternativeBranch extends BehaviorTree {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link ComBE.BehaviorTree}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see ComBE.ComBEPackage#getAlternativeBranch_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviorTree> getChildren();

} // AlternativeBranch
