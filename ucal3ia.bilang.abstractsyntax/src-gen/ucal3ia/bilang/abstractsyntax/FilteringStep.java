/**
 */
package ucal3ia.bilang.abstractsyntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtering Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.FilteringStep#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getFilteringStep()
 * @model abstract="true"
 * @generated
 */
public interface FilteringStep extends EObject {

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see #setAxis(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getFilteringStep_Axis()
	 * @model
	 * @generated
	 */
	String getAxis();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.FilteringStep#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(String value);
} // FilteringStep
