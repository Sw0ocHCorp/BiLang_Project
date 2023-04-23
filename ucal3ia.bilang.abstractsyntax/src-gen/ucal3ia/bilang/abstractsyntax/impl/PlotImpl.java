/**
 */
package ucal3ia.bilang.abstractsyntax.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.Plot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.PlotImpl#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.PlotImpl#getYAxis <em>YAxis</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.PlotImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.PlotImpl#getColors <em>Colors</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.impl.PlotImpl#getThickness <em>Thickness</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PlotImpl extends NamedElementImpl implements Plot {
	/**
	 * The default value of the '{@link #getXAxis() <em>XAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxis()
	 * @generated
	 * @ordered
	 */
	protected static final String XAXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXAxis() <em>XAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxis()
	 * @generated
	 * @ordered
	 */
	protected String xAxis = XAXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxis() <em>YAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxis()
	 * @generated
	 * @ordered
	 */
	protected static final String YAXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYAxis() <em>YAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxis()
	 * @generated
	 * @ordered
	 */
	protected String yAxis = YAXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCATION_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected int location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getColors() <em>Colors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColors()
	 * @generated
	 * @ordered
	 */
	protected static final String COLORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColors() <em>Colors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColors()
	 * @generated
	 * @ordered
	 */
	protected String colors = COLORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected static final float THICKNESS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected float thickness = THICKNESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.PLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXAxis() {
		return xAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxis(String newXAxis) {
		String oldXAxis = xAxis;
		xAxis = newXAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.PLOT__XAXIS, oldXAxis, xAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYAxis() {
		return yAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAxis(String newYAxis) {
		String oldYAxis = yAxis;
		yAxis = newYAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.PLOT__YAXIS, oldYAxis, yAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(int newLocation) {
		int oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.PLOT__LOCATION, oldLocation,
					location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColors() {
		return colors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColors(String newColors) {
		String oldColors = colors;
		colors = newColors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.PLOT__COLORS, oldColors,
					colors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThickness() {
		return thickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(float newThickness) {
		float oldThickness = thickness;
		thickness = newThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsyntaxPackage.PLOT__THICKNESS, oldThickness,
					thickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AbstractsyntaxPackage.PLOT__XAXIS:
			return getXAxis();
		case AbstractsyntaxPackage.PLOT__YAXIS:
			return getYAxis();
		case AbstractsyntaxPackage.PLOT__LOCATION:
			return getLocation();
		case AbstractsyntaxPackage.PLOT__COLORS:
			return getColors();
		case AbstractsyntaxPackage.PLOT__THICKNESS:
			return getThickness();
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
		case AbstractsyntaxPackage.PLOT__XAXIS:
			setXAxis((String) newValue);
			return;
		case AbstractsyntaxPackage.PLOT__YAXIS:
			setYAxis((String) newValue);
			return;
		case AbstractsyntaxPackage.PLOT__LOCATION:
			setLocation((Integer) newValue);
			return;
		case AbstractsyntaxPackage.PLOT__COLORS:
			setColors((String) newValue);
			return;
		case AbstractsyntaxPackage.PLOT__THICKNESS:
			setThickness((Float) newValue);
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
		case AbstractsyntaxPackage.PLOT__XAXIS:
			setXAxis(XAXIS_EDEFAULT);
			return;
		case AbstractsyntaxPackage.PLOT__YAXIS:
			setYAxis(YAXIS_EDEFAULT);
			return;
		case AbstractsyntaxPackage.PLOT__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case AbstractsyntaxPackage.PLOT__COLORS:
			setColors(COLORS_EDEFAULT);
			return;
		case AbstractsyntaxPackage.PLOT__THICKNESS:
			setThickness(THICKNESS_EDEFAULT);
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
		case AbstractsyntaxPackage.PLOT__XAXIS:
			return XAXIS_EDEFAULT == null ? xAxis != null : !XAXIS_EDEFAULT.equals(xAxis);
		case AbstractsyntaxPackage.PLOT__YAXIS:
			return YAXIS_EDEFAULT == null ? yAxis != null : !YAXIS_EDEFAULT.equals(yAxis);
		case AbstractsyntaxPackage.PLOT__LOCATION:
			return location != LOCATION_EDEFAULT;
		case AbstractsyntaxPackage.PLOT__COLORS:
			return COLORS_EDEFAULT == null ? colors != null : !COLORS_EDEFAULT.equals(colors);
		case AbstractsyntaxPackage.PLOT__THICKNESS:
			return thickness != THICKNESS_EDEFAULT;
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
		result.append(" (xAxis: ");
		result.append(xAxis);
		result.append(", yAxis: ");
		result.append(yAxis);
		result.append(", location: ");
		result.append(location);
		result.append(", colors: ");
		result.append(colors);
		result.append(", thickness: ");
		result.append(thickness);
		result.append(')');
		return result.toString();
	}

} //PlotImpl
