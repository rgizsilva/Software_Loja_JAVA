
package lojastanger_telas;

public class MenuInicial extends javax.swing.JFrame {
    MenuInicial menuinicial;
    
    MENU_VENDEDOR menu_vendedor;

    public MenuInicial() {
        initComponents();
    }
    public void Mostrartela(){
        
        setVisible(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bemvindo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Gerenciabtn = new javax.swing.JButton();
        Financeirobtn = new javax.swing.JButton();
        Vendedorbtn = new javax.swing.JButton();
        img_top = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bemvindo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        bemvindo.setText("SEJA BEM VINDO!");
        jPanel1.add(bemvindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 460, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tanger 1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 150, 70));

        Gerenciabtn.setText("GERÊNCIA");
        Gerenciabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciabtnActionPerformed(evt);
            }
        });
        jPanel1.add(Gerenciabtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 210, 40));

        Financeirobtn.setText("FINANCEIRO");
        Financeirobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinanceirobtnActionPerformed(evt);
            }
        });
        jPanel1.add(Financeirobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 464, 210, 40));

        Vendedorbtn.setText("VENDEDOR");
        Vendedorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendedorbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Vendedorbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 210, 40));

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

    private void VendedorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendedorbtnActionPerformed
        MENU_VENDEDOR vendedor_menu = new MENU_VENDEDOR();
        this.dispose();
        vendedor_menu.setVisible(true);
    }//GEN-LAST:event_VendedorbtnActionPerformed

    private void FinanceirobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinanceirobtnActionPerformed
        Financeiro_menu financeiro_menu = new Financeiro_menu();
        this.dispose();
        financeiro_menu.setVisible(true);
    }//GEN-LAST:event_FinanceirobtnActionPerformed

    private void GerenciabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciabtnActionPerformed
        Gerencia_login gerencia_menu = new Gerencia_login();
        this.dispose();
        gerencia_menu.setVisible(true);
        
        
    }//GEN-LAST:event_GerenciabtnActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Financeirobtn;
    private javax.swing.JButton Gerenciabtn;
    private javax.swing.JButton Vendedorbtn;
    private javax.swing.JLabel bemvindo;
    private javax.swing.JLabel img_top;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
