/**
 */
package ucal3ia.bilang.abstractsyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Extractor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.FileExtractor#getPath <em>Path</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.FileExtractor#getNullreplacement <em>Nullreplacement</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getFileExtractor()
 * @model abstract="true"
 * @generated
 */
public interface FileExtractor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getFileExtractor_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link ucal3ia.bilang.abstractsyntax.FileExtractor#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Nullreplacement</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.bilang.abstractsyntax.NullReplacement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullreplacement</em>' containment reference list.
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getFileExtractor_Nullreplacement()
	 * @model containment="true"
	 * @generated
	 */
	EList<NullReplacement> getNullreplacement();

} // FileExtractor
