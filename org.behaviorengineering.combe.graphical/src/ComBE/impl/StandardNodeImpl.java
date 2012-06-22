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
import ComBE.TracibilityStatus;

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
 *   <li>{@link ComBE.impl.StandardNodeImpl#getTracibilitystatus <em>Tracibilitystatus</em>}</li>
 *   <li>{@link ComBE.impl.StandardNodeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link ComBE.impl.StandardNodeImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link ComBE.impl.StandardNodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link ComBE.impl.StandardNodeImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardNodeImpl extends NodeImpl implements StandardNode {

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
			case ComBEPackage.STANDARD_NODE__TRACIBILITYSTATUS:
				setTracibilitystatus((TracibilityStatus)newValue);
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
}
