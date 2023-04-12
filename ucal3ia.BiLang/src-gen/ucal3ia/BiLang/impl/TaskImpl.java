/**
 */
package ucal3ia.BiLang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucal3ia.BiLang.BiLangPackage;
import ucal3ia.BiLang.DashBoard;
import ucal3ia.BiLang.DataFiltering;
import ucal3ia.BiLang.FileExtractor;
import ucal3ia.BiLang.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.BiLang.impl.TaskImpl#getFileextractor <em>Fileextractor</em>}</li>
 *   <li>{@link ucal3ia.BiLang.impl.TaskImpl#getDatafiltering <em>Datafiltering</em>}</li>
 *   <li>{@link ucal3ia.BiLang.impl.TaskImpl#getDashboard <em>Dashboard</em>}</li>
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
	 * The cached value of the '{@link #getDashboard() <em>Dashboard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashboard()
	 * @generated
	 * @ordered
	 */
	protected EList<DashBoard> dashboard;

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
		return BiLangPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileExtractor> getFileextractor() {
		if (fileextractor == null) {
			fileextractor = new EObjectContainmentEList<FileExtractor>(FileExtractor.class, this,
					BiLangPackage.TASK__FILEEXTRACTOR);
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
					BiLangPackage.TASK__DATAFILTERING);
		}
		return datafiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DashBoard> getDashboard() {
		if (dashboard == null) {
			dashboard = new EObjectContainmentEList<DashBoard>(DashBoard.class, this, BiLangPackage.TASK__DASHBOARD);
		}
		return dashboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BiLangPackage.TASK__FILEEXTRACTOR:
			return ((InternalEList<?>) getFileextractor()).basicRemove(otherEnd, msgs);
		case BiLangPackage.TASK__DATAFILTERING:
			return ((InternalEList<?>) getDatafiltering()).basicRemove(otherEnd, msgs);
		case BiLangPackage.TASK__DASHBOARD:
			return ((InternalEList<?>) getDashboard()).basicRemove(otherEnd, msgs);
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
		case BiLangPackage.TASK__FILEEXTRACTOR:
			return getFileextractor();
		case BiLangPackage.TASK__DATAFILTERING:
			return getDatafiltering();
		case BiLangPackage.TASK__DASHBOARD:
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
		case BiLangPackage.TASK__FILEEXTRACTOR:
			getFileextractor().clear();
			getFileextractor().addAll((Collection<? extends FileExtractor>) newValue);
			return;
		case BiLangPackage.TASK__DATAFILTERING:
			getDatafiltering().clear();
			getDatafiltering().addAll((Collection<? extends DataFiltering>) newValue);
			return;
		case BiLangPackage.TASK__DASHBOARD:
			getDashboard().clear();
			getDashboard().addAll((Collection<? extends DashBoard>) newValue);
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
		case BiLangPackage.TASK__FILEEXTRACTOR:
			getFileextractor().clear();
			return;
		case BiLangPackage.TASK__DATAFILTERING:
			getDatafiltering().clear();
			return;
		case BiLangPackage.TASK__DASHBOARD:
			getDashboard().clear();
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
		case BiLangPackage.TASK__FILEEXTRACTOR:
			return fileextractor != null && !fileextractor.isEmpty();
		case BiLangPackage.TASK__DATAFILTERING:
			return datafiltering != null && !datafiltering.isEmpty();
		case BiLangPackage.TASK__DASHBOARD:
			return dashboard != null && !dashboard.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
