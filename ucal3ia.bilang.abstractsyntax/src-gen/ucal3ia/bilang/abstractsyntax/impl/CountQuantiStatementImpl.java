/**
 */
package ucal3ia.bilang.abstractsyntax.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.CountQuantiStatement;
import ucal3ia.bilang.abstractsyntax.QuantitativeOperator;
import ucal3ia.bilang.abstractsyntax.RangeOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Quanti Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountQuantiStatementImpl#getQuantiOperator <em>Quanti Operator</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountQuantiStatementImpl#getLSide <em>LSide</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountQuantiStatementImpl#getRSide <em>RSide</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountQuantiStatementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountQuantiStatementImpl#getRangeOperator <em>Range Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountQuantiStatementImpl extends MinimalEObjectImpl.Container implements CountQuantiStatement {
	/**
	 * The default value of the '{@link #getQuantiOperator() <em>Quanti Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiOperator()
	 * @generated
	 * @ordered
	 */
	protected static final QuantitativeOperator QUANTI_OPERATOR_EDEFAULT = QuantitativeOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getQuantiOperator() <em>Quanti Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiOperator()
	 * @generated
	 * @ordered
	 */
	protected QuantitativeOperator quantiOperator = QUANTI_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLSide() <em>LSide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSide()
	 * @generated
	 * @ordered
	 */
	protected static final float LSIDE_EDEFAULT = -1.23456792E8F;

	/**
	 * The cached value of the '{@link #getLSide() <em>LSide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSide()
	 * @generated
	 * @ordered
	 */
	protected float lSide = LSIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRSide() <em>RSide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSide()
	 * @generated
	 * @ordered
	 */
	protected static final float RSIDE_EDEFAULT = -1.23456792E8F;

	/**
	 * The cached value of the '{@link #getRSide() <em>RSide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSide()
	 * @generated
	 * @ordered
	 */
	protected float rSide = RSIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected String statement = STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRangeOperator() <em>Range Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeOperator()
	 * @generated
	 * @ordered
	 */
	protected static final RangeOperator RANGE_OPERATOR_EDEFAULT = RangeOperator.LR_INCLUSION;

	/**
	 * The cached value of the '{@link #getRangeOperator() <em>Range Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeOperator()
	 * @generated
	 * @ordered
	 */
	protected RangeOperator rangeOperator = RANGE_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountQuantiStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.COUNT_QUANTI_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitativeOperator getQuantiOperator() {
		return quantiOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiOperator(QuantitativeOperator newQuantiOperator) {
		QuantitativeOperator oldQuantiOperator = quantiOperator;
		quantiOperator = newQuantiOperator == null ? QUANTI_OPERATOR_EDEFAULT : newQuantiOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__QUANTI_OPERATOR, oldQuantiOperator, quantiOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLSide() {
		return lSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLSide(float newLSide) {
		float oldLSide = lSide;
		lSide = newLSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__LSIDE,
					oldLSide, lSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRSide() {
		return rSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSide(float newRSide) {
		float oldRSide = rSide;
		rSide = newRSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__RSIDE,
					oldRSide, rSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(String newStatement) {
		String oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeOperator getRangeOperator() {
		return rangeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeOperator(RangeOperator newRangeOperator) {
		RangeOperator oldRangeOperator = rangeOperator;
		rangeOperator = newRangeOperator == null ? RANGE_OPERATOR_EDEFAULT : newRangeOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__RANGE_OPERATOR, oldRangeOperator, rangeOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__QUANTI_OPERATOR:
			return getQuantiOperator();
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__LSIDE:
			return getLSide();
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__RSIDE:
			return getRSide();
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__STATEMENT:
			return getStatement();
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__RANGE_OPERATOR:
			return getRangeOperator();
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
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__QUANTI_OPERATOR:
			setQuantiOperator((QuantitativeOperator) newValue);
			return;
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__LSIDE:
			setLSide((Float) newValue);
			return;
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__RSIDE:
			setRSide((Float) newValue);
			return;
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__STATEMENT:
			setStatement((String) newValue);
			return;
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__RANGE_OPERATOR:
			setRangeOperator((RangeOperator) newValue);
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
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__QUANTI_OPERATOR:
			setQuantiOperator(QUANTI_OPERATOR_EDEFAULT);
			return;
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__LSIDE:
			setLSide(LSIDE_EDEFAULT);
			return;
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__RSIDE:
			setRSide(RSIDE_EDEFAULT);
			return;
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__STATEMENT:
			setStatement(STATEMENT_EDEFAULT);
			return;
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__RANGE_OPERATOR:
			setRangeOperator(RANGE_OPERATOR_EDEFAULT);
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
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__QUANTI_OPERATOR:
			return quantiOperator != QUANTI_OPERATOR_EDEFAULT;
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__LSIDE:
			return lSide != LSIDE_EDEFAULT;
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__RSIDE:
			return rSide != RSIDE_EDEFAULT;
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__STATEMENT:
			return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
		case AbstractsyntaxPackage.COUNT_QUANTI_STATEMENT__RANGE_OPERATOR:
			return rangeOperator != RANGE_OPERATOR_EDEFAULT;
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
		result.append(" (quantiOperator: ");
		result.append(quantiOperator);
		result.append(", lSide: ");
		result.append(lSide);
		result.append(", rSide: ");
		result.append(rSide);
		result.append(", statement: ");
		result.append(statement);
		result.append(", rangeOperator: ");
		result.append(rangeOperator);
		result.append(')');
		return result.toString();
	}

} //CountQuantiStatementImpl
