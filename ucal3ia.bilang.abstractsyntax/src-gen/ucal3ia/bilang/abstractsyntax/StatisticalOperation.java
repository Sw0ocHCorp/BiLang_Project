/**
 */
package ucal3ia.bilang.abstractsyntax;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistical Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.StatisticalOperation#getColreference <em>Colreference</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.StatisticalOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getStatisticalOperation()
 * @model
 * @generated
 */
public interface StatisticalOperation extends PreprocessingStep {
	/**
	 * Returns the value of the '<em><b>Colreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colreference</em>' containment reference.
	 * @see #setColreference(ColReference)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getStatisticalOperation_Colreference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ColReference getColreference();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.StatisticalOperation#getColreference <em>Colreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colreference</em>' containment reference.
	 * @see #getColreference()
	 * @generated
	 */
	void setColreference(ColReference value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ucal3ia.bilang.abstractsyntax.StatisticalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.StatisticalOperator
	 * @see #setOperator(StatisticalOperator)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getStatisticalOperation_Operator()
	 * @model
	 * @generated
	 */
	StatisticalOperator getOperator();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.StatisticalOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.StatisticalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(StatisticalOperator value);

} // StatisticalOperation
