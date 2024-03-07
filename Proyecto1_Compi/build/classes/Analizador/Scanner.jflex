package Analizador;
import java_cup.runtime.Symbol;
import Errores.Exception_;
import Metodos.Recorrido;
import java.util.ArrayList;

%%

//Agregar codigo de java para trabajar de manera externa
%{
    //sirve para agregar codigo de sintaxis, como arreglos, clases, objetos etc
    public ArrayList<Exception_> Errores = new ArrayList();
    public ArrayList<Recorrido> Lexemas = new ArrayList();
%}

%cup
%class LexicalAnalysis
%public
%line
%char
%column
%full
%ignorecase // Omite el case sensitive, mayúsculas y minúsculas son iguales


%{

%}

/* datos primitivos y símbolos especiales */
/*PALABRAS RESERVADAS*/
PROGRAM  = "PROGRAM"
END = "END"
VAR = "VAR"
CONSOLE = "CONSOLE"
PRINT = "PRINT"
CHAR = "CHAR"
DOUBLE = "DOUBLE"
ARREGLO = "ARR"
SUMA = "SUM"
RESTA = "RES"
MULTIPLICACION = "MUL"
DIVISION = "DIV"
MODULO = "MOD"
MEDIA = "MEDIA"
MEDIANA = "MEDIANA"
MODA = "MODA"
VARIANZA = "VARIANZA"
MAX = "MAX"
MIN = "MIN"
COLUMN = "COLUMN"
GRAPH = "GRAPH"
PRBAR = "BAR"
PRPIE = "PIE"
PRLINE = "LINE"
EXEC = "EXEC"
TITULO = "TITULO"
LABEL = "LABEL"
VALUES = "VALUES"
EJE = "EJE"
PRX = "X"
PRY = "Y"
HISTOGRAM = "HISTOGRAM"

/*SIMBOLOS ESPECIALES*/
DOSPUNTOS = ":"
PUNTOCOMA = ";"
FLECHA = "<-"|"\->"
CORABRE = "["
CORCIERRA = "]"
ARROBA = "@"
PARABRE = "("
PARCIERRA = ")"
COMA = ","
IGUAL = "="

/*DECLARACION DE VARIABLES COMO ID, CADENA, */ 
DECIMAL=[0-9]+("."[  |0-9]+)?
ID=[a-zA-Z][a-zA-Z0-9_]*
CADENA=\"[^\"]*\"

//Espacios en blanco
SPACE = [\ \r\t\f\t]
ENTER = [\ \n]

/* comentarios */
ComentarioLinea = \!.*
ComentarioBloque = \<\![^>]*\!\>

%%

//REGLAS SEMANTICAS

//----------------SECCION DE RESERVADAS Y SIMBOLOS----------------- 
<YYINITIAL> {PROGRAM}                   { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "PROGRAM",yyline+"",yycolumn+""));
                                            return new Symbol(sym.PROGRAM, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {END}                       { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "END",yyline+"",yycolumn+""));
                                            return new Symbol(sym.END, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {VAR}                       { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "VAR",yyline+"",yycolumn+""));
                                            return new Symbol(sym.VAR, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {CONSOLE}                   { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "CONSOLE",yyline+"",yycolumn+""));
                                            return new Symbol(sym.CONSOLE, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {PRINT}                     { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "PRINT",yyline+"",yycolumn+""));
                                            return new Symbol(sym.PRINT, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {CHAR}                      { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "CHAR",yyline+"",yycolumn+""));
                                            return new Symbol(sym.CHAR, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {DOUBLE}                    { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "DOUBLE",yyline+"",yycolumn+""));
                                            return new Symbol(sym.DOUBLE, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {ARREGLO}                   { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "ARR",yyline+"",yycolumn+""));
                                            return new Symbol(sym.ARREGLO, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {SUMA}                      { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "SUM",yyline+"",yycolumn+""));
                                            return new Symbol(sym.SUMA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {RESTA}                     { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "RES",yyline+"",yycolumn+""));
                                            return new Symbol(sym.RESTA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {MULTIPLICACION}            { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "MUL",yyline+"",yycolumn+""));
                                            return new Symbol(sym.MULTIPLICACION, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {DIVISION}                  { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "DIV",yyline+"",yycolumn+""));
                                            return new Symbol(sym.DIVISION, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {MODULO}                    { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "MOD",yyline+"",yycolumn+""));
                                            return new Symbol(sym.MODULO, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {MEDIA}                     { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "MEDIA",yyline+"",yycolumn+""));
                                            return new Symbol(sym.MEDIA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {MEDIANA}                   { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "MEDIANA",yyline+"",yycolumn+""));
                                            return new Symbol(sym.MEDIANA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {MODA}                      { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "MODA",yyline+"",yycolumn+""));
                                            return new Symbol(sym.MODA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {VARIANZA}                  { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "VARIANZA",yyline+"",yycolumn+""));
                                            return new Symbol(sym.VARIANZA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {MAX}                       { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "MAX",yyline+"",yycolumn+""));
                                            return new Symbol(sym.MAX, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {MIN}                       { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "MIN",yyline+"",yycolumn+""));
                                            return new Symbol(sym.MIN, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {COLUMN}                    { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "COLUMN",yyline+"",yycolumn+""));
                                            return new Symbol(sym.COLUMN, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {GRAPH}                     { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "GRAPH",yyline+"",yycolumn+""));
                                            return new Symbol(sym.GRAPH, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {PRBAR}                     { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "BAR",yyline+"",yycolumn+""));
                                            return new Symbol(sym.PRBAR, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {PRPIE}                     { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "PIE",yyline+"",yycolumn+""));
                                            return new Symbol(sym.PRPIE, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {PRLINE}                    { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "LINE",yyline+"",yycolumn+""));
                                            return new Symbol(sym.PRLINE, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {EXEC}                      { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "EXEC",yyline+"",yycolumn+""));
                                            return new Symbol(sym.EXEC, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {TITULO}                    { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "TITULO",yyline+"",yycolumn+""));
                                            return new Symbol(sym.TITULO, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {LABEL}                     { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "LABEL",yyline+"",yycolumn+""));
                                            return new Symbol(sym.LABEL, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {VALUES}                    { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "VALUES",yyline+"",yycolumn+""));
                                            return new Symbol(sym.VALUES, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {EJE}                       { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "EJE",yyline+"",yycolumn+""));
                                            return new Symbol(sym.EJE, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {PRX}                       { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "X",yyline+"",yycolumn+""));
                                            return new Symbol(sym.PRX, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {PRY}                       { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "Y",yyline+"",yycolumn+""));
                                            return new Symbol(sym.PRY, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {HISTOGRAM}                 { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "HISTOGRAM",yyline+"",yycolumn+""));
                                            return new Symbol(sym.HISTOGRAM, yyline, yycolumn,yytext());
                                        }                                                                                
