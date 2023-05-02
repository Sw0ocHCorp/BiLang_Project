/**
 */
package ucal3ia.bilang.abstractsyntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Quali Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountQualiStatement#getQualiOperator <em>Quali Operator</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountQualiStatement#getLabel <em>Label</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountQualiStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountQualiStatement()
 * @model
 * @generated
 */
public interface CountQualiStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Quali Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ucal3ia.bilang.abstractsyntax.QualitativeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quali Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.QualitativeOperator
	 * @see #setQualiOperator(QualitativeOperator)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountQualiStatement_QualiOperator()
	 * @model
	 * @generated
	 */
	QualitativeOperator getQualiOperator();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.CountQualiStatement#getQualiOperator <em>Quali Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quali Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.QualitativeOperator
	 * @see #getQualiOperator()
	 * @generated
	 */
	void setQualiOperator(QualitativeOperator value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountQualiStatement_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.CountQualiStatement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountQualiStatement_Statement()
	 * @model
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.CountQualiStatement#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

} // CountQualiStatement
