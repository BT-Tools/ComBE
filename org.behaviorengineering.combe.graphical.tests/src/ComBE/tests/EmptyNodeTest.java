/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE.tests;

import ComBE.ComBEFactory;
import ComBE.EmptyNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Empty Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmptyNodeTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmptyNodeTest.class);
	}

	/**
	 * Constructs a new Empty Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Empty Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EmptyNode getFixture() {
		return (EmptyNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComBEFactory.eINSTANCE.createEmptyNode());
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

} //EmptyNodeTest
