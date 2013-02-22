/**
 */
package ComBE.impl;

import ComBE.BehaviorTree;
import ComBE.ComBEPackage;
import ComBE.Root;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ComBE.impl.RootImpl#getBehaviortree <em>Behaviortree</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends EObjectImpl implements Root {
	/**
	 * The cached value of the '{@link #getBehaviortree() <em>Behaviortree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviortree()
	 * @generated
	 * @ordered
	 */
	protected BehaviorTree behaviortree;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComBEPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTree getBehaviortree() {
		return behaviortree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviortree(BehaviorTree newBehaviortree, NotificationChain msgs) {
		BehaviorTree oldBehaviortree = behaviortree;
		behaviortree = newBehaviortree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComBEPackage.ROOT__BEHAVIORTREE, oldBehaviortree, newBehaviortree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviortree(BehaviorTree newBehaviortree) {
		if (newBehaviortree != behaviortree) {
			NotificationChain msgs = null;
			if (behaviortree != null)
				msgs = ((InternalEObject)behaviortree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComBEPackage.ROOT__BEHAVIORTREE, null, msgs);
			if (newBehaviortree != null)
				msgs = ((InternalEObject)newBehaviortree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComBEPackage.ROOT__BEHAVIORTREE, null, msgs);
			msgs = basicSetBehaviortree(newBehaviortree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComBEPackage.ROOT__BEHAVIORTREE, newBehaviortree, newBehaviortree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComBEPackage.ROOT__BEHAVIORTREE:
				return basicSetBehaviortree(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComBEPackage.ROOT__BEHAVIORTREE:
				return getBehaviortree();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComBEPackage.ROOT__BEHAVIORTREE:
				setBehaviortree((BehaviorTree)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComBEPackage.ROOT__BEHAVIORTREE:
				setBehaviortree((BehaviorTree)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComBEPackage.ROOT__BEHAVIORTREE:
				return behaviortree != null;
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
