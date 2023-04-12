/**
 */
package ucal3ia.BiLang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucal3ia.BiLang.BiLangPackage
 * @generated
 */
public interface BiLangFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BiLangFactory eINSTANCE = ucal3ia.BiLang.impl.BiLangFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Csv Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csv Extractor</em>'.
	 * @generated
	 */
	CsvExtractor createCsvExtractor();

	/**
	 * Returns a new object of class '<em>Excel Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excel Extractor</em>'.
	 * @generated
	 */
	ExcelExtractor createExcelExtractor();

	/**
	 * Returns a new object of class '<em>Data Filtering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Filtering</em>'.
	 * @generated
	 */
	DataFiltering createDataFiltering();

	/**
	 * Returns a new object of class '<em>Dash Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dash Board</em>'.
	 * @generated
	 */
	DashBoard createDashBoard();

	/**
	 * Returns a new object of class '<em>Line Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Plot</em>'.
	 * @generated
	 */
	LinePlot createLinePlot();

	/**
	 * Returns a new object of class '<em>Bar Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar Plot</em>'.
	 * @generated
	 */
	BarPlot createBarPlot();

	/**
	 * Returns a new object of class '<em>Quantitative Filtering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantitative Filtering</em>'.
	 * @generated
	 */
	QuantitativeFiltering createQuantitativeFiltering();

	/**
	 * Returns a new object of class '<em>Qualitative Filtering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualitative Filtering</em>'.
	 * @generated
	 */
	QualitativeFiltering createQualitativeFiltering();

	/**
	 * Returns a new object of class '<em>Math Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Math Operation</em>'.
	 * @generated
	 */
	MathOperation createMathOperation();

	/**
	 * Returns a new object of class '<em>Statistical Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistical Operation</em>'.
	 * @generated
	 */
	StatisticalOperation createStatisticalOperation();

	/**
	 * Returns a new object of class '<em>col Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>col Reference</em>'.
	 * @generated
	 */
	colReference createcolReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BiLangPackage getBiLangPackage();

} //BiLangFactory
