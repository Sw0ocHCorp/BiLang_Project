/**
 */
package ucal3ia.BiLang.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucal3ia.BiLang.BiLangPackage;
import ucal3ia.BiLang.QualitativeFiltering;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualitative Filtering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.BiLang.impl.QualitativeFilteringImpl#getTargetLabel <em>Target Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualitativeFilteringImpl extends FilteringStepsImpl implements QualitativeFiltering {
	/**
	 * The default value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetLabel() <em>Target Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetLabel = TARGET_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualitativeFilteringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BiLangPackage.Literals.QUALITATIVE_FILTERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetLabel() {
		return targetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLabel(String newTargetLabel) {
		String oldTargetLabel = targetLabel;
		targetLabel = newTargetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiLangPackage.QUALITATIVE_FILTERING__TARGET_LABEL,
					oldTargetLabel, targetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BiLangPackage.QUALITATIVE_FILTERING__TARGET_LABEL:
			return getTargetLabel();
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
		case BiLangPackage.QUALITATIVE_FILTERING__TARGET_LABEL:
			setTargetLabel((String) newValue);
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
		case BiLangPackage.QUALITATIVE_FILTERING__TARGET_LABEL:
			setTargetLabel(TARGET_LABEL_EDEFAULT);
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
		case BiLangPackage.QUALITATIVE_FILTERING__TARGET_LABEL:
			return TARGET_LABEL_EDEFAULT == null ? targetLabel != null : !TARGET_LABEL_EDEFAULT.equals(targetLabel);
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
		result.append(" (targetLabel: ");
		result.append(targetLabel);
		result.append(')');
		return result.toString();
	}

} //QualitativeFilteringImpl
