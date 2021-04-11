package InterfazGrafica;

import Jugador.Granjero;
import ManejadoresControladores.ManejadorGranjero;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class VentanaMyFarm extends javax.swing.JFrame {

    public VentanaMyFarm() {
        initComponents();
        this.setTitle("My Little Farm");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        verPartidasjButton3 = new javax.swing.JButton();
        nicknameJugadorjTextField2 = new javax.swing.JTextField();
        nombreJugadorjLabel1 = new javax.swing.JLabel();
        comenzarJuegojButton1 = new javax.swing.JButton();
        tituloMyFarmjLabel1 = new javax.swing.JLabel();
        nombreJugadorjTextField1 = new javax.swing.JTextField();
        crearPlantasjButton2 = new javax.swing.JButton();
        nicknameJugadorjLabel2 = new javax.swing.JLabel();
        fondoImagenjLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verPartidasjButton3.setBackground(new java.awt.Color(0,0,0,80));
        verPartidasjButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        verPartidasjButton3.setForeground(new java.awt.Color(255, 255, 255));
        verPartidasjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VerPartidas.png"))); // NOI18N
        verPartidasjButton3.setBorder(null);
        verPartidasjButton3.setContentAreaFilled(false);
        verPartidasjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPartidasjButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(verPartidasjButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 210, 70));

        nicknameJugadorjTextField2.setBackground(new java.awt.Color(0,0,0,0));
        nicknameJugadorjTextField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nicknameJugadorjTextField2.setForeground(new java.awt.Color(255, 51, 51));
        nicknameJugadorjTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel1.add(nicknameJugadorjTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 300, 40));

        nombreJugadorjLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nombreJugadorjLabel1.setForeground(new java.awt.Color(255, 255, 255));
        nombreJugadorjLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IngresaNombre.png"))); // NOI18N
        jPanel1.add(nombreJugadorjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 210, 70));

        comenzarJuegojButton1.setBackground(new java.awt.Color(0,0,0,80));
        comenzarJuegojButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comenzarJuegojButton1.setForeground(new java.awt.Color(255, 255, 255));
        comenzarJuegojButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ComenzarAJugar.png"))); // NOI18N
        comenzarJuegojButton1.setBorder(null);
        comenzarJuegojButton1.setContentAreaFilled(false);
        comenzarJuegojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarJuegojButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(comenzarJuegojButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 210, 70));

        tituloMyFarmjLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TituloMyFarm.png"))); // NOI18N
        tituloMyFarmjLabel1.setToolTipText("");
        jPanel1.add(tituloMyFarmjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 480, 250));

        nombreJugadorjTextField1.setBackground(new java.awt.Color(0,0,0,0));
        nombreJugadorjTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombreJugadorjTextField1.setForeground(new java.awt.Color(255, 51, 51));
        nombreJugadorjTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.add(nombreJugadorjTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 260, 40));

        crearPlantasjButton2.setBackground(new java.awt.Color(0,0,0,80));
        crearPlantasjButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        crearPlantasjButton2.setForeground(new java.awt.Color(255, 255, 255));
        crearPlantasjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Crear.png"))); // NOI18N
        crearPlantasjButton2.setBorder(null);
        crearPlantasjButton2.setContentAreaFilled(false);
        jPanel1.add(crearPlantasjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 210, 70));

        nicknameJugadorjLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nicknameJugadorjLabel2.setForeground(new java.awt.Color(255, 255, 255));
        nicknameJugadorjLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IngresaNickname.png"))); // NOI18N
        jPanel1.add(nicknameJugadorjLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 210, 70));

        fondoImagenjLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoJuego.png"))); // NOI18N
        jPanel1.add(fondoImagenjLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 720));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verPartidasjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPartidasjButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verPartidasjButton3ActionPerformed

    private void comenzarJuegojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarJuegojButton1ActionPerformed
        // TODO add your handling code here:
        Granjero granjero = new Granjero(100, 3000, nicknameJugadorjTextField2.getText(), nombreJugadorjTextField1.getText());
        VentanaTerreno ventanaTerreno = new VentanaTerreno(granjero);
        ventanaTerreno.setVisible(true);
        dispose();
    }//GEN-LAST:event_comenzarJuegojButton1ActionPerformed
//    /**
//     * @param args the command line arguments
//     */

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMyFarm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comenzarJuegojButton1;
    private javax.swing.JButton crearPlantasjButton2;
    private javax.swing.JLabel fondoImagenjLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nicknameJugadorjLabel2;
    private javax.swing.JTextField nicknameJugadorjTextField2;
    private javax.swing.JLabel nombreJugadorjLabel1;
    private javax.swing.JTextField nombreJugadorjTextField1;
    private javax.swing.JLabel tituloMyFarmjLabel1;
    private javax.swing.JButton verPartidasjButton3;
    // End of variables declaration//GEN-END:variables

}
