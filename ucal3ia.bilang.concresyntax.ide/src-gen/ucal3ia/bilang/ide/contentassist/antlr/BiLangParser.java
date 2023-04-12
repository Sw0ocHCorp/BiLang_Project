/*
 * generated by Xtext 2.25.0
 */
package ucal3ia.bilang.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import ucal3ia.bilang.ide.contentassist.antlr.internal.InternalBiLangParser;
import ucal3ia.bilang.services.BiLangGrammarAccess;

public class BiLangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(BiLangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, BiLangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFileExtractorAccess().getAlternatives(), "rule__FileExtractor__Alternatives");
			builder.put(grammarAccess.getFilteringStepAccess().getAlternatives(), "rule__FilteringStep__Alternatives");
			builder.put(grammarAccess.getPreprocessingStepAccess().getAlternatives(), "rule__PreprocessingStep__Alternatives");
			builder.put(grammarAccess.getPlotAccess().getAlternatives(), "rule__Plot__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getDashBoardAccess().getAlternatives_2(), "rule__DashBoard__Alternatives_2");
			builder.put(grammarAccess.getEFloatAccess().getAlternatives_4_0(), "rule__EFloat__Alternatives_4_0");
			builder.put(grammarAccess.getMathOperatorAccess().getAlternatives(), "rule__MathOperator__Alternatives");
			builder.put(grammarAccess.getStatisticalOperatorAccess().getAlternatives(), "rule__StatisticalOperator__Alternatives");
			builder.put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
			builder.put(grammarAccess.getTaskAccess().getGroup_6(), "rule__Task__Group_6__0");
			builder.put(grammarAccess.getDataFilteringAccess().getGroup(), "rule__DataFiltering__Group__0");
			builder.put(grammarAccess.getDataFilteringAccess().getGroup_4(), "rule__DataFiltering__Group_4__0");
			builder.put(grammarAccess.getDataFilteringAccess().getGroup_7(), "rule__DataFiltering__Group_7__0");
			builder.put(grammarAccess.getDashBoardAccess().getGroup(), "rule__DashBoard__Group__0");
			builder.put(grammarAccess.getDashBoardAccess().getGroup_2_0(), "rule__DashBoard__Group_2_0__0");
			builder.put(grammarAccess.getDashBoardAccess().getGroup_2_1(), "rule__DashBoard__Group_2_1__0");
			builder.put(grammarAccess.getCsvExtractorAccess().getGroup(), "rule__CsvExtractor__Group__0");
			builder.put(grammarAccess.getExcelExtractorAccess().getGroup(), "rule__ExcelExtractor__Group__0");
			builder.put(grammarAccess.getQuantitativeFilteringAccess().getGroup(), "rule__QuantitativeFiltering__Group__0");
			builder.put(grammarAccess.getQualitativeFilteringAccess().getGroup(), "rule__QualitativeFiltering__Group__0");
			builder.put(grammarAccess.getMathOperationAccess().getGroup(), "rule__MathOperation__Group__0");
			builder.put(grammarAccess.getColReferenceAccess().getGroup(), "rule__ColReference__Group__0");
			builder.put(grammarAccess.getStatisticalOperationAccess().getGroup(), "rule__StatisticalOperation__Group__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup_4(), "rule__EFloat__Group_4__0");
			builder.put(grammarAccess.getBarPlotAccess().getGroup(), "rule__BarPlot__Group__0");
			builder.put(grammarAccess.getBarPlotAccess().getGroup_8(), "rule__BarPlot__Group_8__0");
			builder.put(grammarAccess.getBarPlotAccess().getGroup_9(), "rule__BarPlot__Group_9__0");
			builder.put(grammarAccess.getBarPlotAccess().getGroup_10(), "rule__BarPlot__Group_10__0");
			builder.put(grammarAccess.getLinePlotAccess().getGroup(), "rule__LinePlot__Group__0");
			builder.put(grammarAccess.getLinePlotAccess().getGroup_8(), "rule__LinePlot__Group_8__0");
			builder.put(grammarAccess.getLinePlotAccess().getGroup_9(), "rule__LinePlot__Group_9__0");
			builder.put(grammarAccess.getLinePlotAccess().getGroup_10(), "rule__LinePlot__Group_10__0");
			builder.put(grammarAccess.getTaskAccess().getNameAssignment_1(), "rule__Task__NameAssignment_1");
			builder.put(grammarAccess.getTaskAccess().getFileextractorAssignment_4(), "rule__Task__FileextractorAssignment_4");
			builder.put(grammarAccess.getTaskAccess().getDatafilteringAssignment_5(), "rule__Task__DatafilteringAssignment_5");
			builder.put(grammarAccess.getTaskAccess().getFileextractorAssignment_6_0(), "rule__Task__FileextractorAssignment_6_0");
			builder.put(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1(), "rule__Task__DatafilteringAssignment_6_1");
			builder.put(grammarAccess.getTaskAccess().getDashboardAssignment_8(), "rule__Task__DashboardAssignment_8");
			builder.put(grammarAccess.getTaskAccess().getDashboardAssignment_9(), "rule__Task__DashboardAssignment_9");
			builder.put(grammarAccess.getDataFilteringAccess().getNameAssignment_1(), "rule__DataFiltering__NameAssignment_1");
			builder.put(grammarAccess.getDataFilteringAccess().getFileextractorAssignment_3(), "rule__DataFiltering__FileextractorAssignment_3");
			builder.put(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_4_1(), "rule__DataFiltering__ProcessingstepAssignment_4_1");
			builder.put(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_4_2(), "rule__DataFiltering__ProcessingstepAssignment_4_2");
			builder.put(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_6(), "rule__DataFiltering__FilteringstepAssignment_6");
			builder.put(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_7_1(), "rule__DataFiltering__FilteringstepAssignment_7_1");
			builder.put(grammarAccess.getDashBoardAccess().getNameAssignment_0(), "rule__DashBoard__NameAssignment_0");
			builder.put(grammarAccess.getDashBoardAccess().getFileextractorAssignment_2_0_1(), "rule__DashBoard__FileextractorAssignment_2_0_1");
			builder.put(grammarAccess.getDashBoardAccess().getDatafilteringAssignment_2_1_1(), "rule__DashBoard__DatafilteringAssignment_2_1_1");
			builder.put(grammarAccess.getDashBoardAccess().getPlotAssignment_5(), "rule__DashBoard__PlotAssignment_5");
			builder.put(grammarAccess.getDashBoardAccess().getPlotAssignment_6(), "rule__DashBoard__PlotAssignment_6");
			builder.put(grammarAccess.getCsvExtractorAccess().getNameAssignment_1(), "rule__CsvExtractor__NameAssignment_1");
			builder.put(grammarAccess.getCsvExtractorAccess().getPathAssignment_4(), "rule__CsvExtractor__PathAssignment_4");
			builder.put(grammarAccess.getExcelExtractorAccess().getNameAssignment_1(), "rule__ExcelExtractor__NameAssignment_1");
			builder.put(grammarAccess.getExcelExtractorAccess().getPathAssignment_4(), "rule__ExcelExtractor__PathAssignment_4");
			builder.put(grammarAccess.getQuantitativeFilteringAccess().getAxisAssignment_2(), "rule__QuantitativeFiltering__AxisAssignment_2");
			builder.put(grammarAccess.getQuantitativeFilteringAccess().getValuesAssignment_4(), "rule__QuantitativeFiltering__ValuesAssignment_4");
			builder.put(grammarAccess.getQualitativeFilteringAccess().getAxisAssignment_2(), "rule__QualitativeFiltering__AxisAssignment_2");
			builder.put(grammarAccess.getQualitativeFilteringAccess().getLabelsAssignment_4(), "rule__QualitativeFiltering__LabelsAssignment_4");
			builder.put(grammarAccess.getMathOperationAccess().getLsideAssignment_1(), "rule__MathOperation__LsideAssignment_1");
			builder.put(grammarAccess.getMathOperationAccess().getOperatorAssignment_2(), "rule__MathOperation__OperatorAssignment_2");
			builder.put(grammarAccess.getMathOperationAccess().getRsideAssignment_4(), "rule__MathOperation__RsideAssignment_4");
			builder.put(grammarAccess.getColReferenceAccess().getTargetAssignment_1(), "rule__ColReference__TargetAssignment_1");
			builder.put(grammarAccess.getStatisticalOperationAccess().getOperatorAssignment_0(), "rule__StatisticalOperation__OperatorAssignment_0");
			builder.put(grammarAccess.getStatisticalOperationAccess().getColreferenceAssignment_2(), "rule__StatisticalOperation__ColreferenceAssignment_2");
			builder.put(grammarAccess.getBarPlotAccess().getNameAssignment_2(), "rule__BarPlot__NameAssignment_2");
			builder.put(grammarAccess.getBarPlotAccess().getXAxisAssignment_5(), "rule__BarPlot__XAxisAssignment_5");
			builder.put(grammarAccess.getBarPlotAccess().getYAxisAssignment_7(), "rule__BarPlot__YAxisAssignment_7");
			builder.put(grammarAccess.getBarPlotAccess().getLocationAssignment_8_1(), "rule__BarPlot__LocationAssignment_8_1");
			builder.put(grammarAccess.getBarPlotAccess().getColorAssignment_9_1(), "rule__BarPlot__ColorAssignment_9_1");
			builder.put(grammarAccess.getBarPlotAccess().getThicknessAssignment_10_1(), "rule__BarPlot__ThicknessAssignment_10_1");
			builder.put(grammarAccess.getLinePlotAccess().getNameAssignment_2(), "rule__LinePlot__NameAssignment_2");
			builder.put(grammarAccess.getLinePlotAccess().getXAxisAssignment_5(), "rule__LinePlot__XAxisAssignment_5");
			builder.put(grammarAccess.getLinePlotAccess().getYAxisAssignment_7(), "rule__LinePlot__YAxisAssignment_7");
			builder.put(grammarAccess.getLinePlotAccess().getLocationAssignment_8_1(), "rule__LinePlot__LocationAssignment_8_1");
			builder.put(grammarAccess.getLinePlotAccess().getColorAssignment_9_1(), "rule__LinePlot__ColorAssignment_9_1");
			builder.put(grammarAccess.getLinePlotAccess().getThicknessAssignment_10_1(), "rule__LinePlot__ThicknessAssignment_10_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private BiLangGrammarAccess grammarAccess;

	@Override
	protected InternalBiLangParser createParser() {
		InternalBiLangParser result = new InternalBiLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BiLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BiLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}