/**
 */
package ucal3ia.bilang.abstractsyntax;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satistical Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.SatisticalOperation#getColreference <em>Colreference</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getSatisticalOperation()
 * @model
 * @generated
 */
public interface SatisticalOperation extends ProcessingStep {
	/**
	 * Returns the value of the '<em><b>Colreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colreference</em>' containment reference.
	 * @see #setColreference(ColReference)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getSatisticalOperation_Colreference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ColReference getColreference();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.SatisticalOperation#getColreference <em>Colreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colreference</em>' containment reference.
	 * @see #getColreference()
	 * @generated
	 */
	void setColreference(ColReference value);

} // SatisticalOperation
