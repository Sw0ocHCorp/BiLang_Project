/*
 * generated by Xtext 2.25.0
 */
package ucal3ia.bilang.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ucal3ia.bilang.abstractsyntax.Task
import java.util.HashMap
import java.util.ArrayList
import ucal3ia.bilang.abstractsyntax.FileExtractor
import ucal3ia.bilang.abstractsyntax.CsvExtractor
import java.io.BufferedReader
import java.io.FileReader
import java.util.Arrays
import ucal3ia.bilang.abstractsyntax.ExcelExtractor
import ucal3ia.bilang.abstractsyntax.DataFiltering
import ucal3ia.bilang.abstractsyntax.DashBoard
import ucal3ia.bilang.abstractsyntax.BarPlot
import ucal3ia.bilang.abstractsyntax.QuantitativeFiltering
import ucal3ia.bilang.abstractsyntax.QualitativeFiltering
import ucal3ia.bilang.abstractsyntax.MathOperation
import ucal3ia.bilang.abstractsyntax.ColReference
import ucal3ia.bilang.abstractsyntax.StatisticalOperation

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BiLangGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		System.out.println("------------------------------")
		var Task task= resource.allContents.head as Task
		var dataArray= new HashMap<String, HashMap<String, ArrayList<String>>>;
		var fileExtractName= "";
		var fileContent= '''
		<!DOCTYPE html>
		<html>
		<head>
		  <title>Exemple de graphique avec Chart.js</title>
		  <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
		  <script src="./fs"></script>
		  <script src="./csv-parser"></script>
		
		</head>
		<body>
		<div>
		  <canvas id="histogramme"></canvas>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
		<script>
		  	const CHART_COLORS = {
		  	  redt: 'rgba(255, 99, 132, 0.6)',
		  	  red: 'rgb(255, 99, 132)',
		  	  orange: 'rgb(255, 159, 64)',
		  	  yellow: 'rgb(255, 205, 86)',
		  	  green: 'rgb(75, 192, 192)',
		  	  bluet: 'rgba(54, 162, 235,0.6)',
		  	  blue: 'rgb(54, 162, 235)',
		  	  purple: 'rgb(153, 102, 255)',
		  	  grey: 'rgb(201, 203, 207)'
		  	};
		  	
		  	const NAMED_COLORS = [
		  	  CHART_COLORS.red,
		  	  CHART_COLORS.orange,
		  	  CHART_COLORS.yellow,
		  	  CHART_COLORS.green,
		  	  CHART_COLORS.blue,
		  	  CHART_COLORS.purple,
		  	  CHART_COLORS.grey,
		  	];
		'''
		for (extractor:task.fileextractor) {
			var extractorData= translateFileExtractor(extractor)
			dataArray.put(extractor.name, extractorData);
		}
		for (filter:task.datafiltering) {
			var inputData= dataArray.get(filter.fileextractor.name)
			//var filteredData= 
			dataArray.put(filter.fileextractor.name, translateDataFiltering(filter, inputData))
		}
		for (dashboard:task.dashboard) {
			fileContent += translateDashBoard(dashboard, dataArray.get(dashboard.fileextractor.name))
			/*if (dashboard.datafiltering != null) {
				fileContent += translateDashBoardManager(dashboard, dataArray.get(dashboard.datafiltering));
			} else {
				fileContent += translateDashBoardManager(dashboard, dataArray.get(dashboard.fileextractor))
			}*/
			
		}
		
		fileContent += '''
		</script>
		</body>
		</html>
		'''
		fsa.generateFile(task.name+".html", fileContent)
	}
	
	def translateFileExtractor(FileExtractor fe) {
		var i=0
		var fileName= "";
		for (str:fe.path.split("\\.")) {
			if (str.contains("/")) {
				for(tk:str.split("/")){
					fileName= tk;
				}
			}
		}
		if (fe instanceof CsvExtractor) {
			var csvData= new ArrayList<ArrayList<String>>();
			var allData= new HashMap<String, ArrayList<String>>();
			var labels= new ArrayList<String>;
			var row= "";
			try {
				var iterator= new BufferedReader(new FileReader(fe.path));
				var z=0;
				while((row= iterator.readLine()) != null) {
					if (z ==0) {
						labels= new ArrayList<String>(Arrays.asList(row.split(";")));
					} else if (z == 1) {
						
					} else {
						csvData.add(new ArrayList<String>(Arrays.asList(row.split(";"))));
					}
					z++;
				}
			} catch(Exception e) {
   				e.printStackTrace();
			}
			var k= 0;
			for (String lab: labels) {
				var colData= new ArrayList<String>();
				for (var j=0; j<csvData.size(); j++) {
					colData.add(csvData.get(j).get(k));
				}
				allData.put(lab, colData);
            	k++;
			}
			
			return allData
		}
		if (fe instanceof ExcelExtractor) {
			var excelData= new ArrayList<ArrayList<String>>
			var allData= new HashMap<String, ArrayList<String>>;
			return allData
		}
	}
	
	def translateDataFiltering(DataFiltering df, HashMap<String, ArrayList<String>> fileData) {
		var filteredData= new HashMap<String, ArrayList<String>>;
		var targets= new ArrayList<String>()	
		var operationContent= new ArrayList<String>()
		/* Copie du contenu du fichier CSV / EXCEL */
		for (lab:fileData.keySet()) {
			filteredData.put(lab, (fileData.get(lab)));
		}
		if (df.fileextractor instanceof CsvExtractor){
			//PHASE DE PREPROCESSING 
			for (preprocess:df.processingstep) {
				var newFieldData= new ArrayList<String>();
				if (preprocess instanceof MathOperation) {
					var lSide= preprocess.lside
					var rSide= preprocess.rside
					if (lSide instanceof ColReference) {
						operationContent.add(lSide.target)
						operationContent.add(preprocess.operator.literal)
					}if (rSide instanceof ColReference) {
						operationContent.add(rSide.target)
					}
					System.out.println(operationContent)
					var keyList= new ArrayList<String>(filteredData.keySet());
					for (var i= 0; i<filteredData.get(keyList.get(0)).size(); i++) {
						var sum= 0;
						var floatSum= 0.0;
						var isDouble= false;
						var addition= false;
						var substraction= false;
						var multiplication= false;
						var division= false;
						for (var j= 0; j<operationContent.size(); j++) {
							if (j == 0) {
								var stringValue= filteredData.get(operationContent.get(0)).get(i);
								if (Character.isDigit(stringValue.charAt(0))) {
									if (stringValue.contains(".")) {
										isDouble= true;
										floatSum+= Double.valueOf(stringValue);
									}
									else {
										isDouble= false;
										sum+= Integer.valueOf(stringValue);
									}
								}
							} else if (operationContent.get(j).equals("+")) {
								addition= true;
							} else if (operationContent.get(j).equals("-")) {
								substraction= true;
							} else if (operationContent.get(j).equals("*")) {
								multiplication= true;
							} else if (operationContent.get(j).equals("/")) {
								division= true;	
							} else {
								var stringValue= filteredData.get(operationContent.get(j)).get(i);
								if (Character.isDigit(stringValue.charAt(0))) {
									if (stringValue.contains(".")) {
										isDouble= true;
										if (addition == true) {
											floatSum+= Double.valueOf(stringValue);
										} else if (substraction == true) {
											floatSum-= Double.valueOf(stringValue);
										} else if (multiplication == true) {
											floatSum*= Double.valueOf(stringValue);
										} else if (division == true) {
											floatSum/= Double.valueOf(stringValue);
										}
									}
									else {
										isDouble= false;
										if (addition == true) {
											sum+= Integer.valueOf(stringValue);
										} else if (substraction == true) {
											sum-= Integer.valueOf(stringValue);
										} else if (multiplication == true) {
											sum*= Integer.valueOf(stringValue);
										} else if (division == true) {
											sum/= Integer.valueOf(stringValue);
										}
									}
								}
							}
						}
						if (isDouble == false) {
							newFieldData.add(Integer.toString(sum));
						} else {
							newFieldData.add(Double.toString(floatSum));
						}
					}
					filteredData.put("TEST", newFieldData);
				} else if (preprocess instanceof StatisticalOperation) {
					var ref= preprocess.colreference
					var operator= preprocess.operator
				}
			
			}
			//PHASE DE FILTRAGE
			var stopLoop= false;
			for (filter:df.filteringstep){
				// RECUPERATION DES CARACTERISTIQUES DU FILTRE | Axe cible et Valeur(s) � conserver
				var targetCol= fileData.get(filter.axis)
				if (filter instanceof QuantitativeFiltering) {
					targets= new ArrayList<String>(Arrays.asList(filter.values.split(",")))
				} if (filter instanceof QualitativeFiltering) {
					targets= new ArrayList<String>(Arrays.asList(filter.labels.split(",")))
				}
				//NETTOYAGE DES DONN�ES SELON LES CA
				for(var i= 0; i<targetCol.size(); i++) {
					while ((stopLoop == false) && (targets.contains(targetCol.get(i)) == false)){
						for (lab:filteredData.keySet()){
							if (i == targetCol.size()) {
								stopLoop= true;
							}
							filteredData.get(lab).remove(i)	
						}
					}
				}
			}
			return filteredData
		}
		if (df.fileextractor instanceof ExcelExtractor){
			for (preprocess:df.processingstep) {
			
			}
			for (filter:df.filteringstep){
			
			}
			return filteredData
		}
		
	}
	
	def translateDashBoard(DashBoard dbm, HashMap<String, ArrayList<String>> fileData) {
		var content= "";
		for (var j= 0; j < dbm.plot.length(); j++){
			var plotType= ""
			var xLabs= new ArrayList<String>()
			var yLabs= new ArrayList<String>()
			if (dbm.plot.get(j).YAxis.contains(", ")) {
				yLabs= new ArrayList<String>(Arrays.asList(dbm.plot.get(j).YAxis.split(", ")));
			} else if (dbm.plot.get(j).YAxis.contains(",")) {
				yLabs= new ArrayList<String>(Arrays.asList(dbm.plot.get(j).YAxis.split(",")));
			} else {
				yLabs.add(dbm.plot.get(j).YAxis);
			}
			if (dbm.plot.get(j).XAxis.contains(", ")) {
				xLabs= new ArrayList<String>(Arrays.asList(dbm.plot.get(j).XAxis.split(", ")));
			} else if (dbm.plot.get(j).XAxis.contains(",")) {
				xLabs= new ArrayList<String>(Arrays.asList(dbm.plot.get(j).XAxis.split(",")));
			} else {
				xLabs.add(dbm.plot.get(j).XAxis);
			}
			
			if (dbm.plot.get(j) instanceof BarPlot) {
				plotType= "bar"
			}
			//var yCol= fileData.get(dbm.plot.get(j).YAxis)
			//var xCol= fileData.get(dbm.plot.get(j).XAxis)
			var yCols= new ArrayList<ArrayList<String>>();
			var xCols= new ArrayList<ArrayList<String>>();	
			for (var a= 0; a < yLabs.size(); a++) 
				yCols.add(fileData.get(yLabs.get(a)));
	
			for (var a= 0; a < xLabs.size(); a++) 
				xCols.add(fileData.get(xLabs.get(a)));
			content += '''	const file''' + j+1 + '''= ['''
			var yLength= yCols.get(0).length()
			for (var i= 0; i < yLength; i++) {
				content+='''	{'''
				for (var cx= 0; cx < xCols.length(); cx++)
					content+= xLabs.get(cx) + ''': "''' + xCols.get(cx).get(i) + '''", '''
					//content+= dbm.plot.get(j).XAxis + ''': "''' + xCol.get(i) + '''", ''' + dbm.plot.get(j).YAxis + ''': "''' + yCol.get(i) + '''"},'''
				for (var cy= 0; cy < yCols.length(); cy++)
					content+= yLabs.get(cy) + ''': "''' + yCols.get(cy).get(i) + '''", '''
				//content-= ''', '''
				content += "},\n"
			}
			content += '''	];'''
			content += "\n"
			content += '''	''' + dbm.plot.get(j).name + '''= new Chart(
		document.getElementById('histogramme'),
		{
			type: "''' + plotType + '''",
			data: {
				labels: file''' + j+1 + '''.map(row => row.''' + dbm.plot.get(j).XAxis + '''),
				datasets: [
					''' 
			for (var a= 0; a < yLabs.size(); a++) { 
					content+= '''					{
			    		label: "''' + yLabs.get(a) + '''",
			        	data: file''' + j+1 + '''.map(row => row.''' + yLabs.get(a) + '''),
			    	},
			    	''' 
			}
			    	content+= '''
				]
			}
		}
	);
					
			'''
				
		}
		return content
	}
	
}