package br.com.partypass.tela;

import br.com.partypass.dao.HibernateUtil;
import br.com.partypass.dao.ProdutoDao;
import br.com.partypass.dao.ProdutoDaoImpl;
import br.com.partypass.entidade.Produto;
import br.com.partypass.exceptions.ProdutoAtivoException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class CadastrarProduto extends javax.swing.JFrame {

    private Produto produto;
    private final ProdutoDao produtoDao = new ProdutoDaoImpl();
    private Session sessao;

    public CadastrarProduto() {
        initComponents();
    }

    public CadastrarProduto(Produto produto) {
        initComponents();
        this.produto = produto;
        varCodigo.setText(produto.getCodigo());
        varNome.setText(produto.getNome());
        varTipo.setSelectedItem(produto.getTipo());
        varValor.setText(String.valueOf(produto.getValor()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        varCodigo = new javax.swing.JTextField();
        varNome = new javax.swing.JTextField();
        varTipo = new javax.swing.JComboBox<>();
        btCadastrar = new javax.swing.JButton();
        varValor = new javax.swing.JTextField();
        lb_codigo = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        lb_tipo = new javax.swing.JLabel();
        lb_valor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setResizable(false);

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Cadastro de Produto");

        varTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um tipo...", "Bebida", "Comida", "Outros" }));
        varTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varTipoActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lb_codigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_codigo.setText("Código Produto:");

        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        lb_tipo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_tipo.setText("Tipo de Produto:");

        lb_valor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_valor.setText("Valor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lb_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_tipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_valor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(varValor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(varTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 138, Short.MAX_VALUE))
                            .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(273, 273, 273))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_codigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tipo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_valor)
                    .addComponent(varValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btCadastrar)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void varTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varTipoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        if (validarFormulario()) {
            if (produto == null) {
                produto = new Produto();
            }
        }
        carregarFormulario();
        try {
            sessao = HibernateUtil.abrirConexao();
            produtoDao.salvarOuAlterar(produto, sessao);
            JOptionPane.showMessageDialog(null, "Produto criado/alterado com sucesso!\n"
                    + "O código do seu produto é " + produto.getCodigo());
            this.dispose();
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto!");
        } finally {
            sessao.close();
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void carregarFormulario() {
        produto.setCodigo(varCodigo.getText().trim());
        produto.setNome(varNome.getText().trim());
        produto.setTipo((String) varTipo.getSelectedItem());
        produto.setValor(Double.valueOf(varValor.getText().trim()));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    private boolean validarFormulario() {
        if (varTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecione um tipo de produto!");
            return false;
        } else if (varCodigo.getText().trim().length() < 4) {
            JOptionPane.showMessageDialog(null, "O código do produto deve ter no mínimo 4 caracteres!");
            return false;
        } else if (varNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o nome do produto!");
            return false;
        } else if (varValor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o valor do produto!");
            return false;
        } else if (varNome.getText().trim().length() < 6) {
            JOptionPane.showMessageDialog(null, "O nome do produto deve ter no mínimo 6 caracteres!");
            return false;
        }

        sessao = HibernateUtil.abrirConexao();
        List<Produto> codigosProdutos = produtoDao.pesquisarPorCodigo(varCodigo.getText().trim(), sessao);
        for (Produto produto : codigosProdutos) {
            if (produto.getCodigo().equals(varCodigo.getText().trim())) {
                JOptionPane.showMessageDialog(null, "O código do produto já existe no sistema!");
                return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_codigo;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_tipo;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_valor;
    private javax.swing.JTextField varCodigo;
    private javax.swing.JTextField varNome;
    private javax.swing.JComboBox<String> varTipo;
    private javax.swing.JTextField varValor;
    // End of variables declaration//GEN-END:variables
}
