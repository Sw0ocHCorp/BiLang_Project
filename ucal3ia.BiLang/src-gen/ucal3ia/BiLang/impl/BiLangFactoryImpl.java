/**
 */
package ucal3ia.BiLang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ucal3ia.BiLang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BiLangFactoryImpl extends EFactoryImpl implements BiLangFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BiLangFactory init() {
		try {
			BiLangFactory theBiLangFactory = (BiLangFactory) EPackage.Registry.INSTANCE
					.getEFactory(BiLangPackage.eNS_URI);
			if (theBiLangFactory != null) {
				return theBiLangFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BiLangFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiLangFactoryImpl() {
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
		case BiLangPackage.TASK:
			return createTask();
		case BiLangPackage.CSV_EXTRACTOR:
			return createCsvExtractor();
		case BiLangPackage.EXCEL_EXTRACTOR:
			return createExcelExtractor();
		case BiLangPackage.DATA_FILTERING:
			return createDataFiltering();
		case BiLangPackage.DASH_BOARD:
			return createDashBoard();
		case BiLangPackage.LINE_PLOT:
			return createLinePlot();
		case BiLangPackage.BAR_PLOT:
			return createBarPlot();
		case BiLangPackage.QUANTITATIVE_FILTERING:
			return createQuantitativeFiltering();
		case BiLangPackage.QUALITATIVE_FILTERING:
			return createQualitativeFiltering();
		case BiLangPackage.MATH_OPERATION:
			return createMathOperation();
		case BiLangPackage.STATISTICAL_OPERATION:
			return createStatisticalOperation();
		case BiLangPackage.COL_REFERENCE:
			return createcolReference();
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
		case BiLangPackage.MATH_OPERATOR:
			return createMathOperatorFromString(eDataType, initialValue);
		case BiLangPackage.STATISTICAL_OPERATOR:
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
		case BiLangPackage.MATH_OPERATOR:
			return convertMathOperatorToString(eDataType, instanceValue);
		case BiLangPackage.STATISTICAL_OPERATOR:
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
	public LinePlot createLinePlot() {
		LinePlotImpl linePlot = new LinePlotImpl();
		return linePlot;
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
	public StatisticalOperation createStatisticalOperation() {
		StatisticalOperationImpl statisticalOperation = new StatisticalOperationImpl();
		return statisticalOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public colReference createcolReference() {
		colReferenceImpl colReference = new colReferenceImpl();
		return colReference;
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
	public BiLangPackage getBiLangPackage() {
		return (BiLangPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BiLangPackage getPackage() {
		return BiLangPackage.eINSTANCE;
	}

} //BiLangFactoryImpl
