package Presentacion;

public class Administrador extends javax.swing.JFrame {

    public Administrador() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("USUARIO ADMINISTRADOR");
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        crear_terminal = new javax.swing.JMenuItem();
        MantenimientoUnidades = new javax.swing.JMenuItem();
        MantenimientoRutas = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenuItem();
        X = new javax.swing.JMenu();
        cerrarsesion = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/admin.png"))); // NOI18N
        jMenu1.setText("Menu Administrador");

        crear_terminal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camino.png"))); // NOI18N
        crear_terminal.setText("Mantenimiento de terminales");
        crear_terminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearRutaActionPerformed(evt);
            }
        });
        jMenu1.add(crear_terminal);

        MantenimientoUnidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminal.png"))); // NOI18N
        MantenimientoUnidades.setText("Mantenimiento de unidades");
        MantenimientoUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoUnidadesActionPerformed(evt);
            }
        });
        jMenu1.add(MantenimientoUnidades);

        MantenimientoRutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/autobus.png"))); // NOI18N
        MantenimientoRutas.setText("Mantenimiento de rutas");
        MantenimientoRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientoRutasActionPerformed(evt);
            }
        });
        jMenu1.add(MantenimientoRutas);

        Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte.png"))); // NOI18N
        Reportes.setText("Reportes");
        jMenu1.add(Reportes);

        jMenuBar1.add(jMenu1);

        X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        X.setText("Cerrar Sesión");

        cerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.png"))); // NOI18N
        cerrarsesion.setText("Cerrar Sesión");
        cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarsesionActionPerformed(evt);
            }
        });
        X.add(cerrarsesion);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        X.add(salir);

        jMenuBar1.add(X);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearRutaActionPerformed
        MantenimientoTerminales v = new MantenimientoTerminales();
        escritorio.add(v);
        v.show();
    }//GEN-LAST:event_CrearRutaActionPerformed

    private void cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarsesionActionPerformed
        this.dispose();
        Inicio_Sesion v = new Inicio_Sesion();
        v.show();
    }//GEN-LAST:event_cerrarsesionActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void MantenimientoUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoUnidadesActionPerformed
        MantenimientoUnidades v = new MantenimientoUnidades();
        escritorio.add(v);
        v.show();
    }//GEN-LAST:event_MantenimientoUnidadesActionPerformed

    private void MantenimientoRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientoRutasActionPerformed
       MantenimientoRutas u = new MantenimientoRutas();
        escritorio.add(u);
        u.show();
    }//GEN-LAST:event_MantenimientoRutasActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MantenimientoRutas;
    private javax.swing.JMenuItem MantenimientoUnidades;
    private javax.swing.JMenuItem Reportes;
    private javax.swing.JMenu X;
    private javax.swing.JMenuItem cerrarsesion;
    private javax.swing.JMenuItem crear_terminal;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
