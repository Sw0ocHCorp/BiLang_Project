/**
 */
package ucal3ia.BiLang.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import ucal3ia.BiLang.util.BiLangAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BiLangItemProviderAdapterFactory extends BiLangAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiLangItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.Task} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskItemProvider taskItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskAdapter() {
		if (taskItemProvider == null) {
			taskItemProvider = new TaskItemProvider(this);
		}

		return taskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.CsvExtractor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CsvExtractorItemProvider csvExtractorItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.CsvExtractor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCsvExtractorAdapter() {
		if (csvExtractorItemProvider == null) {
			csvExtractorItemProvider = new CsvExtractorItemProvider(this);
		}

		return csvExtractorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.ExcelExtractor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcelExtractorItemProvider excelExtractorItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.ExcelExtractor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExcelExtractorAdapter() {
		if (excelExtractorItemProvider == null) {
			excelExtractorItemProvider = new ExcelExtractorItemProvider(this);
		}

		return excelExtractorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.DataFiltering} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFilteringItemProvider dataFilteringItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.DataFiltering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataFilteringAdapter() {
		if (dataFilteringItemProvider == null) {
			dataFilteringItemProvider = new DataFilteringItemProvider(this);
		}

		return dataFilteringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.DashBoard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashBoardItemProvider dashBoardItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.DashBoard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDashBoardAdapter() {
		if (dashBoardItemProvider == null) {
			dashBoardItemProvider = new DashBoardItemProvider(this);
		}

		return dashBoardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.LinePlot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinePlotItemProvider linePlotItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.LinePlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinePlotAdapter() {
		if (linePlotItemProvider == null) {
			linePlotItemProvider = new LinePlotItemProvider(this);
		}

		return linePlotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.BarPlot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarPlotItemProvider barPlotItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.BarPlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBarPlotAdapter() {
		if (barPlotItemProvider == null) {
			barPlotItemProvider = new BarPlotItemProvider(this);
		}

		return barPlotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.QuantitativeFiltering} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantitativeFilteringItemProvider quantitativeFilteringItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.QuantitativeFiltering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuantitativeFilteringAdapter() {
		if (quantitativeFilteringItemProvider == null) {
			quantitativeFilteringItemProvider = new QuantitativeFilteringItemProvider(this);
		}

		return quantitativeFilteringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.QualitativeFiltering} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualitativeFilteringItemProvider qualitativeFilteringItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.QualitativeFiltering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQualitativeFilteringAdapter() {
		if (qualitativeFilteringItemProvider == null) {
			qualitativeFilteringItemProvider = new QualitativeFilteringItemProvider(this);
		}

		return qualitativeFilteringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.MathOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MathOperationItemProvider mathOperationItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.MathOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMathOperationAdapter() {
		if (mathOperationItemProvider == null) {
			mathOperationItemProvider = new MathOperationItemProvider(this);
		}

		return mathOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.StatisticalOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticalOperationItemProvider statisticalOperationItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.StatisticalOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatisticalOperationAdapter() {
		if (statisticalOperationItemProvider == null) {
			statisticalOperationItemProvider = new StatisticalOperationItemProvider(this);
		}

		return statisticalOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ucal3ia.BiLang.colReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected colReferenceItemProvider colReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link ucal3ia.BiLang.colReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createcolReferenceAdapter() {
		if (colReferenceItemProvider == null) {
			colReferenceItemProvider = new colReferenceItemProvider(this);
		}

		return colReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (taskItemProvider != null)
			taskItemProvider.dispose();
		if (csvExtractorItemProvider != null)
			csvExtractorItemProvider.dispose();
		if (excelExtractorItemProvider != null)
			excelExtractorItemProvider.dispose();
		if (dataFilteringItemProvider != null)
			dataFilteringItemProvider.dispose();
		if (dashBoardItemProvider != null)
			dashBoardItemProvider.dispose();
		if (linePlotItemProvider != null)
			linePlotItemProvider.dispose();
		if (barPlotItemProvider != null)
			barPlotItemProvider.dispose();
		if (quantitativeFilteringItemProvider != null)
			quantitativeFilteringItemProvider.dispose();
		if (qualitativeFilteringItemProvider != null)
			qualitativeFilteringItemProvider.dispose();
		if (mathOperationItemProvider != null)
			mathOperationItemProvider.dispose();
		if (statisticalOperationItemProvider != null)
			statisticalOperationItemProvider.dispose();
		if (colReferenceItemProvider != null)
			colReferenceItemProvider.dispose();
	}

}