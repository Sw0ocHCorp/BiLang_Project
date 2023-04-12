/**
 */
package ucal3ia.BiLang;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.BiLang.MathOperation#getLside <em>Lside</em>}</li>
 *   <li>{@link ucal3ia.BiLang.MathOperation#getRside <em>Rside</em>}</li>
 *   <li>{@link ucal3ia.BiLang.MathOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see ucal3ia.BiLang.BiLangPackage#getMathOperation()
 * @model
 * @generated
 */
public interface MathOperation extends PreprocessingSteps {
	/**
	 * Returns the value of the '<em><b>Lside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lside</em>' containment reference.
	 * @see #setLside(PreprocessingSteps)
	 * @see ucal3ia.BiLang.BiLangPackage#getMathOperation_Lside()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PreprocessingSteps getLside();

	/**
	 * Sets the value of the '{@link ucal3ia.BiLang.MathOperation#getLside <em>Lside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lside</em>' containment reference.
	 * @see #getLside()
	 * @generated
	 */
	void setLside(PreprocessingSteps value);

	/**
	 * Returns the value of the '<em><b>Rside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rside</em>' containment reference.
	 * @see #setRside(PreprocessingSteps)
	 * @see ucal3ia.BiLang.BiLangPackage#getMathOperation_Rside()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PreprocessingSteps getRside();

	/**
	 * Sets the value of the '{@link ucal3ia.BiLang.MathOperation#getRside <em>Rside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rside</em>' containment reference.
	 * @see #getRside()
	 * @generated
	 */
	void setRside(PreprocessingSteps value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ucal3ia.BiLang.MathOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.BiLang.MathOperator
	 * @see #setOperator(MathOperator)
	 * @see ucal3ia.BiLang.BiLangPackage#getMathOperation_Operator()
	 * @model
	 * @generated
	 */
	MathOperator getOperator();

	/**
	 * Sets the value of the '{@link ucal3ia.BiLang.MathOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.BiLang.MathOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(MathOperator value);

} // MathOperation
