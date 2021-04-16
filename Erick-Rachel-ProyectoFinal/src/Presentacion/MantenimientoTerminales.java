
package Presentacion;

import Datos.*;
import Negocio.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MantenimientoTerminales extends javax.swing.JInternalFrame {

    Terminales terminal = new Terminales();
    Listas lista = new Listas();
    BDTerminales ter = new BDTerminales();
    DefaultTableModel modelo;

    public MantenimientoTerminales() {
        initComponents();
        setTitle("CREAR TERMINALES");
        llenar_combos();
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre de la Teminal");
        modelo.addColumn("Lugares");
        modelo.addColumn("Numero de terminal");
        this.tabla.setModel(modelo);

    }

    public void llenar_combos() {

        //Llenado de combo de lugares
        ArrayList<String> a = lista.leerLista_lugares();
        if (a.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, No hay datos en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < a.size(); i++) {
                cmbLugares.addItem(a.get(i));
            }
        }

        ArrayList<String> b = lista.leerLista_numterminales();
        if (b.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, No hay datos en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < b.size(); i++) {
                cmbNumTerminal.addItem(b.get(i));
            }
        }
    }

    public int generarNumeros() {
        int num = (int) Math.floor(Math.random() * 100 + 1);
        return num;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomterminal = new javax.swing.JLabel();
        lblLugares = new javax.swing.JLabel();
        lblNumTerminal = new javax.swing.JLabel();
        txtNomTerminal = new javax.swing.JTextField();
        cmbLugares = new javax.swing.JComboBox<>();
        cmbNumTerminal = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblFila = new javax.swing.JLabel();
        lblColumna = new javax.swing.JLabel();
        lblDatonew = new javax.swing.JLabel();
        txtFila = new javax.swing.JTextField();
        txtColumna = new javax.swing.JTextField();
        txtNuevoDato = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        lblNomterminal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblNomterminal.setText("Nombre de la Teminal:");

        lblLugares.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblLugares.setText("Lugares:");

        lblNumTerminal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblNumTerminal.setText("Numero de terminal:");

        btnCrear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear.png"))); // NOI18N
        btnCrear.setText("Crear Terminal");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        lblFila.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblFila.setText("Fila:");

        lblColumna.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblColumna.setText("Columna:");

        lblDatonew.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblDatonew.setText("Nuevo Dato:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNomterminal)
                                .addGap(18, 18, 18)
                                .addComponent(txtNomTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumTerminal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(lblLugares)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbNumTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblFila, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtFila, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblColumna)
                            .addComponent(lblDatonew))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomterminal)
                    .addComponent(txtNomTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFila)
                    .addComponent(txtFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLugares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLugares)
                    .addComponent(lblColumna)
                    .addComponent(txtColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatonew))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumTerminal)
                        .addComponent(cmbNumTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        String nomTerminal = txtNomTerminal.getText();
        String lugar = (String) cmbLugares.getSelectedItem();
        String NumTerminal = (String) cmbNumTerminal.getSelectedItem();
        String[] info = new String[3];
        info[0] = txtNomTerminal.getText();
        info[1] = (String) cmbLugares.getSelectedItem();
        info[2] = (String) cmbNumTerminal.getSelectedItem();
        modelo.addRow(info);

        String crearterminal = nomTerminal + "|" + lugar + "|" + NumTerminal;
        terminal.insertarTerminal_en_archivo(crearterminal);
        lista.llenarLista_terminales(crearterminal);
        JOptionPane.showMessageDialog(this, "Terminal Creada Correctamente");

        txtNomTerminal.setText("");
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar fila");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = Integer.parseInt(txtFila.getText());
        int columna = Integer.parseInt(txtColumna.getText());
        modelo.setValueAt(txtNuevoDato.getText(), fila, columna);
        
        txtFila.setText("");
        txtColumna.setText("");
        txtNuevoDato.setText("");
    }//GEN-LAST:event_btnModificarActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbLugares;
    private javax.swing.JComboBox<String> cmbNumTerminal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblColumna;
    private javax.swing.JLabel lblDatonew;
    private javax.swing.JLabel lblFila;
    private javax.swing.JLabel lblLugares;
    private javax.swing.JLabel lblNomterminal;
    private javax.swing.JLabel lblNumTerminal;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtColumna;
    private javax.swing.JTextField txtFila;
    private javax.swing.JTextField txtNomTerminal;
    private javax.swing.JTextField txtNuevoDato;
    // End of variables declaration//GEN-END:variables
}
