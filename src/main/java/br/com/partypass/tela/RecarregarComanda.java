package br.com.partypass.tela;


import br.com.partypass.dao.ClienteDao;
import br.com.partypass.dao.ClienteDaoImpl;
import br.com.partypass.dao.HibernateUtil;
import br.com.partypass.dao.ProdutoDao;
import br.com.partypass.dao.ProdutoDaoImpl;
import br.com.partypass.entidade.Cliente;
import br.com.partypass.entidade.Produto;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class RecarregarComanda extends javax.swing.JFrame {

    private Session sessao;

    private Cliente cliente = new Cliente();
    private ClienteDao clienteDao = new ClienteDaoImpl();
    private List<Cliente> clientes;

    private Produto produto;
    private ProdutoDao produtoDao = new ProdutoDaoImpl();
    private List<Produto> produtos;

    public RecarregarComanda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_numero_comanda = new javax.swing.JLabel();
        varId = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        lb_cliente = new javax.swing.JLabel();
        varCliente = new javax.swing.JLabel();
        lb_valor_recarga = new javax.swing.JLabel();
        lb_rs = new javax.swing.JLabel();
        varValorRecarga = new javax.swing.JTextField();
        lb_forma_pagamento = new javax.swing.JLabel();
        varFormaPagamento = new javax.swing.JComboBox<>();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();
        lb_rs1 = new javax.swing.JLabel();
        lb_valorSaldo = new javax.swing.JLabel();
        varSaldo = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        lb_Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realizar Consumo");

        lb_numero_comanda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_numero_comanda.setText("NÚMERO DA COMANDA");

        varId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        varId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btPesquisar.setBackground(new java.awt.Color(153, 153, 153));
        btPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        lb_cliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_cliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cliente.setText("Cliente:");

        varCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_valor_recarga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_valor_recarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_valor_recarga.setText("Valor da Recarga:");

        lb_rs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_rs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_rs.setText("R$");

        varValorRecarga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_forma_pagamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_forma_pagamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_forma_pagamento.setText("Forma de Pagamento:");

        varFormaPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        varFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cartão de Débito", "Cartão de Crédito", "Dinheiro", "Pix" }));

        btCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btConfirmar.setBackground(new java.awt.Color(153, 153, 153));
        btConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        lb_rs1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_rs1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_rs1.setText("R$");

        lb_valorSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_valorSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_valorSaldo.setText("Saldo:");

        jPanelTitulo.setBackground(new java.awt.Color(153, 153, 153));

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Recarregar Comanda");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Logo PartyPass I.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_forma_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_valorSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_valor_recarga, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_rs1)
                                        .addGap(18, 18, 18)
                                        .addComponent(varSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_rs)
                                        .addGap(18, 18, 18)
                                        .addComponent(varValorRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(varCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(183, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btConfirmar)
                                .addGap(99, 99, 99))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lb_numero_comanda)
                        .addGap(18, 18, 18)
                        .addComponent(varId, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_Logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_numero_comanda, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_valorSaldo)
                        .addComponent(lb_rs1))
                    .addComponent(varSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_valor_recarga)
                    .addComponent(lb_rs)
                    .addComponent(varValorRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_forma_pagamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btConfirmar))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed

        sessao = HibernateUtil.abrirConexao();
        String numeroComanda = varId.getText().trim();
        Long idCliente = Long.valueOf(numeroComanda);
        try {

            Cliente clientePesq = clienteDao.pesquisarPorId(idCliente, sessao);
            if (clientePesq == null) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            } else {
                varCliente.setText(clientePesq.getNome());
                varSaldo.setText(String.valueOf(clientePesq.getSaldo()));
            }

        } catch (HibernateException e) {
            System.out.println("Erro ao pesquisar cliente: " + e.getMessage());
        } finally {
            sessao.close();
        }

    }//GEN-LAST:event_btPesquisarActionPerformed


    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        double valorRecarg = Double.parseDouble(varValorRecarga.getText());
        try {
            sessao = HibernateUtil.abrirConexao();
            int iD = Integer.parseInt(varId.getText());
            Long idCliente = Long.valueOf(iD);

            Cliente clientePesq = clienteDao.pesquisarPorId(idCliente, sessao);
            if (clientePesq == null) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            } else {
                varSaldo.setText(String.valueOf(clientePesq.getSaldo()));
                varCliente.setText(clientePesq.getNome());
//                buscarCliente();
                clientePesq.setSaldo(clientePesq.getSaldo() + valorRecarg);
                clienteDao.salvarOuAlterar(clientePesq, sessao);

                JOptionPane.showMessageDialog(null, "Recarga realizada com sucesso!");
                dispose();
            }

        } catch (HeadlessException | NumberFormatException | HibernateException e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar recarga: " + e.getMessage());
        } finally {
            sessao.close();
        }


    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Você fechará esta janela");
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

   

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
            java.util.logging.Logger.getLogger(RecarregarComanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecarregarComanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecarregarComanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecarregarComanda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecarregarComanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JLabel lb_Logo;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_forma_pagamento;
    private javax.swing.JLabel lb_numero_comanda;
    private javax.swing.JLabel lb_rs;
    private javax.swing.JLabel lb_rs1;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_valorSaldo;
    private javax.swing.JLabel lb_valor_recarga;
    private javax.swing.JLabel varCliente;
    private javax.swing.JComboBox<String> varFormaPagamento;
    private javax.swing.JTextField varId;
    private javax.swing.JLabel varSaldo;
    private javax.swing.JTextField varValorRecarga;
    // End of variables declaration//GEN-END:variables
}
