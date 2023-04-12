/**
 */
package ucal3ia.bilang.abstractsyntax;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.Plot#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.Plot#getYAxis <em>YAxis</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.Plot#getLocation <em>Location</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.Plot#getColor <em>Color</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.Plot#getThickness <em>Thickness</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getPlot()
 * @model abstract="true"
 * @generated
 */
public interface Plot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis</em>' attribute.
	 * @see #setXAxis(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getPlot_XAxis()
	 * @model
	 * @generated
	 */
	String getXAxis();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.Plot#getXAxis <em>XAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis</em>' attribute.
	 * @see #getXAxis()
	 * @generated
	 */
	void setXAxis(String value);

	/**
	 * Returns the value of the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis</em>' attribute.
	 * @see #setYAxis(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getPlot_YAxis()
	 * @model
	 * @generated
	 */
	String getYAxis();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.Plot#getYAxis <em>YAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis</em>' attribute.
	 * @see #getYAxis()
	 * @generated
	 */
	void setYAxis(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getPlot_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.Plot#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getPlot_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.Plot#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #setThickness(float)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getPlot_Thickness()
	 * @model
	 * @generated
	 */
	float getThickness();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.Plot#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' attribute.
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(float value);

} // Plot
