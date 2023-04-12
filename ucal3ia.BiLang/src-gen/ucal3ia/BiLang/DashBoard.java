/**
 */
package ucal3ia.BiLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dash Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.BiLang.DashBoard#getFileextractor <em>Fileextractor</em>}</li>
 *   <li>{@link ucal3ia.BiLang.DashBoard#getDatafiltering <em>Datafiltering</em>}</li>
 *   <li>{@link ucal3ia.BiLang.DashBoard#getPlot <em>Plot</em>}</li>
 * </ul>
 *
 * @see ucal3ia.BiLang.BiLangPackage#getDashBoard()
 * @model
 * @generated
 */
public interface DashBoard extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Fileextractor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileextractor</em>' reference.
	 * @see #setFileextractor(FileExtractor)
	 * @see ucal3ia.BiLang.BiLangPackage#getDashBoard_Fileextractor()
	 * @model
	 * @generated
	 */
	FileExtractor getFileextractor();

	/**
	 * Sets the value of the '{@link ucal3ia.BiLang.DashBoard#getFileextractor <em>Fileextractor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fileextractor</em>' reference.
	 * @see #getFileextractor()
	 * @generated
	 */
	void setFileextractor(FileExtractor value);

	/**
	 * Returns the value of the '<em><b>Datafiltering</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datafiltering</em>' reference.
	 * @see #setDatafiltering(DataFiltering)
	 * @see ucal3ia.BiLang.BiLangPackage#getDashBoard_Datafiltering()
	 * @model
	 * @generated
	 */
	DataFiltering getDatafiltering();

	/**
	 * Sets the value of the '{@link ucal3ia.BiLang.DashBoard#getDatafiltering <em>Datafiltering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datafiltering</em>' reference.
	 * @see #getDatafiltering()
	 * @generated
	 */
	void setDatafiltering(DataFiltering value);

	/**
	 * Returns the value of the '<em><b>Plot</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.BiLang.Plot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plot</em>' containment reference list.
	 * @see ucal3ia.BiLang.BiLangPackage#getDashBoard_Plot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Plot> getPlot();

} // DashBoard
