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
import ucal3ia.bilang.abstractsyntax.StatisticalOperation;
import ucal3ia.bilang.abstractsyntax.StatisticalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistical Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.StatisticalOperationImpl#getColreference <em>Colreference</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.StatisticalOperationImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticalOperationImpl extends PreprocessingStepImpl implements StatisticalOperation {
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
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final StatisticalOperator OPERATOR_EDEFAULT = StatisticalOperator.MEAN;
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected StatisticalOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticalOperationImpl() {
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
	public StatisticalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(StatisticalOperator newOperator) {
		StatisticalOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.STATISTICAL_OPERATION__OPERATOR,
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
		case AbstractsyntaxPackage.STATISTICAL_OPERATION__OPERATOR:
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
		case AbstractsyntaxPackage.STATISTICAL_OPERATION__COLREFERENCE:
			setColreference((ColReference) newValue);
			return;
		case AbstractsyntaxPackage.STATISTICAL_OPERATION__OPERATOR:
			setOperator((StatisticalOperator) newValue);
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
		case AbstractsyntaxPackage.STATISTICAL_OPERATION__OPERATOR:
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
		case AbstractsyntaxPackage.STATISTICAL_OPERATION__COLREFERENCE:
			return colreference != null;
		case AbstractsyntaxPackage.STATISTICAL_OPERATION__OPERATOR:
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

} //StatisticalOperationImpl
