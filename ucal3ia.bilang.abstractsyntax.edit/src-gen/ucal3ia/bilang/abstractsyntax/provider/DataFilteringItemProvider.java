/**
 */
package ucal3ia.bilang.abstractsyntax.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxFactory;
import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.DataFiltering;

/**
 * This is the item provider adapter for a {@link ucal3ia.bilang.abstractsyntax.DataFiltering} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFilteringItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFilteringItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFileextractorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Fileextractor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileextractorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DataFiltering_fileextractor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DataFiltering_fileextractor_feature",
								"_UI_DataFiltering_type"),
						AbstractsyntaxPackage.Literals.DATA_FILTERING__FILEEXTRACTOR, true, false, true, null, null,
						null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AbstractsyntaxPackage.Literals.DATA_FILTERING__FILTERINGSTEP);
			childrenFeatures.add(AbstractsyntaxPackage.Literals.DATA_FILTERING__PROCESSINGSTEP);
			childrenFeatures.add(AbstractsyntaxPackage.Literals.DATA_FILTERING__COUNTPREPROCESSINGSTEP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DataFiltering.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataFiltering"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DataFiltering_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DataFiltering.class)) {
		case AbstractsyntaxPackage.DATA_FILTERING__FILTERINGSTEP:
		case AbstractsyntaxPackage.DATA_FILTERING__PROCESSINGSTEP:
		case AbstractsyntaxPackage.DATA_FILTERING__COUNTPREPROCESSINGSTEP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.DATA_FILTERING__FILTERINGSTEP,
				AbstractsyntaxFactory.eINSTANCE.createQuantitativeFiltering()));

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.DATA_FILTERING__FILTERINGSTEP,
				AbstractsyntaxFactory.eINSTANCE.createQualitativeFiltering()));

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.DATA_FILTERING__PROCESSINGSTEP,
				AbstractsyntaxFactory.eINSTANCE.createMathOperation()));

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.DATA_FILTERING__PROCESSINGSTEP,
				AbstractsyntaxFactory.eINSTANCE.createColReference()));

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.DATA_FILTERING__PROCESSINGSTEP,
				AbstractsyntaxFactory.eINSTANCE.createStatisticalOperation()));

		newChildDescriptors
				.add(createChildParameter(AbstractsyntaxPackage.Literals.DATA_FILTERING__COUNTPREPROCESSINGSTEP,
						AbstractsyntaxFactory.eINSTANCE.createCountPreprocessingStep()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AbstractsyntaxEditPlugin.INSTANCE;
	}

}
