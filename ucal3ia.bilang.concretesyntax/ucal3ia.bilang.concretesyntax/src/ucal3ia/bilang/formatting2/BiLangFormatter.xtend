/*
 * generated by Xtext 2.25.0
 */
package ucal3ia.bilang.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import ucal3ia.bilang.abstractsyntax.DataFiltering
import ucal3ia.bilang.abstractsyntax.Task
import ucal3ia.bilang.services.BiLangGrammarAccess

class BiLangFormatter extends AbstractFormatter2 {
	
	@Inject extension BiLangGrammarAccess

	def dispatch void format(Task task, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (fileExtractor : task.fileextractor) {
			fileExtractor.format
		}
		for (dataFiltering : task.datafiltering) {
			dataFiltering.format
		}
		task.dashboard.format
	}

	def dispatch void format(DataFiltering dataFiltering, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (filteringStep : dataFiltering.filteringstep) {
			filteringStep.format
		}
		for (preprocessingStep : dataFiltering.processingstep) {
			preprocessingStep.format
		}
	}
	
	// TODO: implement for DashBoard, NullReplacement, CsvExtractor, ExcelExtractor, StatisticalOperation, MathOperation
}
