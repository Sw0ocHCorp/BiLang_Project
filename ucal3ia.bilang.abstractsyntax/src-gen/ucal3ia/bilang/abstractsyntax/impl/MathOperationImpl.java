/**
 */
package ucal3ia.bilang.abstractsyntax.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.MathOperation;
import ucal3ia.bilang.abstractsyntax.MathOperator;
import ucal3ia.bilang.abstractsyntax.PreprocessingStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.MathOperationImpl#getLside <em>Lside</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.MathOperationImpl#getRside <em>Rside</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.MathOperationImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MathOperationImpl extends PreprocessingStepImpl implements MathOperation {
	/**
	 * The cached value of the '{@link #getLside() <em>Lside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLside()
	 * @generated
	 * @ordered
	 */
	protected PreprocessingStep lside;

	/**
	 * The cached value of the '{@link #getRside() <em>Rside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRside()
	 * @generated
	 * @ordered
	 */
	protected PreprocessingStep rside;

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
		return AbstractsyntaxPackage.Literals.MATH_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingStep getLside() {
		return lside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLside(PreprocessingStep newLside, NotificationChain msgs) {
		PreprocessingStep oldLside = lside;
		lside = newLside;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.MATH_OPERATION__LSIDE, oldLside, newLside);
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
	public void setLside(PreprocessingStep newLside) {
		if (newLside != lside) {
			NotificationChain msgs = null;
			if (lside != null)
				msgs = ((InternalEObject) lside).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.MATH_OPERATION__LSIDE, null, msgs);
			if (newLside != null)
				msgs = ((InternalEObject) newLside).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.MATH_OPERATION__LSIDE, null, msgs);
			msgs = basicSetLside(newLside, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MATH_OPERATION__LSIDE, newLside,
					newLside));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingStep getRside() {
		return rside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRside(PreprocessingStep newRside, NotificationChain msgs) {
		PreprocessingStep oldRside = rside;
		rside = newRside;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.MATH_OPERATION__RSIDE, oldRside, newRside);
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
	public void setRside(PreprocessingStep newRside) {
		if (newRside != rside) {
			NotificationChain msgs = null;
			if (rside != null)
				msgs = ((InternalEObject) rside).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.MATH_OPERATION__RSIDE, null, msgs);
			if (newRside != null)
				msgs = ((InternalEObject) newRside).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.MATH_OPERATION__RSIDE, null, msgs);
			msgs = basicSetRside(newRside, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MATH_OPERATION__RSIDE, newRside,
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.MATH_OPERATION__OPERATOR,
					oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AbstractsyntaxPackage.MATH_OPERATION__LSIDE:
			return basicSetLside(null, msgs);
		case AbstractsyntaxPackage.MATH_OPERATION__RSIDE:
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
		case AbstractsyntaxPackage.MATH_OPERATION__LSIDE:
			return getLside();
		case AbstractsyntaxPackage.MATH_OPERATION__RSIDE:
			return getRside();
		case AbstractsyntaxPackage.MATH_OPERATION__OPERATOR:
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
		case AbstractsyntaxPackage.MATH_OPERATION__LSIDE:
			setLside((PreprocessingStep) newValue);
			return;
		case AbstractsyntaxPackage.MATH_OPERATION__RSIDE:
			setRside((PreprocessingStep) newValue);
			return;
		case AbstractsyntaxPackage.MATH_OPERATION__OPERATOR:
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
		case AbstractsyntaxPackage.MATH_OPERATION__LSIDE:
			setLside((PreprocessingStep) null);
			return;
		case AbstractsyntaxPackage.MATH_OPERATION__RSIDE:
			setRside((PreprocessingStep) null);
			return;
		case AbstractsyntaxPackage.MATH_OPERATION__OPERATOR:
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
		case AbstractsyntaxPackage.MATH_OPERATION__LSIDE:
			return lside != null;
		case AbstractsyntaxPackage.MATH_OPERATION__RSIDE:
			return rside != null;
		case AbstractsyntaxPackage.MATH_OPERATION__OPERATOR:
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
