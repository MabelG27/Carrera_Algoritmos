package carrera_de_algoritmos;

import carrera_de_algoritmos.Algoritmos.Alg_Burb_Bid;
import carrera_de_algoritmos.Algoritmos.Alg_QuickSort;
import carrera_de_algoritmos.Algoritmos.Alg_Burbuja;
import carrera_de_algoritmos.Algoritmos.Alg_Insercion;
import static carrera_de_algoritmos.Algoritmos.arreglo;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Mabel
 */
public class Interfaz_Grafica extends javax.swing.JFrame {

    public Interfaz_Grafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSecuencial = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtVector = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtQuickSort = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtInsercion = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtBurbuja = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLlenar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        BtnIniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtTimeInser = new javax.swing.JLabel();
        txtTimeSec = new javax.swing.JLabel();
        txtTimeQuick = new javax.swing.JLabel();
        txtTimeBurb = new javax.swing.JLabel();
        txtMemoInser = new javax.swing.JLabel();
        txtMemoBurb = new javax.swing.JLabel();
        txtMemoQuick = new javax.swing.JLabel();
        txtMemoSec = new javax.swing.JLabel();
        txtCpuBB = new javax.swing.JLabel();
        txtCpuInser = new javax.swing.JLabel();
        txtCpuQuick = new javax.swing.JLabel();
        txtCpuBurb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(153, 204, 255));

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("Vector");

        txtSecuencial.setEditable(false);
        txtSecuencial.setBackground(new java.awt.Color(204, 204, 204));
        txtSecuencial.setColumns(20);
        txtSecuencial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSecuencial.setForeground(new java.awt.Color(0, 102, 153));
        txtSecuencial.setRows(5);
        jScrollPane1.setViewportView(txtSecuencial);

        txtVector.setEditable(false);
        txtVector.setBackground(new java.awt.Color(204, 204, 204));
        txtVector.setColumns(20);
        txtVector.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtVector.setRows(5);
        jScrollPane2.setViewportView(txtVector);

        txtQuickSort.setEditable(false);
        txtQuickSort.setBackground(new java.awt.Color(204, 204, 204));
        txtQuickSort.setColumns(20);
        txtQuickSort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQuickSort.setForeground(new java.awt.Color(0, 102, 153));
        txtQuickSort.setRows(5);
        jScrollPane3.setViewportView(txtQuickSort);

        txtInsercion.setEditable(false);
        txtInsercion.setBackground(new java.awt.Color(204, 204, 204));
        txtInsercion.setColumns(20);
        txtInsercion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtInsercion.setForeground(new java.awt.Color(0, 102, 153));
        txtInsercion.setRows(5);
        jScrollPane4.setViewportView(txtInsercion);

        txtBurbuja.setEditable(false);
        txtBurbuja.setBackground(new java.awt.Color(204, 204, 204));
        txtBurbuja.setColumns(20);
        txtBurbuja.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBurbuja.setForeground(new java.awt.Color(0, 102, 153));
        txtBurbuja.setRows(5);
        jScrollPane5.setViewportView(txtBurbuja);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ordenamiento por Inserción");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ordenamiento Burbuja   Bidireccional");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Ordenamiento QuickSort");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ordenamiento Burbuja");

        btnLlenar.setBackground(new java.awt.Color(0, 153, 153));
        btnLlenar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLlenar.setText("Generar Vector");
        btnLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(0, 153, 153));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevo.setText("Nueva");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        BtnIniciar.setBackground(new java.awt.Color(0, 153, 153));
        BtnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnIniciar.setText("Iniciar");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 153, 153));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtTimeInser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimeInser.setForeground(new java.awt.Color(153, 0, 0));
        txtTimeInser.setText("Tiempo: 0.0 ms");

        txtTimeSec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimeSec.setForeground(new java.awt.Color(153, 0, 0));
        txtTimeSec.setText("Tiempo: 0.0 ms");

        txtTimeQuick.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimeQuick.setForeground(new java.awt.Color(153, 0, 0));
        txtTimeQuick.setText("Tiempo: 0.0 ms");

        txtTimeBurb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTimeBurb.setForeground(new java.awt.Color(153, 0, 0));
        txtTimeBurb.setText("Tiempo: 0.0 ms");

        txtMemoInser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMemoInser.setForeground(new java.awt.Color(153, 0, 0));
        txtMemoInser.setText("Memoria consumida: 0.0 KB");

        txtMemoBurb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMemoBurb.setForeground(new java.awt.Color(153, 0, 0));
        txtMemoBurb.setText("Memoria consumida: 0.0 KB");

        txtMemoQuick.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMemoQuick.setForeground(new java.awt.Color(153, 0, 0));
        txtMemoQuick.setText("Memoria consumida: 0.0 KB");

        txtMemoSec.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMemoSec.setForeground(new java.awt.Color(153, 0, 0));
        txtMemoSec.setText("Memoria consumida: 0.0 KB");

        txtCpuBB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCpuBB.setForeground(new java.awt.Color(153, 0, 0));
        txtCpuBB.setText("CPU time: 0.0 ns");

        txtCpuInser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCpuInser.setForeground(new java.awt.Color(153, 0, 0));
        txtCpuInser.setText("CPU time:: 0.0 ns");
        txtCpuInser.setToolTipText("");

        txtCpuQuick.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCpuQuick.setForeground(new java.awt.Color(153, 0, 0));
        txtCpuQuick.setText("CPU time: 0.0 ns");

        txtCpuBurb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCpuBurb.setForeground(new java.awt.Color(153, 0, 0));
        txtCpuBurb.setText("CPU time: 0.0 ns");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLlenar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimeInser)
                            .addComponent(txtMemoInser)
                            .addComponent(txtCpuInser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTimeSec)
                                .addComponent(txtMemoSec)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(txtCpuBB))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimeQuick)
                            .addComponent(txtMemoQuick)
                            .addComponent(txtCpuQuick))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpuBurb)
                            .addComponent(txtTimeBurb)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemoBurb))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimeInser)
                            .addComponent(txtTimeSec)
                            .addComponent(txtTimeQuick)
                            .addComponent(txtTimeBurb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMemoInser)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMemoBurb)
                                .addComponent(txtMemoQuick)
                                .addComponent(txtMemoSec)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCpuInser)
                                .addComponent(txtCpuBB))
                            .addComponent(txtCpuQuick)
                            .addComponent(txtCpuBurb)))
                    .addComponent(btnLlenar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed

        String vector = txtVector.getText();
        if (vector.equals("")) {

            JOptionPane.showMessageDialog(null, "No se ha declarado ningún vector");
            Limpiar();

        } else {

            Alg_Insercion AI = new Alg_Insercion();
            AI.start();

            Alg_Burbuja AB = new Alg_Burbuja();
            AB.start();

            Alg_Burb_Bid ABB = new Alg_Burb_Bid();
            ABB.start();

            Alg_QuickSort AQ = new Alg_QuickSort();
            AQ.start();

            DecimalFormat formatea = new DecimalFormat("###,###.##");
            ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();

            for (Long threadID : threadMXBean.getAllThreadIds()) {
                ThreadInfo info = threadMXBean.getThreadInfo(threadID);
                System.out.println("Thread name: " + info.getThreadName());
                System.out.println("Thread State: " + info.getThreadState());
                System.out.println(String.format("CPU time: %s ns",
                        threadMXBean.getThreadCpuTime(threadID)));

                if (info.getThreadName().equals("Thread-0")) {

                    txtCpuInser.setText(String.format("CPU time: %s ns",
                            formatea.format(threadMXBean.getThreadCpuTime(threadID))));

                } else if (info.getThreadName().equals("Thread-1")) {

                    txtCpuBurb.setText(String.format("CPU time: %s ns",
                            formatea.format(threadMXBean.getThreadCpuTime(threadID))));

                } else if (info.getThreadName().equals("Thread-2")) {

                    txtCpuBB.setText(String.format("CPU time: %s ns",
                            formatea.format(threadMXBean.getThreadCpuTime(threadID))));

                } else if (info.getThreadName().equals("Thread-3")) {

                    txtCpuQuick.setText(String.format("CPU time: %s ns",
                            formatea.format(threadMXBean.getThreadCpuTime(threadID))));
                }

            }

        }
    }//GEN-LAST:event_BtnIniciarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarActionPerformed

        LLenar_Arreglo();
    }//GEN-LAST:event_btnLlenarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Grafica().setVisible(true);
            }
        });
    }

    //Funcion para limpiar los campos
    public void Limpiar() {
        txtInsercion.setText("");
        txtBurbuja.setText("");
        txtQuickSort.setText("");
        txtSecuencial.setText("");
        txtVector.setText("");
        txtTimeBurb.setText("Tiempo: 0.0 ms");
        txtTimeInser.setText("Tiempo: 0.0 ms");
        txtTimeQuick.setText("Tiempo: 0.0 ms");
        txtTimeSec.setText("Tiempo: 0.0 ms");
        txtMemoInser.setText("Memoria consumida: 0.0 KB");
        txtMemoBurb.setText("Memoria consumida: 0.0 KB");
        txtMemoQuick.setText("Memoria consumida: 0.0 KB");
        txtMemoSec.setText("Memoria consumida: 0.0 KB");
        txtCpuInser.setText("CPU time:: 0.0 ns");
        txtCpuBB.setText("CPU time: 0.0 ns");
        txtCpuBurb.setText("CPU time:: 0.0 ns");
        txtCpuQuick.setText("CPU time:: 0.0 ns");
    }

    //Función para llenar el arreglo
    public void LLenar_Arreglo() {

        String valores = "";

        for (int i = 0; i < arreglo.length; i++) {

            for (int j = 0; j <= i; j++) {

                arreglo[i] = (int) (Math.random() * 1000);

            }

        }

        for (int i = 0; i < arreglo.length; i++) {
            valores += arreglo[i] + " | ";
            txtVector.setText(valores);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JButton btnLlenar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    public static javax.swing.JTextArea txtBurbuja;
    public static javax.swing.JLabel txtCpuBB;
    public static javax.swing.JLabel txtCpuBurb;
    public static javax.swing.JLabel txtCpuInser;
    public static javax.swing.JLabel txtCpuQuick;
    public static javax.swing.JTextArea txtInsercion;
    public static javax.swing.JLabel txtMemoBurb;
    public static javax.swing.JLabel txtMemoInser;
    public static javax.swing.JLabel txtMemoQuick;
    public static javax.swing.JLabel txtMemoSec;
    public static javax.swing.JTextArea txtQuickSort;
    public static javax.swing.JTextArea txtSecuencial;
    public static javax.swing.JLabel txtTimeBurb;
    public static javax.swing.JLabel txtTimeInser;
    public static javax.swing.JLabel txtTimeQuick;
    public static javax.swing.JLabel txtTimeSec;
    private javax.swing.JTextArea txtVector;
    // End of variables declaration//GEN-END:variables
}
