/**
 */
package ucal3ia.BiLang.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucal3ia.BiLang.BiLangPackage;
import ucal3ia.BiLang.colReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>col Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.BiLang.impl.colReferenceImpl#getColLabel <em>Col Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class colReferenceImpl extends PreprocessingStepsImpl implements colReference {
	/**
	 * The default value of the '{@link #getColLabel() <em>Col Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String COL_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColLabel() <em>Col Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColLabel()
	 * @generated
	 * @ordered
	 */
	protected String colLabel = COL_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected colReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BiLangPackage.Literals.COL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColLabel() {
		return colLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColLabel(String newColLabel) {
		String oldColLabel = colLabel;
		colLabel = newColLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiLangPackage.COL_REFERENCE__COL_LABEL, oldColLabel,
					colLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BiLangPackage.COL_REFERENCE__COL_LABEL:
			return getColLabel();
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
		case BiLangPackage.COL_REFERENCE__COL_LABEL:
			setColLabel((String) newValue);
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
		case BiLangPackage.COL_REFERENCE__COL_LABEL:
			setColLabel(COL_LABEL_EDEFAULT);
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
		case BiLangPackage.COL_REFERENCE__COL_LABEL:
			return COL_LABEL_EDEFAULT == null ? colLabel != null : !COL_LABEL_EDEFAULT.equals(colLabel);
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
		result.append(" (colLabel: ");
		result.append(colLabel);
		result.append(')');
		return result.toString();
	}

} //colReferenceImpl
