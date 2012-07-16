/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE.tests;

import ComBE.ComBEFactory;
import ComBE.StandardNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Standard Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardNodeTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StandardNodeTest.class);
	}

	/**
	 * Constructs a new Standard Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Standard Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StandardNode getFixture() {
		return (StandardNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComBEFactory.eINSTANCE.createStandardNode());
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

} //StandardNodeTest
