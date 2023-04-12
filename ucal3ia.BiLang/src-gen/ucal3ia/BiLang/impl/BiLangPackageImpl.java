/**
 */
package ucal3ia.BiLang.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import ucal3ia.BiLang.BarPlot;
import ucal3ia.BiLang.BiLangFactory;
import ucal3ia.BiLang.BiLangPackage;
import ucal3ia.BiLang.CsvExtractor;
import ucal3ia.BiLang.DashBoard;
import ucal3ia.BiLang.DataFiltering;
import ucal3ia.BiLang.ExcelExtractor;
import ucal3ia.BiLang.FileExtractor;
import ucal3ia.BiLang.FilteringSteps;
import ucal3ia.BiLang.LinePlot;
import ucal3ia.BiLang.MathOperation;
import ucal3ia.BiLang.MathOperator;
import ucal3ia.BiLang.NamedElement;
import ucal3ia.BiLang.Plot;
import ucal3ia.BiLang.PreprocessingSteps;
import ucal3ia.BiLang.QualitativeFiltering;
import ucal3ia.BiLang.QuantitativeFiltering;
import ucal3ia.BiLang.StatisticalOperation;
import ucal3ia.BiLang.StatisticalOperator;
import ucal3ia.BiLang.Task;
import ucal3ia.BiLang.colReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BiLangPackageImpl extends EPackageImpl implements BiLangPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileExtractorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvExtractorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excelExtractorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFilteringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dashBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linePlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteringStepsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preprocessingStepsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantitativeFilteringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualitativeFilteringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticalOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mathOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statisticalOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ucal3ia.BiLang.BiLangPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BiLangPackageImpl() {
		super(eNS_URI, BiLangFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BiLangPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BiLangPackage init() {
		if (isInited)
			return (BiLangPackage) EPackage.Registry.INSTANCE.getEPackage(BiLangPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBiLangPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BiLangPackageImpl theBiLangPackage = registeredBiLangPackage instanceof BiLangPackageImpl
				? (BiLangPackageImpl) registeredBiLangPackage
				: new BiLangPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBiLangPackage.createPackageContents();

		// Initialize created meta-data
		theBiLangPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBiLangPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BiLangPackage.eNS_URI, theBiLangPackage);
		return theBiLangPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Fileextractor() {
		return (EReference) taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Datafiltering() {
		return (EReference) taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Dashboard() {
		return (EReference) taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileExtractor() {
		return fileExtractorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileExtractor_Path() {
		return (EAttribute) fileExtractorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsvExtractor() {
		return csvExtractorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcelExtractor() {
		return excelExtractorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFiltering() {
		return dataFilteringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFiltering_Filteringsteps() {
		return (EReference) dataFilteringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFiltering_Preprocessingsteps() {
		return (EReference) dataFilteringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFiltering_Fileextractor() {
		return (EReference) dataFilteringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDashBoard() {
		return dashBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDashBoard_Fileextractor() {
		return (EReference) dashBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDashBoard_Datafiltering() {
		return (EReference) dashBoardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDashBoard_Plot() {
		return (EReference) dashBoardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinePlot() {
		return linePlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBarPlot() {
		return barPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteringSteps() {
		return filteringStepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteringSteps_Axis() {
		return (EAttribute) filteringStepsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreprocessingSteps() {
		return preprocessingStepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantitativeFiltering() {
		return quantitativeFilteringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeFiltering_TargetValue() {
		return (EAttribute) quantitativeFilteringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualitativeFiltering() {
		return qualitativeFilteringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualitativeFiltering_TargetLabel() {
		return (EAttribute) qualitativeFilteringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMathOperation() {
		return mathOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMathOperation_Lside() {
		return (EReference) mathOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMathOperation_Rside() {
		return (EReference) mathOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMathOperation_Operator() {
		return (EAttribute) mathOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatisticalOperation() {
		return statisticalOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatisticalOperation_Preprocessingsteps() {
		return (EReference) statisticalOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatisticalOperation_Operator() {
		return (EAttribute) statisticalOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcolReference() {
		return colReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcolReference_ColLabel() {
		return (EAttribute) colReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlot() {
		return plotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlot_XAxis() {
		return (EAttribute) plotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlot_YAxis() {
		return (EAttribute) plotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlot_Location() {
		return (EAttribute) plotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlot_Color() {
		return (EAttribute) plotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlot_Thickness() {
		return (EAttribute) plotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMathOperator() {
		return mathOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatisticalOperator() {
		return statisticalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiLangFactory getBiLangFactory() {
		return (BiLangFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__FILEEXTRACTOR);
		createEReference(taskEClass, TASK__DATAFILTERING);
		createEReference(taskEClass, TASK__DASHBOARD);

		fileExtractorEClass = createEClass(FILE_EXTRACTOR);
		createEAttribute(fileExtractorEClass, FILE_EXTRACTOR__PATH);

		csvExtractorEClass = createEClass(CSV_EXTRACTOR);

		excelExtractorEClass = createEClass(EXCEL_EXTRACTOR);

		dataFilteringEClass = createEClass(DATA_FILTERING);
		createEReference(dataFilteringEClass, DATA_FILTERING__FILTERINGSTEPS);
		createEReference(dataFilteringEClass, DATA_FILTERING__PREPROCESSINGSTEPS);
		createEReference(dataFilteringEClass, DATA_FILTERING__FILEEXTRACTOR);

		dashBoardEClass = createEClass(DASH_BOARD);
		createEReference(dashBoardEClass, DASH_BOARD__FILEEXTRACTOR);
		createEReference(dashBoardEClass, DASH_BOARD__DATAFILTERING);
		createEReference(dashBoardEClass, DASH_BOARD__PLOT);

		linePlotEClass = createEClass(LINE_PLOT);

		barPlotEClass = createEClass(BAR_PLOT);

		filteringStepsEClass = createEClass(FILTERING_STEPS);
		createEAttribute(filteringStepsEClass, FILTERING_STEPS__AXIS);

		preprocessingStepsEClass = createEClass(PREPROCESSING_STEPS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		quantitativeFilteringEClass = createEClass(QUANTITATIVE_FILTERING);
		createEAttribute(quantitativeFilteringEClass, QUANTITATIVE_FILTERING__TARGET_VALUE);

		qualitativeFilteringEClass = createEClass(QUALITATIVE_FILTERING);
		createEAttribute(qualitativeFilteringEClass, QUALITATIVE_FILTERING__TARGET_LABEL);

		mathOperationEClass = createEClass(MATH_OPERATION);
		createEReference(mathOperationEClass, MATH_OPERATION__LSIDE);
		createEReference(mathOperationEClass, MATH_OPERATION__RSIDE);
		createEAttribute(mathOperationEClass, MATH_OPERATION__OPERATOR);

		statisticalOperationEClass = createEClass(STATISTICAL_OPERATION);
		createEReference(statisticalOperationEClass, STATISTICAL_OPERATION__PREPROCESSINGSTEPS);
		createEAttribute(statisticalOperationEClass, STATISTICAL_OPERATION__OPERATOR);

		colReferenceEClass = createEClass(COL_REFERENCE);
		createEAttribute(colReferenceEClass, COL_REFERENCE__COL_LABEL);

		plotEClass = createEClass(PLOT);
		createEAttribute(plotEClass, PLOT__XAXIS);
		createEAttribute(plotEClass, PLOT__YAXIS);
		createEAttribute(plotEClass, PLOT__LOCATION);
		createEAttribute(plotEClass, PLOT__COLOR);
		createEAttribute(plotEClass, PLOT__THICKNESS);

		// Create enums
		mathOperatorEEnum = createEEnum(MATH_OPERATOR);
		statisticalOperatorEEnum = createEEnum(STATISTICAL_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		taskEClass.getESuperTypes().add(this.getNamedElement());
		fileExtractorEClass.getESuperTypes().add(this.getNamedElement());
		csvExtractorEClass.getESuperTypes().add(this.getFileExtractor());
		excelExtractorEClass.getESuperTypes().add(this.getFileExtractor());
		dataFilteringEClass.getESuperTypes().add(this.getNamedElement());
		dashBoardEClass.getESuperTypes().add(this.getNamedElement());
		linePlotEClass.getESuperTypes().add(this.getPlot());
		barPlotEClass.getESuperTypes().add(this.getPlot());
		quantitativeFilteringEClass.getESuperTypes().add(this.getFilteringSteps());
		qualitativeFilteringEClass.getESuperTypes().add(this.getFilteringSteps());
		mathOperationEClass.getESuperTypes().add(this.getPreprocessingSteps());
		statisticalOperationEClass.getESuperTypes().add(this.getPreprocessingSteps());
		colReferenceEClass.getESuperTypes().add(this.getPreprocessingSteps());
		plotEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Fileextractor(), this.getFileExtractor(), null, "fileextractor", null, 1, -1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Datafiltering(), this.getDataFiltering(), null, "datafiltering", null, 0, -1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Dashboard(), this.getDashBoard(), null, "dashboard", null, 1, -1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileExtractorEClass, FileExtractor.class, "FileExtractor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileExtractor_Path(), ecorePackage.getEString(), "path", null, 0, 1, FileExtractor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csvExtractorEClass, CsvExtractor.class, "CsvExtractor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(excelExtractorEClass, ExcelExtractor.class, "ExcelExtractor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFilteringEClass, DataFiltering.class, "DataFiltering", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFiltering_Filteringsteps(), this.getFilteringSteps(), null, "filteringsteps", null, 1, -1,
				DataFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFiltering_Preprocessingsteps(), this.getPreprocessingSteps(), null, "preprocessingsteps",
				null, 0, -1, DataFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFiltering_Fileextractor(), this.getFileExtractor(), null, "fileextractor", null, 1, 1,
				DataFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dashBoardEClass, DashBoard.class, "DashBoard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDashBoard_Fileextractor(), this.getFileExtractor(), null, "fileextractor", null, 0, 1,
				DashBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDashBoard_Datafiltering(), this.getDataFiltering(), null, "datafiltering", null, 0, 1,
				DashBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDashBoard_Plot(), this.getPlot(), null, "plot", null, 1, -1, DashBoard.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(linePlotEClass, LinePlot.class, "LinePlot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(barPlotEClass, BarPlot.class, "BarPlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filteringStepsEClass, FilteringSteps.class, "FilteringSteps", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilteringSteps_Axis(), ecorePackage.getEString(), "axis", null, 0, 1, FilteringSteps.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preprocessingStepsEClass, PreprocessingSteps.class, "PreprocessingSteps", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theXMLTypePackage.getID(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantitativeFilteringEClass, QuantitativeFiltering.class, "QuantitativeFiltering", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantitativeFiltering_TargetValue(), ecorePackage.getEString(), "targetValue", null, 0, 1,
				QuantitativeFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualitativeFilteringEClass, QualitativeFiltering.class, "QualitativeFiltering", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualitativeFiltering_TargetLabel(), ecorePackage.getEString(), "targetLabel", null, 0, 1,
				QualitativeFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mathOperationEClass, MathOperation.class, "MathOperation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMathOperation_Lside(), this.getPreprocessingSteps(), null, "lside", null, 1, 1,
				MathOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMathOperation_Rside(), this.getPreprocessingSteps(), null, "rside", null, 1, 1,
				MathOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMathOperation_Operator(), this.getMathOperator(), "operator", null, 0, 1, MathOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticalOperationEClass, StatisticalOperation.class, "StatisticalOperation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatisticalOperation_Preprocessingsteps(), this.getPreprocessingSteps(), null,
				"preprocessingsteps", null, 1, 1, StatisticalOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatisticalOperation_Operator(), this.getStatisticalOperator(), "operator", null, 0, 1,
				StatisticalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colReferenceEClass, colReference.class, "colReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcolReference_ColLabel(), ecorePackage.getEString(), "colLabel", null, 0, 1,
				colReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(plotEClass, Plot.class, "Plot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlot_XAxis(), ecorePackage.getEString(), "xAxis", null, 0, 1, Plot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlot_YAxis(), ecorePackage.getEString(), "yAxis", null, 0, 1, Plot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlot_Location(), ecorePackage.getEString(), "location", null, 0, 1, Plot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlot_Color(), ecorePackage.getEString(), "color", null, 0, 1, Plot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlot_Thickness(), ecorePackage.getEFloat(), "thickness", null, 0, 1, Plot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mathOperatorEEnum, MathOperator.class, "MathOperator");
		addEEnumLiteral(mathOperatorEEnum, MathOperator.PLUS);
		addEEnumLiteral(mathOperatorEEnum, MathOperator.MINUS);
		addEEnumLiteral(mathOperatorEEnum, MathOperator.MULTIPLY);
		addEEnumLiteral(mathOperatorEEnum, MathOperator.DIVIDING);

		initEEnum(statisticalOperatorEEnum, StatisticalOperator.class, "StatisticalOperator");
		addEEnumLiteral(statisticalOperatorEEnum, StatisticalOperator.MEAN);
		addEEnumLiteral(statisticalOperatorEEnum, StatisticalOperator.MEDIAN);
		addEEnumLiteral(statisticalOperatorEEnum, StatisticalOperator.STD);

		// Create resource
		createResource(eNS_URI);
	}

} //BiLangPackageImpl
