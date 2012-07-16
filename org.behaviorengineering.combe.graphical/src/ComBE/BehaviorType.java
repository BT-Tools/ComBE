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
 * A representation of the literals of the enumeration '<em><b>Behavior Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ComBE.ComBEPackage#getBehaviorType()
 * @model
 * @generated
 */
public enum BehaviorType implements Enumerator {
	/**
	 * The '<em><b>State Realisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATE_REALISATION_VALUE
	 * @generated
	 * @ordered
	 */
	STATE_REALISATION(0, "StateRealisation", "#S"),

	/**
	 * The '<em><b>Selection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SELECTION(1, "Selection", "#L"),

	/**
	 * The '<em><b>Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT(2, "Event", "#E"),

	/**
	 * The '<em><b>Guard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARD_VALUE
	 * @generated
	 * @ordered
	 */
	GUARD(3, "Guard", "#G"),

	/**
	 * The '<em><b>II Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #II_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	II_EVENT(4, "IIEvent", "#II"),

	/**
	 * The '<em><b>IO Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IO_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	IO_EVENT(5, "IOEvent", "#IO"),

	/**
	 * The '<em><b>EI Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EI_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	EI_EVENT(6, "EIEvent", "#EI"),

	/**
	 * The '<em><b>EO Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EO_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	EO_EVENT(7, "EOEvent", "#EO"),

	/**
	 * The '<em><b>Assertion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERTION_VALUE
	 * @generated
	 * @ordered
	 */
	ASSERTION(8, "Assertion", "#A");

	/**
	 * The '<em><b>State Realisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>State Realisation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATE_REALISATION
	 * @model name="StateRealisation" literal="#S"
	 * @generated
	 * @ordered
	 */
	public static final int STATE_REALISATION_VALUE = 0;

	/**
	 * The '<em><b>Selection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Selection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECTION
	 * @model name="Selection" literal="#L"
	 * @generated
	 * @ordered
	 */
	public static final int SELECTION_VALUE = 1;

	/**
	 * The '<em><b>Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT
	 * @model name="Event" literal="#E"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_VALUE = 2;

	/**
	 * The '<em><b>Guard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUARD
	 * @model name="Guard" literal="#G"
	 * @generated
	 * @ordered
	 */
	public static final int GUARD_VALUE = 3;

	/**
	 * The '<em><b>II Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>II Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #II_EVENT
	 * @model name="IIEvent" literal="#II"
	 * @generated
	 * @ordered
	 */
	public static final int II_EVENT_VALUE = 4;

	/**
	 * The '<em><b>IO Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IO Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IO_EVENT
	 * @model name="IOEvent" literal="#IO"
	 * @generated
	 * @ordered
	 */
	public static final int IO_EVENT_VALUE = 5;

	/**
	 * The '<em><b>EI Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EI Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EI_EVENT
	 * @model name="EIEvent" literal="#EI"
	 * @generated
	 * @ordered
	 */
	public static final int EI_EVENT_VALUE = 6;

	/**
	 * The '<em><b>EO Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EO Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EO_EVENT
	 * @model name="EOEvent" literal="#EO"
	 * @generated
	 * @ordered
	 */
	public static final int EO_EVENT_VALUE = 7;

	/**
	 * The '<em><b>Assertion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assertion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSERTION
	 * @model name="Assertion" literal="#A"
	 * @generated
	 * @ordered
	 */
	public static final int ASSERTION_VALUE = 8;

	/**
	 * An array of all the '<em><b>Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BehaviorType[] VALUES_ARRAY =
		new BehaviorType[] {
			STATE_REALISATION,
			SELECTION,
			EVENT,
			GUARD,
			II_EVENT,
			IO_EVENT,
			EI_EVENT,
			EO_EVENT,
			ASSERTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Behavior Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BehaviorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Behavior Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BehaviorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behavior Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BehaviorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behavior Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorType get(int value) {
		switch (value) {
			case STATE_REALISATION_VALUE: return STATE_REALISATION;
			case SELECTION_VALUE: return SELECTION;
			case EVENT_VALUE: return EVENT;
			case GUARD_VALUE: return GUARD;
			case II_EVENT_VALUE: return II_EVENT;
			case IO_EVENT_VALUE: return IO_EVENT;
			case EI_EVENT_VALUE: return EI_EVENT;
			case EO_EVENT_VALUE: return EO_EVENT;
			case ASSERTION_VALUE: return ASSERTION;
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
	private BehaviorType(int value, String name, String literal) {
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
	
} //BehaviorType
