/**
 */
package ucal3ia.bilang.abstractsyntax.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxFactory;
import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.BarPlot;
import ucal3ia.bilang.abstractsyntax.ColReference;
import ucal3ia.bilang.abstractsyntax.CsvExtractor;
import ucal3ia.bilang.abstractsyntax.DashBoard;
import ucal3ia.bilang.abstractsyntax.DataFiltering;
import ucal3ia.bilang.abstractsyntax.DonutPlot;
import ucal3ia.bilang.abstractsyntax.ExcelExtractor;
import ucal3ia.bilang.abstractsyntax.FileExtractor;
import ucal3ia.bilang.abstractsyntax.FilteringStep;
import ucal3ia.bilang.abstractsyntax.LinePlot;
import ucal3ia.bilang.abstractsyntax.MathOperation;
import ucal3ia.bilang.abstractsyntax.MathOperator;
import ucal3ia.bilang.abstractsyntax.NamedElement;
import ucal3ia.bilang.abstractsyntax.PiePlot;
import ucal3ia.bilang.abstractsyntax.Plot;
import ucal3ia.bilang.abstractsyntax.PolarPlot;
import ucal3ia.bilang.abstractsyntax.PreprocessingStep;
import ucal3ia.bilang.abstractsyntax.QualitativeFiltering;
import ucal3ia.bilang.abstractsyntax.QualitativeOperator;
import ucal3ia.bilang.abstractsyntax.QuantitativeFiltering;
import ucal3ia.bilang.abstractsyntax.QuantitativeOperator;
import ucal3ia.bilang.abstractsyntax.RadarPlot;
import ucal3ia.bilang.abstractsyntax.ScatterPlot;
import ucal3ia.bilang.abstractsyntax.StatisticalOperation;
import ucal3ia.bilang.abstractsyntax.StatisticalOperator;
import ucal3ia.bilang.abstractsyntax.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractsyntaxPackageImpl extends EPackageImpl implements AbstractsyntaxPackage {
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
	private EClass plotEClass = null;

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
	private EClass linePlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteringStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preprocessingStepEClass = null;

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
	private EClass colReferenceEClass = null;

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
	private EClass scatterPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polarPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass piePlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radarPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donutPlotEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantitativeOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qualitativeOperatorEEnum = null;

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
	 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AbstractsyntaxPackageImpl() {
		super(eNS_URI, AbstractsyntaxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AbstractsyntaxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AbstractsyntaxPackage init() {
		if (isInited)
			return (AbstractsyntaxPackage) EPackage.Registry.INSTANCE.getEPackage(AbstractsyntaxPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAbstractsyntaxPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AbstractsyntaxPackageImpl theAbstractsyntaxPackage = registeredAbstractsyntaxPackage instanceof AbstractsyntaxPackageImpl
				? (AbstractsyntaxPackageImpl) registeredAbstractsyntaxPackage
				: new AbstractsyntaxPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAbstractsyntaxPackage.createPackageContents();

		// Initialize created meta-data
		theAbstractsyntaxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAbstractsyntaxPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AbstractsyntaxPackage.eNS_URI, theAbstractsyntaxPackage);
		return theAbstractsyntaxPackage;
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
	public EClass getDataFiltering() {
		return dataFilteringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFiltering_Fileextractor() {
		return (EReference) dataFilteringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFiltering_Filteringstep() {
		return (EReference) dataFilteringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFiltering_Processingstep() {
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
	public EAttribute getPlot_Colors() {
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
	public EClass getBarPlot() {
		return barPlotEClass;
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
	public EClass getFilteringStep() {
		return filteringStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteringStep_Axis() {
		return (EAttribute) filteringStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreprocessingStep() {
		return preprocessingStepEClass;
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
	public EAttribute getQuantitativeFiltering_Values() {
		return (EAttribute) quantitativeFilteringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitativeFiltering_Operator() {
		return (EAttribute) quantitativeFilteringEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getQualitativeFiltering_Labels() {
		return (EAttribute) qualitativeFilteringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualitativeFiltering_Operator() {
		return (EAttribute) qualitativeFilteringEClass.getEStructuralFeatures().get(1);
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
	public EClass getColReference() {
		return colReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColReference_Target() {
		return (EAttribute) colReferenceEClass.getEStructuralFeatures().get(0);
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
	public EReference getStatisticalOperation_Colreference() {
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
	public EClass getScatterPlot() {
		return scatterPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolarPlot() {
		return polarPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPiePlot() {
		return piePlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadarPlot() {
		return radarPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDonutPlot() {
		return donutPlotEClass;
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
	public EEnum getQuantitativeOperator() {
		return quantitativeOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQualitativeOperator() {
		return qualitativeOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxFactory getAbstractsyntaxFactory() {
		return (AbstractsyntaxFactory) getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__FILEEXTRACTOR);
		createEReference(taskEClass, TASK__DATAFILTERING);
		createEReference(taskEClass, TASK__DASHBOARD);

		fileExtractorEClass = createEClass(FILE_EXTRACTOR);
		createEAttribute(fileExtractorEClass, FILE_EXTRACTOR__PATH);

		dataFilteringEClass = createEClass(DATA_FILTERING);
		createEReference(dataFilteringEClass, DATA_FILTERING__FILEEXTRACTOR);
		createEReference(dataFilteringEClass, DATA_FILTERING__FILTERINGSTEP);
		createEReference(dataFilteringEClass, DATA_FILTERING__PROCESSINGSTEP);

		dashBoardEClass = createEClass(DASH_BOARD);
		createEReference(dashBoardEClass, DASH_BOARD__FILEEXTRACTOR);
		createEReference(dashBoardEClass, DASH_BOARD__DATAFILTERING);
		createEReference(dashBoardEClass, DASH_BOARD__PLOT);

		csvExtractorEClass = createEClass(CSV_EXTRACTOR);

		excelExtractorEClass = createEClass(EXCEL_EXTRACTOR);

		plotEClass = createEClass(PLOT);
		createEAttribute(plotEClass, PLOT__XAXIS);
		createEAttribute(plotEClass, PLOT__YAXIS);
		createEAttribute(plotEClass, PLOT__LOCATION);
		createEAttribute(plotEClass, PLOT__COLORS);
		createEAttribute(plotEClass, PLOT__THICKNESS);

		barPlotEClass = createEClass(BAR_PLOT);

		linePlotEClass = createEClass(LINE_PLOT);

		filteringStepEClass = createEClass(FILTERING_STEP);
		createEAttribute(filteringStepEClass, FILTERING_STEP__AXIS);

		preprocessingStepEClass = createEClass(PREPROCESSING_STEP);

		quantitativeFilteringEClass = createEClass(QUANTITATIVE_FILTERING);
		createEAttribute(quantitativeFilteringEClass, QUANTITATIVE_FILTERING__VALUES);
		createEAttribute(quantitativeFilteringEClass, QUANTITATIVE_FILTERING__OPERATOR);

		qualitativeFilteringEClass = createEClass(QUALITATIVE_FILTERING);
		createEAttribute(qualitativeFilteringEClass, QUALITATIVE_FILTERING__LABELS);
		createEAttribute(qualitativeFilteringEClass, QUALITATIVE_FILTERING__OPERATOR);

		mathOperationEClass = createEClass(MATH_OPERATION);
		createEReference(mathOperationEClass, MATH_OPERATION__LSIDE);
		createEReference(mathOperationEClass, MATH_OPERATION__RSIDE);
		createEAttribute(mathOperationEClass, MATH_OPERATION__OPERATOR);

		colReferenceEClass = createEClass(COL_REFERENCE);
		createEAttribute(colReferenceEClass, COL_REFERENCE__TARGET);

		statisticalOperationEClass = createEClass(STATISTICAL_OPERATION);
		createEReference(statisticalOperationEClass, STATISTICAL_OPERATION__COLREFERENCE);
		createEAttribute(statisticalOperationEClass, STATISTICAL_OPERATION__OPERATOR);

		scatterPlotEClass = createEClass(SCATTER_PLOT);

		polarPlotEClass = createEClass(POLAR_PLOT);

		piePlotEClass = createEClass(PIE_PLOT);

		radarPlotEClass = createEClass(RADAR_PLOT);

		donutPlotEClass = createEClass(DONUT_PLOT);

		// Create enums
		mathOperatorEEnum = createEEnum(MATH_OPERATOR);
		statisticalOperatorEEnum = createEEnum(STATISTICAL_OPERATOR);
		quantitativeOperatorEEnum = createEEnum(QUANTITATIVE_OPERATOR);
		qualitativeOperatorEEnum = createEEnum(QUALITATIVE_OPERATOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		taskEClass.getESuperTypes().add(this.getNamedElement());
		fileExtractorEClass.getESuperTypes().add(this.getNamedElement());
		dashBoardEClass.getESuperTypes().add(this.getNamedElement());
		csvExtractorEClass.getESuperTypes().add(this.getFileExtractor());
		excelExtractorEClass.getESuperTypes().add(this.getFileExtractor());
		plotEClass.getESuperTypes().add(this.getNamedElement());
		barPlotEClass.getESuperTypes().add(this.getPlot());
		linePlotEClass.getESuperTypes().add(this.getPlot());
		quantitativeFilteringEClass.getESuperTypes().add(this.getFilteringStep());
		qualitativeFilteringEClass.getESuperTypes().add(this.getFilteringStep());
		mathOperationEClass.getESuperTypes().add(this.getPreprocessingStep());
		colReferenceEClass.getESuperTypes().add(this.getPreprocessingStep());
		statisticalOperationEClass.getESuperTypes().add(this.getPreprocessingStep());
		scatterPlotEClass.getESuperTypes().add(this.getPlot());
		polarPlotEClass.getESuperTypes().add(this.getPlot());
		piePlotEClass.getESuperTypes().add(this.getPlot());
		radarPlotEClass.getESuperTypes().add(this.getPlot());
		donutPlotEClass.getESuperTypes().add(this.getPlot());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_Fileextractor(), this.getFileExtractor(), null, "fileextractor", null, 1, -1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Datafiltering(), this.getDataFiltering(), null, "datafiltering", null, 0, -1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Dashboard(), this.getDashBoard(), null, "dashboard", null, 1, 1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileExtractorEClass, FileExtractor.class, "FileExtractor", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileExtractor_Path(), ecorePackage.getEString(), "path", null, 0, 1, FileExtractor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFilteringEClass, DataFiltering.class, "DataFiltering", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFiltering_Fileextractor(), this.getFileExtractor(), null, "fileextractor", null, 1, 1,
				DataFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFiltering_Filteringstep(), this.getFilteringStep(), null, "filteringstep", null, 1, -1,
				DataFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFiltering_Processingstep(), this.getPreprocessingStep(), null, "processingstep", null, 0,
				-1, DataFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
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

		initEClass(csvExtractorEClass, CsvExtractor.class, "CsvExtractor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(excelExtractorEClass, ExcelExtractor.class, "ExcelExtractor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(plotEClass, Plot.class, "Plot", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlot_XAxis(), ecorePackage.getEString(), "xAxis", null, 0, 1, Plot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlot_YAxis(), ecorePackage.getEString(), "yAxis", null, 0, 1, Plot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlot_Location(), ecorePackage.getEString(), "location", null, 0, 1, Plot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlot_Colors(), ecorePackage.getEString(), "colors", null, 0, 1, Plot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlot_Thickness(), ecorePackage.getEFloat(), "thickness", null, 0, 1, Plot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barPlotEClass, BarPlot.class, "BarPlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linePlotEClass, LinePlot.class, "LinePlot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(filteringStepEClass, FilteringStep.class, "FilteringStep", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilteringStep_Axis(), ecorePackage.getEString(), "axis", null, 0, 1, FilteringStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preprocessingStepEClass, PreprocessingStep.class, "PreprocessingStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantitativeFilteringEClass, QuantitativeFiltering.class, "QuantitativeFiltering", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantitativeFiltering_Values(), ecorePackage.getEFloat(), "values", null, 0, 1,
				QuantitativeFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantitativeFiltering_Operator(), this.getQuantitativeOperator(), "operator", null, 0, 1,
				QuantitativeFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualitativeFilteringEClass, QualitativeFiltering.class, "QualitativeFiltering", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualitativeFiltering_Labels(), ecorePackage.getEString(), "labels", null, 0, 1,
				QualitativeFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualitativeFiltering_Operator(), this.getQualitativeOperator(), "operator", null, 0, 1,
				QualitativeFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mathOperationEClass, MathOperation.class, "MathOperation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMathOperation_Lside(), this.getPreprocessingStep(), null, "lside", null, 1, 1,
				MathOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMathOperation_Rside(), this.getPreprocessingStep(), null, "rside", null, 1, 1,
				MathOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMathOperation_Operator(), this.getMathOperator(), "operator", null, 0, 1, MathOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colReferenceEClass, ColReference.class, "ColReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColReference_Target(), ecorePackage.getEString(), "target", null, 0, 1, ColReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticalOperationEClass, StatisticalOperation.class, "StatisticalOperation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatisticalOperation_Colreference(), this.getColReference(), null, "colreference", null, 1, 1,
				StatisticalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatisticalOperation_Operator(), this.getStatisticalOperator(), "operator", null, 0, 1,
				StatisticalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scatterPlotEClass, ScatterPlot.class, "ScatterPlot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(polarPlotEClass, PolarPlot.class, "PolarPlot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(piePlotEClass, PiePlot.class, "PiePlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radarPlotEClass, RadarPlot.class, "RadarPlot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(donutPlotEClass, DonutPlot.class, "DonutPlot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

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

		initEEnum(quantitativeOperatorEEnum, QuantitativeOperator.class, "QuantitativeOperator");
		addEEnumLiteral(quantitativeOperatorEEnum, QuantitativeOperator.EQUAL);
		addEEnumLiteral(quantitativeOperatorEEnum, QuantitativeOperator.SUPERIOR);
		addEEnumLiteral(quantitativeOperatorEEnum, QuantitativeOperator.INFERIOR);

		initEEnum(qualitativeOperatorEEnum, QualitativeOperator.class, "QualitativeOperator");
		addEEnumLiteral(qualitativeOperatorEEnum, QualitativeOperator.EQUALS);
		addEEnumLiteral(qualitativeOperatorEEnum, QualitativeOperator.NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //AbstractsyntaxPackageImpl
