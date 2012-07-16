/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tracibility Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ComBE.ComBEPackage#getTracibilityStatus()
 * @model
 * @generated
 */
public enum TracibilityStatus implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", ""),

	/**
	 * The '<em><b>Implied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLIED_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLIED(1, "Implied", "+"),

	/**
	 * The '<em><b>Missing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISSING_VALUE
	 * @generated
	 * @ordered
	 */
	MISSING(2, "Missing", "-"),

	/**
	 * The '<em><b>Updated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATED_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATED(3, "Updated", "++"),

	/**
	 * The '<em><b>Deleted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETED_VALUE
	 * @generated
	 * @ordered
	 */
	DELETED(4, "Deleted", "--"),

	/**
	 * The '<em><b>Refinement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFINEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REFINEMENT(5, "Refinement", "+-");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None" literal=""
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Implied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Implied</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLIED
	 * @model name="Implied" literal="+"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLIED_VALUE = 1;

	/**
	 * The '<em><b>Missing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Missing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MISSING
	 * @model name="Missing" literal="-"
	 * @generated
	 * @ordered
	 */
	public static final int MISSING_VALUE = 2;

	/**
	 * The '<em><b>Updated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Updated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATED
	 * @model name="Updated" literal="++"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATED_VALUE = 3;

	/**
	 * The '<em><b>Deleted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deleted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETED
	 * @model name="Deleted" literal="--"
	 * @generated
	 * @ordered
	 */
	public static final int DELETED_VALUE = 4;

	/**
	 * The '<em><b>Refinement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Refinement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFINEMENT
	 * @model name="Refinement" literal="+-"
	 * @generated
	 * @ordered
	 */
	public static final int REFINEMENT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Tracibility Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TracibilityStatus[] VALUES_ARRAY =
		new TracibilityStatus[] {
			NONE,
			IMPLIED,
			MISSING,
			UPDATED,
			DELETED,
			REFINEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Tracibility Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TracibilityStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tracibility Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TracibilityStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TracibilityStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tracibility Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TracibilityStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TracibilityStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tracibility Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TracibilityStatus get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case IMPLIED_VALUE: return IMPLIED;
			case MISSING_VALUE: return MISSING;
			case UPDATED_VALUE: return UPDATED;
			case DELETED_VALUE: return DELETED;
			case REFINEMENT_VALUE: return REFINEMENT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TracibilityStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TracibilityStatus
