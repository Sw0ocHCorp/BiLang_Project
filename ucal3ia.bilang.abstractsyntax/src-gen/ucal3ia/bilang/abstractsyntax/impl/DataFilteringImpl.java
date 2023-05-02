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

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.CountPreprocessingStep;
import ucal3ia.bilang.abstractsyntax.DataFiltering;
import ucal3ia.bilang.abstractsyntax.FileExtractor;
import ucal3ia.bilang.abstractsyntax.FilteringStep;
import ucal3ia.bilang.abstractsyntax.PreprocessingStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Filtering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.DataFilteringImpl#getFileextractor <em>Fileextractor</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.DataFilteringImpl#getFilteringstep <em>Filteringstep</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.DataFilteringImpl#getProcessingstep <em>Processingstep</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.DataFilteringImpl#getCountpreprocessingstep <em>Countpreprocessingstep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFilteringImpl extends MinimalEObjectImpl.Container implements DataFiltering {
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
	 * The cached value of the '{@link #getFilteringstep() <em>Filteringstep</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteringstep()
	 * @generated
	 * @ordered
	 */
	protected EList<FilteringStep> filteringstep;

	/**
	 * The cached value of the '{@link #getProcessingstep() <em>Processingstep</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingstep()
	 * @generated
	 * @ordered
	 */
	protected EList<PreprocessingStep> processingstep;

	/**
	 * The cached value of the '{@link #getCountpreprocessingstep() <em>Countpreprocessingstep</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountpreprocessingstep()
	 * @generated
	 * @ordered
	 */
	protected EList<CountPreprocessingStep> countpreprocessingstep;

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
		return AbstractsyntaxPackage.Literals.DATA_FILTERING;
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
							AbstractsyntaxPackage.DATA_FILTERING__FILEEXTRACTOR, oldFileextractor, fileextractor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.DATA_FILTERING__FILEEXTRACTOR,
					oldFileextractor, fileextractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilteringStep> getFilteringstep() {
		if (filteringstep == null) {
			filteringstep = new EObjectContainmentEList<FilteringStep>(FilteringStep.class, this,
					AbstractsyntaxPackage.DATA_FILTERING__FILTERINGSTEP);
		}
		return filteringstep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreprocessingStep> getProcessingstep() {
		if (processingstep == null) {
			processingstep = new EObjectContainmentEList<PreprocessingStep>(PreprocessingStep.class, this,
					AbstractsyntaxPackage.DATA_FILTERING__PROCESSINGSTEP);
		}
		return processingstep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CountPreprocessingStep> getCountpreprocessingstep() {
		if (countpreprocessingstep == null) {
			countpreprocessingstep = new EObjectContainmentEList<CountPreprocessingStep>(CountPreprocessingStep.class,
					this, AbstractsyntaxPackage.DATA_FILTERING__COUNTPREPROCESSINGSTEP);
		}
		return countpreprocessingstep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AbstractsyntaxPackage.DATA_FILTERING__FILTERINGSTEP:
			return ((InternalEList<?>) getFilteringstep()).basicRemove(otherEnd, msgs);
		case AbstractsyntaxPackage.DATA_FILTERING__PROCESSINGSTEP:
			return ((InternalEList<?>) getProcessingstep()).basicRemove(otherEnd, msgs);
		case AbstractsyntaxPackage.DATA_FILTERING__COUNTPREPROCESSINGSTEP:
			return ((InternalEList<?>) getCountpreprocessingstep()).basicRemove(otherEnd, msgs);
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
		case AbstractsyntaxPackage.DATA_FILTERING__FILEEXTRACTOR:
			if (resolve)
				return getFileextractor();
			return basicGetFileextractor();
		case AbstractsyntaxPackage.DATA_FILTERING__FILTERINGSTEP:
			return getFilteringstep();
		case AbstractsyntaxPackage.DATA_FILTERING__PROCESSINGSTEP:
			return getProcessingstep();
		case AbstractsyntaxPackage.DATA_FILTERING__COUNTPREPROCESSINGSTEP:
			return getCountpreprocessingstep();
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
		case AbstractsyntaxPackage.DATA_FILTERING__FILEEXTRACTOR:
			setFileextractor((FileExtractor) newValue);
			return;
		case AbstractsyntaxPackage.DATA_FILTERING__FILTERINGSTEP:
			getFilteringstep().clear();
			getFilteringstep().addAll((Collection<? extends FilteringStep>) newValue);
			return;
		case AbstractsyntaxPackage.DATA_FILTERING__PROCESSINGSTEP:
			getProcessingstep().clear();
			getProcessingstep().addAll((Collection<? extends PreprocessingStep>) newValue);
			return;
		case AbstractsyntaxPackage.DATA_FILTERING__COUNTPREPROCESSINGSTEP:
			getCountpreprocessingstep().clear();
			getCountpreprocessingstep().addAll((Collection<? extends CountPreprocessingStep>) newValue);
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
		case AbstractsyntaxPackage.DATA_FILTERING__FILEEXTRACTOR:
			setFileextractor((FileExtractor) null);
			return;
		case AbstractsyntaxPackage.DATA_FILTERING__FILTERINGSTEP:
			getFilteringstep().clear();
			return;
		case AbstractsyntaxPackage.DATA_FILTERING__PROCESSINGSTEP:
			getProcessingstep().clear();
			return;
		case AbstractsyntaxPackage.DATA_FILTERING__COUNTPREPROCESSINGSTEP:
			getCountpreprocessingstep().clear();
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
		case AbstractsyntaxPackage.DATA_FILTERING__FILEEXTRACTOR:
			return fileextractor != null;
		case AbstractsyntaxPackage.DATA_FILTERING__FILTERINGSTEP:
			return filteringstep != null && !filteringstep.isEmpty();
		case AbstractsyntaxPackage.DATA_FILTERING__PROCESSINGSTEP:
			return processingstep != null && !processingstep.isEmpty();
		case AbstractsyntaxPackage.DATA_FILTERING__COUNTPREPROCESSINGSTEP:
			return countpreprocessingstep != null && !countpreprocessingstep.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataFilteringImpl
