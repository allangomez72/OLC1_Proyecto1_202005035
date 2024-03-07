package Metodos;

import java.util.Arrays;

public class OperacionesEstadisticas {
    
    public double media(String[] valores){
        double suma = 0;
        for (String valor : valores) {
            suma += Double.parseDouble(valor);
        }
        return suma / valores.length;
    }

    public double mediana(String[] valores){
        double[] numeros = new double[valores.length];
        for (int i = 0; i < valores.length; i++) {
            numeros[i] = Double.parseDouble(valores[i]);
        }
        java.util.Arrays.sort(numeros);
        if (numeros.length % 2 == 0) {
            return (numeros[numeros.length / 2] + numeros[numeros.length / 2 - 1]) / 2;
        } else {
            return numeros[numeros.length / 2];
        }
    }

    public double moda(String[] valores){
        java.util.HashMap<Double, Integer> freqMap = new java.util.HashMap<>();
        for (String valor : valores) {
            double num = Double.parseDouble(valor);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        double mode = Double.parseDouble(valores[0]);
        int maxCount = 0;
        for (java.util.Map.Entry<Double, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    public double varianza(String[] valores){
        double media = media(valores);
        double suma = 0;
        for (String valor : valores) {
            suma += Math.pow(Double.parseDouble(valor) - media, 2);
        }
        return suma / valores.length;
    }


    public double maximo(String[] valores) {
        return Arrays.stream(valores) // Se supone que Convierte el arreglo de Strings a un DoubleStream
                .mapToDouble(Double::parseDouble)// Convierte cada elemento String a double
                .max()// Encuentra el valor máximo
                .orElse(0.0);// Si el stream está vacío, devuelve 0.0
    }

    public double minimo(String[] valores) {
        return Arrays.stream(valores)// es lo mismo que en el Maximo solo que aqui se usa minimo
                .mapToDouble(Double::parseDouble)
                .min()
                .orElse(0.0);
    }


}
