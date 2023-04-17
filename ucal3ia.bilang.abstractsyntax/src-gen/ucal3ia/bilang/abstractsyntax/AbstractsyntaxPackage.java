/**
 */
package ucal3ia.bilang.abstractsyntax;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractsyntaxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstractsyntax";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/abstractsyntax";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstractsyntax";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractsyntaxPackage eINSTANCE = ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.NamedElementImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.TaskImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fileextractor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FILEEXTRACTOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datafiltering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATAFILTERING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dashboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DASHBOARD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.FileExtractorImpl <em>File Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.FileExtractorImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getFileExtractor()
	 * @generated
	 */
	int FILE_EXTRACTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXTRACTOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXTRACTOR__PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXTRACTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_EXTRACTOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.DataFilteringImpl <em>Data Filtering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.DataFilteringImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getDataFiltering()
	 * @generated
	 */
	int DATA_FILTERING = 3;

	/**
	 * The feature id for the '<em><b>Fileextractor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__FILEEXTRACTOR = 0;

	/**
	 * The feature id for the '<em><b>Filteringstep</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__FILTERINGSTEP = 1;

	/**
	 * The feature id for the '<em><b>Processingstep</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__PROCESSINGSTEP = 2;

	/**
	 * The number of structural features of the '<em>Data Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.DashBoardImpl <em>Dash Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.DashBoardImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getDashBoard()
	 * @generated
	 */
	int DASH_BOARD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASH_BOARD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fileextractor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASH_BOARD__FILEEXTRACTOR = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datafiltering</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASH_BOARD__DATAFILTERING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Plot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASH_BOARD__PLOT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dash Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASH_BOARD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dash Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASH_BOARD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.CsvExtractorImpl <em>Csv Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.CsvExtractorImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getCsvExtractor()
	 * @generated
	 */
	int CSV_EXTRACTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_EXTRACTOR__NAME = FILE_EXTRACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_EXTRACTOR__PATH = FILE_EXTRACTOR__PATH;

	/**
	 * The number of structural features of the '<em>Csv Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_EXTRACTOR_FEATURE_COUNT = FILE_EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Csv Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_EXTRACTOR_OPERATION_COUNT = FILE_EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.ExcelExtractorImpl <em>Excel Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.ExcelExtractorImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getExcelExtractor()
	 * @generated
	 */
	int EXCEL_EXTRACTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_EXTRACTOR__NAME = FILE_EXTRACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_EXTRACTOR__PATH = FILE_EXTRACTOR__PATH;

	/**
	 * The number of structural features of the '<em>Excel Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_EXTRACTOR_FEATURE_COUNT = FILE_EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Excel Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_EXTRACTOR_OPERATION_COUNT = FILE_EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.PlotImpl <em>Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.PlotImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getPlot()
	 * @generated
	 */
	int PLOT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__XAXIS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__YAXIS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__COLORS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__THICKNESS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.BarPlotImpl <em>Bar Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.BarPlotImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getBarPlot()
	 * @generated
	 */
	int BAR_PLOT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_PLOT__NAME = PLOT__NAME;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_PLOT__XAXIS = PLOT__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_PLOT__YAXIS = PLOT__YAXIS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_PLOT__LOCATION = PLOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_PLOT__COLORS = PLOT__COLORS;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_PLOT__THICKNESS = PLOT__THICKNESS;

	/**
	 * The number of structural features of the '<em>Bar Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_PLOT_FEATURE_COUNT = PLOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bar Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_PLOT_OPERATION_COUNT = PLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.LinePlotImpl <em>Line Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.LinePlotImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getLinePlot()
	 * @generated
	 */
	int LINE_PLOT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PLOT__NAME = PLOT__NAME;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PLOT__XAXIS = PLOT__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PLOT__YAXIS = PLOT__YAXIS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PLOT__LOCATION = PLOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PLOT__COLORS = PLOT__COLORS;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PLOT__THICKNESS = PLOT__THICKNESS;

	/**
	 * The number of structural features of the '<em>Line Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PLOT_FEATURE_COUNT = PLOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PLOT_OPERATION_COUNT = PLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.FilteringStepImpl <em>Filtering Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.FilteringStepImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getFilteringStep()
	 * @generated
	 */
	int FILTERING_STEP = 10;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_STEP__AXIS = 0;

	/**
	 * The number of structural features of the '<em>Filtering Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Filtering Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.PreprocessingStepImpl <em>Preprocessing Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.PreprocessingStepImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getPreprocessingStep()
	 * @generated
	 */
	int PREPROCESSING_STEP = 11;

	/**
	 * The number of structural features of the '<em>Preprocessing Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Preprocessing Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.QuantitativeFilteringImpl <em>Quantitative Filtering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.QuantitativeFilteringImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getQuantitativeFiltering()
	 * @generated
	 */
	int QUANTITATIVE_FILTERING = 12;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_FILTERING__AXIS = FILTERING_STEP__AXIS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_FILTERING__VALUES = FILTERING_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_FILTERING__OPERATOR = FILTERING_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantitative Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_FILTERING_FEATURE_COUNT = FILTERING_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quantitative Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_FILTERING_OPERATION_COUNT = FILTERING_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.QualitativeFilteringImpl <em>Qualitative Filtering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.QualitativeFilteringImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getQualitativeFiltering()
	 * @generated
	 */
	int QUALITATIVE_FILTERING = 13;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FILTERING__AXIS = FILTERING_STEP__AXIS;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FILTERING__LABELS = FILTERING_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FILTERING__OPERATOR = FILTERING_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qualitative Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FILTERING_FEATURE_COUNT = FILTERING_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qualitative Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FILTERING_OPERATION_COUNT = FILTERING_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.MathOperationImpl <em>Math Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.MathOperationImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMathOperation()
	 * @generated
	 */
	int MATH_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Lside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION__LSIDE = PREPROCESSING_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION__RSIDE = PREPROCESSING_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION__OPERATOR = PREPROCESSING_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Math Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_FEATURE_COUNT = PREPROCESSING_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Math Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_OPERATION_COUNT = PREPROCESSING_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.ColReferenceImpl <em>Col Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.ColReferenceImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getColReference()
	 * @generated
	 */
	int COL_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_REFERENCE__TARGET = PREPROCESSING_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Col Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_REFERENCE_FEATURE_COUNT = PREPROCESSING_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Col Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_REFERENCE_OPERATION_COUNT = PREPROCESSING_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.StatisticalOperationImpl <em>Statistical Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.StatisticalOperationImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getStatisticalOperation()
	 * @generated
	 */
	int STATISTICAL_OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Colreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_OPERATION__COLREFERENCE = PREPROCESSING_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_OPERATION__OPERATOR = PREPROCESSING_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statistical Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_OPERATION_FEATURE_COUNT = PREPROCESSING_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statistical Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_OPERATION_OPERATION_COUNT = PREPROCESSING_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.ScatterPlotImpl <em>Scatter Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.ScatterPlotImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getScatterPlot()
	 * @generated
	 */
	int SCATTER_PLOT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__NAME = PLOT__NAME;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__XAXIS = PLOT__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__YAXIS = PLOT__YAXIS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__LOCATION = PLOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__COLORS = PLOT__COLORS;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT__THICKNESS = PLOT__THICKNESS;

	/**
	 * The number of structural features of the '<em>Scatter Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT_FEATURE_COUNT = PLOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scatter Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_PLOT_OPERATION_COUNT = PLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.PolarPlotImpl <em>Polar Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.PolarPlotImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getPolarPlot()
	 * @generated
	 */
	int POLAR_PLOT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_PLOT__NAME = PLOT__NAME;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_PLOT__XAXIS = PLOT__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_PLOT__YAXIS = PLOT__YAXIS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_PLOT__LOCATION = PLOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_PLOT__COLORS = PLOT__COLORS;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_PLOT__THICKNESS = PLOT__THICKNESS;

	/**
	 * The number of structural features of the '<em>Polar Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_PLOT_FEATURE_COUNT = PLOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Polar Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLAR_PLOT_OPERATION_COUNT = PLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.PiePlotImpl <em>Pie Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.PiePlotImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getPiePlot()
	 * @generated
	 */
	int PIE_PLOT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__NAME = PLOT__NAME;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__XAXIS = PLOT__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__YAXIS = PLOT__YAXIS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__LOCATION = PLOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__COLORS = PLOT__COLORS;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT__THICKNESS = PLOT__THICKNESS;

	/**
	 * The number of structural features of the '<em>Pie Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT_FEATURE_COUNT = PLOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pie Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIE_PLOT_OPERATION_COUNT = PLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.RadarPlotImpl <em>Radar Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.RadarPlotImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getRadarPlot()
	 * @generated
	 */
	int RADAR_PLOT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_PLOT__NAME = PLOT__NAME;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_PLOT__XAXIS = PLOT__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_PLOT__YAXIS = PLOT__YAXIS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_PLOT__LOCATION = PLOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_PLOT__COLORS = PLOT__COLORS;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_PLOT__THICKNESS = PLOT__THICKNESS;

	/**
	 * The number of structural features of the '<em>Radar Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_PLOT_FEATURE_COUNT = PLOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Radar Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADAR_PLOT_OPERATION_COUNT = PLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.impl.DonutPlotImpl <em>Donut Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.impl.DonutPlotImpl
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getDonutPlot()
	 * @generated
	 */
	int DONUT_PLOT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONUT_PLOT__NAME = PLOT__NAME;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONUT_PLOT__XAXIS = PLOT__XAXIS;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONUT_PLOT__YAXIS = PLOT__YAXIS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONUT_PLOT__LOCATION = PLOT__LOCATION;

	/**
	 * The feature id for the '<em><b>Colors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONUT_PLOT__COLORS = PLOT__COLORS;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONUT_PLOT__THICKNESS = PLOT__THICKNESS;

	/**
	 * The number of structural features of the '<em>Donut Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONUT_PLOT_FEATURE_COUNT = PLOT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Donut Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONUT_PLOT_OPERATION_COUNT = PLOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.MathOperator <em>Math Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.MathOperator
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMathOperator()
	 * @generated
	 */
	int MATH_OPERATOR = 22;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.StatisticalOperator <em>Statistical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.StatisticalOperator
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getStatisticalOperator()
	 * @generated
	 */
	int STATISTICAL_OPERATOR = 23;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.QuantitativeOperator <em>Quantitative Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.QuantitativeOperator
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getQuantitativeOperator()
	 * @generated
	 */
	int QUANTITATIVE_OPERATOR = 24;

	/**
	 * The meta object id for the '{@link ucal3ia.bilang.abstractsyntax.QualitativeOperator <em>Qualitative Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.bilang.abstractsyntax.QualitativeOperator
	 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getQualitativeOperator()
	 * @generated
	 */
	int QUALITATIVE_OPERATOR = 25;

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link ucal3ia.bilang.abstractsyntax.Task#getFileextractor <em>Fileextractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fileextractor</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.Task#getFileextractor()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Fileextractor();

	/**
	 * Returns the meta object for the containment reference list '{@link ucal3ia.bilang.abstractsyntax.Task#getDatafiltering <em>Datafiltering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datafiltering</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.Task#getDatafiltering()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Datafiltering();

	/**
	 * Returns the meta object for the containment reference '{@link ucal3ia.bilang.abstractsyntax.Task#getDashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dashboard</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.Task#getDashboard()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Dashboard();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.FileExtractor <em>File Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Extractor</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.FileExtractor
	 * @generated
	 */
	EClass getFileExtractor();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.FileExtractor#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.FileExtractor#getPath()
	 * @see #getFileExtractor()
	 * @generated
	 */
	EAttribute getFileExtractor_Path();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.DataFiltering <em>Data Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Filtering</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.DataFiltering
	 * @generated
	 */
	EClass getDataFiltering();

	/**
	 * Returns the meta object for the reference '{@link ucal3ia.bilang.abstractsyntax.DataFiltering#getFileextractor <em>Fileextractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fileextractor</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.DataFiltering#getFileextractor()
	 * @see #getDataFiltering()
	 * @generated
	 */
	EReference getDataFiltering_Fileextractor();

	/**
	 * Returns the meta object for the containment reference list '{@link ucal3ia.bilang.abstractsyntax.DataFiltering#getFilteringstep <em>Filteringstep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filteringstep</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.DataFiltering#getFilteringstep()
	 * @see #getDataFiltering()
	 * @generated
	 */
	EReference getDataFiltering_Filteringstep();

	/**
	 * Returns the meta object for the containment reference list '{@link ucal3ia.bilang.abstractsyntax.DataFiltering#getProcessingstep <em>Processingstep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processingstep</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.DataFiltering#getProcessingstep()
	 * @see #getDataFiltering()
	 * @generated
	 */
	EReference getDataFiltering_Processingstep();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.DashBoard <em>Dash Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dash Board</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.DashBoard
	 * @generated
	 */
	EClass getDashBoard();

	/**
	 * Returns the meta object for the reference '{@link ucal3ia.bilang.abstractsyntax.DashBoard#getFileextractor <em>Fileextractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fileextractor</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.DashBoard#getFileextractor()
	 * @see #getDashBoard()
	 * @generated
	 */
	EReference getDashBoard_Fileextractor();

	/**
	 * Returns the meta object for the reference '{@link ucal3ia.bilang.abstractsyntax.DashBoard#getDatafiltering <em>Datafiltering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datafiltering</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.DashBoard#getDatafiltering()
	 * @see #getDashBoard()
	 * @generated
	 */
	EReference getDashBoard_Datafiltering();

	/**
	 * Returns the meta object for the containment reference list '{@link ucal3ia.bilang.abstractsyntax.DashBoard#getPlot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plot</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.DashBoard#getPlot()
	 * @see #getDashBoard()
	 * @generated
	 */
	EReference getDashBoard_Plot();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.CsvExtractor <em>Csv Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Csv Extractor</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.CsvExtractor
	 * @generated
	 */
	EClass getCsvExtractor();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.ExcelExtractor <em>Excel Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excel Extractor</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.ExcelExtractor
	 * @generated
	 */
	EClass getExcelExtractor();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.Plot
	 * @generated
	 */
	EClass getPlot();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.Plot#getXAxis <em>XAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.Plot#getXAxis()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_XAxis();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.Plot#getYAxis <em>YAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.Plot#getYAxis()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_YAxis();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.Plot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.Plot#getLocation()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_Location();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.Plot#getColors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colors</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.Plot#getColors()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_Colors();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.Plot#getThickness <em>Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thickness</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.Plot#getThickness()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_Thickness();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.BarPlot <em>Bar Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Plot</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.BarPlot
	 * @generated
	 */
	EClass getBarPlot();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.LinePlot <em>Line Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Plot</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.LinePlot
	 * @generated
	 */
	EClass getLinePlot();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.FilteringStep <em>Filtering Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtering Step</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.FilteringStep
	 * @generated
	 */
	EClass getFilteringStep();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.FilteringStep#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.FilteringStep#getAxis()
	 * @see #getFilteringStep()
	 * @generated
	 */
	EAttribute getFilteringStep_Axis();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.PreprocessingStep <em>Preprocessing Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preprocessing Step</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.PreprocessingStep
	 * @generated
	 */
	EClass getPreprocessingStep();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.QuantitativeFiltering <em>Quantitative Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantitative Filtering</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.QuantitativeFiltering
	 * @generated
	 */
	EClass getQuantitativeFiltering();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.QuantitativeFiltering#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.QuantitativeFiltering#getValues()
	 * @see #getQuantitativeFiltering()
	 * @generated
	 */
	EAttribute getQuantitativeFiltering_Values();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.QuantitativeFiltering#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.QuantitativeFiltering#getOperator()
	 * @see #getQuantitativeFiltering()
	 * @generated
	 */
	EAttribute getQuantitativeFiltering_Operator();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.QualitativeFiltering <em>Qualitative Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualitative Filtering</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.QualitativeFiltering
	 * @generated
	 */
	EClass getQualitativeFiltering();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.QualitativeFiltering#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labels</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.QualitativeFiltering#getLabels()
	 * @see #getQualitativeFiltering()
	 * @generated
	 */
	EAttribute getQualitativeFiltering_Labels();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.QualitativeFiltering#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.QualitativeFiltering#getOperator()
	 * @see #getQualitativeFiltering()
	 * @generated
	 */
	EAttribute getQualitativeFiltering_Operator();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.MathOperation <em>Math Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Operation</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.MathOperation
	 * @generated
	 */
	EClass getMathOperation();

	/**
	 * Returns the meta object for the containment reference '{@link ucal3ia.bilang.abstractsyntax.MathOperation#getLside <em>Lside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lside</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.MathOperation#getLside()
	 * @see #getMathOperation()
	 * @generated
	 */
	EReference getMathOperation_Lside();

	/**
	 * Returns the meta object for the containment reference '{@link ucal3ia.bilang.abstractsyntax.MathOperation#getRside <em>Rside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rside</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.MathOperation#getRside()
	 * @see #getMathOperation()
	 * @generated
	 */
	EReference getMathOperation_Rside();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.MathOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.MathOperation#getOperator()
	 * @see #getMathOperation()
	 * @generated
	 */
	EAttribute getMathOperation_Operator();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.ColReference <em>Col Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Col Reference</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.ColReference
	 * @generated
	 */
	EClass getColReference();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.ColReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.ColReference#getTarget()
	 * @see #getColReference()
	 * @generated
	 */
	EAttribute getColReference_Target();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.StatisticalOperation <em>Statistical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistical Operation</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.StatisticalOperation
	 * @generated
	 */
	EClass getStatisticalOperation();

	/**
	 * Returns the meta object for the containment reference '{@link ucal3ia.bilang.abstractsyntax.StatisticalOperation#getColreference <em>Colreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Colreference</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.StatisticalOperation#getColreference()
	 * @see #getStatisticalOperation()
	 * @generated
	 */
	EReference getStatisticalOperation_Colreference();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.bilang.abstractsyntax.StatisticalOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.StatisticalOperation#getOperator()
	 * @see #getStatisticalOperation()
	 * @generated
	 */
	EAttribute getStatisticalOperation_Operator();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.ScatterPlot <em>Scatter Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scatter Plot</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.ScatterPlot
	 * @generated
	 */
	EClass getScatterPlot();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.PolarPlot <em>Polar Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polar Plot</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.PolarPlot
	 * @generated
	 */
	EClass getPolarPlot();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.PiePlot <em>Pie Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pie Plot</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.PiePlot
	 * @generated
	 */
	EClass getPiePlot();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.RadarPlot <em>Radar Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radar Plot</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.RadarPlot
	 * @generated
	 */
	EClass getRadarPlot();

	/**
	 * Returns the meta object for class '{@link ucal3ia.bilang.abstractsyntax.DonutPlot <em>Donut Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donut Plot</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.DonutPlot
	 * @generated
	 */
	EClass getDonutPlot();

	/**
	 * Returns the meta object for enum '{@link ucal3ia.bilang.abstractsyntax.MathOperator <em>Math Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Math Operator</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.MathOperator
	 * @generated
	 */
	EEnum getMathOperator();

	/**
	 * Returns the meta object for enum '{@link ucal3ia.bilang.abstractsyntax.StatisticalOperator <em>Statistical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statistical Operator</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.StatisticalOperator
	 * @generated
	 */
	EEnum getStatisticalOperator();

	/**
	 * Returns the meta object for enum '{@link ucal3ia.bilang.abstractsyntax.QuantitativeOperator <em>Quantitative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantitative Operator</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.QuantitativeOperator
	 * @generated
	 */
	EEnum getQuantitativeOperator();

	/**
	 * Returns the meta object for enum '{@link ucal3ia.bilang.abstractsyntax.QualitativeOperator <em>Qualitative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualitative Operator</em>'.
	 * @see ucal3ia.bilang.abstractsyntax.QualitativeOperator
	 * @generated
	 */
	EEnum getQualitativeOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractsyntaxFactory getAbstractsyntaxFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.NamedElementImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.TaskImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Fileextractor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__FILEEXTRACTOR = eINSTANCE.getTask_Fileextractor();

		/**
		 * The meta object literal for the '<em><b>Datafiltering</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DATAFILTERING = eINSTANCE.getTask_Datafiltering();

		/**
		 * The meta object literal for the '<em><b>Dashboard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DASHBOARD = eINSTANCE.getTask_Dashboard();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.FileExtractorImpl <em>File Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.FileExtractorImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getFileExtractor()
		 * @generated
		 */
		EClass FILE_EXTRACTOR = eINSTANCE.getFileExtractor();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_EXTRACTOR__PATH = eINSTANCE.getFileExtractor_Path();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.DataFilteringImpl <em>Data Filtering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.DataFilteringImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getDataFiltering()
		 * @generated
		 */
		EClass DATA_FILTERING = eINSTANCE.getDataFiltering();

		/**
		 * The meta object literal for the '<em><b>Fileextractor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FILTERING__FILEEXTRACTOR = eINSTANCE.getDataFiltering_Fileextractor();

		/**
		 * The meta object literal for the '<em><b>Filteringstep</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FILTERING__FILTERINGSTEP = eINSTANCE.getDataFiltering_Filteringstep();

		/**
		 * The meta object literal for the '<em><b>Processingstep</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FILTERING__PROCESSINGSTEP = eINSTANCE.getDataFiltering_Processingstep();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.DashBoardImpl <em>Dash Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.DashBoardImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getDashBoard()
		 * @generated
		 */
		EClass DASH_BOARD = eINSTANCE.getDashBoard();

		/**
		 * The meta object literal for the '<em><b>Fileextractor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASH_BOARD__FILEEXTRACTOR = eINSTANCE.getDashBoard_Fileextractor();

		/**
		 * The meta object literal for the '<em><b>Datafiltering</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASH_BOARD__DATAFILTERING = eINSTANCE.getDashBoard_Datafiltering();

		/**
		 * The meta object literal for the '<em><b>Plot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASH_BOARD__PLOT = eINSTANCE.getDashBoard_Plot();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.CsvExtractorImpl <em>Csv Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.CsvExtractorImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getCsvExtractor()
		 * @generated
		 */
		EClass CSV_EXTRACTOR = eINSTANCE.getCsvExtractor();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.ExcelExtractorImpl <em>Excel Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.ExcelExtractorImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getExcelExtractor()
		 * @generated
		 */
		EClass EXCEL_EXTRACTOR = eINSTANCE.getExcelExtractor();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.PlotImpl <em>Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.PlotImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getPlot()
		 * @generated
		 */
		EClass PLOT = eINSTANCE.getPlot();

		/**
		 * The meta object literal for the '<em><b>XAxis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT__XAXIS = eINSTANCE.getPlot_XAxis();

		/**
		 * The meta object literal for the '<em><b>YAxis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT__YAXIS = eINSTANCE.getPlot_YAxis();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT__LOCATION = eINSTANCE.getPlot_Location();

		/**
		 * The meta object literal for the '<em><b>Colors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT__COLORS = eINSTANCE.getPlot_Colors();

		/**
		 * The meta object literal for the '<em><b>Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT__THICKNESS = eINSTANCE.getPlot_Thickness();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.BarPlotImpl <em>Bar Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.BarPlotImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getBarPlot()
		 * @generated
		 */
		EClass BAR_PLOT = eINSTANCE.getBarPlot();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.LinePlotImpl <em>Line Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.LinePlotImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getLinePlot()
		 * @generated
		 */
		EClass LINE_PLOT = eINSTANCE.getLinePlot();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.FilteringStepImpl <em>Filtering Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.FilteringStepImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getFilteringStep()
		 * @generated
		 */
		EClass FILTERING_STEP = eINSTANCE.getFilteringStep();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERING_STEP__AXIS = eINSTANCE.getFilteringStep_Axis();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.PreprocessingStepImpl <em>Preprocessing Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.PreprocessingStepImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getPreprocessingStep()
		 * @generated
		 */
		EClass PREPROCESSING_STEP = eINSTANCE.getPreprocessingStep();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.QuantitativeFilteringImpl <em>Quantitative Filtering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.QuantitativeFilteringImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getQuantitativeFiltering()
		 * @generated
		 */
		EClass QUANTITATIVE_FILTERING = eINSTANCE.getQuantitativeFiltering();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_FILTERING__VALUES = eINSTANCE.getQuantitativeFiltering_Values();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_FILTERING__OPERATOR = eINSTANCE.getQuantitativeFiltering_Operator();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.QualitativeFilteringImpl <em>Qualitative Filtering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.QualitativeFilteringImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getQualitativeFiltering()
		 * @generated
		 */
		EClass QUALITATIVE_FILTERING = eINSTANCE.getQualitativeFiltering();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITATIVE_FILTERING__LABELS = eINSTANCE.getQualitativeFiltering_Labels();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITATIVE_FILTERING__OPERATOR = eINSTANCE.getQualitativeFiltering_Operator();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.MathOperationImpl <em>Math Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.MathOperationImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMathOperation()
		 * @generated
		 */
		EClass MATH_OPERATION = eINSTANCE.getMathOperation();

		/**
		 * The meta object literal for the '<em><b>Lside</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_OPERATION__LSIDE = eINSTANCE.getMathOperation_Lside();

		/**
		 * The meta object literal for the '<em><b>Rside</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATH_OPERATION__RSIDE = eINSTANCE.getMathOperation_Rside();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATH_OPERATION__OPERATOR = eINSTANCE.getMathOperation_Operator();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.ColReferenceImpl <em>Col Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.ColReferenceImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getColReference()
		 * @generated
		 */
		EClass COL_REFERENCE = eINSTANCE.getColReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_REFERENCE__TARGET = eINSTANCE.getColReference_Target();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.StatisticalOperationImpl <em>Statistical Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.StatisticalOperationImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getStatisticalOperation()
		 * @generated
		 */
		EClass STATISTICAL_OPERATION = eINSTANCE.getStatisticalOperation();

		/**
		 * The meta object literal for the '<em><b>Colreference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICAL_OPERATION__COLREFERENCE = eINSTANCE.getStatisticalOperation_Colreference();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICAL_OPERATION__OPERATOR = eINSTANCE.getStatisticalOperation_Operator();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.ScatterPlotImpl <em>Scatter Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.ScatterPlotImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getScatterPlot()
		 * @generated
		 */
		EClass SCATTER_PLOT = eINSTANCE.getScatterPlot();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.PolarPlotImpl <em>Polar Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.PolarPlotImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getPolarPlot()
		 * @generated
		 */
		EClass POLAR_PLOT = eINSTANCE.getPolarPlot();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.PiePlotImpl <em>Pie Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.PiePlotImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getPiePlot()
		 * @generated
		 */
		EClass PIE_PLOT = eINSTANCE.getPiePlot();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.RadarPlotImpl <em>Radar Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.RadarPlotImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getRadarPlot()
		 * @generated
		 */
		EClass RADAR_PLOT = eINSTANCE.getRadarPlot();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.impl.DonutPlotImpl <em>Donut Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.impl.DonutPlotImpl
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getDonutPlot()
		 * @generated
		 */
		EClass DONUT_PLOT = eINSTANCE.getDonutPlot();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.MathOperator <em>Math Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.MathOperator
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getMathOperator()
		 * @generated
		 */
		EEnum MATH_OPERATOR = eINSTANCE.getMathOperator();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.StatisticalOperator <em>Statistical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.StatisticalOperator
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getStatisticalOperator()
		 * @generated
		 */
		EEnum STATISTICAL_OPERATOR = eINSTANCE.getStatisticalOperator();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.QuantitativeOperator <em>Quantitative Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.QuantitativeOperator
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getQuantitativeOperator()
		 * @generated
		 */
		EEnum QUANTITATIVE_OPERATOR = eINSTANCE.getQuantitativeOperator();

		/**
		 * The meta object literal for the '{@link ucal3ia.bilang.abstractsyntax.QualitativeOperator <em>Qualitative Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.bilang.abstractsyntax.QualitativeOperator
		 * @see ucal3ia.bilang.abstractsyntax.impl.AbstractsyntaxPackageImpl#getQualitativeOperator()
		 * @generated
		 */
		EEnum QUALITATIVE_OPERATOR = eINSTANCE.getQualitativeOperator();

	}

} //AbstractsyntaxPackage
