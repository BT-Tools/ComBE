/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE.tests;

import ComBE.ComBEFactory;
import ComBE.StandardComponent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Standard Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardComponentTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StandardComponentTest.class);
	}

	/**
	 * Constructs a new Standard Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Standard Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StandardComponent getFixture() {
		return (StandardComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComBEFactory.eINSTANCE.createStandardComponent());
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

} //StandardComponentTest
