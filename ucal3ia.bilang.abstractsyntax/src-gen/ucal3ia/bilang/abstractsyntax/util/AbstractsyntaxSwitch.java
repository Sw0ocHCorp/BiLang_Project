/**
 */
package ucal3ia.bilang.abstractsyntax.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucal3ia.bilang.abstractsyntax.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage
 * @generated
 */
public class AbstractsyntaxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractsyntaxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxSwitch() {
		if (modelPackage == null) {
			modelPackage = AbstractsyntaxPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AbstractsyntaxPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = caseNamedElement(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.FILE_EXTRACTOR: {
			FileExtractor fileExtractor = (FileExtractor) theEObject;
			T result = caseFileExtractor(fileExtractor);
			if (result == null)
				result = caseNamedElement(fileExtractor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.DATA_FILTERING: {
			DataFiltering dataFiltering = (DataFiltering) theEObject;
			T result = caseDataFiltering(dataFiltering);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.DASH_BOARD: {
			DashBoard dashBoard = (DashBoard) theEObject;
			T result = caseDashBoard(dashBoard);
			if (result == null)
				result = caseNamedElement(dashBoard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.CSV_EXTRACTOR: {
			CsvExtractor csvExtractor = (CsvExtractor) theEObject;
			T result = caseCsvExtractor(csvExtractor);
			if (result == null)
				result = caseFileExtractor(csvExtractor);
			if (result == null)
				result = caseNamedElement(csvExtractor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.EXCEL_EXTRACTOR: {
			ExcelExtractor excelExtractor = (ExcelExtractor) theEObject;
			T result = caseExcelExtractor(excelExtractor);
			if (result == null)
				result = caseFileExtractor(excelExtractor);
			if (result == null)
				result = caseNamedElement(excelExtractor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.PLOT: {
			Plot plot = (Plot) theEObject;
			T result = casePlot(plot);
			if (result == null)
				result = caseNamedElement(plot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.BAR_PLOT: {
			BarPlot barPlot = (BarPlot) theEObject;
			T result = caseBarPlot(barPlot);
			if (result == null)
				result = casePlot(barPlot);
			if (result == null)
				result = caseNamedElement(barPlot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.LINE_PLOT: {
			LinePlot linePlot = (LinePlot) theEObject;
			T result = caseLinePlot(linePlot);
			if (result == null)
				result = casePlot(linePlot);
			if (result == null)
				result = caseNamedElement(linePlot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.FILTERING_STEP: {
			FilteringStep filteringStep = (FilteringStep) theEObject;
			T result = caseFilteringStep(filteringStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.PREPROCESSING_STEP: {
			PreprocessingStep preprocessingStep = (PreprocessingStep) theEObject;
			T result = casePreprocessingStep(preprocessingStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.QUANTITATIVE_FILTERING: {
			QuantitativeFiltering quantitativeFiltering = (QuantitativeFiltering) theEObject;
			T result = caseQuantitativeFiltering(quantitativeFiltering);
			if (result == null)
				result = caseFilteringStep(quantitativeFiltering);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.QUALITATIVE_FILTERING: {
			QualitativeFiltering qualitativeFiltering = (QualitativeFiltering) theEObject;
			T result = caseQualitativeFiltering(qualitativeFiltering);
			if (result == null)
				result = caseFilteringStep(qualitativeFiltering);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.MATH_OPERATION: {
			MathOperation mathOperation = (MathOperation) theEObject;
			T result = caseMathOperation(mathOperation);
			if (result == null)
				result = casePreprocessingStep(mathOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.COL_REFERENCE: {
			ColReference colReference = (ColReference) theEObject;
			T result = caseColReference(colReference);
			if (result == null)
				result = casePreprocessingStep(colReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AbstractsyntaxPackage.STATISTICAL_OPERATION: {
			StatisticalOperation statisticalOperation = (StatisticalOperation) theEObject;
			T result = caseStatisticalOperation(statisticalOperation);
			if (result == null)
				result = casePreprocessingStep(statisticalOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Extractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileExtractor(FileExtractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Filtering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Filtering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFiltering(DataFiltering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dash Board</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dash Board</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDashBoard(DashBoard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Csv Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Csv Extractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsvExtractor(CsvExtractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excel Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excel Extractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcelExtractor(ExcelExtractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlot(Plot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bar Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bar Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarPlot(BarPlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinePlot(LinePlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtering Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtering Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteringStep(FilteringStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preprocessing Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preprocessing Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreprocessingStep(PreprocessingStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantitative Filtering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantitative Filtering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantitativeFiltering(QuantitativeFiltering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualitative Filtering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualitative Filtering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualitativeFiltering(QualitativeFiltering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Math Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Math Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMathOperation(MathOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Col Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Col Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColReference(ColReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistical Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistical Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatisticalOperation(StatisticalOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AbstractsyntaxSwitch
