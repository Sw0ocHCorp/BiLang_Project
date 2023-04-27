/**
 */
package ucal3ia.bilang.abstractsyntax;

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
 *   <li>{@link ucal3ia.bilang.abstractsyntax.DashBoard#getFileextractor <em>Fileextractor</em>}</li>
 *   <li>{@link ucal3ia.bilang.abstractsyntax.DashBoard#getPlot <em>Plot</em>}</li>
 * </ul>
 *
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getDashBoard()
 * @model
 * @generated
 */
public interface DashBoard extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Fileextractor</b></em>' reference list.
	 * The list contents are of type {@link ucal3ia.bilang.abstractsyntax.FileExtractor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileextractor</em>' reference list.
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getDashBoard_Fileextractor()
	 * @model required="true"
	 * @generated
	 */
	EList<FileExtractor> getFileextractor();

	/**
	 * Returns the value of the '<em><b>Plot</b></em>' containment reference list.
	 * The list contents are of type {@link ucal3ia.bilang.abstractsyntax.Plot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plot</em>' containment reference list.
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#getDashBoard_Plot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Plot> getPlot();

} // DashBoard
