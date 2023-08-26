package lojastanger_telas;

import dados.Venda;
import dados.Vendadao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class vendedor_2 extends javax.swing.JFrame {

    public vendedor_2() {
        initComponents();
        dica_txt data = new dica_txt("##/##/####", datacampo);

        dica_txt cliente = new dica_txt("nome do cliente", nomecampo);
        dica_txt idCliente = new dica_txt("id do cliente", idclientecampo);
        dica_txt cpfCliente = new dica_txt("cpf do cliente", cpfcampo);
        dica_txt idVendedor = new dica_txt("id do vendedor", idvendedorcampo);
        dica_txt idprod = new dica_txt("id do produto", idprodutocampo);
        dica_txt valor = new dica_txt("valor total da venda", valorcampo);
        dica_txt cupom = new dica_txt("% do cupom (vazio se não houve cupom", cupomcampo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cupomcampo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        qntdcampo = new javax.swing.JTextField();
        nomecampo = new javax.swing.JTextField();
        idclientecampo = new javax.swing.JTextField();
        cpfcampo = new javax.swing.JTextField();
        idvendedorcampo = new javax.swing.JTextField();
        idprodutocampo = new javax.swing.JTextField();
        valorcampo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        primeiracompracheck = new javax.swing.JCheckBox();
        datacampo = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        idcampo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        voltarbotao = new javax.swing.JButton();
        VENDEDORTEXT = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        img_top = new javax.swing.JLabel();
        registrarvendabotao = new javax.swing.JButton();
        down = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        cupomcampo.setBackground(new java.awt.Color(255, 255, 255));
        cupomcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupomcampoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NOME");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ID CLIENTE");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CPF");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ID VENDEDOR");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ID PRODUTO");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("VALOR");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CUPOM");

        qntdcampo.setBackground(new java.awt.Color(255, 255, 255));
        qntdcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntdcampoActionPerformed(evt);
            }
        });

        nomecampo.setBackground(new java.awt.Color(255, 255, 255));
        nomecampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomecampoActionPerformed(evt);
            }
        });

        idclientecampo.setBackground(new java.awt.Color(255, 255, 255));
        idclientecampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idclientecampoActionPerformed(evt);
            }
        });

        cpfcampo.setBackground(new java.awt.Color(255, 255, 255));
        cpfcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfcampoActionPerformed(evt);
            }
        });

        idvendedorcampo.setBackground(new java.awt.Color(255, 255, 255));
        idvendedorcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idvendedorcampoActionPerformed(evt);
            }
        });

        idprodutocampo.setBackground(new java.awt.Color(255, 255, 255));
        idprodutocampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idprodutocampoActionPerformed(evt);
            }
        });

        valorcampo.setBackground(new java.awt.Color(255, 255, 255));
        valorcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorcampoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("PRIMEIRA COMPRA");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("QUANTIDADE");

        primeiracompracheck.setBackground(new java.awt.Color(255, 255, 255));
        primeiracompracheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiracompracheckActionPerformed(evt);
            }
        });

        datacampo.setBackground(new java.awt.Color(255, 255, 255));
        try {
            datacampo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        datacampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datacampoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("DATA");

        idcampo.setBackground(new java.awt.Color(255, 255, 255));
        idcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcampoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(138, 138, 138)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(idcampo)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datacampo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178))
                            .addComponent(idclientecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cupomcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpfcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idvendedorcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idprodutocampo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(primeiracompracheck))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qntdcampo)))))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(datacampo)
                    .addComponent(jLabel15)
                    .addComponent(idcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nomecampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(idclientecampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cpfcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(idvendedorcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(idprodutocampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(qntdcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(valorcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(primeiracompracheck))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cupomcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 900, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Polygon 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, 10, 10));

        voltarbotao.setText("VOLTAR");
        voltarbotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarbotaoActionPerformed(evt);
            }
        });
        jPanel1.add(voltarbotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 610, 80, 30));

        VENDEDORTEXT.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        VENDEDORTEXT.setText("VENDEDOR");
        jPanel1.add(VENDEDORTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 290, 110));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tanger 1.png"))); // NOI18N
        logo.setText("jLabel1");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 150, 70));

        img_top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        img_top.setText("jLabel1");
        jPanel1.add(img_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1018, -1));

        registrarvendabotao.setBackground(new java.awt.Color(51, 153, 0));
        registrarvendabotao.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        registrarvendabotao.setForeground(new java.awt.Color(255, 255, 255));
        registrarvendabotao.setText("REGISTRAR");
        registrarvendabotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarvendabotaoActionPerformed(evt);
            }
        });
        jPanel1.add(registrarvendabotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, -1, 30));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarbotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarbotaoActionPerformed
        MenuInicial meninic = new MenuInicial();
        this.dispose();
        meninic.setVisible(true);
    }//GEN-LAST:event_voltarbotaoActionPerformed

    private void cupomcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cupomcampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cupomcampoActionPerformed

    private void qntdcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntdcampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qntdcampoActionPerformed

    private void nomecampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomecampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomecampoActionPerformed

    private void idclientecampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idclientecampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idclientecampoActionPerformed

    private void cpfcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfcampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfcampoActionPerformed

    private void idvendedorcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idvendedorcampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idvendedorcampoActionPerformed

    private void idprodutocampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idprodutocampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idprodutocampoActionPerformed

    private void valorcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorcampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorcampoActionPerformed

    private void primeiracompracheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiracompracheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primeiracompracheckActionPerformed

    private void registrarvendabotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarvendabotaoActionPerformed
        Venda venda = new Venda();
        validacaocadastro(venda);
    }//GEN-LAST:event_registrarvendabotaoActionPerformed
    public void validacaocadastro(Venda venda) {// método para validar os dados do cadastro de novo filme
        String id = idcampo.getText();
        String data = datacampo.getText();
        String nome = nomecampo.getText();
        String id_cliente = idclientecampo.getText();
        String cpf = cpfcampo.getText();
        String id_vendedor = idvendedorcampo.getText();
        String id_produto = idprodutocampo.getText();
        String valor = valorcampo.getText();
        String cupom = cupomcampo.getText();
        String quantidade = qntdcampo.getText();

        Vendadao vendadao = new Vendadao();

        int resposta;
        boolean status = vendadao.conectar();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo id deve ser preenchido. ");
        } else {
            int id1 = Integer.parseInt(id);
            venda.setId(id1);
            boolean verid = id.matches("[0-9]+");
            if (verid == false) {
                JOptionPane.showMessageDialog(null, "Preencha o id corretamente. ");
            } else {
                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo nome deve ser preenchido. ");
                } else {
                    venda.setNomeCliente(nomecampo.getText());
                    boolean verNome = nome.matches("[a-zA-Z]+");
                    if (verNome == false) {
                        JOptionPane.showMessageDialog(null, "Preencha o nome corretamente. ");
                    } else {
                        if (data.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "O campo data deve ser preenchido. ");
                        } else {
                            boolean verData = data.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
                            if (verData == false) {
                                JOptionPane.showMessageDialog(null, "O campo data deve ser preenchido no formato DD/MM/AAAA. ");
                            } else {
                                if (id_cliente.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "O campo id_cliente deve ser preenchido. ");
                                } else {
                                    int idcli = Integer.parseInt(id_cliente);
                                    venda.setCodCliente(idcli);
                                    boolean vercli = id_cliente.matches("[0-9]+");
                                    if (vercli == false) {
                                        JOptionPane.showMessageDialog(null, "Preencha o campo id_cliente somente com números. ");
                                    } else {
                                        if (cpf.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "O campo cpf deve ser preenchido. ");
                                        } else {

                                            venda.setCpfCliente(cpfcampo.getText());
                                            boolean vercpf = cpf.matches("[0-9]+");
                                            if (vercpf == false) {
                                                JOptionPane.showMessageDialog(null, "Preencha o campo cpf somente com números. ");
                                            } else {
                                                if (id_vendedor.isEmpty()) {
                                                    JOptionPane.showMessageDialog(null, "O campo id_vendedor deve ser preenchido. ");
                                                } else {
                                                    int idven = Integer.parseInt(id_vendedor);
                                                    venda.setCodVendedor(idven);
                                                    boolean verven = id_vendedor.matches("[0-9]+");
                                                    if (verven == false) {
                                                        JOptionPane.showMessageDialog(null, "Preencha o campo id_cvendedor somente com números. ");
                                                    } else {
                                                        if (id_produto.isEmpty()) {
                                                            JOptionPane.showMessageDialog(null, "O campo id_produto deve ser preenchido. ");
                                                        } else {
                                                            int idprod = Integer.parseInt(id_produto);
                                                            venda.setCodProduto(idprod);
                                                            boolean verprod = id_produto.matches("[0-9]+");
                                                            if (verprod == false) {
                                                                JOptionPane.showMessageDialog(null, "Preencha o campo id_produto somente com números. ");
                                                            } else {
                                                                venda.setCupom(cupomcampo.getText());

                                                                if (quantidade.isEmpty()) {
                                                                    JOptionPane.showMessageDialog(null, "O campo quantidade deve ser preenchido. ");
                                                                } else {
                                                                    int quant = Integer.parseInt(quantidade);
                                                                    venda.setQntdProd(quant);
                                                                    boolean verquant = quantidade.matches("[0-9]+");
                                                                    if (verquant == false) {
                                                                        JOptionPane.showMessageDialog(null, "Preencha o campo quantidade somente com números. ");
                                                                    } else {
                                                                        if (valor.isEmpty()) {
                                                                            JOptionPane.showMessageDialog(null, "O campo valor deve ser preenchido. ");
                                                                        } else {
                                                                            double val = Double.parseDouble(valor);
                                                                            venda.setValorTotal(val);
                                                                            boolean verval = quantidade.matches("[0-9]+");
                                                                            if (verval == false) {
                                                                                JOptionPane.showMessageDialog(null, "Preencha o campo valor no formato XX.XX. ");

                                                                            } else {
                                                                                try {
                                                                                    if (primeiracompracheck.isSelected()) {
                                                                                        venda.setPrimeiraCompra("sim");
                                                                                    } else {
                                                                                        venda.setPrimeiraCompra("Não");
                                                                                    }
                                                                                    SimpleDateFormat dataconv = new SimpleDateFormat("dd/MM/yyyy");
                                                                                    Date data2 = dataconv.parse(data);
                                                                                    java.sql.Date sqldate = new java.sql.Date(data2.getTime());
                                                                                    venda.setData(sqldate);
                                                                                } catch (ParseException ex) {
                                                                                    System.out.println("Erro na conversão da data");
                                                                                }

                                                                                if (status == false) {
                                                                                    JOptionPane.showMessageDialog(null, "Erro de conexão");
                                                                                } else {
                                                                                    resposta = vendadao.salvar(venda); // salvando o objeto filme no banco de dados
                                                                                    if (resposta == 1) {

                                                                                        JOptionPane.showMessageDialog(null, "Dados incluidos com sucesso");
                                                                                        limparCampos();
                                                                                    } else if (resposta == 1062) {
                                                                                        JOptionPane.showMessageDialog(null, "Id de Venda ja foi cadastrado");
                                                                                    } else {
                                                                                        JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados");

                                                                                    }

                                                                                    vendadao.desconectar();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void limparCampos() {
        nomecampo.setText("");
        datacampo.setText("");
        idclientecampo.setText("");
        idprodutocampo.setText("");
        idvendedorcampo.setText("");
        cpfcampo.setText("");
        cupomcampo.setText("");
        valorcampo.setText("");
        qntdcampo.setText("");
        idcampo.setText("");

        //setando os campos de preenchimento com espaço
    }

    private void datacampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datacampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datacampoActionPerformed

    private void idcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idcampoActionPerformed

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
            java.util.logging.Logger.getLogger(vendedor_2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendedor_2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendedor_2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendedor_2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendedor_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VENDEDORTEXT;
    private javax.swing.JTextField cpfcampo;
    private javax.swing.JTextField cupomcampo;
    private javax.swing.JFormattedTextField datacampo;
    private javax.swing.JLabel down;
    private javax.swing.JTextField idcampo;
    private javax.swing.JTextField idclientecampo;
    private javax.swing.JTextField idprodutocampo;
    private javax.swing.JTextField idvendedorcampo;
    private javax.swing.JLabel img_top;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nomecampo;
    private javax.swing.JCheckBox primeiracompracheck;
    private javax.swing.JTextField qntdcampo;
    private javax.swing.JButton registrarvendabotao;
    private javax.swing.JTextField valorcampo;
    private javax.swing.JButton voltarbotao;
    // End of variables declaration//GEN-END:variables
}
