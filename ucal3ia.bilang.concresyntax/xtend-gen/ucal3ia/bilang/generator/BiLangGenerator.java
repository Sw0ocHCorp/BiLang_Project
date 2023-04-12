/**
 * generated by Xtext 2.25.0
 */
package ucal3ia.bilang.generator;

import com.google.common.base.Objects;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import ucal3ia.bilang.abstractsyntax.BarPlot;
import ucal3ia.bilang.abstractsyntax.CsvExtractor;
import ucal3ia.bilang.abstractsyntax.DashBoard;
import ucal3ia.bilang.abstractsyntax.DataFiltering;
import ucal3ia.bilang.abstractsyntax.ExcelExtractor;
import ucal3ia.bilang.abstractsyntax.FileExtractor;
import ucal3ia.bilang.abstractsyntax.Plot;
import ucal3ia.bilang.abstractsyntax.Task;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class BiLangGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    System.out.println("------------------------------");
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    Task task = ((Task) _head);
    HashMap<String, HashMap<String, ArrayList<String>>> dataArray = new HashMap<String, HashMap<String, ArrayList<String>>>();
    String fileExtractName = "";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<title>Exemple de graphique avec Chart.js</title>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<script src=\"./fs\"></script>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<script src=\"./csv-parser\"></script>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<canvas id=\"histogramme\"></canvas>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("<script src=\"https://cdn.jsdelivr.net/npm/chart.js\"></script>");
    _builder.newLine();
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("const CHART_COLORS = {");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("redt: \'rgba(255, 99, 132, 0.6)\',");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("red: \'rgb(255, 99, 132)\',");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("orange: \'rgb(255, 159, 64)\',");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("yellow: \'rgb(255, 205, 86)\',");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("green: \'rgb(75, 192, 192)\',");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("bluet: \'rgba(54, 162, 235,0.6)\',");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("blue: \'rgb(54, 162, 235)\',");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("purple: \'rgb(153, 102, 255)\',");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("grey: \'rgb(201, 203, 207)\'");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("  \t");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("const NAMED_COLORS = [");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("CHART_COLORS.red,");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("CHART_COLORS.orange,");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("CHART_COLORS.yellow,");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("CHART_COLORS.green,");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("CHART_COLORS.blue,");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("CHART_COLORS.purple,");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("CHART_COLORS.grey,");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("];");
    _builder.newLine();
    String fileContent = _builder.toString();
    EList<FileExtractor> _fileextractor = task.getFileextractor();
    for (final FileExtractor extractor : _fileextractor) {
      {
        HashMap<String, ArrayList<String>> extractorData = this.translateFileExtractor(extractor);
        dataArray.put(extractor.getName(), extractorData);
      }
    }
    EList<DataFiltering> _datafiltering = task.getDatafiltering();
    for (final DataFiltering filter : _datafiltering) {
    }
    EList<DashBoard> _dashboard = task.getDashboard();
    for (final DashBoard dashboard : _dashboard) {
      String _fileContent = fileContent;
      String _translateDashBoard = this.translateDashBoard(dashboard, dataArray.get(dashboard.getFileextractor().getName()));
      fileContent = (_fileContent + _translateDashBoard);
    }
    String _fileContent_1 = fileContent;
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("</script>");
    _builder_1.newLine();
    _builder_1.append("</body>");
    _builder_1.newLine();
    _builder_1.append("</html>");
    _builder_1.newLine();
    fileContent = (_fileContent_1 + _builder_1);
    String _name = task.getName();
    String _plus = (_name + ".html");
    fsa.generateFile(_plus, fileContent);
  }
  
  public HashMap<String, ArrayList<String>> translateFileExtractor(final FileExtractor fe) {
    int i = 0;
    String fileName = "";
    String[] _split = fe.getPath().split("\\.");
    for (final String str : _split) {
      boolean _contains = str.contains("/");
      if (_contains) {
        String[] _split_1 = str.split("/");
        for (final String tk : _split_1) {
          fileName = tk;
        }
      }
    }
    if ((fe instanceof CsvExtractor)) {
      ArrayList<ArrayList<String>> csvData = new ArrayList<ArrayList<String>>();
      HashMap<String, ArrayList<String>> allData = new HashMap<String, ArrayList<String>>();
      ArrayList<String> labels = new ArrayList<String>();
      String row = "";
      try {
        String _path = ((CsvExtractor)fe).getPath();
        FileReader _fileReader = new FileReader(_path);
        BufferedReader iterator = new BufferedReader(_fileReader);
        int z = 0;
        while ((!Objects.equal((row = iterator.readLine()), null))) {
          {
            if ((z == 0)) {
              List<String> _asList = Arrays.<String>asList(row.split(";"));
              ArrayList<String> _arrayList = new ArrayList<String>(_asList);
              labels = _arrayList;
            } else {
              if ((z == 1)) {
              } else {
                List<String> _asList_1 = Arrays.<String>asList(row.split(";"));
                ArrayList<String> _arrayList_1 = new ArrayList<String>(_asList_1);
                csvData.add(_arrayList_1);
              }
            }
            z++;
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      int k = 0;
      for (final String lab : labels) {
        {
          ArrayList<String> colData = new ArrayList<String>();
          for (int j = 0; (j < csvData.size()); j++) {
            colData.add(csvData.get(j).get(k));
          }
          allData.put(lab, colData);
          k++;
        }
      }
      return allData;
    }
    if ((fe instanceof ExcelExtractor)) {
      ArrayList<ArrayList<String>> excelData = new ArrayList<ArrayList<String>>();
      HashMap<String, ArrayList<String>> allData_1 = new HashMap<String, ArrayList<String>>();
      return allData_1;
    }
    return null;
  }
  
  public HashMap<String, ArrayList<String>> translateDataFiltering(final DataFiltering df, final HashMap<String, ArrayList<String>> fileData) {
    HashMap<String, ArrayList<String>> filteredData = new HashMap<String, ArrayList<String>>();
    int i = 0;
    String fileName = "";
    String[] _split = df.getFileextractor().getPath().split("\\.");
    for (final String str : _split) {
      boolean _contains = str.contains("/");
      if (_contains) {
        String[] _split_1 = str.split("/");
        for (final String tk : _split_1) {
          fileName = tk;
        }
      }
    }
    FileExtractor _fileextractor = df.getFileextractor();
    if ((_fileextractor instanceof CsvExtractor)) {
      return filteredData;
    }
    FileExtractor _fileextractor_1 = df.getFileextractor();
    if ((_fileextractor_1 instanceof ExcelExtractor)) {
      return filteredData;
    }
    return null;
  }
  
  public String translateDashBoard(final DashBoard dbm, final HashMap<String, ArrayList<String>> fileData) {
    String content = "";
    for (int j = 0; (j < ((Object[])Conversions.unwrapArray(dbm.getPlot(), Object.class)).length); j++) {
      {
        String plotType = "";
        ArrayList<String> xLabs = new ArrayList<String>();
        ArrayList<String> yLabs = new ArrayList<String>();
        boolean _contains = dbm.getPlot().get(j).getYAxis().contains(", ");
        if (_contains) {
          List<String> _asList = Arrays.<String>asList(dbm.getPlot().get(j).getYAxis().split(", "));
          ArrayList<String> _arrayList = new ArrayList<String>(_asList);
          yLabs = _arrayList;
        } else {
          boolean _contains_1 = dbm.getPlot().get(j).getYAxis().contains(",");
          if (_contains_1) {
            List<String> _asList_1 = Arrays.<String>asList(dbm.getPlot().get(j).getYAxis().split(","));
            ArrayList<String> _arrayList_1 = new ArrayList<String>(_asList_1);
            yLabs = _arrayList_1;
          } else {
            yLabs.add(dbm.getPlot().get(j).getYAxis());
          }
        }
        boolean _contains_2 = dbm.getPlot().get(j).getXAxis().contains(", ");
        if (_contains_2) {
          List<String> _asList_2 = Arrays.<String>asList(dbm.getPlot().get(j).getXAxis().split(", "));
          ArrayList<String> _arrayList_2 = new ArrayList<String>(_asList_2);
          xLabs = _arrayList_2;
        } else {
          boolean _contains_3 = dbm.getPlot().get(j).getXAxis().contains(",");
          if (_contains_3) {
            List<String> _asList_3 = Arrays.<String>asList(dbm.getPlot().get(j).getXAxis().split(","));
            ArrayList<String> _arrayList_3 = new ArrayList<String>(_asList_3);
            xLabs = _arrayList_3;
          } else {
            xLabs.add(dbm.getPlot().get(j).getXAxis());
          }
        }
        Plot _get = dbm.getPlot().get(j);
        if ((_get instanceof BarPlot)) {
          plotType = "bar";
        }
        ArrayList<ArrayList<String>> yCols = new ArrayList<ArrayList<String>>();
        ArrayList<ArrayList<String>> xCols = new ArrayList<ArrayList<String>>();
        for (int a = 0; (a < yLabs.size()); a++) {
          yCols.add(fileData.get(yLabs.get(a)));
        }
        for (int a = 0; (a < xLabs.size()); a++) {
          xCols.add(fileData.get(xLabs.get(a)));
        }
        String _content = content;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\t");
        _builder.append("const file");
        String _plus = (_builder.toString() + Integer.valueOf(j));
        String _plus_1 = (_plus + Integer.valueOf(1));
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("= [");
        String _plus_2 = (_plus_1 + _builder_1);
        content = (_content + _plus_2);
        int yLength = ((Object[])Conversions.unwrapArray(yCols.get(0), Object.class)).length;
        for (int i = 0; (i < yLength); i++) {
          {
            String _content_1 = content;
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("\t");
            _builder_2.append("{");
            content = (_content_1 + _builder_2);
            for (int cx = 0; (cx < ((Object[])Conversions.unwrapArray(xCols, Object.class)).length); cx++) {
              String _content_2 = content;
              String _get_1 = xLabs.get(cx);
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append(": \"");
              String _plus_3 = (_get_1 + _builder_3);
              String _get_2 = xCols.get(cx).get(i);
              String _plus_4 = (_plus_3 + _get_2);
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("\", ");
              String _plus_5 = (_plus_4 + _builder_4);
              content = (_content_2 + _plus_5);
            }
            for (int cy = 0; (cy < ((Object[])Conversions.unwrapArray(yCols, Object.class)).length); cy++) {
              String _content_2 = content;
              String _get_1 = yLabs.get(cy);
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append(": \"");
              String _plus_3 = (_get_1 + _builder_3);
              String _get_2 = yCols.get(cy).get(i);
              String _plus_4 = (_plus_3 + _get_2);
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("\", ");
              String _plus_5 = (_plus_4 + _builder_4);
              content = (_content_2 + _plus_5);
            }
            String _content_2 = content;
            content = (_content_2 + "},\n");
          }
        }
        String _content_1 = content;
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("\t");
        _builder_2.append("];");
        content = (_content_1 + _builder_2);
        String _content_2 = content;
        content = (_content_2 + "\n");
        String _content_3 = content;
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("\t");
        String _name = dbm.getPlot().get(j).getName();
        String _plus_3 = (_builder_3.toString() + _name);
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("= new Chart(");
        _builder_4.newLine();
        _builder_4.append("\t\t");
        _builder_4.append("document.getElementById(\'histogramme\'),");
        _builder_4.newLine();
        _builder_4.append("\t\t");
        _builder_4.append("{");
        _builder_4.newLine();
        _builder_4.append("\t\t\t");
        _builder_4.append("type: \"");
        String _plus_4 = (_plus_3 + _builder_4);
        String _plus_5 = (_plus_4 + plotType);
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("\",");
        _builder_5.newLine();
        _builder_5.append("\t\t\t");
        _builder_5.append("data: {");
        _builder_5.newLine();
        _builder_5.append("\t\t\t\t");
        _builder_5.append("labels: file");
        String _plus_6 = (_plus_5 + _builder_5);
        String _plus_7 = (_plus_6 + Integer.valueOf(j));
        String _plus_8 = (_plus_7 + Integer.valueOf(1));
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append(".map(row => row.");
        String _plus_9 = (_plus_8 + _builder_6);
        String _xAxis = dbm.getPlot().get(j).getXAxis();
        String _plus_10 = (_plus_9 + _xAxis);
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("),");
        _builder_7.newLine();
        _builder_7.append("\t\t\t\t");
        _builder_7.append("datasets: [");
        _builder_7.newLine();
        String _plus_11 = (_plus_10 + _builder_7);
        content = (_content_3 + _plus_11);
        for (int a = 0; (a < yLabs.size()); a++) {
          String _content_4 = content;
          StringConcatenation _builder_8 = new StringConcatenation();
          _builder_8.append("\t\t\t\t\t");
          _builder_8.append("{");
          _builder_8.newLine();
          _builder_8.append("\t\t\t    \t\t");
          _builder_8.append("label: \"");
          String _get_1 = yLabs.get(a);
          String _plus_12 = (_builder_8.toString() + _get_1);
          StringConcatenation _builder_9 = new StringConcatenation();
          _builder_9.append("\",");
          _builder_9.newLine();
          _builder_9.append("\t\t\t        \t");
          _builder_9.append("data: file");
          String _plus_13 = (_plus_12 + _builder_9);
          String _plus_14 = (_plus_13 + Integer.valueOf(j));
          String _plus_15 = (_plus_14 + Integer.valueOf(1));
          StringConcatenation _builder_10 = new StringConcatenation();
          _builder_10.append(".map(row => row.");
          String _plus_16 = (_plus_15 + _builder_10);
          String _get_2 = yLabs.get(a);
          String _plus_17 = (_plus_16 + _get_2);
          StringConcatenation _builder_11 = new StringConcatenation();
          _builder_11.append("),");
          _builder_11.newLine();
          _builder_11.append("\t\t\t    \t");
          _builder_11.append("},");
          _builder_11.newLine();
          String _plus_18 = (_plus_17 + _builder_11);
          content = (_content_4 + _plus_18);
        }
        String _content_4 = content;
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("\t\t\t");
        _builder_8.append("]");
        _builder_8.newLine();
        _builder_8.append("\t\t");
        _builder_8.append("}");
        _builder_8.newLine();
        _builder_8.append("\t");
        _builder_8.append("}");
        _builder_8.newLine();
        _builder_8.append(");");
        _builder_8.newLine();
        _builder_8.append("\t\t\t\t");
        _builder_8.newLine();
        content = (_content_4 + _builder_8);
      }
    }
    return content;
  }
}