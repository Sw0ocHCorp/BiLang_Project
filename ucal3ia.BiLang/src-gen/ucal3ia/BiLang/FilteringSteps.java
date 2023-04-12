/**
 */
package ucal3ia.BiLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtering Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.BiLang.FilteringSteps#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @see ucal3ia.BiLang.BiLangPackage#getFilteringSteps()
 * @model abstract="true"
 * @generated
 */
public interface FilteringSteps extends EObject {
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see #setAxis(String)
	 * @see ucal3ia.BiLang.BiLangPackage#getFilteringSteps_Axis()
	 * @model
	 * @generated
	 */
	String getAxis();

	/**
	 * Sets the value of the '{@link ucal3ia.BiLang.FilteringSteps#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(String value);

} // FilteringSteps
