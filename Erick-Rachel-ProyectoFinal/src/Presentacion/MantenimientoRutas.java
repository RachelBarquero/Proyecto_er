package Presentacion;

import Negocio.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MantenimientoRutas extends javax.swing.JInternalFrame {

    Listas lista = new Listas();
    Rutas ruta = new Rutas();
    DefaultTableModel modelo;

    public MantenimientoRutas() {
        initComponents();
        setTitle("CREAR RUTAS");
        llenar_combos();
        modelo = new DefaultTableModel();
        modelo.addColumn("Lugar");
        modelo.addColumn("Precio de la ruta");
        modelo.addColumn("Fecha y hora de salida");
        modelo.addColumn("Terminal salida");
        modelo.addColumn("Fecha y hora de llegada");
        modelo.addColumn("Terminal llegada");
        this.Tabla.setModel(modelo);
    }

    public void llenar_combos() {

        //Llenado de combo de lugares
        ArrayList<String> a = lista.leerLista_lugares();
        if (a.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, No hay datos en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < a.size(); i++) {
                cmblugares.addItem(a.get(i));
            }
        }
        //Llenado de combo de terminales
        ArrayList<String> ae = lista.leerLista_numterminales();
        if (ae.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, No hay datos en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < ae.size(); i++) {
                cmbterminalLlegada.addItem(ae.get(i));
                cmbterminalSalida.addItem(ae.get(i));
            }
        }
    }

    public String fecha_salida() {
        Date fecha = fechasalida.getDate();
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fs = formato.format(fecha);
        return fs;
    }

    public String fecha_llegada() {
        Date fecha = fechallegada.getDate();
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fl = formato.format(fecha);
        return fl;
    }

    public String hora_salida() {

        String h = spihorasalida.getValue().toString();
        String m = spiminutossalida.getValue().toString();
        String ho = spihorariosalida.getValue().toString();

        String hs = h + ":" + m + " " + ho;
        return hs;
    }

    public String hora_llegada() {

        String h = horallegada.getValue().toString();
        String m = spiminutosllegada.getValue().toString();
        String ho = spihorariollegada.getValue().toString();

        String hl = h + ":" + m + " " + ho;
        return hl;
    }

    public String duracion() {

        int hora_s = (int) spihorasalida.getValue();
        int hora_l = (int) horallegada.getValue();

        int min_s = (int) spiminutossalida.getValue();
        int min_l = (int) spiminutosllegada.getValue();

        int ds = fechasalida.getCalendar().get(Calendar.DAY_OF_MONTH);
        int dll = fechallegada.getCalendar().get(Calendar.DAY_OF_MONTH);

        int dia = ds - dll;

        if (dia < 0) {
            dia = dia * -1;
        }

        int horas = hora_l - hora_s;
        int minutos = min_l - min_s;

        if (horas < 0) {
            horas = horas * -1;
        }

        if (minutos < 0) {
            minutos = minutos * -1;
        }

        validacion(hora_l, hora_s, min_l, min_s);

        return dia + " dias " + horas + " horas y " + minutos + " minutos";

    }

    public void validacion(int hora_l, int hora_s, int min_l, int min_s) {

        String hs = spihorariosalida.getValue().toString();
        String hl = spihorariollegada.getValue().toString();

        String fs = fecha_salida();
        String fl = fecha_llegada();

        if (fs.equals(fl)) {
            if (hora_s >= hora_l && min_s >= min_l && hs.equals(hl)) {
                JOptionPane.showMessageDialog(null, "Error, revise correctamente las horas correspondientes "
                        + "y las fechas correspondientes, de la ruta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public String asignacion_unidad(String idv) {
        String ida = lista.asignacionUnidad(idv);
        return ida;
    }

    public String asignacion(String a) {
        String id = lista.asignacion_ID(a);
        return id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmblugares = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        fechasalida = new com.toedter.calendar.JDateChooser();
        spihorasalida = new javax.swing.JSpinner();
        spiminutossalida = new javax.swing.JSpinner();
        spihorariosalida = new javax.swing.JSpinner();
        cmbterminalSalida = new javax.swing.JComboBox<>();
        fechallegada = new com.toedter.calendar.JDateChooser();
        horallegada = new javax.swing.JSpinner();
        spiminutosllegada = new javax.swing.JSpinner();
        spihorariollegada = new javax.swing.JSpinner();
        cmbterminalLlegada = new javax.swing.JComboBox<>();
        btnCrearRuta = new javax.swing.JButton();
        lblLugares = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblFHsalida = new javax.swing.JLabel();
        lblTermiSalida = new javax.swing.JLabel();
        lblFHllegada = new javax.swing.JLabel();
        lblTermiLlgada = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblFlia = new javax.swing.JLabel();
        lblColumna = new javax.swing.JLabel();
        lblDatonew = new javax.swing.JLabel();
        txtFila = new javax.swing.JTextField();
        txtColumna = new javax.swing.JTextField();
        txtNuevoDato = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(cmblugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 150, -1));

        txtPrecio.setText("₡");
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, -1));
        jPanel1.add(fechasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 150, -1));

        spihorasalida.setModel(new javax.swing.SpinnerNumberModel(1, 0, 24, 1));
        jPanel1.add(spihorasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 50, -1));

        spiminutossalida.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spiminutossalida.setToolTipText("");
        jPanel1.add(spiminutossalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 50, -1));

        spihorariosalida.setModel(new javax.swing.SpinnerListModel(new String[] {"am", "pm"}));
        jPanel1.add(spihorariosalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 50, -1));

        jPanel1.add(cmbterminalSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 390, -1));
        jPanel1.add(fechallegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 150, -1));

        horallegada.setModel(new javax.swing.SpinnerNumberModel(1, 0, 24, 1));
        jPanel1.add(horallegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 50, -1));

        spiminutosllegada.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel1.add(spiminutosllegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 50, -1));

        spihorariollegada.setModel(new javax.swing.SpinnerListModel(new String[] {"am", "pm"}));
        jPanel1.add(spihorariollegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 50, -1));

        jPanel1.add(cmbterminalLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 390, -1));

        btnCrearRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear.png"))); // NOI18N
        btnCrearRuta.setText("Crear Ruta");
        btnCrearRuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearRutaMouseClicked(evt);
            }
        });
        btnCrearRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRutaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 183, -1));

        lblLugares.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblLugares.setText("Lugares:");
        jPanel1.add(lblLugares, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPrecio.setText("Precio de la ruta:");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 20));

        lblFHsalida.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblFHsalida.setText("Fecha y Hora de Salida:");
        jPanel1.add(lblFHsalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, -1));

        lblTermiSalida.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTermiSalida.setText("Terminal de Salida:");
        jPanel1.add(lblTermiSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lblFHllegada.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblFHllegada.setText("Fecha y Hora de Llegada:");
        jPanel1.add(lblFHllegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        lblTermiLlgada.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTermiLlgada.setText("Terminal de Llegada:");
        jPanel1.add(lblTermiLlgada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 750, 230));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 190, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 170, -1));

        lblFlia.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblFlia.setText("Fila:");
        jPanel1.add(lblFlia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        lblColumna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblColumna.setText("Columna:");
        jPanel1.add(lblColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 70, -1));

        lblDatonew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDatonew.setText("Nuevo Dato:");
        jPanel1.add(lblDatonew, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        txtFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 190, -1));
        jPanel1.add(txtColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 190, 20));
        jPanel1.add(txtNuevoDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRutaActionPerformed

        String a = (String) cmblugares.getSelectedItem();
        String p = txtPrecio.getText();
        String fs = fecha_salida();
        String hs = hora_salida();
        String fl = fecha_llegada();
        String hl = hora_llegada();
        String as = (String) cmbterminalSalida.getSelectedItem();
        String al = (String) cmbterminalLlegada.getSelectedItem();
        String d = duracion();
        String ida = asignacion(a);
        String idar = asignacion_unidad(ida);
        String[] info = new String[6];
        info[0] = (String) cmblugares.getSelectedItem();
        info[1] = txtPrecio.getText();
        info[2] = fecha_salida()+ hora_salida();
        info[3] = (String) cmbterminalSalida.getSelectedItem();
        info[4] = fecha_llegada()+ hora_llegada();
        info[5] = (String) cmbterminalLlegada.getSelectedItem();
        modelo.addRow(info);

        if (ida.equals("n")) {
            JOptionPane.showMessageDialog(null, "Error, no hay unidades disponibles para esta terminal", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (d.equals("error")) {
            JOptionPane.showMessageDialog(null, "Error, revise correctamente las horas correspondientes, de la ruta", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (as.equals(al)) {
            JOptionPane.showMessageDialog(null, "Error, No puedes elegir la misma terminal de LLegada en la terminal de Salida", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (fechasalida.getDate() == null && fechallegada.getDate() == null && txtPrecio.getText().equals("₡")) {
            JOptionPane.showMessageDialog(null, "Error, No puedes dejar espacios en blanco", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String v = ida + "|" + p + "|" + fs + "|" + hs + "|" + as + "|" + fl + "|" + hl + "|" + al + "|" + d + "/" + idar;
            ruta.insertarRuta_en_archivo(v);
            lista.llenarLista_rutas(v);
            JOptionPane.showMessageDialog(this, "Ruta Creada Correctamente");
        }
        
        txtPrecio.setText("");
    }//GEN-LAST:event_btnCrearRutaActionPerformed

    private void btnCrearRutaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearRutaMouseClicked


    }//GEN-LAST:event_btnCrearRutaMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = Integer.parseInt(txtFila.getText());
        int columna = Integer.parseInt(txtColumna.getText());
        modelo.setValueAt(txtNuevoDato.getText(), fila, columna);
        
        txtFila.setText("");
        txtColumna.setText("");
        txtNuevoDato.setText("");
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = Tabla.getSelectedRow();
        if (fila >= 0) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar fila");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFilaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnCrearRuta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmblugares;
    private javax.swing.JComboBox<String> cmbterminalLlegada;
    private javax.swing.JComboBox<String> cmbterminalSalida;
    private com.toedter.calendar.JDateChooser fechallegada;
    private com.toedter.calendar.JDateChooser fechasalida;
    private javax.swing.JSpinner horallegada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColumna;
    private javax.swing.JLabel lblDatonew;
    private javax.swing.JLabel lblFHllegada;
    private javax.swing.JLabel lblFHsalida;
    private javax.swing.JLabel lblFlia;
    private javax.swing.JLabel lblLugares;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTermiLlgada;
    private javax.swing.JLabel lblTermiSalida;
    private javax.swing.JSpinner spihorariollegada;
    private javax.swing.JSpinner spihorariosalida;
    private javax.swing.JSpinner spihorasalida;
    private javax.swing.JSpinner spiminutosllegada;
    private javax.swing.JSpinner spiminutossalida;
    private javax.swing.JTextField txtColumna;
    private javax.swing.JTextField txtFila;
    private javax.swing.JTextField txtNuevoDato;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
