package Metodos;

public class OperacionesAritmeticas {
    
    public double suma(Object num1, Object num2) {
        if (num1 == null || num1.toString().isEmpty() || num2 == null || num2.toString().isEmpty()) {
            return 0.0; // Retorna cero si alguno de los argumentos es nulo o está vacío
        } else {
            return Double.parseDouble(num1.toString()) + Double.parseDouble(num2.toString());
        }
    }
    
    public double resta(Object num1, Object num2) {
        if (num1 == null || num1.toString().isEmpty() || num2 == null || num2.toString().isEmpty()) {
            return 0.0; // Retorna cero si alguno de los argumentos es nulo o está vacío
        } else {
            return Double.parseDouble(num1.toString()) - Double.parseDouble(num2.toString());
        }
    }
    
    public double multiplicacion(Object num1, Object num2) {
        if (num1 == null || num1.toString().isEmpty() || num2 == null || num2.toString().isEmpty()) {
            return 0.0; // Retorna cero si alguno de los argumentos es nulo o está vacío
        } else {
            return Double.parseDouble(num1.toString()) * Double.parseDouble(num2.toString());
        }
    }
    
    public double division(Object num1, Object num2) {
        if (num1 == null || num1.toString().isEmpty() || num2 == null || num2.toString().isEmpty()) {
            return 0.0; // Retorna cero si alguno de los argumentos es nulo o está vacío
        } else {
            double n1 = Double.parseDouble(num1.toString());
            double n2 = Double.parseDouble(num2.toString());
            if (n2 == 0) {
                return 0; // Retorna cero si el divisor es cero
            } else {
                return n1 / n2;
            }
        }
    }
    
    public double modulo(Object num1, Object num2) {
        if (num1 == null || num1.toString().isEmpty() || num2 == null || num2.toString().isEmpty()) {
            return 0.0; // Retorna cero si alguno de los argumentos es nulo o está vacío
        } else {
            return Double.parseDouble(num1.toString()) % Double.parseDouble(num2.toString());
        }
    }
    
    
}
