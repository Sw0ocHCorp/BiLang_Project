/**
 */
package ucal3ia.BiLang.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ucal3ia.BiLang.*;

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
 * @see ucal3ia.BiLang.BiLangPackage
 * @generated
 */
public class BiLangSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BiLangPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiLangSwitch() {
		if (modelPackage == null) {
			modelPackage = BiLangPackage.eINSTANCE;
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
		case BiLangPackage.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = caseNamedElement(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.FILE_EXTRACTOR: {
			FileExtractor fileExtractor = (FileExtractor) theEObject;
			T result = caseFileExtractor(fileExtractor);
			if (result == null)
				result = caseNamedElement(fileExtractor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.CSV_EXTRACTOR: {
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
		case BiLangPackage.EXCEL_EXTRACTOR: {
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
		case BiLangPackage.DATA_FILTERING: {
			DataFiltering dataFiltering = (DataFiltering) theEObject;
			T result = caseDataFiltering(dataFiltering);
			if (result == null)
				result = caseNamedElement(dataFiltering);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.DASH_BOARD: {
			DashBoard dashBoard = (DashBoard) theEObject;
			T result = caseDashBoard(dashBoard);
			if (result == null)
				result = caseNamedElement(dashBoard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.LINE_PLOT: {
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
		case BiLangPackage.BAR_PLOT: {
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
		case BiLangPackage.FILTERING_STEPS: {
			FilteringSteps filteringSteps = (FilteringSteps) theEObject;
			T result = caseFilteringSteps(filteringSteps);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.PREPROCESSING_STEPS: {
			PreprocessingSteps preprocessingSteps = (PreprocessingSteps) theEObject;
			T result = casePreprocessingSteps(preprocessingSteps);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.QUANTITATIVE_FILTERING: {
			QuantitativeFiltering quantitativeFiltering = (QuantitativeFiltering) theEObject;
			T result = caseQuantitativeFiltering(quantitativeFiltering);
			if (result == null)
				result = caseFilteringSteps(quantitativeFiltering);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.QUALITATIVE_FILTERING: {
			QualitativeFiltering qualitativeFiltering = (QualitativeFiltering) theEObject;
			T result = caseQualitativeFiltering(qualitativeFiltering);
			if (result == null)
				result = caseFilteringSteps(qualitativeFiltering);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.MATH_OPERATION: {
			MathOperation mathOperation = (MathOperation) theEObject;
			T result = caseMathOperation(mathOperation);
			if (result == null)
				result = casePreprocessingSteps(mathOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.STATISTICAL_OPERATION: {
			StatisticalOperation statisticalOperation = (StatisticalOperation) theEObject;
			T result = caseStatisticalOperation(statisticalOperation);
			if (result == null)
				result = casePreprocessingSteps(statisticalOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.COL_REFERENCE: {
			colReference colReference = (colReference) theEObject;
			T result = casecolReference(colReference);
			if (result == null)
				result = casePreprocessingSteps(colReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BiLangPackage.PLOT: {
			Plot plot = (Plot) theEObject;
			T result = casePlot(plot);
			if (result == null)
				result = caseNamedElement(plot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Filtering Steps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtering Steps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteringSteps(FilteringSteps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preprocessing Steps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preprocessing Steps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreprocessingSteps(PreprocessingSteps object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>col Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>col Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecolReference(colReference object) {
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

} //BiLangSwitch
