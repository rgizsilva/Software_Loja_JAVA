package lojastanger_telas;

import dados.Produto;
import dados.Produtodao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Gerencia_estoque extends javax.swing.JFrame {

    public Gerencia_estoque() {
        initComponents();
        PreencherTabela("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscaCampo = new javax.swing.JTextField();
        limpardados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produto_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        camponome = new javax.swing.JTextField();
        campoqntd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        deletarBotao = new javax.swing.JButton();
        atualizarBotao = new javax.swing.JButton();
        voltarbotao = new javax.swing.JButton();
        VENDEDORTEXT = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        img_top = new javax.swing.JLabel();
        down = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Digite o id do produto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 180, -1));

        buscaCampo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                buscaCampoCaretUpdate(evt);
            }
        });
        jPanel1.add(buscaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 80, -1));

        limpardados.setText("Limpar ");
        limpardados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpardadosActionPerformed(evt);
            }
        });
        jPanel1.add(limpardados, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 80, 30));

        produto_table.setBackground(new java.awt.Color(204, 204, 204));
        produto_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Código", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        produto_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produto_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(produto_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 920, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Polygon 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(943, 630, 10, 10));

        camponome.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        camponome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponomeActionPerformed(evt);
            }
        });

        campoqntd.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Quantidade:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Nome:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoqntd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoqntd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 560, 60));

        deletarBotao.setText("Deletar");
        deletarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(deletarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 80, 30));

        atualizarBotao.setText("Atualizar");
        atualizarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(atualizarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 80, 30));

        voltarbotao.setText("VOLTAR");
        voltarbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarbotaoActionPerformed(evt);
            }
        });
        jPanel1.add(voltarbotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 620, 80, 30));

        VENDEDORTEXT.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        VENDEDORTEXT.setText("GERÊNCIA");
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

    private void buscaCampoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_buscaCampoCaretUpdate
        this.PreencherTabela(buscaCampo.getText()); //preenchendo a tabela com os dados do campo de pesquisar.
    }//GEN-LAST:event_buscaCampoCaretUpdate
    private void consultar(int id) {
        Produtodao produtodao = new Produtodao();
        boolean status = produtodao.conectar();
        if (status) {
            Produto produto = produtodao.consultar(id);
            if (produto == null) {
                JOptionPane.showMessageDialog(null, "Produto não localizado");
            } else {
                int codigo = produto.getCodigo();
                buscaCampo.setText(String.valueOf(codigo));
                camponome.setText(produto.getNome());
                int quant = produto.getQuantidade();
                campoqntd.setText(String.valueOf(quant));

            }
            produtodao.desconectar();

        } else {
            JOptionPane.showMessageDialog(null, "Erro de conexão");
        }
    }

    private void produto_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produto_tableMouseClicked
        int linha = produto_table.getSelectedRow();
        this.consultar((int) produto_table.getValueAt(linha, 1));
        buscaCampo.setEditable(false);


    }//GEN-LAST:event_produto_tableMouseClicked

    private void deletarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarBotaoActionPerformed
        Produtodao produtodao = new Produtodao();
        boolean status = produtodao.conectar();

        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro de conexão");
        } else {
            String id = buscaCampo.getText();
            int codigoInt = Integer.parseInt(id);

            status = produtodao.excluir(codigoInt); //chamando método excluir para excluir o objeto filme da tabela
            if (status == true) {
                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
                PreencherTabela("");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Erro na exclusão do produto!");
            }
            produtodao.desconectar();

        }

    }//GEN-LAST:event_deletarBotaoActionPerformed

    private void camponomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponomeActionPerformed

    private void atualizarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBotaoActionPerformed
        Produto produto = new Produto();
        Produtodao produtodao = new Produtodao();
        String nome = camponome.getText();
        String codigo = buscaCampo.getText();
        String Quantidade = campoqntd.getText();

        int resposta;
        boolean status = produtodao.conectar();
        if (nome.isEmpty()) { // iniciando a validação dos dados
            JOptionPane.showMessageDialog(null, "O campo nome deve ser preenchido. ");
        } else {
            produto.setNome(camponome.getText());
            boolean verNome = nome.matches("[a-zA-ZÀ-ÿ\\s]+");
            if (verNome == false) {
                JOptionPane.showMessageDialog(null, "Preencha o nome corretamente. ");
            } else {
                int cod = Integer.parseInt(codigo);
                produto.setCodigo(cod);
                if (codigo.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo id deve ser preenchido. ");
                } else {
                    boolean verCodigo = codigo.matches("[0-9]{1,4}");
                    if (verCodigo == false) {
                        JOptionPane.showMessageDialog(null, "O campo id deve conter apenas números ");
                    } else {
                        if (Quantidade.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "O campo quantidade deve ser preenchido. ");
                        } else {
                            int quantidade = Integer.parseInt(Quantidade);
                            produto.setQuantidade(quantidade);
                            boolean verQuanti = Quantidade.matches("[0-9]{1,4}");
                            if (verQuanti == false) {
                                JOptionPane.showMessageDialog(null, "Preencha o campo quantidade somente com números ");
                            }

                            if (status == false) {
                                JOptionPane.showMessageDialog(null, "Erro de conexão");
                            } else {
                                resposta = produtodao.atualizar(produto);//chamando método para fazer update no banco de dados
                                if (resposta == 1) {

                                    JOptionPane.showMessageDialog(null, "Dados incluídos com sucesso");
                                    limparCampos();
                                } else if (resposta == 1062) {
                                    JOptionPane.showMessageDialog(null, "Nome do produto já foi cadastrado");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados");

                                }
                                produtodao.desconectar();
                            }
                        }
                    }
                }
            }

        }


    }//GEN-LAST:event_atualizarBotaoActionPerformed

    private void limpardadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpardadosActionPerformed
        limparCampos();
    }//GEN-LAST:event_limpardadosActionPerformed
    public void limparCampos() {
        camponome.setText("");
        campoqntd.setText("");
        buscaCampo.setText("");

        //setando os campos de preenchimento com espaço
    }

    private void PreencherTabela(String filtro) {
        Produtodao produtodao = new Produtodao();
        boolean status = produtodao.conectar();
        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro de conexão");
        } else {
            List<Produto> listaproduto = produtodao.listagem(filtro);
            DefaultTableModel tabelaprodutos = (DefaultTableModel) produto_table.getModel();
            produto_table.setRowSorter(new TableRowSorter(tabelaprodutos));
            tabelaprodutos.setNumRows(0);
            for (Produto p : listaproduto) {
                Object[] object = new Object[]{
                    p.getNome(),
                    p.getCodigo(),
                    p.getQuantidade()
                };
                tabelaprodutos.addRow(object);// add o objeto filme com seus atributos na tabela 
            }
            produtodao.desconectar();
        }
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
            java.util.logging.Logger.getLogger(Gerencia_estoque.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerencia_estoque.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerencia_estoque.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerencia_estoque.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerencia_estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VENDEDORTEXT;
    private javax.swing.JButton atualizarBotao;
    private javax.swing.JTextField buscaCampo;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField campoqntd;
    private javax.swing.JButton deletarBotao;
    private javax.swing.JLabel down;
    private javax.swing.JLabel img_top;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpardados;
    private javax.swing.JLabel logo;
    private javax.swing.JTable produto_table;
    private javax.swing.JButton voltarbotao;
    // End of variables declaration//GEN-END:variables
}
