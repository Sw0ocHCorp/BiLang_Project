/**
 */
package ucal3ia.bilang.abstractsyntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.NullReplacement#getColName <em>Col Name</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.NullReplacement#getLabel <em>Label</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.NullReplacement#getStatisticaloperation <em>Statisticaloperation</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getNullReplacement()
 * @model
 * @generated
 */
public interface NullReplacement extends EObject {
	/**
	 * Returns the value of the '<em><b>Col Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Name</em>' attribute.
	 * @see #setColName(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getNullReplacement_ColName()
	 * @model
	 * @generated
	 */
	String getColName();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.NullReplacement#getColName <em>Col Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Name</em>' attribute.
	 * @see #getColName()
	 * @generated
	 */
	void setColName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getNullReplacement_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.NullReplacement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Statisticaloperation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statisticaloperation</em>' containment reference.
	 * @see #setStatisticaloperation(StatisticalOperation)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getNullReplacement_Statisticaloperation()
	 * @model containment="true"
	 * @generated
	 */
	StatisticalOperation getStatisticaloperation();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.NullReplacement#getStatisticaloperation <em>Statisticaloperation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statisticaloperation</em>' containment reference.
	 * @see #getStatisticaloperation()
	 * @generated
	 */
	void setStatisticaloperation(StatisticalOperation value);

} // NullReplacement
