/*
 * generated by Xtext 2.25.0
 */
package ucal3ia.bilang.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import ucal3ia.bilang.concretesyntax.ui.internal.ConcretesyntaxActivator;

public class BiLangUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ConcretesyntaxActivator.getInstance().getInjector("ucal3ia.bilang.BiLang");
	}

}
