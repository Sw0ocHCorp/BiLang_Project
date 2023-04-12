/**
 */
package ucal3ia.BiLang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucal3ia.BiLang.BiLangPackage;
import ucal3ia.BiLang.DataFiltering;
import ucal3ia.BiLang.FileExtractor;
import ucal3ia.BiLang.FilteringSteps;
import ucal3ia.BiLang.PreprocessingSteps;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Filtering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.BiLang.impl.DataFilteringImpl#getFilteringsteps <em>Filteringsteps</em>}</li>
 *   <li>{@link ucal3ia.BiLang.impl.DataFilteringImpl#getPreprocessingsteps <em>Preprocessingsteps</em>}</li>
 *   <li>{@link ucal3ia.BiLang.impl.DataFilteringImpl#getFileextractor <em>Fileextractor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFilteringImpl extends NamedElementImpl implements DataFiltering {
	/**
	 * The cached value of the '{@link #getFilteringsteps() <em>Filteringsteps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteringsteps()
	 * @generated
	 * @ordered
	 */
	protected EList<FilteringSteps> filteringsteps;

	/**
	 * The cached value of the '{@link #getPreprocessingsteps() <em>Preprocessingsteps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprocessingsteps()
	 * @generated
	 * @ordered
	 */
	protected EList<PreprocessingSteps> preprocessingsteps;

	/**
	 * The cached value of the '{@link #getFileextractor() <em>Fileextractor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileextractor()
	 * @generated
	 * @ordered
	 */
	protected FileExtractor fileextractor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFilteringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BiLangPackage.Literals.DATA_FILTERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilteringSteps> getFilteringsteps() {
		if (filteringsteps == null) {
			filteringsteps = new EObjectContainmentEList<FilteringSteps>(FilteringSteps.class, this,
					BiLangPackage.DATA_FILTERING__FILTERINGSTEPS);
		}
		return filteringsteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreprocessingSteps> getPreprocessingsteps() {
		if (preprocessingsteps == null) {
			preprocessingsteps = new EObjectContainmentEList<PreprocessingSteps>(PreprocessingSteps.class, this,
					BiLangPackage.DATA_FILTERING__PREPROCESSINGSTEPS);
		}
		return preprocessingsteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileExtractor getFileextractor() {
		if (fileextractor != null && fileextractor.eIsProxy()) {
			InternalEObject oldFileextractor = (InternalEObject) fileextractor;
			fileextractor = (FileExtractor) eResolveProxy(oldFileextractor);
			if (fileextractor != oldFileextractor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BiLangPackage.DATA_FILTERING__FILEEXTRACTOR, oldFileextractor, fileextractor));
			}
		}
		return fileextractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileExtractor basicGetFileextractor() {
		return fileextractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileextractor(FileExtractor newFileextractor) {
		FileExtractor oldFileextractor = fileextractor;
		fileextractor = newFileextractor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BiLangPackage.DATA_FILTERING__FILEEXTRACTOR,
					oldFileextractor, fileextractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BiLangPackage.DATA_FILTERING__FILTERINGSTEPS:
			return ((InternalEList<?>) getFilteringsteps()).basicRemove(otherEnd, msgs);
		case BiLangPackage.DATA_FILTERING__PREPROCESSINGSTEPS:
			return ((InternalEList<?>) getPreprocessingsteps()).basicRemove(otherEnd, msgs);
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
		case BiLangPackage.DATA_FILTERING__FILTERINGSTEPS:
			return getFilteringsteps();
		case BiLangPackage.DATA_FILTERING__PREPROCESSINGSTEPS:
			return getPreprocessingsteps();
		case BiLangPackage.DATA_FILTERING__FILEEXTRACTOR:
			if (resolve)
				return getFileextractor();
			return basicGetFileextractor();
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
		case BiLangPackage.DATA_FILTERING__FILTERINGSTEPS:
			getFilteringsteps().clear();
			getFilteringsteps().addAll((Collection<? extends FilteringSteps>) newValue);
			return;
		case BiLangPackage.DATA_FILTERING__PREPROCESSINGSTEPS:
			getPreprocessingsteps().clear();
			getPreprocessingsteps().addAll((Collection<? extends PreprocessingSteps>) newValue);
			return;
		case BiLangPackage.DATA_FILTERING__FILEEXTRACTOR:
			setFileextractor((FileExtractor) newValue);
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
		case BiLangPackage.DATA_FILTERING__FILTERINGSTEPS:
			getFilteringsteps().clear();
			return;
		case BiLangPackage.DATA_FILTERING__PREPROCESSINGSTEPS:
			getPreprocessingsteps().clear();
			return;
		case BiLangPackage.DATA_FILTERING__FILEEXTRACTOR:
			setFileextractor((FileExtractor) null);
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
		case BiLangPackage.DATA_FILTERING__FILTERINGSTEPS:
			return filteringsteps != null && !filteringsteps.isEmpty();
		case BiLangPackage.DATA_FILTERING__PREPROCESSINGSTEPS:
			return preprocessingsteps != null && !preprocessingsteps.isEmpty();
		case BiLangPackage.DATA_FILTERING__FILEEXTRACTOR:
			return fileextractor != null;
		}
		return super.eIsSet(featureID);
	}

} //DataFilteringImpl
