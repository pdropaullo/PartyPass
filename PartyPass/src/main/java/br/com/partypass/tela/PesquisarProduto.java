package br.com.partypass.tela;

import br.com.partypass.dao.HibernateUtil;
import br.com.partypass.dao.ProdutoDao;
import br.com.partypass.dao.ProdutoDaoImpl;
import br.com.partypass.entidade.Produto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class PesquisarProduto extends javax.swing.JFrame {

    private List<Produto> produtos;
    private Produto produto;
    private final ProdutoDao produtoDao = new ProdutoDaoImpl();
    private Session sessao;

    public PesquisarProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        lb_filtro = new javax.swing.JLabel();
        varPesquisa = new javax.swing.JComboBox<>();
        varProduto = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Produto");
        setResizable(false);

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Pesquisar Produto");

        lb_filtro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_filtro.setText("Selecione um filtro:");

        varPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um filtro...", "Código", "Nome", "Tipo" }));

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Código Produto", "Nome", "Tipo", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProduto.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbProduto.setName(""); // NOI18N
        tbProduto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbProduto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_filtro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_filtro)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(varPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(varProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPesquisar)
                        .addComponent(btAlterar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        if (validarPesquisa()) {
            String termoPesquisa = varProduto.getText().trim();
            int opcaoFiltro = varPesquisa.getSelectedIndex();
            try (Session sessao = HibernateUtil.abrirConexao()) {
                switch (opcaoFiltro) {
                    case 0:
                        produtos = produtoDao.pesquisarTodos(sessao);
                        break;
                    case 1:
                        produtos = produtoDao.pesquisarPorCodigo(termoPesquisa, sessao);
                        if (produtos.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum produto com esse código!");
                        }
                        break;
                    case 2:
                        produtos = produtoDao.pesquisarPorNome(termoPesquisa, sessao);
                        break;
                    case 3:
                        produtos = produtoDao.pesquisarPorTipo(termoPesquisa, sessao);
                        if (produtos.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Nenhum produto encontrado!");
                        } else {
                            carregarTabelaProduto();
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Opção de filtro inválida: " + opcaoFiltro);
                }
                carregarTabelaProduto();
            } catch (HibernateException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível pesquisar os produtos: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void carregarTabelaProduto() {
        DefaultTableModel defaultTable = (DefaultTableModel) tbProduto.getModel();
        defaultTable.setNumRows(0);
        produtos.stream()
                .forEach(produto -> {
                    defaultTable.addRow(new Object[]{
                        produto.getId(),
                        produto.getCodigo(),
                        produto.getNome(),
                        produto.getTipo(),
                        produto.getValor(),});
                });
    }

    private boolean validarPesquisa() {
        if (varProduto.getText().trim().length() > 30) {
            JOptionPane.showMessageDialog(null, "Valor de filtro não pode ultrapassar 30 caracteres!");
            return false;
        } else if (!validarFiltro()) {
            return false;
        }
        return true;
    }

    private boolean validarFiltro() {
        int opcaoPesquisa = varPesquisa.getSelectedIndex();
        String valorFiltro = varProduto.getText().trim();
        if (opcaoPesquisa == 1 && valorFiltro.length() < 1) {
            JOptionPane.showMessageDialog(null, "Digite pelo menos 1 caracteres para pesquisar pelo código!");
            return false;
        } else if (opcaoPesquisa == 2 && valorFiltro.length() < 3) {
            JOptionPane.showMessageDialog(null, "Digite pelo menos 3 caracteres para pesquisar por nome!");
            return false;
        } else if (opcaoPesquisa == 3 && valorFiltro.length() < 1) {
            JOptionPane.showMessageDialog(null, "Digite pelo menos 3 caracteres para pesquisar por tipo!");
            return false;
        }
        return true;
    }

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (tbProduto.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para alterar!");
        } else {
            new CadastrarProduto(produtos.get(tbProduto.getSelectedRow())).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_filtro;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JTable tbProduto;
    private javax.swing.JComboBox<String> varPesquisa;
    private javax.swing.JTextField varProduto;
    // End of variables declaration//GEN-END:variables
}
