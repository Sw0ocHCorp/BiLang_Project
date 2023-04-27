/**
 */
package ucal3ia.bilang.abstractsyntax.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.DashBoard;
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
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.DashBoardImpl#getPlot <em>Plot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DashBoardImpl extends NamedElementImpl implements DashBoard {
	/**
	 * The cached value of the '{@link #getFileextractor() <em>Fileextractor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileextractor()
	 * @generated
	 * @ordered
	 */
	protected EList<FileExtractor> fileextractor;

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
	public EList<FileExtractor> getFileextractor() {
		if (fileextractor == null) {
			fileextractor = new EObjectResolvingEList<FileExtractor>(FileExtractor.class, this,
					AbstractsyntaxPackage.DASH_BOARD__FILEEXTRACTOR);
		}
		return fileextractor;
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
			return getFileextractor();
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
			getFileextractor().clear();
			getFileextractor().addAll((Collection<? extends FileExtractor>) newValue);
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
			getFileextractor().clear();
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
			return fileextractor != null && !fileextractor.isEmpty();
		case AbstractsyntaxPackage.DASH_BOARD__PLOT:
			return plot != null && !plot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DashBoardImpl
