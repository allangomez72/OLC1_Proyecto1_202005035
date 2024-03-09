package Metodos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperacionesEstadisticas {

    public double media(ArrayList<Object> valores) {
        double suma = 0;
        // Recorre todos los elementos en el ArrayList
        for (Object valor : valores) {
            // Convierte cada objeto a String y luego a Double, sumándolos
            suma += Double.parseDouble(valor.toString());
        }
        // Retorna la media dividida por el tamaño del ArrayList
        return suma / valores.size();
    }

    public double mediana(ArrayList<Object> valores) {
        // Crea una lista de Doubles para almacenar los valores convertidos
        List<Double> numeros = new ArrayList<>();
        // Convierte los objetos en el ArrayList a Doubles y los añade a la lista
        for (Object valor : valores) {
            numeros.add(Double.parseDouble(valor.toString()));
        }
        // Ordena la lista de números
        numeros.sort(null);
        // Calcula y devuelve la mediana
        int n = numeros.size();
        if (n % 2 == 0) {
            return (numeros.get(n / 2) + numeros.get(n / 2 - 1)) / 2;
        } else {
            return numeros.get(n / 2);
        }
    }

    public double moda(ArrayList<Object> valores) {
        // HashMap para mantener el conteo de la frecuencia de cada valor
        HashMap<Double, Integer> freqMap = new HashMap<>();
        // Recorre todos los elementos en el ArrayList
        for (Object valor : valores) {
            // Convierte cada objeto a Double y actualiza su frecuencia en el mapa
            double num = Double.parseDouble(valor.toString());
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // Encuentra el valor con la mayor frecuencia
        double mode = Double.parseDouble(valores.get(0).toString());
        int maxCount = 0;
        for (Map.Entry<Double, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    public double varianza(ArrayList<Object> valores) {
        // Calcula la media de los valores en el ArrayList
        double media = media(valores);
        double suma = 0;
        // Recorre todos los elementos en el ArrayList
        for (Object valor : valores) {
            // Calcula la diferencia al cuadrado entre el valor y la media y suma los resultados
            suma += Math.pow(Double.parseDouble(valor.toString()) - media, 2);
        }
        // Retorna la varianza
        return suma / valores.size();
    }

    public double maximo(ArrayList<Object> valores) {
        // Utiliza streams para encontrar el valor máximo en el ArrayList
        return valores.stream()
                .mapToDouble(value -> Double.parseDouble(value.toString()))//conviernte a double
                .max()//busca el maximo
                .orElse(0.0); // Si el ArrayList está vacío, devuelve 0.0
    }

    public double minimo(ArrayList<Object> valores) {
        // Utiliza streams para encontrar el valor mínimo en el ArrayList
        return valores.stream()
                .mapToDouble(value -> Double.parseDouble(value.toString())) //convierte a double
                .min()//busca el minimmo
                .orElse(0.0); // Si el ArrayList está vacío, devuelve 0.0
    }
}
