/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicoo4;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author xiana
 */
public class FormularioAlumnoVista extends javax.swing.JInternalFrame {

    static HashSet<Alumno> alumnos;

    /**
     * Creates new form FormularioAlumnoVista
     */
    public FormularioAlumnoVista(HashSet<Alumno>alumnos) {
        initComponents();
        this.alumnos = alumnos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtLegajo = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Formulario de Alumnos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Legajo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Nombre:");

        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-check-mark-48.png"))); // NOI18N
        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-product-48.png"))); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.setMaximumSize(new java.awt.Dimension(79, 25));
        jbSalir.setMinimumSize(new java.awt.Dimension(79, 25));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jGuardar)
                .addGap(18, 18, 18)
                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtLegajo)
                            .addComponent(jtApellido)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        jtLegajo.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        try {
            int legajo = Integer.parseInt(jtLegajo.getText());
            
            if (jtApellido.getText().isEmpty()||jtNombre.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this, "No se permiten campos vacíos.");
                 return;
            }    
            String apellido = jtApellido.getText();
            String nombre = jtNombre.getText();
        
        Alumno alumno = new Alumno (legajo, apellido, nombre);
        if (alumnos.add(alumno)){
            JOptionPane.showMessageDialog(this, "El alumno se cargó correctamente.");
            }else{
            JOptionPane.showMessageDialog(this, "El número de legajo no admite duplicados.");
        };
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "La matrícula debe ser un número entero.");
        }  
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtLegajo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
