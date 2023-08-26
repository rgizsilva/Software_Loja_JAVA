/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lojastanger_telas;

public class MENU_VENDEDOR extends javax.swing.JFrame {
    private MenuInicial menuinicial;
    

    
    public MENU_VENDEDOR() {
        initComponents();
    }
    public void Mostrartela(){
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        VOLTARbotao = new javax.swing.JButton();
        VENDEDORTEXT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        REGISVENDAbotao = new javax.swing.JButton();
        img_top = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Polygon 1.png"))); // NOI18N
        jLabel2.setAlignmentX(0.1F);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 610, 10, 10));

        VOLTARbotao.setText("  VOLTAR");
        VOLTARbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARbotaoActionPerformed(evt);
            }
        });
        jPanel1.add(VOLTARbotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 90, 30));

        VENDEDORTEXT.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        VENDEDORTEXT.setText("VENDEDOR");
        jPanel1.add(VENDEDORTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 290, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tanger 1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 150, 70));

        REGISVENDAbotao.setText("REGISTRAR VENDA");
        REGISVENDAbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISVENDAbotaoActionPerformed(evt);
            }
        });
        jPanel1.add(REGISVENDAbotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 210, 40));

        img_top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        img_top.setText("jLabel1");
        jPanel1.add(img_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1018, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/baixo.png"))); // NOI18N
        logo.setText("jLabel2");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1020, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGISVENDAbotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISVENDAbotaoActionPerformed
        vendedor_2 Vendedor_2 = new vendedor_2();
        this.dispose();
        Vendedor_2.setVisible(true);
        
    }//GEN-LAST:event_REGISVENDAbotaoActionPerformed

    private void VOLTARbotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARbotaoActionPerformed
        MenuInicial meninic = new MenuInicial();
        this.dispose();
        meninic.setVisible(true);
      
    }//GEN-LAST:event_VOLTARbotaoActionPerformed

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
            java.util.logging.Logger.getLogger(MENU_VENDEDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_VENDEDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_VENDEDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_VENDEDOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_VENDEDOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REGISVENDAbotao;
    private javax.swing.JLabel VENDEDORTEXT;
    private javax.swing.JButton VOLTARbotao;
    private javax.swing.JLabel img_top;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
