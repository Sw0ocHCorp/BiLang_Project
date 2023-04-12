/**
 */
package ucal3ia.BiLang;

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
 * @see ucal3ia.BiLang.BiLangFactory
 * @model kind="package"
 * @generated
 */
public interface BiLangPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BiLang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/BiLang";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BiLang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BiLangPackage eINSTANCE = ucal3ia.BiLang.impl.BiLangPackageImpl.init();

	/**
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.NamedElementImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 10;

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
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.TaskImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

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
	 * The feature id for the '<em><b>Dashboard</b></em>' containment reference list.
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
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.FileExtractorImpl <em>File Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.FileExtractorImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getFileExtractor()
	 * @generated
	 */
	int FILE_EXTRACTOR = 1;

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
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.CsvExtractorImpl <em>Csv Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.CsvExtractorImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getCsvExtractor()
	 * @generated
	 */
	int CSV_EXTRACTOR = 2;

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
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.ExcelExtractorImpl <em>Excel Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.ExcelExtractorImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getExcelExtractor()
	 * @generated
	 */
	int EXCEL_EXTRACTOR = 3;

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
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.DataFilteringImpl <em>Data Filtering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.DataFilteringImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getDataFiltering()
	 * @generated
	 */
	int DATA_FILTERING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Filteringsteps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__FILTERINGSTEPS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preprocessingsteps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__PREPROCESSINGSTEPS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fileextractor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING__FILEEXTRACTOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FILTERING_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.DashBoardImpl <em>Dash Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.DashBoardImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getDashBoard()
	 * @generated
	 */
	int DASH_BOARD = 5;

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
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.PlotImpl <em>Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.PlotImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getPlot()
	 * @generated
	 */
	int PLOT = 16;

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
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__COLOR = NAMED_ELEMENT_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.LinePlotImpl <em>Line Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.LinePlotImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getLinePlot()
	 * @generated
	 */
	int LINE_PLOT = 6;

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
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PLOT__COLOR = PLOT__COLOR;

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
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.BarPlotImpl <em>Bar Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.BarPlotImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getBarPlot()
	 * @generated
	 */
	int BAR_PLOT = 7;

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
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_PLOT__COLOR = PLOT__COLOR;

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
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.FilteringStepsImpl <em>Filtering Steps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.FilteringStepsImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getFilteringSteps()
	 * @generated
	 */
	int FILTERING_STEPS = 8;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_STEPS__AXIS = 0;

	/**
	 * The number of structural features of the '<em>Filtering Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_STEPS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Filtering Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_STEPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.PreprocessingStepsImpl <em>Preprocessing Steps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.PreprocessingStepsImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getPreprocessingSteps()
	 * @generated
	 */
	int PREPROCESSING_STEPS = 9;

	/**
	 * The number of structural features of the '<em>Preprocessing Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_STEPS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Preprocessing Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESSING_STEPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.QuantitativeFilteringImpl <em>Quantitative Filtering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.QuantitativeFilteringImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getQuantitativeFiltering()
	 * @generated
	 */
	int QUANTITATIVE_FILTERING = 11;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_FILTERING__AXIS = FILTERING_STEPS__AXIS;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_FILTERING__TARGET_VALUE = FILTERING_STEPS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantitative Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_FILTERING_FEATURE_COUNT = FILTERING_STEPS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quantitative Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_FILTERING_OPERATION_COUNT = FILTERING_STEPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.QualitativeFilteringImpl <em>Qualitative Filtering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.QualitativeFilteringImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getQualitativeFiltering()
	 * @generated
	 */
	int QUALITATIVE_FILTERING = 12;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FILTERING__AXIS = FILTERING_STEPS__AXIS;

	/**
	 * The feature id for the '<em><b>Target Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FILTERING__TARGET_LABEL = FILTERING_STEPS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Qualitative Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FILTERING_FEATURE_COUNT = FILTERING_STEPS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Qualitative Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FILTERING_OPERATION_COUNT = FILTERING_STEPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.MathOperationImpl <em>Math Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.MathOperationImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getMathOperation()
	 * @generated
	 */
	int MATH_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Lside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION__LSIDE = PREPROCESSING_STEPS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION__RSIDE = PREPROCESSING_STEPS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION__OPERATOR = PREPROCESSING_STEPS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Math Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_FEATURE_COUNT = PREPROCESSING_STEPS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Math Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_OPERATION_OPERATION_COUNT = PREPROCESSING_STEPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.StatisticalOperationImpl <em>Statistical Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.StatisticalOperationImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getStatisticalOperation()
	 * @generated
	 */
	int STATISTICAL_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Preprocessingsteps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_OPERATION__PREPROCESSINGSTEPS = PREPROCESSING_STEPS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_OPERATION__OPERATOR = PREPROCESSING_STEPS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statistical Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_OPERATION_FEATURE_COUNT = PREPROCESSING_STEPS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statistical Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICAL_OPERATION_OPERATION_COUNT = PREPROCESSING_STEPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.BiLang.impl.colReferenceImpl <em>col Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.impl.colReferenceImpl
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getcolReference()
	 * @generated
	 */
	int COL_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Col Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_REFERENCE__COL_LABEL = PREPROCESSING_STEPS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>col Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_REFERENCE_FEATURE_COUNT = PREPROCESSING_STEPS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>col Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_REFERENCE_OPERATION_COUNT = PREPROCESSING_STEPS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ucal3ia.BiLang.MathOperator <em>Math Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.MathOperator
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getMathOperator()
	 * @generated
	 */
	int MATH_OPERATOR = 17;

	/**
	 * The meta object id for the '{@link ucal3ia.BiLang.StatisticalOperator <em>Statistical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ucal3ia.BiLang.StatisticalOperator
	 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getStatisticalOperator()
	 * @generated
	 */
	int STATISTICAL_OPERATOR = 18;

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see ucal3ia.BiLang.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the containment reference list '{@link ucal3ia.BiLang.Task#getFileextractor <em>Fileextractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fileextractor</em>'.
	 * @see ucal3ia.BiLang.Task#getFileextractor()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Fileextractor();

	/**
	 * Returns the meta object for the containment reference list '{@link ucal3ia.BiLang.Task#getDatafiltering <em>Datafiltering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datafiltering</em>'.
	 * @see ucal3ia.BiLang.Task#getDatafiltering()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Datafiltering();

	/**
	 * Returns the meta object for the containment reference list '{@link ucal3ia.BiLang.Task#getDashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dashboard</em>'.
	 * @see ucal3ia.BiLang.Task#getDashboard()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Dashboard();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.FileExtractor <em>File Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Extractor</em>'.
	 * @see ucal3ia.BiLang.FileExtractor
	 * @generated
	 */
	EClass getFileExtractor();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.FileExtractor#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ucal3ia.BiLang.FileExtractor#getPath()
	 * @see #getFileExtractor()
	 * @generated
	 */
	EAttribute getFileExtractor_Path();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.CsvExtractor <em>Csv Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Csv Extractor</em>'.
	 * @see ucal3ia.BiLang.CsvExtractor
	 * @generated
	 */
	EClass getCsvExtractor();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.ExcelExtractor <em>Excel Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excel Extractor</em>'.
	 * @see ucal3ia.BiLang.ExcelExtractor
	 * @generated
	 */
	EClass getExcelExtractor();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.DataFiltering <em>Data Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Filtering</em>'.
	 * @see ucal3ia.BiLang.DataFiltering
	 * @generated
	 */
	EClass getDataFiltering();

	/**
	 * Returns the meta object for the containment reference list '{@link ucal3ia.BiLang.DataFiltering#getFilteringsteps <em>Filteringsteps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filteringsteps</em>'.
	 * @see ucal3ia.BiLang.DataFiltering#getFilteringsteps()
	 * @see #getDataFiltering()
	 * @generated
	 */
	EReference getDataFiltering_Filteringsteps();

	/**
	 * Returns the meta object for the containment reference list '{@link ucal3ia.BiLang.DataFiltering#getPreprocessingsteps <em>Preprocessingsteps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preprocessingsteps</em>'.
	 * @see ucal3ia.BiLang.DataFiltering#getPreprocessingsteps()
	 * @see #getDataFiltering()
	 * @generated
	 */
	EReference getDataFiltering_Preprocessingsteps();

	/**
	 * Returns the meta object for the reference '{@link ucal3ia.BiLang.DataFiltering#getFileextractor <em>Fileextractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fileextractor</em>'.
	 * @see ucal3ia.BiLang.DataFiltering#getFileextractor()
	 * @see #getDataFiltering()
	 * @generated
	 */
	EReference getDataFiltering_Fileextractor();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.DashBoard <em>Dash Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dash Board</em>'.
	 * @see ucal3ia.BiLang.DashBoard
	 * @generated
	 */
	EClass getDashBoard();

	/**
	 * Returns the meta object for the reference '{@link ucal3ia.BiLang.DashBoard#getFileextractor <em>Fileextractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fileextractor</em>'.
	 * @see ucal3ia.BiLang.DashBoard#getFileextractor()
	 * @see #getDashBoard()
	 * @generated
	 */
	EReference getDashBoard_Fileextractor();

	/**
	 * Returns the meta object for the reference '{@link ucal3ia.BiLang.DashBoard#getDatafiltering <em>Datafiltering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datafiltering</em>'.
	 * @see ucal3ia.BiLang.DashBoard#getDatafiltering()
	 * @see #getDashBoard()
	 * @generated
	 */
	EReference getDashBoard_Datafiltering();

	/**
	 * Returns the meta object for the containment reference list '{@link ucal3ia.BiLang.DashBoard#getPlot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plot</em>'.
	 * @see ucal3ia.BiLang.DashBoard#getPlot()
	 * @see #getDashBoard()
	 * @generated
	 */
	EReference getDashBoard_Plot();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.LinePlot <em>Line Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Plot</em>'.
	 * @see ucal3ia.BiLang.LinePlot
	 * @generated
	 */
	EClass getLinePlot();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.BarPlot <em>Bar Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar Plot</em>'.
	 * @see ucal3ia.BiLang.BarPlot
	 * @generated
	 */
	EClass getBarPlot();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.FilteringSteps <em>Filtering Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtering Steps</em>'.
	 * @see ucal3ia.BiLang.FilteringSteps
	 * @generated
	 */
	EClass getFilteringSteps();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.FilteringSteps#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see ucal3ia.BiLang.FilteringSteps#getAxis()
	 * @see #getFilteringSteps()
	 * @generated
	 */
	EAttribute getFilteringSteps_Axis();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.PreprocessingSteps <em>Preprocessing Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preprocessing Steps</em>'.
	 * @see ucal3ia.BiLang.PreprocessingSteps
	 * @generated
	 */
	EClass getPreprocessingSteps();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ucal3ia.BiLang.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ucal3ia.BiLang.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.QuantitativeFiltering <em>Quantitative Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantitative Filtering</em>'.
	 * @see ucal3ia.BiLang.QuantitativeFiltering
	 * @generated
	 */
	EClass getQuantitativeFiltering();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.QuantitativeFiltering#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Value</em>'.
	 * @see ucal3ia.BiLang.QuantitativeFiltering#getTargetValue()
	 * @see #getQuantitativeFiltering()
	 * @generated
	 */
	EAttribute getQuantitativeFiltering_TargetValue();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.QualitativeFiltering <em>Qualitative Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualitative Filtering</em>'.
	 * @see ucal3ia.BiLang.QualitativeFiltering
	 * @generated
	 */
	EClass getQualitativeFiltering();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.QualitativeFiltering#getTargetLabel <em>Target Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Label</em>'.
	 * @see ucal3ia.BiLang.QualitativeFiltering#getTargetLabel()
	 * @see #getQualitativeFiltering()
	 * @generated
	 */
	EAttribute getQualitativeFiltering_TargetLabel();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.MathOperation <em>Math Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math Operation</em>'.
	 * @see ucal3ia.BiLang.MathOperation
	 * @generated
	 */
	EClass getMathOperation();

	/**
	 * Returns the meta object for the containment reference '{@link ucal3ia.BiLang.MathOperation#getLside <em>Lside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lside</em>'.
	 * @see ucal3ia.BiLang.MathOperation#getLside()
	 * @see #getMathOperation()
	 * @generated
	 */
	EReference getMathOperation_Lside();

	/**
	 * Returns the meta object for the containment reference '{@link ucal3ia.BiLang.MathOperation#getRside <em>Rside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rside</em>'.
	 * @see ucal3ia.BiLang.MathOperation#getRside()
	 * @see #getMathOperation()
	 * @generated
	 */
	EReference getMathOperation_Rside();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.MathOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ucal3ia.BiLang.MathOperation#getOperator()
	 * @see #getMathOperation()
	 * @generated
	 */
	EAttribute getMathOperation_Operator();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.StatisticalOperation <em>Statistical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistical Operation</em>'.
	 * @see ucal3ia.BiLang.StatisticalOperation
	 * @generated
	 */
	EClass getStatisticalOperation();

	/**
	 * Returns the meta object for the containment reference '{@link ucal3ia.BiLang.StatisticalOperation#getPreprocessingsteps <em>Preprocessingsteps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preprocessingsteps</em>'.
	 * @see ucal3ia.BiLang.StatisticalOperation#getPreprocessingsteps()
	 * @see #getStatisticalOperation()
	 * @generated
	 */
	EReference getStatisticalOperation_Preprocessingsteps();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.StatisticalOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ucal3ia.BiLang.StatisticalOperation#getOperator()
	 * @see #getStatisticalOperation()
	 * @generated
	 */
	EAttribute getStatisticalOperation_Operator();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.colReference <em>col Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>col Reference</em>'.
	 * @see ucal3ia.BiLang.colReference
	 * @generated
	 */
	EClass getcolReference();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.colReference#getColLabel <em>Col Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Label</em>'.
	 * @see ucal3ia.BiLang.colReference#getColLabel()
	 * @see #getcolReference()
	 * @generated
	 */
	EAttribute getcolReference_ColLabel();

	/**
	 * Returns the meta object for class '{@link ucal3ia.BiLang.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot</em>'.
	 * @see ucal3ia.BiLang.Plot
	 * @generated
	 */
	EClass getPlot();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.Plot#getXAxis <em>XAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis</em>'.
	 * @see ucal3ia.BiLang.Plot#getXAxis()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_XAxis();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.Plot#getYAxis <em>YAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis</em>'.
	 * @see ucal3ia.BiLang.Plot#getYAxis()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_YAxis();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.Plot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see ucal3ia.BiLang.Plot#getLocation()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_Location();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.Plot#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see ucal3ia.BiLang.Plot#getColor()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_Color();

	/**
	 * Returns the meta object for the attribute '{@link ucal3ia.BiLang.Plot#getThickness <em>Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thickness</em>'.
	 * @see ucal3ia.BiLang.Plot#getThickness()
	 * @see #getPlot()
	 * @generated
	 */
	EAttribute getPlot_Thickness();

	/**
	 * Returns the meta object for enum '{@link ucal3ia.BiLang.MathOperator <em>Math Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Math Operator</em>'.
	 * @see ucal3ia.BiLang.MathOperator
	 * @generated
	 */
	EEnum getMathOperator();

	/**
	 * Returns the meta object for enum '{@link ucal3ia.BiLang.StatisticalOperator <em>Statistical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statistical Operator</em>'.
	 * @see ucal3ia.BiLang.StatisticalOperator
	 * @generated
	 */
	EEnum getStatisticalOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BiLangFactory getBiLangFactory();

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
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.TaskImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getTask()
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
		 * The meta object literal for the '<em><b>Dashboard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DASHBOARD = eINSTANCE.getTask_Dashboard();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.FileExtractorImpl <em>File Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.FileExtractorImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getFileExtractor()
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
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.CsvExtractorImpl <em>Csv Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.CsvExtractorImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getCsvExtractor()
		 * @generated
		 */
		EClass CSV_EXTRACTOR = eINSTANCE.getCsvExtractor();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.ExcelExtractorImpl <em>Excel Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.ExcelExtractorImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getExcelExtractor()
		 * @generated
		 */
		EClass EXCEL_EXTRACTOR = eINSTANCE.getExcelExtractor();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.DataFilteringImpl <em>Data Filtering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.DataFilteringImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getDataFiltering()
		 * @generated
		 */
		EClass DATA_FILTERING = eINSTANCE.getDataFiltering();

		/**
		 * The meta object literal for the '<em><b>Filteringsteps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FILTERING__FILTERINGSTEPS = eINSTANCE.getDataFiltering_Filteringsteps();

		/**
		 * The meta object literal for the '<em><b>Preprocessingsteps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FILTERING__PREPROCESSINGSTEPS = eINSTANCE.getDataFiltering_Preprocessingsteps();

		/**
		 * The meta object literal for the '<em><b>Fileextractor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FILTERING__FILEEXTRACTOR = eINSTANCE.getDataFiltering_Fileextractor();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.DashBoardImpl <em>Dash Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.DashBoardImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getDashBoard()
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
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.LinePlotImpl <em>Line Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.LinePlotImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getLinePlot()
		 * @generated
		 */
		EClass LINE_PLOT = eINSTANCE.getLinePlot();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.BarPlotImpl <em>Bar Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.BarPlotImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getBarPlot()
		 * @generated
		 */
		EClass BAR_PLOT = eINSTANCE.getBarPlot();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.FilteringStepsImpl <em>Filtering Steps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.FilteringStepsImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getFilteringSteps()
		 * @generated
		 */
		EClass FILTERING_STEPS = eINSTANCE.getFilteringSteps();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTERING_STEPS__AXIS = eINSTANCE.getFilteringSteps_Axis();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.PreprocessingStepsImpl <em>Preprocessing Steps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.PreprocessingStepsImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getPreprocessingSteps()
		 * @generated
		 */
		EClass PREPROCESSING_STEPS = eINSTANCE.getPreprocessingSteps();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.NamedElementImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.QuantitativeFilteringImpl <em>Quantitative Filtering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.QuantitativeFilteringImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getQuantitativeFiltering()
		 * @generated
		 */
		EClass QUANTITATIVE_FILTERING = eINSTANCE.getQuantitativeFiltering();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_FILTERING__TARGET_VALUE = eINSTANCE.getQuantitativeFiltering_TargetValue();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.QualitativeFilteringImpl <em>Qualitative Filtering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.QualitativeFilteringImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getQualitativeFiltering()
		 * @generated
		 */
		EClass QUALITATIVE_FILTERING = eINSTANCE.getQualitativeFiltering();

		/**
		 * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITATIVE_FILTERING__TARGET_LABEL = eINSTANCE.getQualitativeFiltering_TargetLabel();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.MathOperationImpl <em>Math Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.MathOperationImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getMathOperation()
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
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.StatisticalOperationImpl <em>Statistical Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.StatisticalOperationImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getStatisticalOperation()
		 * @generated
		 */
		EClass STATISTICAL_OPERATION = eINSTANCE.getStatisticalOperation();

		/**
		 * The meta object literal for the '<em><b>Preprocessingsteps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICAL_OPERATION__PREPROCESSINGSTEPS = eINSTANCE.getStatisticalOperation_Preprocessingsteps();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICAL_OPERATION__OPERATOR = eINSTANCE.getStatisticalOperation_Operator();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.colReferenceImpl <em>col Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.colReferenceImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getcolReference()
		 * @generated
		 */
		EClass COL_REFERENCE = eINSTANCE.getcolReference();

		/**
		 * The meta object literal for the '<em><b>Col Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_REFERENCE__COL_LABEL = eINSTANCE.getcolReference_ColLabel();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.impl.PlotImpl <em>Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.impl.PlotImpl
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getPlot()
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
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT__COLOR = eINSTANCE.getPlot_Color();

		/**
		 * The meta object literal for the '<em><b>Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLOT__THICKNESS = eINSTANCE.getPlot_Thickness();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.MathOperator <em>Math Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.MathOperator
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getMathOperator()
		 * @generated
		 */
		EEnum MATH_OPERATOR = eINSTANCE.getMathOperator();

		/**
		 * The meta object literal for the '{@link ucal3ia.BiLang.StatisticalOperator <em>Statistical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ucal3ia.BiLang.StatisticalOperator
		 * @see ucal3ia.BiLang.impl.BiLangPackageImpl#getStatisticalOperator()
		 * @generated
		 */
		EEnum STATISTICAL_OPERATOR = eINSTANCE.getStatisticalOperator();

	}

} //BiLangPackage
