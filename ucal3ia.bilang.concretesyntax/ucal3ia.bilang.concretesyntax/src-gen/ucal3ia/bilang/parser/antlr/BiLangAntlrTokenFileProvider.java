/*
 * generated by Xtext 2.25.0
 */
package ucal3ia.bilang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BiLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ucal3ia/bilang/parser/antlr/internal/InternalBiLang.tokens");
	}
}
