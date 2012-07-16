/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE.impl;

import ComBE.Behavior;
import ComBE.BehaviorSeq;
import ComBE.BehaviorType;
import ComBE.ComBEPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ComBE.impl.BehaviorSeqImpl#getBehaviortype <em>Behaviortype</em>}</li>
 *   <li>{@link ComBE.impl.BehaviorSeqImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorSeqImpl extends EObjectImpl implements BehaviorSeq {
	/**
	 * The default value of the '{@link #getBehaviortype() <em>Behaviortype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviortype()
	 * @generated
	 * @ordered
	 */
	protected static final BehaviorType BEHAVIORTYPE_EDEFAULT = BehaviorType.STATE_REALISATION;

	/**
	 * The cached value of the '{@link #getBehaviortype() <em>Behaviortype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviortype()
	 * @generated
	 * @ordered
	 */
	protected BehaviorType behaviortype = BEHAVIORTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorSeqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComBEPackage.Literals.BEHAVIOR_SEQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorType getBehaviortype() {
		return behaviortype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviortype(BehaviorType newBehaviortype) {
		BehaviorType oldBehaviortype = behaviortype;
		behaviortype = newBehaviortype == null ? BEHAVIORTYPE_EDEFAULT : newBehaviortype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComBEPackage.BEHAVIOR_SEQ__BEHAVIORTYPE, oldBehaviortype, behaviortype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehavior() {
		if (behavior == null) {
			behavior = new EObjectContainmentEList<Behavior>(Behavior.class, this, ComBEPackage.BEHAVIOR_SEQ__BEHAVIOR);
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComBEPackage.BEHAVIOR_SEQ__BEHAVIOR:
				return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
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
			case ComBEPackage.BEHAVIOR_SEQ__BEHAVIORTYPE:
				return getBehaviortype();
			case ComBEPackage.BEHAVIOR_SEQ__BEHAVIOR:
				return getBehavior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComBEPackage.BEHAVIOR_SEQ__BEHAVIORTYPE:
				setBehaviortype((BehaviorType)newValue);
				return;
			case ComBEPackage.BEHAVIOR_SEQ__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
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
			case ComBEPackage.BEHAVIOR_SEQ__BEHAVIORTYPE:
				setBehaviortype(BEHAVIORTYPE_EDEFAULT);
				return;
			case ComBEPackage.BEHAVIOR_SEQ__BEHAVIOR:
				getBehavior().clear();
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
			case ComBEPackage.BEHAVIOR_SEQ__BEHAVIORTYPE:
				return behaviortype != BEHAVIORTYPE_EDEFAULT;
			case ComBEPackage.BEHAVIOR_SEQ__BEHAVIOR:
				return behavior != null && !behavior.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (behaviortype: ");
		result.append(behaviortype);
		result.append(')');
		return result.toString();
	}

} //BehaviorSeqImpl
