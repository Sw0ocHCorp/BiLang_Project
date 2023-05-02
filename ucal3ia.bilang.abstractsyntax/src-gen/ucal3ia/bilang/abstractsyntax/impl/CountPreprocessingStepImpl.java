/**
 */
package ucal3ia.bilang.abstractsyntax.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.CountPreprocessingStep;
import ucal3ia.bilang.abstractsyntax.CountQualiStatement;
import ucal3ia.bilang.abstractsyntax.CountQuantiStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Preprocessing Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountPreprocessingStepImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountPreprocessingStepImpl#getCountquantistatement <em>Countquantistatement</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountPreprocessingStepImpl#getCountqualistatement <em>Countqualistatement</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountPreprocessingStepImpl#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountPreprocessingStepImpl extends MinimalEObjectImpl.Container implements CountPreprocessingStep {
	/**
	 * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected static final String AXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected String axis = AXIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCountquantistatement() <em>Countquantistatement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountquantistatement()
	 * @generated
	 * @ordered
	 */
	protected EList<CountQuantiStatement> countquantistatement;

	/**
	 * The cached value of the '{@link #getCountqualistatement() <em>Countqualistatement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountqualistatement()
	 * @generated
	 * @ordered
	 */
	protected EList<CountQualiStatement> countqualistatement;

	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected String reference = REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountPreprocessingStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.COUNT_PREPROCESSING_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(String newAxis) {
		String oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__AXIS,
					oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CountQuantiStatement> getCountquantistatement() {
		if (countquantistatement == null) {
			countquantistatement = new EObjectContainmentEList<CountQuantiStatement>(CountQuantiStatement.class, this,
					AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUANTISTATEMENT);
		}
		return countquantistatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CountQualiStatement> getCountqualistatement() {
		if (countqualistatement == null) {
			countqualistatement = new EObjectContainmentEList<CountQualiStatement>(CountQualiStatement.class, this,
					AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUALISTATEMENT);
		}
		return countqualistatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUANTISTATEMENT:
			return ((InternalEList<?>) getCountquantistatement()).basicRemove(otherEnd, msgs);
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUALISTATEMENT:
			return ((InternalEList<?>) getCountqualistatement()).basicRemove(otherEnd, msgs);
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
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__AXIS:
			return getAxis();
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUANTISTATEMENT:
			return getCountquantistatement();
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUALISTATEMENT:
			return getCountqualistatement();
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__REFERENCE:
			return getReference();
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
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__AXIS:
			setAxis((String) newValue);
			return;
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUANTISTATEMENT:
			getCountquantistatement().clear();
			getCountquantistatement().addAll((Collection<? extends CountQuantiStatement>) newValue);
			return;
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUALISTATEMENT:
			getCountqualistatement().clear();
			getCountqualistatement().addAll((Collection<? extends CountQualiStatement>) newValue);
			return;
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__REFERENCE:
			setReference((String) newValue);
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
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__AXIS:
			setAxis(AXIS_EDEFAULT);
			return;
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUANTISTATEMENT:
			getCountquantistatement().clear();
			return;
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUALISTATEMENT:
			getCountqualistatement().clear();
			return;
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__REFERENCE:
			setReference(REFERENCE_EDEFAULT);
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
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__AXIS:
			return AXIS_EDEFAULT == null ? axis != null : !AXIS_EDEFAULT.equals(axis);
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUANTISTATEMENT:
			return countquantistatement != null && !countquantistatement.isEmpty();
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__COUNTQUALISTATEMENT:
			return countqualistatement != null && !countqualistatement.isEmpty();
		case AbstractsyntaxPackage.COUNT_PREPROCESSING_STEP__REFERENCE:
			return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (axis: ");
		result.append(axis);
		result.append(", reference: ");
		result.append(reference);
		result.append(')');
		return result.toString();
	}

} //CountPreprocessingStepImpl
