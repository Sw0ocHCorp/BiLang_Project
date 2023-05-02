/**
 */
package ucal3ia.bilang.abstractsyntax.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.CountQualiStatement;
import ucal3ia.bilang.abstractsyntax.QualitativeOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Quali Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountQualiStatementImpl#getQualiOperator <em>Quali Operator</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountQualiStatementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.CountQualiStatementImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountQualiStatementImpl extends MinimalEObjectImpl.Container implements CountQualiStatement {
	/**
	 * The default value of the '{@link #getQualiOperator() <em>Quali Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualiOperator()
	 * @generated
	 * @ordered
	 */
	protected static final QualitativeOperator QUALI_OPERATOR_EDEFAULT = QualitativeOperator.EQUALS;

	/**
	 * The cached value of the '{@link #getQualiOperator() <em>Quali Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualiOperator()
	 * @generated
	 * @ordered
	 */
	protected QualitativeOperator qualiOperator = QUALI_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountQualiStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.COUNT_QUALI_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeOperator getQualiOperator() {
		return qualiOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualiOperator(QualitativeOperator newQualiOperator) {
		QualitativeOperator oldQualiOperator = qualiOperator;
		qualiOperator = newQualiOperator == null ? QUALI_OPERATOR_EDEFAULT : newQualiOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__QUALI_OPERATOR, oldQualiOperator, qualiOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__LABEL,
					oldLabel, label));
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
					AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__QUALI_OPERATOR:
			return getQualiOperator();
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__LABEL:
			return getLabel();
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__STATEMENT:
			return getStatement();
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
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__QUALI_OPERATOR:
			setQualiOperator((QualitativeOperator) newValue);
			return;
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__LABEL:
			setLabel((String) newValue);
			return;
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__STATEMENT:
			setStatement((String) newValue);
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
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__QUALI_OPERATOR:
			setQualiOperator(QUALI_OPERATOR_EDEFAULT);
			return;
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__STATEMENT:
			setStatement(STATEMENT_EDEFAULT);
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
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__QUALI_OPERATOR:
			return qualiOperator != QUALI_OPERATOR_EDEFAULT;
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case AbstractsyntaxPackage.COUNT_QUALI_STATEMENT__STATEMENT:
			return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
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
		result.append(" (qualiOperator: ");
		result.append(qualiOperator);
		result.append(", label: ");
		result.append(label);
		result.append(", statement: ");
		result.append(statement);
		result.append(')');
		return result.toString();
	}

} //CountQualiStatementImpl
