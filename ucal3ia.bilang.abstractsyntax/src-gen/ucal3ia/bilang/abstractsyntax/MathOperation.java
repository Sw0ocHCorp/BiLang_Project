/**
 */
package ucal3ia.bilang.abstractsyntax;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Math Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.MathOperation#getLside <em>Lside</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.MathOperation#getRside <em>Rside</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.MathOperation#getOperator <em>Operator</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.MathOperation#getNewColName <em>New Col Name</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getMathOperation()
 * @model
 * @generated
 */
public interface MathOperation extends PreprocessingStep {
	/**
	 * Returns the value of the '<em><b>Lside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lside</em>' containment reference.
	 * @see #setLside(PreprocessingStep)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getMathOperation_Lside()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PreprocessingStep getLside();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.MathOperation#getLside <em>Lside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lside</em>' containment reference.
	 * @see #getLside()
	 * @generated
	 */
	void setLside(PreprocessingStep value);

	/**
	 * Returns the value of the '<em><b>Rside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rside</em>' containment reference.
	 * @see #setRside(PreprocessingStep)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getMathOperation_Rside()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PreprocessingStep getRside();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.MathOperation#getRside <em>Rside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rside</em>' containment reference.
	 * @see #getRside()
	 * @generated
	 */
	void setRside(PreprocessingStep value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ucal3ia.bilang.abstractsyntax.MathOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.MathOperator
	 * @see #setOperator(MathOperator)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getMathOperation_Operator()
	 * @model
	 * @generated
	 */
	MathOperator getOperator();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.MathOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.MathOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(MathOperator value);

	/**
	 * Returns the value of the '<em><b>New Col Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Col Name</em>' attribute.
	 * @see #setNewColName(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getMathOperation_NewColName()
	 * @model
	 * @generated
	 */
	String getNewColName();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.MathOperation#getNewColName <em>New Col Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Col Name</em>' attribute.
	 * @see #getNewColName()
	 * @generated
	 */
	void setNewColName(String value);

} // MathOperation
