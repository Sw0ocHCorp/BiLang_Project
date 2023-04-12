/**
 */
package ucal3ia.BiLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.BiLang.Task#getFileextractor <em>Fileextractor</em>}</li>
 *   <li>{@link ucal3ia.BiLang.Task#getDatafiltering <em>Datafiltering</em>}</li>
 *   <li>{@link ucal3ia.BiLang.Task#getDashboard <em>Dashboard</em>}</li>
 * </ul>
 *
 * @see ucal3ia.BiLang.BiLangPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Fileextractor</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.BiLang.FileExtractor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileextractor</em>' containment reference list.
	 * @see ucal3ia.BiLang.BiLangPackage#getTask_Fileextractor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FileExtractor> getFileextractor();

	/**
	 * Returns the value of the '<em><b>Datafiltering</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.BiLang.DataFiltering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datafiltering</em>' containment reference list.
	 * @see ucal3ia.BiLang.BiLangPackage#getTask_Datafiltering()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataFiltering> getDatafiltering();

	/**
	 * Returns the value of the '<em><b>Dashboard</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.BiLang.DashBoard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dashboard</em>' containment reference list.
	 * @see ucal3ia.BiLang.BiLangPackage#getTask_Dashboard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DashBoard> getDashboard();

} // Task
