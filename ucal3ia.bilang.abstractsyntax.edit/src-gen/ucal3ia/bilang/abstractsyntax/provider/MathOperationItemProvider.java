/**
 */
package ucal3ia.bilang.abstractsyntax.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ucal3ia.bilang.abstractsyntax.AbstractsyntaxFactory;
import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.MathOperation;
import ucal3ia.bilang.abstractsyntax.MathOperator;

/**
 * This is the item provider adapter for a {@link ucal3ia.bilang.abstractsyntax.MathOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MathOperationItemProvider extends PreprocessingStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathOperationItemProvider(AdapterFactory adapterFactory) {
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

			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MathOperation_operator_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MathOperation_operator_feature",
								"_UI_MathOperation_type"),
						AbstractsyntaxPackage.Literals.MATH_OPERATION__OPERATOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(AbstractsyntaxPackage.Literals.MATH_OPERATION__LSIDE);
			childrenFeatures.add(AbstractsyntaxPackage.Literals.MATH_OPERATION__RSIDE);
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
	 * This returns MathOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MathOperation"));
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
		MathOperator labelValue = ((MathOperation) object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_MathOperation_type")
				: getString("_UI_MathOperation_type") + " " + label;
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

		switch (notification.getFeatureID(MathOperation.class)) {
		case AbstractsyntaxPackage.MATH_OPERATION__OPERATOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AbstractsyntaxPackage.MATH_OPERATION__LSIDE:
		case AbstractsyntaxPackage.MATH_OPERATION__RSIDE:
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

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.MATH_OPERATION__LSIDE,
				AbstractsyntaxFactory.eINSTANCE.createPreprocessingStep()));

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.MATH_OPERATION__LSIDE,
				AbstractsyntaxFactory.eINSTANCE.createMathOperation()));

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.MATH_OPERATION__LSIDE,
				AbstractsyntaxFactory.eINSTANCE.createColReference()));

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.MATH_OPERATION__LSIDE,
				AbstractsyntaxFactory.eINSTANCE.createStatisticalOperation()));

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.MATH_OPERATION__RSIDE,
				AbstractsyntaxFactory.eINSTANCE.createPreprocessingStep()));

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.MATH_OPERATION__RSIDE,
				AbstractsyntaxFactory.eINSTANCE.createMathOperation()));

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.MATH_OPERATION__RSIDE,
				AbstractsyntaxFactory.eINSTANCE.createColReference()));

		newChildDescriptors.add(createChildParameter(AbstractsyntaxPackage.Literals.MATH_OPERATION__RSIDE,
				AbstractsyntaxFactory.eINSTANCE.createStatisticalOperation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == AbstractsyntaxPackage.Literals.MATH_OPERATION__LSIDE
				|| childFeature == AbstractsyntaxPackage.Literals.MATH_OPERATION__RSIDE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
