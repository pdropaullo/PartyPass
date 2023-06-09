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

public class RealizarConsumo extends javax.swing.JFrame {

    private Session sessao;

    private Cliente cliente;
    private ClienteDao clienteDao = new ClienteDaoImpl();
    private List<Cliente> clientes;

    private List<Produto> produtos;
    private Produto produto;
    private ProdutoDao produtoDao = new ProdutoDaoImpl();

    public RealizarConsumo() {
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
        lb_codigo_produto = new javax.swing.JLabel();
        varCodigoProduto = new javax.swing.JTextField();
        btOkProduto = new javax.swing.JButton();
        lb_nome_produto = new javax.swing.JLabel();
        varNomeProduto = new javax.swing.JLabel();
        lb_valor_produto = new javax.swing.JLabel();
        varValorProduto = new javax.swing.JLabel();
        lb_quantidade = new javax.swing.JLabel();
        varQuantidade = new javax.swing.JTextField();
        lb_unidade = new javax.swing.JLabel();
        btOkQuantidade = new javax.swing.JButton();
        lb_total = new javax.swing.JLabel();
        varTotal = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realizar Consumo");

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Realizar Consumo");

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

        lb_codigo_produto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_codigo_produto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_codigo_produto.setText("CÓDIGO DO PRODUTO:");

        varCodigoProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btOkProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btOkProduto.setText("OK");
        btOkProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkProdutoActionPerformed(evt);
            }
        });

        lb_nome_produto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_nome_produto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome_produto.setText("NOME DO PRODUTO:");

        varNomeProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_valor_produto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_valor_produto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_valor_produto.setText("VALOR DO PRODUTO:");

        varValorProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_quantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_quantidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_quantidade.setText("QUANTIDADE:");

        varQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lb_unidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_unidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_unidade.setText("UNIDADE(S)");

        btOkQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btOkQuantidade.setText("OK");
        btOkQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkQuantidadeActionPerformed(evt);
            }
        });

        lb_total.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_total.setText("TOTAL:");

        varTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCancelar.setText("CANCELAR");

        btConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btConfirmar.setText("CONFIRMAR");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btConfirmar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(lb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lb_codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lb_valor_produto)
                                    .addComponent(lb_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(varCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(varCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btOkProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(varTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(varValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(varQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lb_unidade)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btOkQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 114, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(varNumeroComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_numero_comanda)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(btPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(varNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(varCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btOkProduto))
                    .addComponent(lb_codigo_produto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_nome_produto)
                    .addComponent(varNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_valor_produto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_quantidade)
                    .addComponent(lb_unidade)
                    .addComponent(btOkQuantidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_total))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar)
                    .addComponent(btCancelar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String termoPesquisa = varNumeroComanda.getText().trim();
        try {
            sessao = HibernateUtil.abrirConexao();
            clientes = clienteDao.pesquisarId(Long.valueOf(termoPesquisa), sessao);
            if (clientes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum cliente com esse código!");
            } else {
                clientes.add(cliente);
                varCliente.setText(clientes.get(0).getNome());
            }
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível pesquisar o cliente: " + ex.getMessage());
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btOkProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkProdutoActionPerformed
        if (validarPesquisa()) {
            String termoPesquisa = varCodigoProduto.getText().trim();
            try {
                sessao = HibernateUtil.abrirConexao();
                produtos = produtoDao.pesquisarPorCodigo(termoPesquisa, sessao);
                if (produtos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum produto com esse código!");
                } else {
                    produtos.add(produto);

                    varNomeProduto.setText(produtos.get(0).getNome());
                    varValorProduto.setText(String.valueOf(produtos.get(0).getValor()));
                }
            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível pesquisar os produtos: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btOkProdutoActionPerformed

    private void btOkQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkQuantidadeActionPerformed
        String valor = varQuantidade.getText().trim();
        try {
            sessao = HibernateUtil.abrirConexao();
            varTotal.setText(String.valueOf(Double.valueOf(produtos.get(0).getValor()) * Double.valueOf(valor)));

        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível pesquisar os produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_btOkQuantidadeActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        try {
        double saldo = clientes.get(0).getSaldo();
            sessao = HibernateUtil.abrirConexao();
            Double atualizado = saldo - Double.valueOf(varTotal.getText().trim());
            clientes.get(0).setSaldo(atualizado);
            clienteDao.salvarOuAlterar(clientes.get(0), sessao);
            dispose();;

        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível pesquisar os produtos: " + ex.getMessage());
        }
    }//GEN-LAST:event_btConfirmarActionPerformed

    private boolean validarPesquisa() {
        if (varCodigoProduto.getText().trim().length() > 10) {
            JOptionPane.showMessageDialog(null, "Valor de filtro não pode ultrapassar 10 caracteres!");
            return false;
        } else if (!validarFiltro()) {
            return false;
        }
        return true;
    }

    private boolean validarFiltro() {
        String valorFiltro = varCodigoProduto.getText().trim();
        if (valorFiltro.length() < 1) {
            JOptionPane.showMessageDialog(null, "Digite pelo menos 1 caracteres para pesquisar pelo código!");
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarConsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btOkProduto;
    private javax.swing.JButton btOkQuantidade;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_codigo_produto;
    private javax.swing.JLabel lb_nome_produto;
    private javax.swing.JLabel lb_numero_comanda;
    private javax.swing.JLabel lb_quantidade;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel lb_unidade;
    private javax.swing.JLabel lb_valor_produto;
    private javax.swing.JLabel varCliente;
    private javax.swing.JTextField varCodigoProduto;
    private javax.swing.JLabel varNomeProduto;
    private javax.swing.JTextField varNumeroComanda;
    private javax.swing.JTextField varQuantidade;
    private javax.swing.JLabel varTotal;
    private javax.swing.JLabel varValorProduto;
    // End of variables declaration//GEN-END:variables
}
