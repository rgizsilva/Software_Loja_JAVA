package lojastanger_telas;

import dados.Venda;
import dados.Vendadao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Gerencia_vendas extends javax.swing.JFrame {

    public Gerencia_vendas() {
        initComponents();
        this.PreencherTabela("");

    }

    public String Datareversa(String data) {
        String dia = data.substring(8);
        String mes = data.substring(5, 7);
        String ano = data.substring(0, 4);
        String sqlDate = dia + "/" + mes + "/" + ano;
        return sqlDate;// convertendo a data no formato sql para o formato brasileiro
    }

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

                tabelavenda.addRow(object);// add o objeto venda com seus atributos na tabela

            }
            vendadao.desconectar();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendas_table = new javax.swing.JTable();
        atttabela = new javax.swing.JButton();
        deletarBotao = new javax.swing.JButton();
        buscaCampo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        atualizarBotao = new javax.swing.JButton();
        voltarbotao = new javax.swing.JButton();
        VENDEDORTEXT = new javax.swing.JLabel();
        buscabotao = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        img_top = new javax.swing.JLabel();
        down = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 900, 290));

        atttabela.setText("Atualizar Tabela");
        atttabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atttabelaActionPerformed(evt);
            }
        });
        jPanel1.add(atttabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 120, 30));

        deletarBotao.setText("Deletar");
        deletarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(deletarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 80, 30));
        jPanel1.add(buscaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 80, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Digite o id da venda:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Polygon 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 630, 10, 10));

        atualizarBotao.setText("Atualizar Venda");
        atualizarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(atualizarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 120, 30));

        voltarbotao.setText("    VOLTAR");
        voltarbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarbotaoActionPerformed(evt);
            }
        });
        jPanel1.add(voltarbotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, 80, 30));

        VENDEDORTEXT.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        VENDEDORTEXT.setText("GERÊNCIA");
        jPanel1.add(VENDEDORTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 310, 110));

        buscabotao.setText("Buscar");
        buscabotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscabotaoActionPerformed(evt);
            }
        });
        jPanel1.add(buscabotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 80, 30));

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

    private void atualizarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBotaoActionPerformed
        Atualizar_gerencia atu = new Atualizar_gerencia();
        this.dispose();
        atu.setVisible(true);
    }//GEN-LAST:event_atualizarBotaoActionPerformed

    private void deletarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarBotaoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja deletar essa venda?", "Confirmação", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            Vendadao vendadao = new Vendadao();
        boolean status = vendadao.conectar();

        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro de conexão");
        } else {
            int selectedRow = vendas_table.getSelectedRow(); // Obtém o índice da linha selecionada
            int idBusca = Integer.parseInt(vendas_table.getValueAt(selectedRow, 0).toString());; // Obtém o valor do ID da linha selecionada

            status = vendadao.excluir(idBusca); // Chama o método excluir passando o ID
            if (status == true) {
                JOptionPane.showMessageDialog(null, "Venda excluída com sucesso!");

                // Remove a linha selecionada da tabela
                DefaultTableModel tableModel = (DefaultTableModel) vendas_table.getModel();
                tableModel.removeRow(selectedRow);

                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Erro na exclusão da Venda!");
            }
            vendadao.desconectar();
        }
        } else {
            initComponents();
            
        }
        


    }//GEN-LAST:event_deletarBotaoActionPerformed
    public void limparCampos() {
        buscaCampo.setText("");

        //setando os campos de preenchimento com espaço
    }
    private void buscabotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscabotaoActionPerformed

        if (buscaCampo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo deve ser preenchido. ");
        } else {
            int idBusca = Integer.parseInt(buscaCampo.getText());
            this.consultar(idBusca);

            this.PreencherTabela(buscaCampo.getText());
            limparCampos();
        }
    }//GEN-LAST:event_buscabotaoActionPerformed

    private void atttabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atttabelaActionPerformed
        this.PreencherTabela("");
    }//GEN-LAST:event_atttabelaActionPerformed

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
            java.util.logging.Logger.getLogger(Gerencia_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerencia_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerencia_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerencia_vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerencia_vendas().setVisible(true);
            }
        });
    }

    private void consultar(int id) {
        Vendadao vendadao = new Vendadao();
        boolean status = vendadao.conectar();
        if (status == true) {
            Venda venda = vendadao.consultar(id);
            System.out.println(vendadao.consultar(id));
            if (venda == null) {
                JOptionPane.showMessageDialog(null, "Venda não localizada");
            } else {
                int id1 = venda.getId();
                buscaCampo.setText(String.valueOf(id1));

            }
            vendadao.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "Erro de conexão");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VENDEDORTEXT;
    private javax.swing.JButton atttabela;
    private javax.swing.JButton atualizarBotao;
    private javax.swing.JTextField buscaCampo;
    private javax.swing.JButton buscabotao;
    private javax.swing.JButton deletarBotao;
    private javax.swing.JLabel down;
    private javax.swing.JLabel img_top;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JTable vendas_table;
    private javax.swing.JButton voltarbotao;
    // End of variables declaration//GEN-END:variables
}
