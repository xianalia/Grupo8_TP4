/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicoo4;

import java.util.HashSet;
import javax.swing.JOptionPane;
import static practicoo4.FormularioInscripcionVista.alumnos;

/**
 *
 * @author xiana
 */
public class ConsultaVista extends javax.swing.JInternalFrame {

    static HashSet<Alumno>alumnos;
    static HashSet<Materia>materias;
    
    public ConsultaVista(HashSet<Alumno>alumnos,HashSet<Materia>materias) {
        initComponents();
        this.alumnos = alumnos;
        this.materias = materias;
        cargarComboAlumno();
        
        
        
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
        jcbAlumnoMostrar = new javax.swing.JComboBox<>();
        jlMateriasText = new javax.swing.JLabel();
        jbMostrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlMaterias = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Consulta de alumnos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Elija el alumno:");

        jlMateriasText.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jbMostrar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-check-mark-48.png"))); // NOI18N
        jbMostrar.setText("Mostrar");
        jbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostrarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.setPreferredSize(new java.awt.Dimension(59, 25));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlMaterias.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlMaterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jlMateriasText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jbMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbAlumnoMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jcbAlumnoMostrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlMateriasText)
                .addGap(1, 1, 1)
                .addComponent(jlMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostrarActionPerformed
        // TODO add your handling code here:
        Alumno seleccionado = (Alumno) jcbAlumnoMostrar.getSelectedItem();
        
        String mater = seleccionado.getMaterias().toString();
        jlMateriasText.setText("Materias en las que está inscripto:");
        jlMaterias.setText(mater);     
    }//GEN-LAST:event_jbMostrarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed
    
    public void cargarComboAlumno(){
        for (Alumno alumno:alumnos){
            jcbAlumnoMostrar.addItem(alumno);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbMostrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnoMostrar;
    private javax.swing.JLabel jlMaterias;
    private javax.swing.JLabel jlMateriasText;
    // End of variables declaration//GEN-END:variables
}
