/**
 */
package ucal3ia.bilang.abstractsyntax.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.ColReference;
import ucal3ia.bilang.abstractsyntax.SatisticalOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satistical Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.SatisticalOperationImpl#getColreference <em>Colreference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatisticalOperationImpl extends ProcessingStepImpl implements SatisticalOperation {
	/**
	 * The cached value of the '{@link #getColreference() <em>Colreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColreference()
	 * @generated
	 * @ordered
	 */
	protected ColReference colreference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisticalOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.STATISTICAL_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColReference getColreference() {
		return colreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColreference(ColReference newColreference, NotificationChain msgs) {
		ColReference oldColreference = colreference;
		colreference = newColreference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.STATISTICAL_OPERATION__COLREFERENCE, oldColreference, newColreference);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColreference(ColReference newColreference) {
		if (newColreference != colreference) {
			NotificationChain msgs = null;
			if (colreference != null)
				msgs = ((InternalEObject) colreference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.STATISTICAL_OPERATION__COLREFERENCE, null, msgs);
			if (newColreference != null)
				msgs = ((InternalEObject) newColreference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.STATISTICAL_OPERATION__COLREFERENCE, null, msgs);
			msgs = basicSetColreference(newColreference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.STATISTICAL_OPERATION__COLREFERENCE, newColreference, newColreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AbstractsyntaxPackage.STATISTICAL_OPERATION__COLREFERENCE:
			return basicSetColreference(null, msgs);
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
		case AbstractsyntaxPackage.STATISTICAL_OPERATION__COLREFERENCE:
			return getColreference();
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
		case AbstractsyntaxPackage.STATISTICAL_OPERATION__COLREFERENCE:
			setColreference((ColReference) newValue);
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
		case AbstractsyntaxPackage.STATISTICAL_OPERATION__COLREFERENCE:
			setColreference((ColReference) null);
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
		case AbstractsyntaxPackage.STATISTICAL_OPERATION__COLREFERENCE:
			return colreference != null;
		}
		return super.eIsSet(featureID);
	}

} //SatisticalOperationImpl
