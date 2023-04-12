/**
 */
package ucal3ia.BiLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucal3ia.BiLang.BiLangPackage;
import ucal3ia.BiLang.MathOperation;
import ucal3ia.BiLang.MathOperator;
import ucal3ia.BiLang.PreprocessingSteps;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.BiLang.impl.MathOperationImpl#getLside <em>Lside</em>}</li>
 *   <li>{@link ucal3ia.BiLang.impl.MathOperationImpl#getRside <em>Rside</em>}</li>
 *   <li>{@link ucal3ia.BiLang.impl.MathOperationImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MathOperationImpl extends PreprocessingStepsImpl implements MathOperation {
	/**
	 * The cached value of the '{@link #getLside() <em>Lside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLside()
	 * @generated
	 * @ordered
	 */
	protected PreprocessingSteps lside;

	/**
	 * The cached value of the '{@link #getRside() <em>Rside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRside()
	 * @generated
	 * @ordered
	 */
	protected PreprocessingSteps rside;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final MathOperator OPERATOR_EDEFAULT = MathOperator.PLUS;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected MathOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MathOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BiLangPackage.Literals.MATH_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingSteps getLside() {
		return lside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLside(PreprocessingSteps newLside, NotificationChain msgs) {
		PreprocessingSteps oldLside = lside;
		lside = newLside;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BiLangPackage.MATH_OPERATION__LSIDE, oldLside, newLside);
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
	public void setLside(PreprocessingSteps newLside) {
		if (newLside != lside) {
			NotificationChain msgs = null;
			if (lside != null)
				msgs = ((InternalEObject) lside).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BiLangPackage.MATH_OPERATION__LSIDE, null, msgs);
			if (newLside != null)
				msgs = ((InternalEObject) newLside).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BiLangPackage.MATH_OPERATION__LSIDE, null, msgs);
			msgs = basicSetLside(newLside, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiLangPackage.MATH_OPERATION__LSIDE, newLside,
					newLside));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingSteps getRside() {
		return rside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRside(PreprocessingSteps newRside, NotificationChain msgs) {
		PreprocessingSteps oldRside = rside;
		rside = newRside;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BiLangPackage.MATH_OPERATION__RSIDE, oldRside, newRside);
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
	public void setRside(PreprocessingSteps newRside) {
		if (newRside != rside) {
			NotificationChain msgs = null;
			if (rside != null)
				msgs = ((InternalEObject) rside).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BiLangPackage.MATH_OPERATION__RSIDE, null, msgs);
			if (newRside != null)
				msgs = ((InternalEObject) newRside).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BiLangPackage.MATH_OPERATION__RSIDE, null, msgs);
			msgs = basicSetRside(newRside, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiLangPackage.MATH_OPERATION__RSIDE, newRside,
					newRside));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(MathOperator newOperator) {
		MathOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiLangPackage.MATH_OPERATION__OPERATOR, oldOperator,
					operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BiLangPackage.MATH_OPERATION__LSIDE:
			return basicSetLside(null, msgs);
		case BiLangPackage.MATH_OPERATION__RSIDE:
			return basicSetRside(null, msgs);
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
		case BiLangPackage.MATH_OPERATION__LSIDE:
			return getLside();
		case BiLangPackage.MATH_OPERATION__RSIDE:
			return getRside();
		case BiLangPackage.MATH_OPERATION__OPERATOR:
			return getOperator();
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
		case BiLangPackage.MATH_OPERATION__LSIDE:
			setLside((PreprocessingSteps) newValue);
			return;
		case BiLangPackage.MATH_OPERATION__RSIDE:
			setRside((PreprocessingSteps) newValue);
			return;
		case BiLangPackage.MATH_OPERATION__OPERATOR:
			setOperator((MathOperator) newValue);
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
		case BiLangPackage.MATH_OPERATION__LSIDE:
			setLside((PreprocessingSteps) null);
			return;
		case BiLangPackage.MATH_OPERATION__RSIDE:
			setRside((PreprocessingSteps) null);
			return;
		case BiLangPackage.MATH_OPERATION__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
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
		case BiLangPackage.MATH_OPERATION__LSIDE:
			return lside != null;
		case BiLangPackage.MATH_OPERATION__RSIDE:
			return rside != null;
		case BiLangPackage.MATH_OPERATION__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //MathOperationImpl
