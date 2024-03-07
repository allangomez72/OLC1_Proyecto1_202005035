package Metodos;

import java.util.ArrayList;
import java.util.HashMap;

public class Mapas {
    private static HashMap<String, Object> variables = new HashMap<String, Object>();
    private static HashMap<String, ArrayList<Object>> arreglos = new HashMap<String, ArrayList<Object>>();

    public static void setVariable(String name, Object value) {
        variables.put(name, value);
    }

    public static Object getVariable(String name) {
        return variables.get(name);
    }

    public static void setArreglo(String name, ArrayList<Object> value) {
        arreglos.put(name, value);
    }

    public static ArrayList<Object> getArreglo(String name) {
        return arreglos.get(name);
    }
}
