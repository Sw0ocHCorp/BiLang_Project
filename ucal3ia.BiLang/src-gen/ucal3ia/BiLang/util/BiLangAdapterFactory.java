/**
 */
package ucal3ia.BiLang.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ucal3ia.BiLang.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ucal3ia.BiLang.BiLangPackage
 * @generated
 */
public class BiLangAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BiLangPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiLangAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BiLangPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiLangSwitch<Adapter> modelSwitch = new BiLangSwitch<Adapter>() {
		@Override
		public Adapter caseTask(Task object) {
			return createTaskAdapter();
		}

		@Override
		public Adapter caseFileExtractor(FileExtractor object) {
			return createFileExtractorAdapter();
		}

		@Override
		public Adapter caseCsvExtractor(CsvExtractor object) {
			return createCsvExtractorAdapter();
		}

		@Override
		public Adapter caseExcelExtractor(ExcelExtractor object) {
			return createExcelExtractorAdapter();
		}

		@Override
		public Adapter caseDataFiltering(DataFiltering object) {
			return createDataFilteringAdapter();
		}

		@Override
		public Adapter caseDashBoard(DashBoard object) {
			return createDashBoardAdapter();
		}

		@Override
		public Adapter caseLinePlot(LinePlot object) {
			return createLinePlotAdapter();
		}

		@Override
		public Adapter caseBarPlot(BarPlot object) {
			return createBarPlotAdapter();
		}

		@Override
		public Adapter caseFilteringSteps(FilteringSteps object) {
			return createFilteringStepsAdapter();
		}

		@Override
		public Adapter casePreprocessingSteps(PreprocessingSteps object) {
			return createPreprocessingStepsAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseQuantitativeFiltering(QuantitativeFiltering object) {
			return createQuantitativeFilteringAdapter();
		}

		@Override
		public Adapter caseQualitativeFiltering(QualitativeFiltering object) {
			return createQualitativeFilteringAdapter();
		}

		@Override
		public Adapter caseMathOperation(MathOperation object) {
			return createMathOperationAdapter();
		}

		@Override
		public Adapter caseStatisticalOperation(StatisticalOperation object) {
			return createStatisticalOperationAdapter();
		}

		@Override
		public Adapter casecolReference(colReference object) {
			return createcolReferenceAdapter();
		}

		@Override
		public Adapter casePlot(Plot object) {
			return createPlotAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.FileExtractor <em>File Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.FileExtractor
	 * @generated
	 */
	public Adapter createFileExtractorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.CsvExtractor <em>Csv Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.CsvExtractor
	 * @generated
	 */
	public Adapter createCsvExtractorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.ExcelExtractor <em>Excel Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.ExcelExtractor
	 * @generated
	 */
	public Adapter createExcelExtractorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.DataFiltering <em>Data Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.DataFiltering
	 * @generated
	 */
	public Adapter createDataFilteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.DashBoard <em>Dash Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.DashBoard
	 * @generated
	 */
	public Adapter createDashBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.LinePlot <em>Line Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.LinePlot
	 * @generated
	 */
	public Adapter createLinePlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.BarPlot <em>Bar Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.BarPlot
	 * @generated
	 */
	public Adapter createBarPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.FilteringSteps <em>Filtering Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.FilteringSteps
	 * @generated
	 */
	public Adapter createFilteringStepsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.PreprocessingSteps <em>Preprocessing Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.PreprocessingSteps
	 * @generated
	 */
	public Adapter createPreprocessingStepsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.QuantitativeFiltering <em>Quantitative Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.QuantitativeFiltering
	 * @generated
	 */
	public Adapter createQuantitativeFilteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.QualitativeFiltering <em>Qualitative Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.QualitativeFiltering
	 * @generated
	 */
	public Adapter createQualitativeFilteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.MathOperation <em>Math Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.MathOperation
	 * @generated
	 */
	public Adapter createMathOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.StatisticalOperation <em>Statistical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.StatisticalOperation
	 * @generated
	 */
	public Adapter createStatisticalOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.colReference <em>col Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.colReference
	 * @generated
	 */
	public Adapter createcolReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.BiLang.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.BiLang.Plot
	 * @generated
	 */
	public Adapter createPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BiLangAdapterFactory
