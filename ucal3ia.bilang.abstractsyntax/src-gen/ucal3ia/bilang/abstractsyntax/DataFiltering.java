/**
 */
package ucal3ia.bilang.abstractsyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Filtering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.DataFiltering#getFileextractor <em>Fileextractor</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.DataFiltering#getFilteringstep <em>Filteringstep</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.DataFiltering#getProcessingstep <em>Processingstep</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getDataFiltering()
 * @model
 * @generated
 */
public interface DataFiltering extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Fileextractor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileextractor</em>' reference.
	 * @see #setFileextractor(FileExtractor)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getDataFiltering_Fileextractor()
	 * @model required="true"
	 * @generated
	 */
	FileExtractor getFileextractor();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.DataFiltering#getFileextractor <em>Fileextractor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fileextractor</em>' reference.
	 * @see #getFileextractor()
	 * @generated
	 */
	void setFileextractor(FileExtractor value);

	/**
	 * Returns the value of the '<em><b>Filteringstep</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.bilang.abstractsyntax.FilteringStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filteringstep</em>' containment reference list.
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getDataFiltering_Filteringstep()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FilteringStep> getFilteringstep();

	/**
	 * Returns the value of the '<em><b>Processingstep</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.bilang.abstractsyntax.PreprocessingStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processingstep</em>' containment reference list.
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getDataFiltering_Processingstep()
	 * @model containment="true"
	 * @generated
	 */
	EList<PreprocessingStep> getProcessingstep();

} // DataFiltering
