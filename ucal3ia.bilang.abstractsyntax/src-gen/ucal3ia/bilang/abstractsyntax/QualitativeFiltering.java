/**
 */
package ucal3ia.bilang.abstractsyntax;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Filtering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.QualitativeFiltering#getLabels <em>Labels</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.QualitativeFiltering#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getQualitativeFiltering()
 * @model
 * @generated
 */
public interface QualitativeFiltering extends FilteringStep {

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute.
	 * @see #setLabels(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getQualitativeFiltering_Labels()
	 * @model
	 * @generated
	 */
	String getLabels();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.QualitativeFiltering#getLabels <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels</em>' attribute.
	 * @see #getLabels()
	 * @generated
	 */
	void setLabels(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ucal3ia.bilang.abstractsyntax.QualitativeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.QualitativeOperator
	 * @see #setOperator(QualitativeOperator)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getQualitativeFiltering_Operator()
	 * @model
	 * @generated
	 */
	QualitativeOperator getOperator();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.QualitativeFiltering#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.QualitativeOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(QualitativeOperator value);
} // QualitativeFiltering
