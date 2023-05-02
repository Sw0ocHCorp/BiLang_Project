/**
 */
package ucal3ia.bilang.abstractsyntax;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage
 * @generated
 */
public interface AbstractsyntaxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractsyntaxFactory eINSTANCE = ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>File Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Extractor</em>'.
	 * @generated
	 */
	FileExtractor createFileExtractor();

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
	 * Returns a new object of class '<em>Bar Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar Plot</em>'.
	 * @generated
	 */
	BarPlot createBarPlot();

	/**
	 * Returns a new object of class '<em>Line Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Plot</em>'.
	 * @generated
	 */
	LinePlot createLinePlot();

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
	 * Returns a new object of class '<em>Col Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Col Reference</em>'.
	 * @generated
	 */
	ColReference createColReference();

	/**
	 * Returns a new object of class '<em>Statistical Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistical Operation</em>'.
	 * @generated
	 */
	StatisticalOperation createStatisticalOperation();

	/**
	 * Returns a new object of class '<em>Scatter Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scatter Plot</em>'.
	 * @generated
	 */
	ScatterPlot createScatterPlot();

	/**
	 * Returns a new object of class '<em>Polar Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polar Plot</em>'.
	 * @generated
	 */
	PolarPlot createPolarPlot();

	/**
	 * Returns a new object of class '<em>Pie Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pie Plot</em>'.
	 * @generated
	 */
	PiePlot createPiePlot();

	/**
	 * Returns a new object of class '<em>Radar Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radar Plot</em>'.
	 * @generated
	 */
	RadarPlot createRadarPlot();

	/**
	 * Returns a new object of class '<em>Donut Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Donut Plot</em>'.
	 * @generated
	 */
	DonutPlot createDonutPlot();

	/**
	 * Returns a new object of class '<em>Null Replacement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Replacement</em>'.
	 * @generated
	 */
	NullReplacement createNullReplacement();

	/**
	 * Returns a new object of class '<em>Count Preprocessing Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Preprocessing Step</em>'.
	 * @generated
	 */
	CountPreprocessingStep createCountPreprocessingStep();

	/**
	 * Returns a new object of class '<em>Count Quali Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Quali Statement</em>'.
	 * @generated
	 */
	CountQualiStatement createCountQualiStatement();

	/**
	 * Returns a new object of class '<em>Count Quanti Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Quanti Statement</em>'.
	 * @generated
	 */
	CountQuantiStatement createCountQuantiStatement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbstractsyntaxPackage getAbstractsyntaxPackage();

} //AbstractsyntaxFactory
