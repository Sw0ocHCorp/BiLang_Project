/*
 * generated by Xtext 2.25.0
 */
package ucal3ia.bilang;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class BiLangStandaloneSetup extends BiLangStandaloneSetupGenerated {

	public static void doSetup() {
		new BiLangStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
