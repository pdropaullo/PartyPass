package br.com.partypass.tela;

import br.com.partypass.dao.ClienteDao;
import br.com.partypass.dao.ClienteDaoImpl;
import br.com.partypass.dao.HibernateUtil;
import br.com.partypass.dao.ProdutoDao;
import br.com.partypass.dao.ProdutoDaoImpl;
import br.com.partypass.entidade.Cliente;
import br.com.partypass.entidade.Produto;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import static org.hibernate.criterion.Projections.id;

public class RecarregarComanda extends javax.swing.JFrame {

    private Session sessao;

    private Cliente cliente;
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

        lb_titulo = new javax.swing.JLabel();
        lb_numero_comanda = new javax.swing.JLabel();
        varNumeroComanda = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        lb_cliente = new javax.swing.JLabel();
        varCliente = new javax.swing.JLabel();
        lb_valor_recarga = new javax.swing.JLabel();
        lb_rs = new javax.swing.JLabel();
        varValorRecarga = new javax.swing.JTextField();
        lb_forma_pagamento = new javax.swing.JLabel();
        varFormaPagamento = new javax.swing.JComboBox<>();
        lb_atencao = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realizar Consumo");

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Recarregar Comanda");

        lb_numero_comanda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_numero_comanda.setText("NÚMERO DA COMANDA");

        varNumeroComanda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        varNumeroComanda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btPesquisar.setText("PESQUISAR");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        lb_cliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_cliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cliente.setText("CLIENTE:");

        varCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_valor_recarga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_valor_recarga.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_valor_recarga.setText("VALOR DA RECARGA:");

        lb_rs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_rs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_rs.setText("R$");

        varValorRecarga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_forma_pagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_forma_pagamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_forma_pagamento.setText("FORMA DE PAGAMENTO:");

        varFormaPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        varFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cartão de Débito", "Cartão de Crédito", "Dinheiro", "Pix" }));

        lb_atencao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_atencao.setForeground(new java.awt.Color(255, 0, 0));
        lb_atencao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_atencao.setText("Atenção, valor mínimo de R$ 10,00");

        btCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCancelar.setText("CANCELAR");

        btConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btConfirmar.setText("CONFIRMAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lb_valor_recarga, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_forma_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(varCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lb_rs)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(varValorRecarga))
                                        .addComponent(varFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_atencao)
                                .addGap(110, 110, 110))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btConfirmar)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(varNumeroComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_numero_comanda))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btPesquisar)))
                        .addGap(137, 137, 137))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_numero_comanda, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varNumeroComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btPesquisar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varValorRecarga, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_valor_recarga)
                        .addComponent(lb_rs)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_forma_pagamento))
                .addGap(18, 18, 18)
                .addComponent(lb_atencao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar)
                    .addComponent(btCancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
//        String numeroComanda = varNumeroComanda.getText();
//        if (numeroComanda) {//não existir no banco
//            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
//        } else {
//            try {
//                sessao = HibernateUtil.abrirConexao();
//                clientes = clienteDao.pesquisarPorId(id, sessao);
//                varCliente.setText(cliente.getNome());
//            } catch (HibernateException e) {
//                System.out.println("Erro ao pesquisar cliente: " + e.getMessage());
//            } finally {
//                sessao.close();
//            }
//        }
    }//GEN-LAST:event_btPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(RecarregarComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecarregarComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecarregarComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecarregarComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JLabel lb_atencao;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_forma_pagamento;
    private javax.swing.JLabel lb_numero_comanda;
    private javax.swing.JLabel lb_rs;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_valor_recarga;
    private javax.swing.JLabel varCliente;
    private javax.swing.JComboBox<String> varFormaPagamento;
    private javax.swing.JTextField varNumeroComanda;
    private javax.swing.JTextField varValorRecarga;
    // End of variables declaration//GEN-END:variables
}
