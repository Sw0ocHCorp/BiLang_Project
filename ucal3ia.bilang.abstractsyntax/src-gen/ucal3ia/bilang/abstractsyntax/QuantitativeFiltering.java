/**
 */
package ucal3ia.bilang.abstractsyntax;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantitative Filtering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.QuantitativeFiltering#getValues <em>Values</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.QuantitativeFiltering#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getQuantitativeFiltering()
 * @model
 * @generated
 */
public interface QuantitativeFiltering extends FilteringStep {

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute.
	 * @see #setValues(float)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getQuantitativeFiltering_Values()
	 * @model
	 * @generated
	 */
	float getValues();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.QuantitativeFiltering#getValues <em>Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' attribute.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(float value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ucal3ia.bilang.abstractsyntax.QuantitativeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.QuantitativeOperator
	 * @see #setOperator(QuantitativeOperator)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getQuantitativeFiltering_Operator()
	 * @model
	 * @generated
	 */
	QuantitativeOperator getOperator();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.QuantitativeFiltering#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.QuantitativeOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(QuantitativeOperator value);
} // QuantitativeFiltering
