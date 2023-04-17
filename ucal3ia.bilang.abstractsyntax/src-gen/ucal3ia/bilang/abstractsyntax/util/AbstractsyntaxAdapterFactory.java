/**
 */
package ucal3ia.bilang.abstractsyntax.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ucal3ia.bilang.abstractsyntax.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage
 * @generated
 */
public class AbstractsyntaxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AbstractsyntaxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractsyntaxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AbstractsyntaxPackage.eINSTANCE;
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
	protected AbstractsyntaxSwitch<Adapter> modelSwitch = new AbstractsyntaxSwitch<Adapter>() {
		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseTask(Task object) {
			return createTaskAdapter();
		}

		@Override
		public Adapter caseFileExtractor(FileExtractor object) {
			return createFileExtractorAdapter();
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
		public Adapter caseCsvExtractor(CsvExtractor object) {
			return createCsvExtractorAdapter();
		}

		@Override
		public Adapter caseExcelExtractor(ExcelExtractor object) {
			return createExcelExtractorAdapter();
		}

		@Override
		public Adapter casePlot(Plot object) {
			return createPlotAdapter();
		}

		@Override
		public Adapter caseBarPlot(BarPlot object) {
			return createBarPlotAdapter();
		}

		@Override
		public Adapter caseLinePlot(LinePlot object) {
			return createLinePlotAdapter();
		}

		@Override
		public Adapter caseFilteringStep(FilteringStep object) {
			return createFilteringStepAdapter();
		}

		@Override
		public Adapter casePreprocessingStep(PreprocessingStep object) {
			return createPreprocessingStepAdapter();
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
		public Adapter caseColReference(ColReference object) {
			return createColReferenceAdapter();
		}

		@Override
		public Adapter caseStatisticalOperation(StatisticalOperation object) {
			return createStatisticalOperationAdapter();
		}

		@Override
		public Adapter caseScatterPlot(ScatterPlot object) {
			return createScatterPlotAdapter();
		}

		@Override
		public Adapter casePolarPlot(PolarPlot object) {
			return createPolarPlotAdapter();
		}

		@Override
		public Adapter casePiePlot(PiePlot object) {
			return createPiePlotAdapter();
		}

		@Override
		public Adapter caseRadarPlot(RadarPlot object) {
			return createRadarPlotAdapter();
		}

		@Override
		public Adapter caseDonutPlot(DonutPlot object) {
			return createDonutPlotAdapter();
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
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.FileExtractor <em>File Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.FileExtractor
	 * @generated
	 */
	public Adapter createFileExtractorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.DataFiltering <em>Data Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.DataFiltering
	 * @generated
	 */
	public Adapter createDataFilteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.DashBoard <em>Dash Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.DashBoard
	 * @generated
	 */
	public Adapter createDashBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.CsvExtractor <em>Csv Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.CsvExtractor
	 * @generated
	 */
	public Adapter createCsvExtractorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.ExcelExtractor <em>Excel Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.ExcelExtractor
	 * @generated
	 */
	public Adapter createExcelExtractorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.Plot
	 * @generated
	 */
	public Adapter createPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.BarPlot <em>Bar Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.BarPlot
	 * @generated
	 */
	public Adapter createBarPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.LinePlot <em>Line Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.LinePlot
	 * @generated
	 */
	public Adapter createLinePlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.FilteringStep <em>Filtering Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.FilteringStep
	 * @generated
	 */
	public Adapter createFilteringStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.PreprocessingStep <em>Preprocessing Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.PreprocessingStep
	 * @generated
	 */
	public Adapter createPreprocessingStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.QuantitativeFiltering <em>Quantitative Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.QuantitativeFiltering
	 * @generated
	 */
	public Adapter createQuantitativeFilteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.QualitativeFiltering <em>Qualitative Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.QualitativeFiltering
	 * @generated
	 */
	public Adapter createQualitativeFilteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.MathOperation <em>Math Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.MathOperation
	 * @generated
	 */
	public Adapter createMathOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.ColReference <em>Col Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.ColReference
	 * @generated
	 */
	public Adapter createColReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.StatisticalOperation <em>Statistical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.StatisticalOperation
	 * @generated
	 */
	public Adapter createStatisticalOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.ScatterPlot <em>Scatter Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.ScatterPlot
	 * @generated
	 */
	public Adapter createScatterPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.PolarPlot <em>Polar Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.PolarPlot
	 * @generated
	 */
	public Adapter createPolarPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.PiePlot <em>Pie Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.PiePlot
	 * @generated
	 */
	public Adapter createPiePlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.RadarPlot <em>Radar Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.RadarPlot
	 * @generated
	 */
	public Adapter createRadarPlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ucal3ia.bilang.abstractsyntax.DonutPlot <em>Donut Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ucal3ia.bilang.abstractsyntax.DonutPlot
	 * @generated
	 */
	public Adapter createDonutPlotAdapter() {
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

} //AbstractsyntaxAdapterFactory
