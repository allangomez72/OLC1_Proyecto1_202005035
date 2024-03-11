package Metodos;

public class TablaSimbolos {
    private String variables;
    private Object valores;
    private String tipos;

    // Constructor
    public TablaSimbolos(String variables, Object valores, String tipos) {
        this.variables = variables;
        this.valores = valores;
        this.tipos = tipos;
    }

    // Getter y setter para variables
    public String getVariables() {
        return variables;
    }

    public void setVariables(String variables) {
        this.variables = variables;
    }

    // Getter y setter para valores
    public Object getValores() {
        return valores;
    }

    public void setValores(Object valores) {
        this.valores = valores;
    }

    // Getter y setter para tipos
    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }
}

