/**
 */
package ucal3ia.BiLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ucal3ia.BiLang.BiLangPackage;
import ucal3ia.BiLang.PreprocessingSteps;
import ucal3ia.BiLang.StatisticalOperation;
import ucal3ia.BiLang.StatisticalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistical Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.BiLang.impl.StatisticalOperationImpl#getPreprocessingsteps <em>Preprocessingsteps</em>}</li>
 *   <li>{@link ucal3ia.BiLang.impl.StatisticalOperationImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticalOperationImpl extends PreprocessingStepsImpl implements StatisticalOperation {
	/**
	 * The cached value of the '{@link #getPreprocessingsteps() <em>Preprocessingsteps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprocessingsteps()
	 * @generated
	 * @ordered
	 */
	protected PreprocessingSteps preprocessingsteps;

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
		return BiLangPackage.Literals.STATISTICAL_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingSteps getPreprocessingsteps() {
		return preprocessingsteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreprocessingsteps(PreprocessingSteps newPreprocessingsteps,
			NotificationChain msgs) {
		PreprocessingSteps oldPreprocessingsteps = preprocessingsteps;
		preprocessingsteps = newPreprocessingsteps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BiLangPackage.STATISTICAL_OPERATION__PREPROCESSINGSTEPS, oldPreprocessingsteps,
					newPreprocessingsteps);
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
	public void setPreprocessingsteps(PreprocessingSteps newPreprocessingsteps) {
		if (newPreprocessingsteps != preprocessingsteps) {
			NotificationChain msgs = null;
			if (preprocessingsteps != null)
				msgs = ((InternalEObject) preprocessingsteps).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BiLangPackage.STATISTICAL_OPERATION__PREPROCESSINGSTEPS, null, msgs);
			if (newPreprocessingsteps != null)
				msgs = ((InternalEObject) newPreprocessingsteps).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BiLangPackage.STATISTICAL_OPERATION__PREPROCESSINGSTEPS, null, msgs);
			msgs = basicSetPreprocessingsteps(newPreprocessingsteps, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BiLangPackage.STATISTICAL_OPERATION__PREPROCESSINGSTEPS, newPreprocessingsteps,
					newPreprocessingsteps));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BiLangPackage.STATISTICAL_OPERATION__OPERATOR,
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
		case BiLangPackage.STATISTICAL_OPERATION__PREPROCESSINGSTEPS:
			return basicSetPreprocessingsteps(null, msgs);
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
		case BiLangPackage.STATISTICAL_OPERATION__PREPROCESSINGSTEPS:
			return getPreprocessingsteps();
		case BiLangPackage.STATISTICAL_OPERATION__OPERATOR:
			return getOperator();
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
		case BiLangPackage.STATISTICAL_OPERATION__PREPROCESSINGSTEPS:
			setPreprocessingsteps((PreprocessingSteps) newValue);
			return;
		case BiLangPackage.STATISTICAL_OPERATION__OPERATOR:
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
		case BiLangPackage.STATISTICAL_OPERATION__PREPROCESSINGSTEPS:
			setPreprocessingsteps((PreprocessingSteps) null);
			return;
		case BiLangPackage.STATISTICAL_OPERATION__OPERATOR:
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
		case BiLangPackage.STATISTICAL_OPERATION__PREPROCESSINGSTEPS:
			return preprocessingsteps != null;
		case BiLangPackage.STATISTICAL_OPERATION__OPERATOR:
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
