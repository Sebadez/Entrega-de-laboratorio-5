/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interdatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;

/**
 *
 * @author misra
 */
public class data extends javax.swing.JFrame {

   String linea;
   String datos[];
ArrayList<String> arrayList = new ArrayList<String>();
String lin;
   
    public data() {
        initComponents();
    }
   
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("GENERAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grafica Ingresos por servivios prestados 2020", "Grafica ingresos por operacion 2022", "Grafica otros ingresos operacionales 2021", "Grafica ingresos totales 2020", "Grafica ingresos totales 2021", "Grafica ingresos totales 2022" }));

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setText("GENERAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("GRAFICO TIPO TORTA");

        jLabel2.setText("GRAFICO DE BARRAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        try { // excepción
        
           File archivo= new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\encuesta (Recuperado).csv"); // objeto que lee el archivo
            
           Scanner in= new Scanner(archivo);
           while(in.hasNext()){ 
               linea=in.nextLine();
               datos=linea.split(";");
               arrayList.addAll(Arrays.asList(datos));
            
               
              
             
           }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, ex);
        }
     
 
     if(combo.getSelectedItem()=="Grafica Ingresos por servivios prestados 2020"){

      DefaultPieDataset pieDataset = new DefaultPieDataset();
      pieDataset.setValue("Enero", new Float(arrayList.get(0)));
      pieDataset.setValue("Febrero", new Float(arrayList.get(5)));
      pieDataset.setValue("Marzo", new Float(arrayList.get(10)));
      pieDataset.setValue("Abril", new Float(arrayList.get(15)));
      pieDataset.setValue("Mayo", new Float(arrayList.get(20)));
      pieDataset.setValue("Junio", new Float(arrayList.get(25)));
      pieDataset.setValue("Julio", new Float(arrayList.get(30)));
      pieDataset.setValue("Agosto", new Float(arrayList.get(35)));
      pieDataset.setValue("Septiembre", new Float(arrayList.get(40)));
      pieDataset.setValue("Octubre", new Float(arrayList.get(45)));
      pieDataset.setValue("Noviembre", new Float(arrayList.get(50)));
      pieDataset.setValue("Diciembre", new Float(arrayList.get(55)));
      JFreeChart chart = ChartFactory.createPieChart
      ("INGRESOS POR SERVICIOS PRESTADOS 2020", // Title
      pieDataset, // Dataset
      true, // Show legend
      true, // Use tooltips
      false // Configure chart to generate URLs?
      );
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\gr.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }
     
      if(combo.getSelectedItem()=="Grafica ingresos por operacion 2022"){

      DefaultPieDataset pieDataset = new DefaultPieDataset();
      pieDataset.setValue("Enero", new Float(arrayList.get(121)));
      pieDataset.setValue("Febrero", new Float(arrayList.get(126)));
      pieDataset.setValue("Marzo", new Float(arrayList.get(131)));
      pieDataset.setValue("Abril", new Float(arrayList.get(136)));
      pieDataset.setValue("Mayo", new Float(arrayList.get(141)));
      pieDataset.setValue("Junio", new Float(arrayList.get(146)));
      pieDataset.setValue("Julio", new Float(arrayList.get(151)));
      pieDataset.setValue("Agosto", new Float(arrayList.get(156)));
      pieDataset.setValue("Septiembre", new Float(arrayList.get(161)));
      pieDataset.setValue("Octubre", new Float(arrayList.get(166)));
      pieDataset.setValue("Noviembre", new Float(arrayList.get(171)));
      pieDataset.setValue("Diciembre", new Float(arrayList.get(176)));
      JFreeChart chart = ChartFactory.createPieChart
      ("INGRESOS POR OPERACION 2022", // Title
      pieDataset, // Dataset
      true, // Show legend
      true, // Use tooltips
      false // Configure chart to generate URLs?
      );
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\gr1.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }

        if(combo.getSelectedItem()=="Grafica otros ingresos operacionales 2021"){

      DefaultPieDataset pieDataset = new DefaultPieDataset();
      pieDataset.setValue("Enero", new Float(arrayList.get(62)));
      pieDataset.setValue("Febrero", new Float(arrayList.get(67)));
      pieDataset.setValue("Marzo", new Float(arrayList.get(72)));
      pieDataset.setValue("Abril", new Float(arrayList.get(77)));
      pieDataset.setValue("Mayo", new Float(arrayList.get(82)));
      pieDataset.setValue("Junio", new Float(arrayList.get(87)));
      pieDataset.setValue("Julio", new Float(arrayList.get(92)));
      pieDataset.setValue("Agosto", new Float(arrayList.get(97)));
      pieDataset.setValue("Septiembre", new Float(arrayList.get(102)));
      pieDataset.setValue("Octubre", new Float(arrayList.get(107)));
      pieDataset.setValue("Noviembre", new Float(arrayList.get(112)));
      pieDataset.setValue("Diciembre", new Float(arrayList.get(117)));
      JFreeChart chart = ChartFactory.createPieChart
      ("OTROS INGRESOS OPERACIONALES 2021", // Title
      pieDataset, // Dataset
      true, // Show legend
      true, // Use tooltips
      false // Configure chart to generate URLs?
      );
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\gr2.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }
        
        
     if(combo.getSelectedItem()=="Grafica ingresos totales 2020"){

      DefaultPieDataset pieDataset = new DefaultPieDataset();
      pieDataset.setValue("Enero", new Float(arrayList.get(3)));
      pieDataset.setValue("Febrero", new Float(arrayList.get(8)));
      pieDataset.setValue("Marzo", new Float(arrayList.get(13)));
      pieDataset.setValue("Abril", new Float(arrayList.get(18)));
      pieDataset.setValue("Mayo", new Float(arrayList.get(23)));
      pieDataset.setValue("Junio", new Float(arrayList.get(28)));
      pieDataset.setValue("Julio", new Float(arrayList.get(33)));
      pieDataset.setValue("Agosto", new Float(arrayList.get(38)));
      pieDataset.setValue("Septiembre", new Float(arrayList.get(43)));
      pieDataset.setValue("Octubre", new Float(arrayList.get(48)));
      pieDataset.setValue("Noviembre", new Float(arrayList.get(53)));
      pieDataset.setValue("Diciembre", new Float(arrayList.get(58)));
      JFreeChart chart = ChartFactory.createPieChart
      ("INGRESOS TOTALES 2020", // Title
      pieDataset, // Dataset
      true, // Show legend
      true, // Use tooltips
      false // Configure chart to generate URLs?
      );
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\gr3.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }
     
     if(combo.getSelectedItem()=="Grafica ingresos totales 2021"){

      DefaultPieDataset pieDataset = new DefaultPieDataset();
      pieDataset.setValue("Enero", new Float(arrayList.get(63)));
      pieDataset.setValue("Febrero", new Float(arrayList.get(68)));
      pieDataset.setValue("Marzo", new Float(arrayList.get(73)));
      pieDataset.setValue("Abril", new Float(arrayList.get(78)));
      pieDataset.setValue("Mayo", new Float(arrayList.get(83)));
      pieDataset.setValue("Junio", new Float(arrayList.get(88)));
      pieDataset.setValue("Julio", new Float(arrayList.get(93)));
      pieDataset.setValue("Agosto", new Float(arrayList.get(98)));
      pieDataset.setValue("Septiembre", new Float(arrayList.get(103)));
      pieDataset.setValue("Octubre", new Float(arrayList.get(108)));
      pieDataset.setValue("Noviembre", new Float(arrayList.get(113)));
      pieDataset.setValue("Diciembre", new Float(arrayList.get(118)));
      JFreeChart chart = ChartFactory.createPieChart
      ("INGRESOS TOTALES 2021", // Title
      pieDataset, // Dataset
      true, // Show legend
      true, // Use tooltips
      false // Configure chart to generate URLs?
      );
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\gr4.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }
     
      if(combo.getSelectedItem()=="Grafica ingresos totales 2022"){

      DefaultPieDataset pieDataset = new DefaultPieDataset();
      pieDataset.setValue("Enero", new Float(arrayList.get(123)));
      pieDataset.setValue("Febrero", new Float(arrayList.get(128)));
      pieDataset.setValue("Marzo", new Float(arrayList.get(133)));
      pieDataset.setValue("Abril", new Float(arrayList.get(138)));
      pieDataset.setValue("Mayo", new Float(arrayList.get(143)));
      pieDataset.setValue("Junio", new Float(arrayList.get(148)));
      pieDataset.setValue("Julio", new Float(arrayList.get(153)));
      pieDataset.setValue("Agosto", new Float(arrayList.get(158)));
      pieDataset.setValue("Septiembre", new Float(arrayList.get(163)));
      pieDataset.setValue("Octubre", new Float(arrayList.get(168)));
      pieDataset.setValue("Noviembre", new Float(arrayList.get(173)));
      pieDataset.setValue("Diciembre", new Float(arrayList.get(178)));
      JFreeChart chart = ChartFactory.createPieChart
      ("INGRESOS TOTALES 2022", // Title
      pieDataset, // Dataset
      true, // Show legend
      true, // Use tooltips
      false // Configure chart to generate URLs?
      );
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\gr5.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }
     
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try { // excepción
        
           File archivo= new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\encuesta (Recuperado).csv"); // objeto que lee el archivo
            
           Scanner in= new Scanner(archivo);
           while(in.hasNext()){ 
               linea=in.nextLine();
               datos=linea.split(";");
               arrayList.addAll(Arrays.asList(datos));
            
               
              
             
           }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      if(combo.getSelectedItem()=="Grafica Ingresos por servivios prestados 2020"){

     
      dataset.setValue(new Float(arrayList.get(0)),"INGRESOS","E");
      dataset.setValue(new Float(arrayList.get(5)),"INGRESOS","F");
      dataset.setValue(new Float(arrayList.get(10)),"INGRESOS","MAR");
      dataset.setValue(new Float(arrayList.get(15)),"INGRESOS","A");
      dataset.setValue(new Float(arrayList.get(20)),"INGRESOS","MAY");
      dataset.setValue(new Float(arrayList.get(25)),"INGRESOS","JUN");
      dataset.setValue(new Float(arrayList.get(30)),"INGRESOS","JUL");
      dataset.setValue(new Float(arrayList.get(35)),"INGRESOS","AG");
      dataset.setValue(new Float(arrayList.get(40)),"IMPUESTOS","S");
      dataset.setValue(new Float(arrayList.get(45)),"INGRESOS","O");
      dataset.setValue(new Float(arrayList.get(50)),"IMPUESTOS","N");
      dataset.setValue(new Float(arrayList.get(55)),"IMPUESTOS","D");
     JFreeChart chart = ChartFactory.createBarChart("INGRESOS SERVICIOS PRESTADOS 2020",
     "MES", "INGRESOS", dataset, PlotOrientation.VERTICAL,
      false, true, false);
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\fr.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }
      
     if(combo.getSelectedItem()=="Grafica ingresos por operacion 2022"){

     
      dataset.setValue(new Float(arrayList.get(121)),"INGRESOS","E");
      dataset.setValue(new Float(arrayList.get(126)),"INGRESOS","F");
      dataset.setValue(new Float(arrayList.get(131)),"INGRESOS","MAR");
      dataset.setValue(new Float(arrayList.get(136)),"INGRESOS","A");
      dataset.setValue(new Float(arrayList.get(141)),"INGRESOS","MAY");
      dataset.setValue(new Float(arrayList.get(146)),"INGRESOS","JUN");
      dataset.setValue(new Float(arrayList.get(151)),"INGRESOS","JUL");
      dataset.setValue(new Float(arrayList.get(156)),"INGRESOS","AG");
      dataset.setValue(new Float(arrayList.get(161)),"IMPUESTOS","S");
      dataset.setValue(new Float(arrayList.get(166)),"INGRESOS","O");
      dataset.setValue(new Float(arrayList.get(171)),"IMPUESTOS","N");
      dataset.setValue(new Float(arrayList.get(176)),"IMPUESTOS","D");
     JFreeChart chart = ChartFactory.createBarChart("INGRESOS POR OPERACION 2022",
     "MES", "INGRESOS", dataset, PlotOrientation.VERTICAL,
      false, true, false);
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\fr1.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }
     
     if(combo.getSelectedItem()=="Grafica otros ingresos operacionales 2021"){

     
      dataset.setValue(new Float(arrayList.get(62)),"INGRESOS","E");
      dataset.setValue(new Float(arrayList.get(67)),"INGRESOS","F");
      dataset.setValue(new Float(arrayList.get(72)),"INGRESOS","MAR");
      dataset.setValue(new Float(arrayList.get(77)),"INGRESOS","A");
      dataset.setValue(new Float(arrayList.get(82)),"INGRESOS","MAY");
      dataset.setValue(new Float(arrayList.get(87)),"INGRESOS","JUN");
      dataset.setValue(new Float(arrayList.get(92)),"INGRESOS","JUL");
      dataset.setValue(new Float(arrayList.get(97)),"INGRESOS","AG");
      dataset.setValue(new Float(arrayList.get(102)),"IMPUESTOS","S");
      dataset.setValue(new Float(arrayList.get(107)),"INGRESOS","O");
      dataset.setValue(new Float(arrayList.get(112)),"IMPUESTOS","N");
      dataset.setValue(new Float(arrayList.get(117)),"IMPUESTOS","D");
     JFreeChart chart = ChartFactory.createBarChart("OTROS INGRESOS OPERACIONALES 2021",
     "MES", "INGRESOS", dataset, PlotOrientation.VERTICAL,
      false, true, false);
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\fr2.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }
       
     
      if(combo.getSelectedItem()=="Grafica ingresos totales 2020"){

     
      dataset.setValue(new Float(arrayList.get(3)),"INGRESOS","E");
      dataset.setValue(new Float(arrayList.get(8)),"INGRESOS","F");
      dataset.setValue(new Float(arrayList.get(13)),"INGRESOS","MAR");
      dataset.setValue(new Float(arrayList.get(18)),"INGRESOS","A");
      dataset.setValue(new Float(arrayList.get(23)),"INGRESOS","MAY");
      dataset.setValue(new Float(arrayList.get(28)),"INGRESOS","JUN");
      dataset.setValue(new Float(arrayList.get(33)),"INGRESOS","JUL");
      dataset.setValue(new Float(arrayList.get(38)),"INGRESOS","AG");
      dataset.setValue(new Float(arrayList.get(43)),"IMPUESTOS","S");
      dataset.setValue(new Float(arrayList.get(48)),"INGRESOS","O");
      dataset.setValue(new Float(arrayList.get(53)),"IMPUESTOS","N");
      dataset.setValue(new Float(arrayList.get(58)),"IMPUESTOS","D");
     JFreeChart chart = ChartFactory.createBarChart("INGRESOS TOTALES 2020",
     "MES", "INGRESOS", dataset, PlotOrientation.VERTICAL,
      false, true, false);
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\fr3.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }
      
      if(combo.getSelectedItem()=="Grafica ingresos totales 2021"){

     
      dataset.setValue(new Float(arrayList.get(63)),"INGRESOS","E");
      dataset.setValue(new Float(arrayList.get(68)),"INGRESOS","F");
      dataset.setValue(new Float(arrayList.get(73)),"INGRESOS","MAR");
      dataset.setValue(new Float(arrayList.get(78)),"INGRESOS","A");
      dataset.setValue(new Float(arrayList.get(83)),"INGRESOS","MAY");
      dataset.setValue(new Float(arrayList.get(88)),"INGRESOS","JUN");
      dataset.setValue(new Float(arrayList.get(93)),"INGRESOS","JUL");
      dataset.setValue(new Float(arrayList.get(98)),"INGRESOS","AG");
      dataset.setValue(new Float(arrayList.get(103)),"IMPUESTOS","S");
      dataset.setValue(new Float(arrayList.get(108)),"INGRESOS","O");
      dataset.setValue(new Float(arrayList.get(113)),"IMPUESTOS","N");
      dataset.setValue(new Float(arrayList.get(118)),"IMPUESTOS","D");
     JFreeChart chart = ChartFactory.createBarChart("INGRESOS TOTALES 2021",
     "MES", "INGRESOS", dataset, PlotOrientation.VERTICAL,
      false, true, false);
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\fr4.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }
      
      if(combo.getSelectedItem()=="Grafica ingresos totales 2022"){

     
      dataset.setValue(new Float(arrayList.get(123)),"INGRESOS","E");
      dataset.setValue(new Float(arrayList.get(128)),"INGRESOS","F");
      dataset.setValue(new Float(arrayList.get(133)),"INGRESOS","MAR");
      dataset.setValue(new Float(arrayList.get(138)),"INGRESOS","A");
      dataset.setValue(new Float(arrayList.get(143)),"INGRESOS","MAY");
      dataset.setValue(new Float(arrayList.get(148)),"INGRESOS","JUN");
      dataset.setValue(new Float(arrayList.get(153)),"INGRESOS","JUL");
      dataset.setValue(new Float(arrayList.get(158)),"INGRESOS","AG");
      dataset.setValue(new Float(arrayList.get(163)),"IMPUESTOS","S");
      dataset.setValue(new Float(arrayList.get(168)),"INGRESOS","O");
      dataset.setValue(new Float(arrayList.get(173)),"IMPUESTOS","N");
      dataset.setValue(new Float(arrayList.get(178)),"IMPUESTOS","D");
     JFreeChart chart = ChartFactory.createBarChart("INGRESOS TOTALES 2022",
     "MES", "INGRESOS", dataset, PlotOrientation.VERTICAL,
      false, true, false);
      try {
      ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\misra\\OneDrive\\Documentos\\Programacion 3\\Interdatos\\fr5.jpg"), chart, 500, 300);
      } catch (Exception e) {
      System.out.println("Problem occurred creating chart.");
      }
     }
    }//GEN-LAST:event_jButton2ActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
