/**
 */
package ucal3ia.BiLang;

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
 *   <li>{@link ucal3ia.BiLang.DataFiltering#getFilteringsteps <em>Filteringsteps</em>}</li>
 *   <li>{@link ucal3ia.BiLang.DataFiltering#getPreprocessingsteps <em>Preprocessingsteps</em>}</li>
 *   <li>{@link ucal3ia.BiLang.DataFiltering#getFileextractor <em>Fileextractor</em>}</li>
 * </ul>
 *
 * @see ucal3ia.BiLang.BiLangPackage#getDataFiltering()
 * @model
 * @generated
 */
public interface DataFiltering extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Filteringsteps</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.BiLang.FilteringSteps}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filteringsteps</em>' containment reference list.
	 * @see ucal3ia.BiLang.BiLangPackage#getDataFiltering_Filteringsteps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FilteringSteps> getFilteringsteps();

	/**
	 * Returns the value of the '<em><b>Preprocessingsteps</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.BiLang.PreprocessingSteps}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessingsteps</em>' containment reference list.
	 * @see ucal3ia.BiLang.BiLangPackage#getDataFiltering_Preprocessingsteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<PreprocessingSteps> getPreprocessingsteps();

	/**
	 * Returns the value of the '<em><b>Fileextractor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileextractor</em>' reference.
	 * @see #setFileextractor(FileExtractor)
	 * @see ucal3ia.BiLang.BiLangPackage#getDataFiltering_Fileextractor()
	 * @model required="true"
	 * @generated
	 */
	FileExtractor getFileextractor();

	/**
	 * Sets the value of the '{@link ucal3ia.BiLang.DataFiltering#getFileextractor <em>Fileextractor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fileextractor</em>' reference.
	 * @see #getFileextractor()
	 * @generated
	 */
	void setFileextractor(FileExtractor value);

} // DataFiltering
