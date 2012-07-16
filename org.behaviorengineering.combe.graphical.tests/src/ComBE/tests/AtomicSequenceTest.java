/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE.tests;

import ComBE.AtomicSequence;
import ComBE.ComBEFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atomic Sequence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicSequenceTest extends BehaviorTreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtomicSequenceTest.class);
	}

	/**
	 * Constructs a new Atomic Sequence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicSequenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atomic Sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AtomicSequence getFixture() {
		return (AtomicSequence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComBEFactory.eINSTANCE.createAtomicSequence());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AtomicSequenceTest
