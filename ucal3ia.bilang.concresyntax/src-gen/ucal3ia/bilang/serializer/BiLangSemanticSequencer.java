/*
 * generated by Xtext 2.25.0
 */
package ucal3ia.bilang.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ucal3ia.bilang.abstractsyntax.AbstractsyntaxPackage;
import ucal3ia.bilang.abstractsyntax.BarPlot;
import ucal3ia.bilang.abstractsyntax.ColReference;
import ucal3ia.bilang.abstractsyntax.CsvExtractor;
import ucal3ia.bilang.abstractsyntax.DashBoard;
import ucal3ia.bilang.abstractsyntax.DataFiltering;
import ucal3ia.bilang.abstractsyntax.ExcelExtractor;
import ucal3ia.bilang.abstractsyntax.LinePlot;
import ucal3ia.bilang.abstractsyntax.MathOperation;
import ucal3ia.bilang.abstractsyntax.QualitativeFiltering;
import ucal3ia.bilang.abstractsyntax.QuantitativeFiltering;
import ucal3ia.bilang.abstractsyntax.StatisticalOperation;
import ucal3ia.bilang.abstractsyntax.Task;
import ucal3ia.bilang.services.BiLangGrammarAccess;

@SuppressWarnings("all")
public class BiLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BiLangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AbstractsyntaxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AbstractsyntaxPackage.BAR_PLOT:
				sequence_BarPlot(context, (BarPlot) semanticObject); 
				return; 
			case AbstractsyntaxPackage.COL_REFERENCE:
				sequence_ColReference(context, (ColReference) semanticObject); 
				return; 
			case AbstractsyntaxPackage.CSV_EXTRACTOR:
				sequence_CsvExtractor(context, (CsvExtractor) semanticObject); 
				return; 
			case AbstractsyntaxPackage.DASH_BOARD:
				sequence_DashBoard(context, (DashBoard) semanticObject); 
				return; 
			case AbstractsyntaxPackage.DATA_FILTERING:
				sequence_DataFiltering(context, (DataFiltering) semanticObject); 
				return; 
			case AbstractsyntaxPackage.EXCEL_EXTRACTOR:
				sequence_ExcelExtractor(context, (ExcelExtractor) semanticObject); 
				return; 
			case AbstractsyntaxPackage.LINE_PLOT:
				sequence_LinePlot(context, (LinePlot) semanticObject); 
				return; 
			case AbstractsyntaxPackage.MATH_OPERATION:
				sequence_MathOperation(context, (MathOperation) semanticObject); 
				return; 
			case AbstractsyntaxPackage.QUALITATIVE_FILTERING:
				sequence_QualitativeFiltering(context, (QualitativeFiltering) semanticObject); 
				return; 
			case AbstractsyntaxPackage.QUANTITATIVE_FILTERING:
				sequence_QuantitativeFiltering(context, (QuantitativeFiltering) semanticObject); 
				return; 
			case AbstractsyntaxPackage.STATISTICAL_OPERATION:
				sequence_StatisticalOperation(context, (StatisticalOperation) semanticObject); 
				return; 
			case AbstractsyntaxPackage.TASK:
				sequence_Task(context, (Task) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Plot returns BarPlot
	 *     BarPlot returns BarPlot
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         xAxis=EString 
	 *         yAxis=EString 
	 *         location=EString? 
	 *         color=EString? 
	 *         thickness=EFloat?
	 *     )
	 */
	protected void sequence_BarPlot(ISerializationContext context, BarPlot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PreprocessingStep returns ColReference
	 *     ColReference returns ColReference
	 *
	 * Constraint:
	 *     target=EString
	 */
	protected void sequence_ColReference(ISerializationContext context, ColReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.COL_REFERENCE__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.COL_REFERENCE__TARGET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColReferenceAccess().getTargetEStringParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FileExtractor returns CsvExtractor
	 *     CsvExtractor returns CsvExtractor
	 *
	 * Constraint:
	 *     (name=EString path=EString)
	 */
	protected void sequence_CsvExtractor(ISerializationContext context, CsvExtractor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.FILE_EXTRACTOR__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.FILE_EXTRACTOR__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCsvExtractorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCsvExtractorAccess().getPathEStringParserRuleCall_4_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DashBoard returns DashBoard
	 *
	 * Constraint:
	 *     (name=EString (fileextractor=[FileExtractor|EString] | datafiltering=[DataFiltering|EString]) plot+=Plot plot+=Plot*)
	 */
	protected void sequence_DashBoard(ISerializationContext context, DashBoard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataFiltering returns DataFiltering
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         fileextractor=[FileExtractor|EString] 
	 *         (processingstep+=PreprocessingStep processingstep+=PreprocessingStep*)? 
	 *         filteringstep+=FilteringStep 
	 *         filteringstep+=FilteringStep*
	 *     )
	 */
	protected void sequence_DataFiltering(ISerializationContext context, DataFiltering semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FileExtractor returns ExcelExtractor
	 *     ExcelExtractor returns ExcelExtractor
	 *
	 * Constraint:
	 *     (name=EString path=EString)
	 */
	protected void sequence_ExcelExtractor(ISerializationContext context, ExcelExtractor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.FILE_EXTRACTOR__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.FILE_EXTRACTOR__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExcelExtractorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExcelExtractorAccess().getPathEStringParserRuleCall_4_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Plot returns LinePlot
	 *     LinePlot returns LinePlot
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         xAxis=EString 
	 *         yAxis=EString 
	 *         location=EString? 
	 *         color=EString? 
	 *         thickness=EFloat?
	 *     )
	 */
	protected void sequence_LinePlot(ISerializationContext context, LinePlot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PreprocessingStep returns MathOperation
	 *     MathOperation returns MathOperation
	 *
	 * Constraint:
	 *     (lside=PreprocessingStep operator=MathOperator rside=PreprocessingStep)
	 */
	protected void sequence_MathOperation(ISerializationContext context, MathOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.MATH_OPERATION__LSIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.MATH_OPERATION__LSIDE));
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.MATH_OPERATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.MATH_OPERATION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.MATH_OPERATION__RSIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.MATH_OPERATION__RSIDE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMathOperationAccess().getLsidePreprocessingStepParserRuleCall_1_0(), semanticObject.getLside());
		feeder.accept(grammarAccess.getMathOperationAccess().getOperatorMathOperatorEnumRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getMathOperationAccess().getRsidePreprocessingStepParserRuleCall_4_0(), semanticObject.getRside());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FilteringStep returns QualitativeFiltering
	 *     QualitativeFiltering returns QualitativeFiltering
	 *
	 * Constraint:
	 *     (axis=EString labels=EString)
	 */
	protected void sequence_QualitativeFiltering(ISerializationContext context, QualitativeFiltering semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.FILTERING_STEP__AXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.FILTERING_STEP__AXIS));
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.QUALITATIVE_FILTERING__LABELS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.QUALITATIVE_FILTERING__LABELS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQualitativeFilteringAccess().getAxisEStringParserRuleCall_2_0(), semanticObject.getAxis());
		feeder.accept(grammarAccess.getQualitativeFilteringAccess().getLabelsEStringParserRuleCall_4_0(), semanticObject.getLabels());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FilteringStep returns QuantitativeFiltering
	 *     QuantitativeFiltering returns QuantitativeFiltering
	 *
	 * Constraint:
	 *     (axis=EString values=EString)
	 */
	protected void sequence_QuantitativeFiltering(ISerializationContext context, QuantitativeFiltering semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.FILTERING_STEP__AXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.FILTERING_STEP__AXIS));
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.QUANTITATIVE_FILTERING__VALUES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.QUANTITATIVE_FILTERING__VALUES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getQuantitativeFilteringAccess().getAxisEStringParserRuleCall_2_0(), semanticObject.getAxis());
		feeder.accept(grammarAccess.getQuantitativeFilteringAccess().getValuesEStringParserRuleCall_4_0(), semanticObject.getValues());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PreprocessingStep returns StatisticalOperation
	 *     StatisticalOperation returns StatisticalOperation
	 *
	 * Constraint:
	 *     (operator=StatisticalOperator colreference=ColReference)
	 */
	protected void sequence_StatisticalOperation(ISerializationContext context, StatisticalOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.STATISTICAL_OPERATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.STATISTICAL_OPERATION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, AbstractsyntaxPackage.Literals.STATISTICAL_OPERATION__COLREFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AbstractsyntaxPackage.Literals.STATISTICAL_OPERATION__COLREFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStatisticalOperationAccess().getOperatorStatisticalOperatorEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getStatisticalOperationAccess().getColreferenceColReferenceParserRuleCall_2_0(), semanticObject.getColreference());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Task returns Task
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         fileextractor+=FileExtractor 
	 *         datafiltering+=DataFiltering? 
	 *         (fileextractor+=FileExtractor datafiltering+=DataFiltering?)* 
	 *         dashboard+=DashBoard 
	 *         dashboard+=DashBoard*
	 *     )
	 */
	protected void sequence_Task(ISerializationContext context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
