/**
 */
package ucal3ia.bilang.abstractsyntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Quanti Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountQuantiStatement#getQuantiOperator <em>Quanti Operator</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountQuantiStatement#getLSide <em>LSide</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountQuantiStatement#getRSide <em>RSide</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountQuantiStatement#getStatement <em>Statement</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountQuantiStatement#getRangeOperator <em>Range Operator</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountQuantiStatement()
 * @model
 * @generated
 */
public interface CountQuantiStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Quanti Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ucal3ia.bilang.abstractsyntax.QuantitativeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quanti Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.QuantitativeOperator
	 * @see #setQuantiOperator(QuantitativeOperator)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountQuantiStatement_QuantiOperator()
	 * @model
	 * @generated
	 */
	QuantitativeOperator getQuantiOperator();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.CountQuantiStatement#getQuantiOperator <em>Quanti Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quanti Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.QuantitativeOperator
	 * @see #getQuantiOperator()
	 * @generated
	 */
	void setQuantiOperator(QuantitativeOperator value);

	/**
	 * Returns the value of the '<em><b>LSide</b></em>' attribute.
	 * The default value is <code>"-123456789"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LSide</em>' attribute.
	 * @see #setLSide(float)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountQuantiStatement_LSide()
	 * @model default="-123456789" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getLSide();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.CountQuantiStatement#getLSide <em>LSide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LSide</em>' attribute.
	 * @see #getLSide()
	 * @generated
	 */
	void setLSide(float value);

	/**
	 * Returns the value of the '<em><b>RSide</b></em>' attribute.
	 * The default value is <code>"-123456789"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RSide</em>' attribute.
	 * @see #setRSide(float)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountQuantiStatement_RSide()
	 * @model default="-123456789" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getRSide();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.CountQuantiStatement#getRSide <em>RSide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RSide</em>' attribute.
	 * @see #getRSide()
	 * @generated
	 */
	void setRSide(float value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountQuantiStatement_Statement()
	 * @model
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.CountQuantiStatement#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Range Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link ucal3ia.bilang.abstractsyntax.RangeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.RangeOperator
	 * @see #setRangeOperator(RangeOperator)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountQuantiStatement_RangeOperator()
	 * @model
	 * @generated
	 */
	RangeOperator getRangeOperator();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.CountQuantiStatement#getRangeOperator <em>Range Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Operator</em>' attribute.
	 * @see ucal3ia.bilang.abstractsyntax.RangeOperator
	 * @see #getRangeOperator()
	 * @generated
	 */
	void setRangeOperator(RangeOperator value);

} // CountQuantiStatement
