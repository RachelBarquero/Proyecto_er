package Presentacion;

import Negocio.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarRutas extends javax.swing.JInternalFrame {

    Listas lista = new Listas();
    Asientos asientos = new Asientos();
    Historial h = new Historial();
    Inicio_Sesion in = new Inicio_Sesion();
    ArrayList<String> v_d = new ArrayList();
    public String as;
    public String ae;
    public String al;
    public String ps;
    public String pe;
    public String pll;
    public int c;
    public int ct;
    public String d;
    Date f_h = new Date();

    public BuscarRutas() {
        initComponents();
        setTitle("BUSCAR RUTAS");
        llenar_combos();

    }

    public void llenar_combos() {
        //Llenado de combo de terminales
        ArrayList<String> ae = lista.leerLista_terminales();
        if (ae.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, No hay datos en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < ae.size(); i++) {
                cmbrutallegada.addItem(ae.get(i));
                cmbrutasalida.addItem(ae.get(i));
            }
        }
    }

    public String fecha_hora() {
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
        String fh = hourdateFormat.format(f_h);
        return fh;
    }

    public String fecha_salida() {
        Date fecha = fechasalida.getDate();
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fs = formato.format(fecha);
        return fs;
    }

    public void añadir_rutas(ArrayList<String> vd) {

        if (vd.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error, No hay Datos Disponibles en el Sistema", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int t = vd.size();
            String nombreC[] = {"Nombre Lugar", "Terminal Salida", "Terminal punto medio", "Terminal Llegada", "Hora Salida", "Hora Llegada", "Duracion", "Precio"};
            String datos[][] = new String[t][8];
            String[] separar = new String[8];
            for (int i = 0; i < vd.size(); i++) {
                separar = vd.get(i).split("\\|");
                datos[i][0] = separar[0];
                datos[i][1] = separar[1];
                datos[i][2] = separar[2];
                datos[i][3] = separar[3];
                datos[i][4] = separar[4];
                datos[i][5] = separar[5];
                datos[i][6] = separar[6];
                datos[i][7] = separar[7];
            }
            rutas.setModel(new DefaultTableModel(datos, nombreC));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbrutasalida = new javax.swing.JComboBox<>();
        cmbrutallegada = new javax.swing.JComboBox<>();
        fechasalida = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBusarruta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rutas = new javax.swing.JTable();
        btncomprarboletos = new javax.swing.JButton();
        cmbcantidadboletos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(cmbrutasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 450, -1));

        jPanel1.add(cmbrutallegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 450, -1));
        jPanel1.add(fechasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 150, 25));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ruta de salida:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ruta de llegada");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha de Salida:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        btnBusarruta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBusarruta.setText("Buscar ruta");
        btnBusarruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusarrutaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBusarruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 260, -1));

        rutas.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        rutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rutasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rutas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1150, 93));

        btncomprarboletos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncomprarboletos.setText("Comprar Boletos");
        btncomprarboletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomprarboletosActionPerformed(evt);
            }
        });
        jPanel1.add(btncomprarboletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 230, 270, 30));

        cmbcantidadboletos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jPanel1.add(cmbcantidadboletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 240, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad de Boletos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusarrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusarrutaActionPerformed

        if (fechasalida.getDate() != null) {
            String as = (String) cmbrutasalida.getSelectedItem();
            String al = (String) cmbrutallegada.getSelectedItem();
            String fs = fecha_salida();
            v_d = lista.buscarRutas(as, al, fs);
            añadir_rutas(v_d);
        } else {

        }
    }//GEN-LAST:event_btnBusarrutaActionPerformed

    private void rutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutasMouseClicked

        int seleccion = rutas.rowAtPoint(evt.getPoint());
        String na = String.valueOf(rutas.getValueAt(seleccion, 0));
        as = String.valueOf(rutas.getValueAt(seleccion, 1));
        ae = String.valueOf(rutas.getValueAt(seleccion, 2));
        al = String.valueOf(rutas.getValueAt(seleccion, 3));
        String hs = String.valueOf(rutas.getValueAt(seleccion, 4));
        String hl = String.valueOf(rutas.getValueAt(seleccion, 5));
        String du = String.valueOf(rutas.getValueAt(seleccion, 6));
        String p = String.valueOf(rutas.getValueAt(seleccion, 7));

        //Seleccion del precio de la ruta
        c = Integer.parseInt(p);

        //Seleccion de la duracion de la ruta
        d = du;

    }//GEN-LAST:event_rutasMouseClicked

    private void btncomprarboletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprarboletosActionPerformed

        //Seleccion de los Cantones de Salida y Llegada
        String[] s1 = as.split(",");
        ps = s1[1];
        if (ae.equals("Directo")) {
            pe = ae;
        } else {
            String[] s2 = ae.split(",");
            pe = s2[1];
        }
        String[] s3 = al.split(",");
        pll = s3[1];

        int cb = Integer.parseInt((String) cmbcantidadboletos.getSelectedItem());
        ct = c * cb;
        String fyh = fecha_hora();

        String asi = asientos.asignar_asientos(cb);

        String ced = in.u;

        String v = ced + "|" + ps + "|" + pe + "|" + pll + "|" + fyh + "|" + cb + "|" + asi + "|" + d + "|" + ct;

        int r = JOptionPane.showConfirmDialog(this, "El monto a pagar es de: " + ct + " desear realizar la compra");
        if (r == 0) {
            h.insertar_historial_en_archivo(v);
        }

    }//GEN-LAST:event_btncomprarboletosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusarruta;
    private javax.swing.JButton btncomprarboletos;
    private javax.swing.JComboBox<String> cmbcantidadboletos;
    private javax.swing.JComboBox<String> cmbrutallegada;
    private javax.swing.JComboBox<String> cmbrutasalida;
    private com.toedter.calendar.JDateChooser fechasalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rutas;
    // End of variables declaration//GEN-END:variables
}
