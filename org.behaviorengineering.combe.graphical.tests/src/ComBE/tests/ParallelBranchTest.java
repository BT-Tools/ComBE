/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE.tests;

import ComBE.ComBEFactory;
import ComBE.ParallelBranch;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parallel Branch</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParallelBranchTest extends BehaviorTreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParallelBranchTest.class);
	}

	/**
	 * Constructs a new Parallel Branch test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelBranchTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parallel Branch test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParallelBranch getFixture() {
		return (ParallelBranch)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ComBEFactory.eINSTANCE.createParallelBranch());
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

} //ParallelBranchTest
