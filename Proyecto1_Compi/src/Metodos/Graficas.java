package Metodos;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Graficas {

    private static ArrayList<JFreeChart> graficas;

    public Graficas() {
        graficas = new ArrayList<>();
    }

    public void agregarGraficaDeBarras(String titulo, ArrayList<Object> ejeX, ArrayList<Object> ejeY, String tituloX, String tituloY) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < ejeX.size(); i++) {
            dataset.addValue((Double) ejeY.get(i), titulo, ejeX.get(i).toString());
        }
        JFreeChart chart = ChartFactory.createBarChart(titulo, tituloX, tituloY, dataset);
        graficas.add(chart);
    }

    public void agregarGraficaDePie(String titulo, ArrayList<Object> values, ArrayList<Object> labels) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int i = 0; i < values.size(); i++) {
            double valor = Double.parseDouble(values.get(i).toString());
            dataset.setValue(labels.get(i).toString(), valor);
        }
        JFreeChart chart = ChartFactory.createPieChart(titulo, dataset);
        System.out.println("Grafica generada correctamente");
        graficas.add(chart);
    }

    public void agregarGraficaDeLineas(String titulo, ArrayList<Object> ejeX, ArrayList<Object> ejeY, String tituloX, String tituloY) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < ejeX.size(); i++) {
            dataset.addValue((Double) ejeY.get(i), titulo, ejeX.get(i).toString());
        }
        JFreeChart chart = ChartFactory.createLineChart(titulo, tituloX, tituloY, dataset);
        graficas.add(chart);
    }

    public static void mostrarGraficas() {
        JFrame frame = new JFrame("Graficas");
        frame.setLayout(new GridLayout(1, graficas.size()));

        for (JFreeChart chart : graficas) {
            ChartPanel chartPanel = new ChartPanel(chart);
            frame.add(chartPanel);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
