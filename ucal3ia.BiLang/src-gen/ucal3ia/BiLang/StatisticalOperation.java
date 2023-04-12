/**
 */
package ucal3ia.BiLang;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistical Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.BiLang.StatisticalOperation#getPreprocessingsteps <em>Preprocessingsteps</em>}</li>
 *   <li>{@link ucal3ia.BiLang.StatisticalOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see ucal3ia.BiLang.BiLangPackage#getStatisticalOperation()
 * @model
 * @generated
 */
public interface StatisticalOperation extends PreprocessingSteps {
	/**
	 * Returns the value of the '<em><b>Preprocessingsteps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessingsteps</em>' containment reference.
	 * @see #setPreprocessingsteps(PreprocessingSteps)
	 * @see ucal3ia.BiLang.BiLangPackage#getStatisticalOperation_Preprocessingsteps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PreprocessingSteps getPreprocessingsteps();

	/**
	 * Sets the value of the '{@link ucal3ia.BiLang.StatisticalOperation#getPreprocessingsteps <em>Preprocessingsteps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preprocessingsteps</em>' containment reference.
	 * @see #getPreprocessingsteps()
	 * @generated
	 */
	void setPreprocessingsteps(PreprocessingSteps value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ucal3ia.BiLang.StatisticalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.BiLang.StatisticalOperator
	 * @see #setOperator(StatisticalOperator)
	 * @see ucal3ia.BiLang.BiLangPackage#getStatisticalOperation_Operator()
	 * @model
	 * @generated
	 */
	StatisticalOperator getOperator();

	/**
	 * Sets the value of the '{@link ucal3ia.BiLang.StatisticalOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.BiLang.StatisticalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(StatisticalOperator value);

} // StatisticalOperation
