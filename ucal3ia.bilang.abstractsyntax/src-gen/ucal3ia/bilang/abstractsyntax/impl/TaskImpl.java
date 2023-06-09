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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.DashBoard;
import ucal3ia.bilang.abstractsyntax.DataFiltering;
import ucal3ia.bilang.abstractsyntax.FileExtractor;
import ucal3ia.bilang.abstractsyntax.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.TaskImpl#getFileextractor <em>Fileextractor</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.TaskImpl#getDatafiltering <em>Datafiltering</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.TaskImpl#getDashboard <em>Dashboard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NamedElementImpl implements Task {
	/**
	 * The cached value of the '{@link #getFileextractor() <em>Fileextractor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileextractor()
	 * @generated
	 * @ordered
	 */
	protected EList<FileExtractor> fileextractor;

	/**
	 * The cached value of the '{@link #getDatafiltering() <em>Datafiltering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatafiltering()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFiltering> datafiltering;

	/**
	 * The cached value of the '{@link #getDashboard() <em>Dashboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashboard()
	 * @generated
	 * @ordered
	 */
	protected DashBoard dashboard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileExtractor> getFileextractor() {
		if (fileextractor == null) {
			fileextractor = new EObjectContainmentEList<FileExtractor>(FileExtractor.class, this,
					AbstractsyntaxPackage.TASK__FILEEXTRACTOR);
		}
		return fileextractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFiltering> getDatafiltering() {
		if (datafiltering == null) {
			datafiltering = new EObjectContainmentEList<DataFiltering>(DataFiltering.class, this,
					AbstractsyntaxPackage.TASK__DATAFILTERING);
		}
		return datafiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DashBoard getDashboard() {
		return dashboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDashboard(DashBoard newDashboard, NotificationChain msgs) {
		DashBoard oldDashboard = dashboard;
		dashboard = newDashboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.TASK__DASHBOARD, oldDashboard, newDashboard);
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
	public void setDashboard(DashBoard newDashboard) {
		if (newDashboard != dashboard) {
			NotificationChain msgs = null;
			if (dashboard != null)
				msgs = ((InternalEObject) dashboard).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.TASK__DASHBOARD, null, msgs);
			if (newDashboard != null)
				msgs = ((InternalEObject) newDashboard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.TASK__DASHBOARD, null, msgs);
			msgs = basicSetDashboard(newDashboard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.TASK__DASHBOARD, newDashboard,
					newDashboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AbstractsyntaxPackage.TASK__FILEEXTRACTOR:
			return ((InternalEList<?>) getFileextractor()).basicRemove(otherEnd, msgs);
		case AbstractsyntaxPackage.TASK__DATAFILTERING:
			return ((InternalEList<?>) getDatafiltering()).basicRemove(otherEnd, msgs);
		case AbstractsyntaxPackage.TASK__DASHBOARD:
			return basicSetDashboard(null, msgs);
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
		case AbstractsyntaxPackage.TASK__FILEEXTRACTOR:
			return getFileextractor();
		case AbstractsyntaxPackage.TASK__DATAFILTERING:
			return getDatafiltering();
		case AbstractsyntaxPackage.TASK__DASHBOARD:
			return getDashboard();
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
		case AbstractsyntaxPackage.TASK__FILEEXTRACTOR:
			getFileextractor().clear();
			getFileextractor().addAll((Collection<? extends FileExtractor>) newValue);
			return;
		case AbstractsyntaxPackage.TASK__DATAFILTERING:
			getDatafiltering().clear();
			getDatafiltering().addAll((Collection<? extends DataFiltering>) newValue);
			return;
		case AbstractsyntaxPackage.TASK__DASHBOARD:
			setDashboard((DashBoard) newValue);
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
		case AbstractsyntaxPackage.TASK__FILEEXTRACTOR:
			getFileextractor().clear();
			return;
		case AbstractsyntaxPackage.TASK__DATAFILTERING:
			getDatafiltering().clear();
			return;
		case AbstractsyntaxPackage.TASK__DASHBOARD:
			setDashboard((DashBoard) null);
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
		case AbstractsyntaxPackage.TASK__FILEEXTRACTOR:
			return fileextractor != null && !fileextractor.isEmpty();
		case AbstractsyntaxPackage.TASK__DATAFILTERING:
			return datafiltering != null && !datafiltering.isEmpty();
		case AbstractsyntaxPackage.TASK__DASHBOARD:
			return dashboard != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
