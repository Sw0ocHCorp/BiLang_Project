/**
 */
package ucal3ia.bilang.abstractsyntax.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.NullReplacement;
import ucal3ia.bilang.abstractsyntax.StatisticalOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Null Replacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.NullReplacementImpl#getColName <em>Col Name</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.NullReplacementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.NullReplacementImpl#getStatisticaloperation <em>Statisticaloperation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NullReplacementImpl extends MinimalEObjectImpl.Container implements NullReplacement {
	/**
	 * The default value of the '{@link #getColName() <em>Col Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColName()
	 * @generated
	 * @ordered
	 */
	protected static final String COL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColName() <em>Col Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColName()
	 * @generated
	 * @ordered
	 */
	protected String colName = COL_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getStatisticaloperation() <em>Statisticaloperation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticaloperation()
	 * @generated
	 * @ordered
	 */
	protected StatisticalOperation statisticaloperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullReplacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.NULL_REPLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColName() {
		return colName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColName(String newColName) {
		String oldColName = colName;
		colName = newColName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.NULL_REPLACEMENT__COL_NAME,
					oldColName, colName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.NULL_REPLACEMENT__LABEL,
					oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticalOperation getStatisticaloperation() {
		return statisticaloperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatisticaloperation(StatisticalOperation newStatisticaloperation,
			NotificationChain msgs) {
		StatisticalOperation oldStatisticaloperation = statisticaloperation;
		statisticaloperation = newStatisticaloperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.NULL_REPLACEMENT__STATISTICALOPERATION, oldStatisticaloperation,
					newStatisticaloperation);
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
	public void setStatisticaloperation(StatisticalOperation newStatisticaloperation) {
		if (newStatisticaloperation != statisticaloperation) {
			NotificationChain msgs = null;
			if (statisticaloperation != null)
				msgs = ((InternalEObject) statisticaloperation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.NULL_REPLACEMENT__STATISTICALOPERATION, null,
						msgs);
			if (newStatisticaloperation != null)
				msgs = ((InternalEObject) newStatisticaloperation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.NULL_REPLACEMENT__STATISTICALOPERATION, null,
						msgs);
			msgs = basicSetStatisticaloperation(newStatisticaloperation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.NULL_REPLACEMENT__STATISTICALOPERATION, newStatisticaloperation,
					newStatisticaloperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AbstractsyntaxPackage.NULL_REPLACEMENT__STATISTICALOPERATION:
			return basicSetStatisticaloperation(null, msgs);
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
		case AbstractsyntaxPackage.NULL_REPLACEMENT__COL_NAME:
			return getColName();
		case AbstractsyntaxPackage.NULL_REPLACEMENT__LABEL:
			return getLabel();
		case AbstractsyntaxPackage.NULL_REPLACEMENT__STATISTICALOPERATION:
			return getStatisticaloperation();
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
		case AbstractsyntaxPackage.NULL_REPLACEMENT__COL_NAME:
			setColName((String) newValue);
			return;
		case AbstractsyntaxPackage.NULL_REPLACEMENT__LABEL:
			setLabel((String) newValue);
			return;
		case AbstractsyntaxPackage.NULL_REPLACEMENT__STATISTICALOPERATION:
			setStatisticaloperation((StatisticalOperation) newValue);
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
		case AbstractsyntaxPackage.NULL_REPLACEMENT__COL_NAME:
			setColName(COL_NAME_EDEFAULT);
			return;
		case AbstractsyntaxPackage.NULL_REPLACEMENT__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case AbstractsyntaxPackage.NULL_REPLACEMENT__STATISTICALOPERATION:
			setStatisticaloperation((StatisticalOperation) null);
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
		case AbstractsyntaxPackage.NULL_REPLACEMENT__COL_NAME:
			return COL_NAME_EDEFAULT == null ? colName != null : !COL_NAME_EDEFAULT.equals(colName);
		case AbstractsyntaxPackage.NULL_REPLACEMENT__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case AbstractsyntaxPackage.NULL_REPLACEMENT__STATISTICALOPERATION:
			return statisticaloperation != null;
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
		result.append(" (colName: ");
		result.append(colName);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //NullReplacementImpl
