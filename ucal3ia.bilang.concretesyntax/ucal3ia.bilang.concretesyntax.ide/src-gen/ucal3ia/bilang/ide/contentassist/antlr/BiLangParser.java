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
			builder.put(grammarAccess.getQualitativeOperatorAccess().getAlternatives(), "rule__QualitativeOperator__Alternatives");
			builder.put(grammarAccess.getQuantitativeOperatorAccess().getAlternatives(), "rule__QuantitativeOperator__Alternatives");
			builder.put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
			builder.put(grammarAccess.getTaskAccess().getGroup_6(), "rule__Task__Group_6__0");
			builder.put(grammarAccess.getDataFilteringAccess().getGroup(), "rule__DataFiltering__Group__0");
			builder.put(grammarAccess.getDataFilteringAccess().getGroup_2(), "rule__DataFiltering__Group_2__0");
			builder.put(grammarAccess.getDataFilteringAccess().getGroup_5(), "rule__DataFiltering__Group_5__0");
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
			builder.put(grammarAccess.getDonutPlotAccess().getGroup(), "rule__DonutPlot__Group__0");
			builder.put(grammarAccess.getDonutPlotAccess().getGroup_7(), "rule__DonutPlot__Group_7__0");
			builder.put(grammarAccess.getDonutPlotAccess().getGroup_8(), "rule__DonutPlot__Group_8__0");
			builder.put(grammarAccess.getDonutPlotAccess().getGroup_9(), "rule__DonutPlot__Group_9__0");
			builder.put(grammarAccess.getPiePlotAccess().getGroup(), "rule__PiePlot__Group__0");
			builder.put(grammarAccess.getPiePlotAccess().getGroup_7(), "rule__PiePlot__Group_7__0");
			builder.put(grammarAccess.getPiePlotAccess().getGroup_8(), "rule__PiePlot__Group_8__0");
			builder.put(grammarAccess.getPiePlotAccess().getGroup_9(), "rule__PiePlot__Group_9__0");
			builder.put(grammarAccess.getPolarPlotAccess().getGroup(), "rule__PolarPlot__Group__0");
			builder.put(grammarAccess.getPolarPlotAccess().getGroup_7(), "rule__PolarPlot__Group_7__0");
			builder.put(grammarAccess.getPolarPlotAccess().getGroup_8(), "rule__PolarPlot__Group_8__0");
			builder.put(grammarAccess.getPolarPlotAccess().getGroup_9(), "rule__PolarPlot__Group_9__0");
			builder.put(grammarAccess.getScatterPlotAccess().getGroup(), "rule__ScatterPlot__Group__0");
			builder.put(grammarAccess.getScatterPlotAccess().getGroup_7(), "rule__ScatterPlot__Group_7__0");
			builder.put(grammarAccess.getScatterPlotAccess().getGroup_8(), "rule__ScatterPlot__Group_8__0");
			builder.put(grammarAccess.getScatterPlotAccess().getGroup_9(), "rule__ScatterPlot__Group_9__0");
			builder.put(grammarAccess.getRadarPlotAccess().getGroup(), "rule__RadarPlot__Group__0");
			builder.put(grammarAccess.getRadarPlotAccess().getGroup_7(), "rule__RadarPlot__Group_7__0");
			builder.put(grammarAccess.getRadarPlotAccess().getGroup_8(), "rule__RadarPlot__Group_8__0");
			builder.put(grammarAccess.getRadarPlotAccess().getGroup_9(), "rule__RadarPlot__Group_9__0");
			builder.put(grammarAccess.getTaskAccess().getNameAssignment_1(), "rule__Task__NameAssignment_1");
			builder.put(grammarAccess.getTaskAccess().getFileextractorAssignment_4(), "rule__Task__FileextractorAssignment_4");
			builder.put(grammarAccess.getTaskAccess().getDatafilteringAssignment_5(), "rule__Task__DatafilteringAssignment_5");
			builder.put(grammarAccess.getTaskAccess().getFileextractorAssignment_6_0(), "rule__Task__FileextractorAssignment_6_0");
			builder.put(grammarAccess.getTaskAccess().getDatafilteringAssignment_6_1(), "rule__Task__DatafilteringAssignment_6_1");
			builder.put(grammarAccess.getTaskAccess().getDashboardAssignment_8(), "rule__Task__DashboardAssignment_8");
			builder.put(grammarAccess.getDataFilteringAccess().getFileextractorAssignment_1(), "rule__DataFiltering__FileextractorAssignment_1");
			builder.put(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_1(), "rule__DataFiltering__ProcessingstepAssignment_2_1");
			builder.put(grammarAccess.getDataFilteringAccess().getProcessingstepAssignment_2_2(), "rule__DataFiltering__ProcessingstepAssignment_2_2");
			builder.put(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_4(), "rule__DataFiltering__FilteringstepAssignment_4");
			builder.put(grammarAccess.getDataFilteringAccess().getFilteringstepAssignment_5_1(), "rule__DataFiltering__FilteringstepAssignment_5_1");
			builder.put(grammarAccess.getDashBoardAccess().getNameAssignment_0(), "rule__DashBoard__NameAssignment_0");
			builder.put(grammarAccess.getDashBoardAccess().getFileextractorAssignment_2_0_1(), "rule__DashBoard__FileextractorAssignment_2_0_1");
			builder.put(grammarAccess.getDashBoardAccess().getDatafilteringAssignment_2_1_1(), "rule__DashBoard__DatafilteringAssignment_2_1_1");
			builder.put(grammarAccess.getDashBoardAccess().getPlotAssignment_5(), "rule__DashBoard__PlotAssignment_5");
			builder.put(grammarAccess.getDashBoardAccess().getPlotAssignment_6(), "rule__DashBoard__PlotAssignment_6");
			builder.put(grammarAccess.getCsvExtractorAccess().getNameAssignment_1(), "rule__CsvExtractor__NameAssignment_1");
			builder.put(grammarAccess.getCsvExtractorAccess().getPathAssignment_4(), "rule__CsvExtractor__PathAssignment_4");
			builder.put(grammarAccess.getExcelExtractorAccess().getNameAssignment_1(), "rule__ExcelExtractor__NameAssignment_1");
			builder.put(grammarAccess.getExcelExtractorAccess().getPathAssignment_4(), "rule__ExcelExtractor__PathAssignment_4");
			builder.put(grammarAccess.getQuantitativeFilteringAccess().getAxisAssignment_1(), "rule__QuantitativeFiltering__AxisAssignment_1");
			builder.put(grammarAccess.getQuantitativeFilteringAccess().getOperatorAssignment_2(), "rule__QuantitativeFiltering__OperatorAssignment_2");
			builder.put(grammarAccess.getQuantitativeFilteringAccess().getValuesAssignment_3(), "rule__QuantitativeFiltering__ValuesAssignment_3");
			builder.put(grammarAccess.getQualitativeFilteringAccess().getAxisAssignment_1(), "rule__QualitativeFiltering__AxisAssignment_1");
			builder.put(grammarAccess.getQualitativeFilteringAccess().getOperatorAssignment_2(), "rule__QualitativeFiltering__OperatorAssignment_2");
			builder.put(grammarAccess.getQualitativeFilteringAccess().getLabelsAssignment_3(), "rule__QualitativeFiltering__LabelsAssignment_3");
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
			builder.put(grammarAccess.getBarPlotAccess().getColorsAssignment_9_1(), "rule__BarPlot__ColorsAssignment_9_1");
			builder.put(grammarAccess.getBarPlotAccess().getThicknessAssignment_10_1(), "rule__BarPlot__ThicknessAssignment_10_1");
			builder.put(grammarAccess.getLinePlotAccess().getNameAssignment_2(), "rule__LinePlot__NameAssignment_2");
			builder.put(grammarAccess.getLinePlotAccess().getXAxisAssignment_5(), "rule__LinePlot__XAxisAssignment_5");
			builder.put(grammarAccess.getLinePlotAccess().getYAxisAssignment_7(), "rule__LinePlot__YAxisAssignment_7");
			builder.put(grammarAccess.getLinePlotAccess().getLocationAssignment_8_1(), "rule__LinePlot__LocationAssignment_8_1");
			builder.put(grammarAccess.getLinePlotAccess().getColorsAssignment_9_1(), "rule__LinePlot__ColorsAssignment_9_1");
			builder.put(grammarAccess.getLinePlotAccess().getThicknessAssignment_10_1(), "rule__LinePlot__ThicknessAssignment_10_1");
			builder.put(grammarAccess.getDonutPlotAccess().getNameAssignment_1(), "rule__DonutPlot__NameAssignment_1");
			builder.put(grammarAccess.getDonutPlotAccess().getXAxisAssignment_4(), "rule__DonutPlot__XAxisAssignment_4");
			builder.put(grammarAccess.getDonutPlotAccess().getYAxisAssignment_6(), "rule__DonutPlot__YAxisAssignment_6");
			builder.put(grammarAccess.getDonutPlotAccess().getLocationAssignment_7_1(), "rule__DonutPlot__LocationAssignment_7_1");
			builder.put(grammarAccess.getDonutPlotAccess().getColorsAssignment_8_1(), "rule__DonutPlot__ColorsAssignment_8_1");
			builder.put(grammarAccess.getDonutPlotAccess().getThicknessAssignment_9_1(), "rule__DonutPlot__ThicknessAssignment_9_1");
			builder.put(grammarAccess.getPiePlotAccess().getNameAssignment_1(), "rule__PiePlot__NameAssignment_1");
			builder.put(grammarAccess.getPiePlotAccess().getXAxisAssignment_4(), "rule__PiePlot__XAxisAssignment_4");
			builder.put(grammarAccess.getPiePlotAccess().getYAxisAssignment_6(), "rule__PiePlot__YAxisAssignment_6");
			builder.put(grammarAccess.getPiePlotAccess().getLocationAssignment_7_1(), "rule__PiePlot__LocationAssignment_7_1");
			builder.put(grammarAccess.getPiePlotAccess().getColorsAssignment_8_1(), "rule__PiePlot__ColorsAssignment_8_1");
			builder.put(grammarAccess.getPiePlotAccess().getThicknessAssignment_9_1(), "rule__PiePlot__ThicknessAssignment_9_1");
			builder.put(grammarAccess.getPolarPlotAccess().getNameAssignment_1(), "rule__PolarPlot__NameAssignment_1");
			builder.put(grammarAccess.getPolarPlotAccess().getXAxisAssignment_4(), "rule__PolarPlot__XAxisAssignment_4");
			builder.put(grammarAccess.getPolarPlotAccess().getYAxisAssignment_6(), "rule__PolarPlot__YAxisAssignment_6");
			builder.put(grammarAccess.getPolarPlotAccess().getLocationAssignment_7_1(), "rule__PolarPlot__LocationAssignment_7_1");
			builder.put(grammarAccess.getPolarPlotAccess().getColorsAssignment_8_1(), "rule__PolarPlot__ColorsAssignment_8_1");
			builder.put(grammarAccess.getPolarPlotAccess().getThicknessAssignment_9_1(), "rule__PolarPlot__ThicknessAssignment_9_1");
			builder.put(grammarAccess.getScatterPlotAccess().getNameAssignment_1(), "rule__ScatterPlot__NameAssignment_1");
			builder.put(grammarAccess.getScatterPlotAccess().getXAxisAssignment_4(), "rule__ScatterPlot__XAxisAssignment_4");
			builder.put(grammarAccess.getScatterPlotAccess().getYAxisAssignment_6(), "rule__ScatterPlot__YAxisAssignment_6");
			builder.put(grammarAccess.getScatterPlotAccess().getLocationAssignment_7_1(), "rule__ScatterPlot__LocationAssignment_7_1");
			builder.put(grammarAccess.getScatterPlotAccess().getColorsAssignment_8_1(), "rule__ScatterPlot__ColorsAssignment_8_1");
			builder.put(grammarAccess.getScatterPlotAccess().getThicknessAssignment_9_1(), "rule__ScatterPlot__ThicknessAssignment_9_1");
			builder.put(grammarAccess.getRadarPlotAccess().getNameAssignment_1(), "rule__RadarPlot__NameAssignment_1");
			builder.put(grammarAccess.getRadarPlotAccess().getXAxisAssignment_4(), "rule__RadarPlot__XAxisAssignment_4");
			builder.put(grammarAccess.getRadarPlotAccess().getYAxisAssignment_6(), "rule__RadarPlot__YAxisAssignment_6");
			builder.put(grammarAccess.getRadarPlotAccess().getLocationAssignment_7_1(), "rule__RadarPlot__LocationAssignment_7_1");
			builder.put(grammarAccess.getRadarPlotAccess().getColorsAssignment_8_1(), "rule__RadarPlot__ColorsAssignment_8_1");
			builder.put(grammarAccess.getRadarPlotAccess().getThicknessAssignment_9_1(), "rule__RadarPlot__ThicknessAssignment_9_1");
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