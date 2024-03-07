package Metodos; 

public class Recorrido{
    //atributos
    private String lexema;
    private String token;
    private String linea;
    private String columna;
    
    //constructor
    public Recorrido(String lexema, String token, String linea, String columna){
        this.lexema=lexema;
        this.token= token;
        this.linea=linea;
        this.columna=columna;
        
    }

    public String getLexema() {
        return lexema;
    }

    public String getToken() {
        return token;
    }

    public String getLinea() {
        return linea;
    }

    public String getColumna() {
        return columna;
    }
    
    
}
