/**
 */
package ucal3ia.bilang.abstractsyntax.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucal3ia.bilang.abstractsyntax.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractsyntaxFactoryImpl extends EFactoryImpl implements AbstractsyntaxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractsyntaxFactory init() {
		try {
			AbstractsyntaxFactory theAbstractsyntaxFactory = (AbstractsyntaxFactory) EPackage.Registry.INSTANCE
					.getEFactory(AbstractsyntaxPackage.eNS_URI);
			if (theAbstractsyntaxFactory != null) {
				return theAbstractsyntaxFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractsyntaxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AbstractsyntaxPackage.TASK:
			return createTask();
		case AbstractsyntaxPackage.DATA_FILTERING:
			return createDataFiltering();
		case AbstractsyntaxPackage.DASH_BOARD:
			return createDashBoard();
		case AbstractsyntaxPackage.CSV_EXTRACTOR:
			return createCsvExtractor();
		case AbstractsyntaxPackage.EXCEL_EXTRACTOR:
			return createExcelExtractor();
		case AbstractsyntaxPackage.BAR_PLOT:
			return createBarPlot();
		case AbstractsyntaxPackage.LINE_PLOT:
			return createLinePlot();
		case AbstractsyntaxPackage.PREPROCESSING_STEP:
			return createPreprocessingStep();
		case AbstractsyntaxPackage.QUANTITATIVE_FILTERING:
			return createQuantitativeFiltering();
		case AbstractsyntaxPackage.QUALITATIVE_FILTERING:
			return createQualitativeFiltering();
		case AbstractsyntaxPackage.MATH_OPERATION:
			return createMathOperation();
		case AbstractsyntaxPackage.COL_REFERENCE:
			return createColReference();
		case AbstractsyntaxPackage.STATISTICAL_OPERATION:
			return createStatisticalOperation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AbstractsyntaxPackage.MATH_OPERATOR:
			return createMathOperatorFromString(eDataType, initialValue);
		case AbstractsyntaxPackage.STATISTICAL_OPERATOR:
			return createStatisticalOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AbstractsyntaxPackage.MATH_OPERATOR:
			return convertMathOperatorToString(eDataType, instanceValue);
		case AbstractsyntaxPackage.STATISTICAL_OPERATOR:
			return convertStatisticalOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFiltering createDataFiltering() {
		DataFilteringImpl dataFiltering = new DataFilteringImpl();
		return dataFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DashBoard createDashBoard() {
		DashBoardImpl dashBoard = new DashBoardImpl();
		return dashBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvExtractor createCsvExtractor() {
		CsvExtractorImpl csvExtractor = new CsvExtractorImpl();
		return csvExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcelExtractor createExcelExtractor() {
		ExcelExtractorImpl excelExtractor = new ExcelExtractorImpl();
		return excelExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarPlot createBarPlot() {
		BarPlotImpl barPlot = new BarPlotImpl();
		return barPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinePlot createLinePlot() {
		LinePlotImpl linePlot = new LinePlotImpl();
		return linePlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreprocessingStep createPreprocessingStep() {
		PreprocessingStepImpl preprocessingStep = new PreprocessingStepImpl();
		return preprocessingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitativeFiltering createQuantitativeFiltering() {
		QuantitativeFilteringImpl quantitativeFiltering = new QuantitativeFilteringImpl();
		return quantitativeFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeFiltering createQualitativeFiltering() {
		QualitativeFilteringImpl qualitativeFiltering = new QualitativeFilteringImpl();
		return qualitativeFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathOperation createMathOperation() {
		MathOperationImpl mathOperation = new MathOperationImpl();
		return mathOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColReference createColReference() {
		ColReferenceImpl colReference = new ColReferenceImpl();
		return colReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticalOperation createStatisticalOperation() {
		StatisticalOperationImpl statisticalOperation = new StatisticalOperationImpl();
		return statisticalOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathOperator createMathOperatorFromString(EDataType eDataType, String initialValue) {
		MathOperator result = MathOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMathOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticalOperator createStatisticalOperatorFromString(EDataType eDataType, String initialValue) {
		StatisticalOperator result = StatisticalOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatisticalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxPackage getAbstractsyntaxPackage() {
		return (AbstractsyntaxPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractsyntaxPackage getPackage() {
		return AbstractsyntaxPackage.eINSTANCE;
	}

} //AbstractsyntaxFactoryImpl
