/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1_compi;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import Analizador.LexicalAnalysis;
import Analizador.parser;
import java.io.BufferedReader;
import java.io.StringReader;
import Errores.Exception_;
import java.util.ArrayList;

import Metodos.Graficas;
import Metodos.Mapas;
import Metodos.Recorrido;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class Ventana extends javax.swing.JFrame {
    
    ArrayList<Exception_> errores = new ArrayList();
    ArrayList<Recorrido> tokens = new ArrayList();
    /**
     * Creates new form Ventana
     */
    private int contadorPestanas = 1;
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    public Ventana() {
        initComponents();
    }
        public String AbrirArchivo(File archivo) {
        String contenido = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                contenido += caracter;

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return contenido;

    }

    public String GuardarArchivo(File archivo, String Contenido) {
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = Contenido.getBytes();
            salida.write(bytesTxt);
            mensaje = "El archivo se guardo con exito :)";
        } catch (Exception e) {
            System.out.println(e);
        }
        return mensaje;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nuevoTabbedPane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextEntrada = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConsolaSalida = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonEjecutar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        ArchivoMenu = new javax.swing.JMenu();
        NuevoButton = new javax.swing.JMenuItem();
        AbrirButton = new javax.swing.JMenuItem();
        GuardarButton = new javax.swing.JMenuItem();
        ComoButton = new javax.swing.JMenuItem();
        DeleteButton = new javax.swing.JMenuItem();
        ReportesMenu = new javax.swing.JMenu();
        ButtonTokens = new javax.swing.JMenuItem();
        ButtonErrores = new javax.swing.JMenuItem();
        ButtonTS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(TextEntrada);

        nuevoTabbedPane.addTab("Archivo", jScrollPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("Anterior");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Siguiente");

        ConsolaSalida.setColumns(20);
        ConsolaSalida.setRows(5);
        jScrollPane1.setViewportView(ConsolaSalida);

        jLabel1.setText("Consola");

        jLabel4.setText("Entrada");

        jLabel5.setText("Grafica");

        buttonEjecutar.setText("Ejecutar");
        buttonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevoTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevoTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(buttonEjecutar))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        ArchivoMenu.setText("Archivo");

        NuevoButton.setText("Nuevo Archivo");
        NuevoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoButtonActionPerformed(evt);
            }
        });
        ArchivoMenu.add(NuevoButton);

        AbrirButton.setText("Abrir Archivo");
        AbrirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirButtonActionPerformed(evt);
            }
        });
        ArchivoMenu.add(AbrirButton);

        GuardarButton.setText("Guardar");
        GuardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarButtonActionPerformed(evt);
            }
        });
        ArchivoMenu.add(GuardarButton);

        ComoButton.setText("Guardar Como");
        ComoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComoButtonActionPerformed(evt);
            }
        });
        ArchivoMenu.add(ComoButton);

        DeleteButton.setText("Eliminar Pestaña");
        ArchivoMenu.add(DeleteButton);

        jMenuBar2.add(ArchivoMenu);

        ReportesMenu.setText("Reportes");

        ButtonTokens.setText("Reporte de Tokens");
        ReportesMenu.add(ButtonTokens);

        ButtonErrores.setText("Reporte de Errores");
        ReportesMenu.add(ButtonErrores);

        ButtonTS.setText("Reporte Tabla de Simbolos");
        ReportesMenu.add(ButtonTS);

        jMenuBar2.add(ReportesMenu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoButtonActionPerformed
        TextEntrada.setText("");  // Limpiar el contenido del área de texto
        archivo = null;  // Establecer el archivo a null (no hay archivo abierto)
    }//GEN-LAST:event_NuevoButtonActionPerformed

    private void AbrirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirButtonActionPerformed
        //aqui va el codigo para el boton del menu archivo Abrir archivo
        if (seleccionar.showDialog(null, "Abrir Archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("df")) {
                    String contenidotxt = AbrirArchivo(archivo);
                    TextEntrada.setText(contenidotxt);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        }
        
    }//GEN-LAST:event_AbrirButtonActionPerformed

    private void buttonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEjecutarActionPerformed
        Analizador.LexicalAnalysis scan;
        Analizador.parser parse;
        try {
            // realizar el analisis lexico con el scanner
            scan = new LexicalAnalysis(new BufferedReader(new StringReader(TextEntrada.getText())));
            // sintactico con el parser
            parse = new parser(scan);
            parse.parse();
            errores.addAll(scan.Errores);
            errores.addAll(parse.getErrores());
            tokens.addAll(scan.Lexemas);
            System.out.println("------------------------------------\n\n");
            //Mapas.mostrarTodosLosArreglos();
            //graficas.mostrarGraficas();

            String result = "";
            for (int i = 0; i < parse.salidas.size(); i++) {
                result += parse.salidas.get(i) + '\n';
            }
            ConsolaSalida.setText(result);

            // SalidaText.setText("Analisis realizado correcatamente");
            // System.out.println("Analisis realizado correctamente");
            ConsolaSalida.setEditable(false);
            // generar reportes de errores lexicos

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_buttonEjecutarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Graficas.mostrarGraficas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GuardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarButtonActionPerformed
        if (archivo != null) {
            String contenido = TextEntrada.getText();
            String respuesta = GuardarArchivo(archivo, contenido);
            if (respuesta != null) {
                JOptionPane.showMessageDialog(null, "El archivo se guardó correctamente.", "Guardado Exitoso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay archivo abierto. Utilice 'Guardar Como'", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarButtonActionPerformed

    private void ComoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComoButtonActionPerformed
        if (seleccionar.showDialog(null, "GUARDAR COMO") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt") || archivo.getName().endsWith("sp") || archivo.getName().endsWith("json")) {
                String contenidotxt = TextEntrada.getText();
                String respuesta = GuardarArchivo(archivo, contenidotxt);
                if (respuesta != null) {
                    JOptionPane.showMessageDialog(null, respuesta);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar texto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El documento debe de guardar en formato sp o json");
            }
        }
    }//GEN-LAST:event_ComoButtonActionPerformed

        private void abrirNuevoTab() {
        JTabbedPane nuevoTabbedPane = new JTabbedPane();
        JTextPane nuevoTextPane = new JTextPane();

        // Aquí podrías abrir un archivo y cargar su contenido en nuevoTextPane

        nuevoTabbedPane.addTab("Pestaña " + contadorPestanas, new JScrollPane(nuevoTextPane));
        jPanel1.add(nuevoTabbedPane);
        contadorPestanas++;
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    private void agregarNuevoTab() {
        JTabbedPane nuevoTabbedPane = new JTabbedPane();
        JTextPane nuevoTextPane = new JTextPane();
        nuevoTabbedPane.addTab("Pestaña " + contadorPestanas, new JScrollPane(nuevoTextPane));
        jPanel1.add(nuevoTabbedPane);
        contadorPestanas++;
        jPanel1.revalidate();
        jPanel1.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrirButton;
    private javax.swing.JMenu ArchivoMenu;
    private javax.swing.JMenuItem ButtonErrores;
    private javax.swing.JMenuItem ButtonTS;
    private javax.swing.JMenuItem ButtonTokens;
    private javax.swing.JMenuItem ComoButton;
    private javax.swing.JTextArea ConsolaSalida;
    private javax.swing.JMenuItem DeleteButton;
    private javax.swing.JMenuItem GuardarButton;
    private javax.swing.JMenuItem NuevoButton;
    private javax.swing.JMenu ReportesMenu;
    private javax.swing.JTextPane TextEntrada;
    private javax.swing.JButton buttonEjecutar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane nuevoTabbedPane;
    // End of variables declaration//GEN-END:variables
}
