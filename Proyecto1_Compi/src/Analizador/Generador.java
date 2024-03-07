package Analizador;

public class Generador {
    public static void main(String[] args) {
        compilar();
    }
    private static void compilar(){
        
        try {
            
            String ruta = "src/Analizador/";    
            //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = { ruta + "Scanner.jflex", "-d", ruta };
            jflex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "parser", ruta + "Parser.cup" };
            java_cup.Main.main(opcCUP);
            System.out.println("Archivo creado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