<YYINITIAL> {DOSPUNTOS}                 { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), ":",yyline+"",yycolumn+""));
                                            return new Symbol(sym.DOSPUNTOS, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {PUNTOCOMA}                 { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), ";",yyline+"",yycolumn+""));
                                            return new Symbol(sym.PUNTOCOMA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {FLECHA}                    { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "<- | ->",yyline+"",yycolumn+""));
                                            return new Symbol(sym.FLECHA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {CORABRE}                   { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "[",yyline+"",yycolumn+""));
                                            return new Symbol(sym.CORABRE, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {CORCIERRA}                 { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "]",yyline+"",yycolumn+""));
                                            return new Symbol(sym.CORCIERRA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {ARROBA}                    { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "@",yyline+"",yycolumn+""));
                                            return new Symbol(sym.ARROBA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {PARABRE}                   { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "(",yyline+"",yycolumn+""));
                                            return new Symbol(sym.PARABRE, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {PARCIERRA}                 { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), ")",yyline+"",yycolumn+""));
                                            return new Symbol(sym.PARCIERRA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {COMA}                      { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), ",",yyline+"",yycolumn+""));
                                            return new Symbol(sym.COMA, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {IGUAL}                     { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "=",yyline+"",yycolumn+""));
                                            return new Symbol(sym.IGUAL, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {DECIMAL}                   { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "DECIMAL",yyline+"",yycolumn+""));
                                            return new Symbol(sym.DECIMAL, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {ID}                        { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "ID",yyline+"",yycolumn+""));
                                            return new Symbol(sym.ID, yyline, yycolumn,yytext());
                                        }

<YYINITIAL> {CADENA}                    { 
                                            Lexemas.add(new Recorrido("Lexema: "+yytext(), "CADENA",yyline+"",yycolumn+""));
                                            return new Symbol(sym.CADENA, yyline, yycolumn,yytext());
                                        }

//------------SE INGNORAN TODOS LOS COMENTARIOS Y ESPACIOS-------------------------------

<YYINITIAL>                             {SPACE} {}                                                              //Reconoce " " un espacio y no lo toma en cuenta

<YYINITIAL>                             {ENTER} {}                                                              //Reconoce un salto de linea y no lo toma en cuenta

<YYINITIAL> {ComentarioLinea} { System.out.println("COMENTARIO SIMPLE: " + yytext()); }

<YYINITIAL> {ComentarioBloque} { System.out.println("COMENTARIO MULTILINEA: " + yytext()); }




// ---------------------------------------------------- --------ERRORES---------------------------------------------------------------------------
<YYINITIAL> .                           { Errores.add(new Exception_ ("Léxico","El caracter : '"+yytext()+"' no pertenece al lenguaje StatPy Convertor", yyline+"",yycolumn+""));
                                        System.out.println("El caracter '"+yytext()+"' no pertenece al lenguaje");}                             