/**
 */
package ucal3ia.bilang.abstractsyntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Preprocessing Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountPreprocessingStep#getAxis <em>Axis</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountPreprocessingStep#getCountquantistatement <em>Countquantistatement</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountPreprocessingStep#getCountqualistatement <em>Countqualistatement</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.CountPreprocessingStep#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountPreprocessingStep()
 * @model
 * @generated
 */
public interface CountPreprocessingStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see #setAxis(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountPreprocessingStep_Axis()
	 * @model
	 * @generated
	 */
	String getAxis();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.CountPreprocessingStep#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(String value);

	/**
	 * Returns the value of the '<em><b>Countquantistatement</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.bilang.abstractsyntax.CountQuantiStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countquantistatement</em>' containment reference list.
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountPreprocessingStep_Countquantistatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<CountQuantiStatement> getCountquantistatement();

	/**
	 * Returns the value of the '<em><b>Countqualistatement</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.bilang.abstractsyntax.CountQualiStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countqualistatement</em>' containment reference list.
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountPreprocessingStep_Countqualistatement()
	 * @model containment="true"
	 * @generated
	 */
	EList<CountQualiStatement> getCountqualistatement();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getCountPreprocessingStep_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.CountPreprocessingStep#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

} // CountPreprocessingStep
