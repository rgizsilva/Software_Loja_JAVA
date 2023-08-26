
package lojastanger_telas;

/**
 *
 * @author Regi
 */
public class Financeiro_1 extends javax.swing.JFrame {
    Financeiro_vendas financeiro_vendas;
    
    

    
    public Financeiro_1() {
        initComponents();
    }
    public void Mostrartela(Financeiro_vendas obj) {
        this.financeiro_vendas = obj;
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        voltar = new javax.swing.JLabel();
        exibirvendas = new javax.swing.JButton();
        estoque = new javax.swing.JButton();
        cadProd = new javax.swing.JButton();
        VOLTARbotao = new javax.swing.JButton();
        VENDEDORTEXT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        img_top = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Polygon 1.png"))); // NOI18N
        voltar.setAlignmentX(0.1F);
        jPanel1.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 610, 10, 10));

        exibirvendas.setText("EXIBIR VENDAS");
        exibirvendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirvendasActionPerformed(evt);
            }
        });
        jPanel1.add(exibirvendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 200, 40));

        estoque.setText("EXIBIR ESTOQUE");
        estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueActionPerformed(evt);
            }
        });
        jPanel1.add(estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 200, 40));

        cadProd.setText("CADASTRAR PRODUTO");
        cadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadProdActionPerformed(evt);
            }
        });
        jPanel1.add(cadProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 200, 40));

        VOLTARbotao.setText("  VOLTAR");
        VOLTARbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARbotaoActionPerformed(evt);
            }
        });
        jPanel1.add(VOLTARbotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 90, 30));

        VENDEDORTEXT.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        VENDEDORTEXT.setText("FINANCEIRO");
        jPanel1.add(VENDEDORTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 380, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tanger 1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 150, 70));

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

    private void VOLTARbotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARbotaoActionPerformed
        MenuInicial meninic = new MenuInicial();
        this.dispose();
        meninic.setVisible(true);
    }//GEN-LAST:event_VOLTARbotaoActionPerformed

    private void estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueActionPerformed
        Financeiro_estoque fiesto = new Financeiro_estoque();
        this.dispose();
        fiesto.setVisible(true);
    }//GEN-LAST:event_estoqueActionPerformed

    private void exibirvendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirvendasActionPerformed
        Financeiro_vendas fiven = new Financeiro_vendas();
        this.dispose();
        fiven.setVisible(true);
    }//GEN-LAST:event_exibirvendasActionPerformed

    private void cadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadProdActionPerformed
        Financeiro_prod fiprod = new Financeiro_prod();
        this.dispose();
        fiprod.setVisible(true);
    }//GEN-LAST:event_cadProdActionPerformed

    
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
            java.util.logging.Logger.getLogger(Financeiro_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Financeiro_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Financeiro_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Financeiro_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Financeiro_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VENDEDORTEXT;
    private javax.swing.JButton VOLTARbotao;
    private javax.swing.JButton cadProd;
    private javax.swing.JButton estoque;
    private javax.swing.JButton exibirvendas;
    private javax.swing.JLabel img_top;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
