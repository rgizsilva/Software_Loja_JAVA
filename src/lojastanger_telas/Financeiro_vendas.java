package lojastanger_telas;



import dados.Venda;
import dados.Vendadao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Financeiro_vendas extends javax.swing.JFrame {

    public Financeiro_vendas() {
        initComponents();
        this.PreencherTabela("");
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendas_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        voltarbotao = new javax.swing.JButton();
        VENDEDORTEXT = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        img_top = new javax.swing.JLabel();
        down = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vendas_table.setBackground(new java.awt.Color(204, 204, 204));
        vendas_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATA", "CLIENTE", "ID CLIENTE", "CPF", "ID VENDEDOR", "ID PRODUTOS", "QUANTIDADE", "VALOR", "PRIMEIRA COMPRA", "CUPOM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vendas_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 910, 350));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Polygon 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(943, 630, 10, 10));

        voltarbotao.setText("VOLTAR");
        voltarbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarbotaoActionPerformed(evt);
            }
        });
        jPanel1.add(voltarbotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 620, 80, 30));

        VENDEDORTEXT.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        VENDEDORTEXT.setText("FINANCEIRO");
        jPanel1.add(VENDEDORTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 310, 110));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tanger 1.png"))); // NOI18N
        logo.setText("jLabel1");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 150, 70));

        img_top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        img_top.setText("jLabel1");
        jPanel1.add(img_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1018, -1));

        down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/baixo.png"))); // NOI18N
        down.setText("jLabel2");
        jPanel1.add(down, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1020, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarbotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarbotaoActionPerformed
        MenuInicial meninic = new MenuInicial();
        this.dispose();
        meninic.setVisible(true);
    }//GEN-LAST:event_voltarbotaoActionPerformed
    private void PreencherTabela(String filtro) {
        Vendadao vendadao = new Vendadao();
        boolean status = vendadao.conectar();
        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro de conexão");
        } else {
            List<Venda> listavenda = vendadao.listagem(filtro);
            DefaultTableModel tabelavenda = (DefaultTableModel) vendas_table.getModel();
            tabelavenda.setColumnIdentifiers(new Object[]{"ID", "Data", "Nome do Cliente", "Código do Cliente", "CPF do Cliente", "Código do Vendedor", "Código do Produto", "Valor Total", "Cupom", "Quantidade de Produtos", "Primeira Compra"});
            vendas_table.setRowSorter(new TableRowSorter(tabelavenda));
            tabelavenda.setNumRows(0);
            System.out.println("aqui");
            for (Venda v : listavenda) {
                Object[] object = new Object[]{
                    v.getId(),
                    this.Datareversa(String.valueOf(v.getData())),
                    v.getNomeCliente(),
                    v.getCodCliente(),
                    v.getCpfCliente(),
                    v.getCodVendedor(),
                    v.getCodProduto(),
                    v.getValorTotal(),
                    v.getCupom(),
                    v.getQntdProd(),
                    v.getPrimeiraCompra()
                };
                System.out.println("aqui");
                tabelavenda.addRow(object);
                System.out.println(v.getNomeCliente());                                // add o objeto venda com seus atributos na tabela 
            }
            vendadao.desconectar();
        }
    }
    public String Datareversa(String data) {
        String dia = data.substring(8);
        String mes = data.substring(5, 7);
        String ano = data.substring(0, 4);
        String sqlDate = dia + "/" + mes + "/" + ano;
        return sqlDate;// convertendo a data no formato sql para o formato brasileiro
    }
    

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
            java.util.logging.Logger.getLogger(Financeiro_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Financeiro_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Financeiro_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Financeiro_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Financeiro_vendas().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VENDEDORTEXT;
    private javax.swing.JLabel down;
    private javax.swing.JLabel img_top;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JTable vendas_table;
    private javax.swing.JButton voltarbotao;
    // End of variables declaration//GEN-END:variables

    
}
