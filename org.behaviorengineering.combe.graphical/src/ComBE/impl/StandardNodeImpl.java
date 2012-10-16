/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComBE.impl;

import ComBE.Behavior;
import ComBE.ComBEPackage;
import ComBE.Component;
import ComBE.Operator;
import ComBE.Requirement;
import ComBE.StandardNode;
import ComBE.TraceabilityStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ComBE.impl.StandardNodeImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link ComBE.impl.StandardNodeImpl#getTraceabilitystatus <em>Traceabilitystatus</em>}</li>
 *   <li>{@link ComBE.impl.StandardNodeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link ComBE.impl.StandardNodeImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardNodeImpl extends NodeImpl implements StandardNode {

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirement requirement;
	/**
	 * The default value of the '{@link #getTraceabilitystatus() <em>Traceabilitystatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabilitystatus()
	 * @generated
	 * @ordered
	 */
	protected static final TraceabilityStatus TRACEABILITYSTATUS_EDEFAULT = TraceabilityStatus.NONE;
	/**
	 * The cached value of the '{@link #getTraceabilitystatus() <em>Traceabilitystatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabilitystatus()
	 * @generated
	 * @ordered
	 */
	protected TraceabilityStatus traceabilitystatus = TRACEABILITYSTATUS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;
	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComBEPackage.Literals.STANDARD_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getRequirement() {
		if (requirement != null && requirement.eIsProxy()) {
			InternalEObject oldRequirement = (InternalEObject)requirement;
			requirement = (Requirement)eResolveProxy(oldRequirement);
			if (requirement != oldRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComBEPackage.STANDARD_NODE__REQUIREMENT, oldRequirement, requirement));
			}
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement(Requirement newRequirement) {
		Requirement oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComBEPackage.STANDARD_NODE__REQUIREMENT, oldRequirement, requirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityStatus getTraceabilitystatus() {
		return traceabilitystatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceabilitystatus(TraceabilityStatus newTraceabilitystatus) {
		TraceabilityStatus oldTraceabilitystatus = traceabilitystatus;
		traceabilitystatus = newTraceabilitystatus == null ? TRACEABILITYSTATUS_EDEFAULT : newTraceabilitystatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComBEPackage.STANDARD_NODE__TRACEABILITYSTATUS, oldTraceabilitystatus, traceabilitystatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComBEPackage.STANDARD_NODE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComBEPackage.STANDARD_NODE__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (Behavior)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComBEPackage.STANDARD_NODE__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComBEPackage.STANDARD_NODE__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComBEPackage.STANDARD_NODE__REQUIREMENT:
				if (resolve) return getRequirement();
				return basicGetRequirement();
			case ComBEPackage.STANDARD_NODE__TRACEABILITYSTATUS:
				return getTraceabilitystatus();
			case ComBEPackage.STANDARD_NODE__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case ComBEPackage.STANDARD_NODE__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		// Somehow, EMF Compare calls this method with 
		//		featureID = ComBEPackage.STANDARD_NODE__REQUIREMENT
		// 		newValue = instanceof Behavior
		// The if-statement below fixes this. Looks like a bug in EMF Compare?
		if (newValue instanceof Behavior) {
			setBehavior((Behavior)newValue);
			return;
		}
		
		switch (featureID) {
			case ComBEPackage.STANDARD_NODE__REQUIREMENT:
				setRequirement((Requirement)newValue);
				return;
			case ComBEPackage.STANDARD_NODE__TRACEABILITYSTATUS:
				setTraceabilitystatus((TraceabilityStatus)newValue);
				return;
			case ComBEPackage.STANDARD_NODE__COMPONENT:
				setComponent((Component)newValue);
				return;
			case ComBEPackage.STANDARD_NODE__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case ComBEPackage.STANDARD_NODE__LABEL:
				setLabel((String)newValue);
				return;
			case ComBEPackage.STANDARD_NODE__OPERATOR:
				setOperator((Operator)newValue);
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
			case ComBEPackage.STANDARD_NODE__REQUIREMENT:
				setRequirement((Requirement)null);
				return;
			case ComBEPackage.STANDARD_NODE__TRACEABILITYSTATUS:
				setTraceabilitystatus(TRACEABILITYSTATUS_EDEFAULT);
				return;
			case ComBEPackage.STANDARD_NODE__COMPONENT:
				setComponent((Component)null);
				return;
			case ComBEPackage.STANDARD_NODE__BEHAVIOR:
				setBehavior((Behavior)null);
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
			case ComBEPackage.STANDARD_NODE__REQUIREMENT:
				return requirement != null;
			case ComBEPackage.STANDARD_NODE__TRACEABILITYSTATUS:
				return traceabilitystatus != TRACEABILITYSTATUS_EDEFAULT;
			case ComBEPackage.STANDARD_NODE__COMPONENT:
				return component != null;
			case ComBEPackage.STANDARD_NODE__BEHAVIOR:
				return behavior != null;
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
		result.append(" (traceabilitystatus: ");
		result.append(traceabilitystatus);
		result.append(')');
		return result.toString();
	}
}
