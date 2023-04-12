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
import ucal3ia.bilang.abstractsyntax.Plot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dash Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.DashBoardImpl#getFileextractor <em>Fileextractor</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.DashBoardImpl#getDatafiltering <em>Datafiltering</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.DashBoardImpl#getPlot <em>Plot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DashBoardImpl extends NamedElementImpl implements DashBoard {
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
	 * The cached value of the '{@link #getDatafiltering() <em>Datafiltering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatafiltering()
	 * @generated
	 * @ordered
	 */
	protected DataFiltering datafiltering;

	/**
	 * The cached value of the '{@link #getPlot() <em>Plot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Plot> plot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashBoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.DASH_BOARD;
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
							AbstractsyntaxPackage.DASH_BOARD__FILEEXTRACTOR, oldFileextractor, fileextractor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.DASH_BOARD__FILEEXTRACTOR,
					oldFileextractor, fileextractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFiltering getDatafiltering() {
		if (datafiltering != null && datafiltering.eIsProxy()) {
			InternalEObject oldDatafiltering = (InternalEObject) datafiltering;
			datafiltering = (DataFiltering) eResolveProxy(oldDatafiltering);
			if (datafiltering != oldDatafiltering) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AbstractsyntaxPackage.DASH_BOARD__DATAFILTERING, oldDatafiltering, datafiltering));
			}
		}
		return datafiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFiltering basicGetDatafiltering() {
		return datafiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatafiltering(DataFiltering newDatafiltering) {
		DataFiltering oldDatafiltering = datafiltering;
		datafiltering = newDatafiltering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.DASH_BOARD__DATAFILTERING,
					oldDatafiltering, datafiltering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plot> getPlot() {
		if (plot == null) {
			plot = new EObjectContainmentEList<Plot>(Plot.class, this, AbstractsyntaxPackage.DASH_BOARD__PLOT);
		}
		return plot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AbstractsyntaxPackage.DASH_BOARD__PLOT:
			return ((InternalEList<?>) getPlot()).basicRemove(otherEnd, msgs);
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
		case AbstractsyntaxPackage.DASH_BOARD__FILEEXTRACTOR:
			if (resolve)
				return getFileextractor();
			return basicGetFileextractor();
		case AbstractsyntaxPackage.DASH_BOARD__DATAFILTERING:
			if (resolve)
				return getDatafiltering();
			return basicGetDatafiltering();
		case AbstractsyntaxPackage.DASH_BOARD__PLOT:
			return getPlot();
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
		case AbstractsyntaxPackage.DASH_BOARD__FILEEXTRACTOR:
			setFileextractor((FileExtractor) newValue);
			return;
		case AbstractsyntaxPackage.DASH_BOARD__DATAFILTERING:
			setDatafiltering((DataFiltering) newValue);
			return;
		case AbstractsyntaxPackage.DASH_BOARD__PLOT:
			getPlot().clear();
			getPlot().addAll((Collection<? extends Plot>) newValue);
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
		case AbstractsyntaxPackage.DASH_BOARD__FILEEXTRACTOR:
			setFileextractor((FileExtractor) null);
			return;
		case AbstractsyntaxPackage.DASH_BOARD__DATAFILTERING:
			setDatafiltering((DataFiltering) null);
			return;
		case AbstractsyntaxPackage.DASH_BOARD__PLOT:
			getPlot().clear();
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
		case AbstractsyntaxPackage.DASH_BOARD__FILEEXTRACTOR:
			return fileextractor != null;
		case AbstractsyntaxPackage.DASH_BOARD__DATAFILTERING:
			return datafiltering != null;
		case AbstractsyntaxPackage.DASH_BOARD__PLOT:
			return plot != null && !plot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DashBoardImpl
