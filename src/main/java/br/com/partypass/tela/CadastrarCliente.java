package br.com.partypass.tela;

import br.com.partypass.dao.ClienteDao;
import br.com.partypass.dao.ClienteDaoImpl;
import br.com.partypass.dao.HibernateUtil;
import br.com.partypass.entidade.Cliente;
import br.com.partypass.util.MyQRCode;
import com.google.zxing.WriterException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.hibernate.Session;

public class CadastrarCliente extends javax.swing.JFrame {

    private ClienteDao clienteDao = new ClienteDaoImpl();
    private Cliente cliente;
    private Session sessao;
    private Date data = new Date();

    public CadastrarCliente() {
        initComponents();
        lb_situacao.setVisible(false);
        btSituacao.setVisible(false);
        lb_saldo.setVisible(false);
        varSaldo.setVisible(false);
    }

    public CadastrarCliente(Cliente cliente) {
        initComponents();
        btCadastrar.setText("Alterar");
        lb_titulo.setText("Alterar Cliente");
        carregarAlteracaoCliente(cliente);
        this.cliente = cliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_nome = new javax.swing.JLabel();
        varNome = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        lb_situacao = new javax.swing.JLabel();
        btSituacao = new javax.swing.JToggleButton();
        lb_nome1 = new javax.swing.JLabel();
        varEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        lb_cpf = new javax.swing.JLabel();
        varCpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        varData = new com.toedter.calendar.JDateChooser();
        lb_saldo = new javax.swing.JLabel();
        varSaldo = new javax.swing.JFormattedTextField();
        lb_telefone = new javax.swing.JLabel();
        varTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Usuário");

        lb_nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome.setText("Nome:");

        btCadastrar.setBackground(new java.awt.Color(153, 153, 153));
        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lb_situacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_situacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_situacao.setText("Situação:");

        btSituacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSituacao.setText("Ativo");
        btSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSituacaoActionPerformed(evt);
            }
        });

        lb_nome1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_nome1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_nome1.setText("Email:");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        lb_titulo.setBackground(new java.awt.Color(204, 0, 204));
        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Cadastrar Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        lb_cpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_cpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_cpf.setText("CPF:");

        try {
            varCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Data de Nascimento: ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Logo PartyPass I.png"))); // NOI18N

        lb_saldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_saldo.setText("Saldo:");

        varSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        lb_telefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_telefone.setText("Telefone: ");

        try {
            varTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(varNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lb_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_telefone)
                                    .addComponent(lb_situacao))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(varTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(varCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(lb_saldo)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(varData, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                            .addComponent(varSaldo)))
                                    .addComponent(varEmail)
                                    .addComponent(btSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome1)
                    .addComponent(varEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_cpf)
                        .addComponent(varCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(varData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_telefone)
                        .addComponent(varTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(varSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_saldo))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_situacao)
                    .addComponent(btSituacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btCadastrar)
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed

        sessao = HibernateUtil.abrirConexao();
        data = varData.getDate();
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            data = inputFormat.parse(varData.getDateFormatString());
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (validarFormulario()) {
            if ((data == null)) {
                JOptionPane.showMessageDialog(null,
                        "Selecione uma data de nascimento");
            }
            if (cliente == null) {
                cliente = new Cliente();
                cliente.setAtivo(true);
                cliente.setSenha("12345");
                cliente.setDataNascimento(data);

            } else {
                buscarValorAtivoBotao();
            }

            cliente.setNome(varNome.getText());
            cliente.setEmail(varEmail.getText());
            cliente.setCpf(varCpf.getText());
            cliente.setTelefone(varTelefone.getText());

            clienteDao.salvarOuAlterar(cliente, sessao);
            dispose();
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!");
            String path = "qrcode-" + cliente.getId() + ".png";
            try {
                MyQRCode.createQRCodeForClient(cliente, path);

            } catch (WriterException | IOException e) {
                e.printStackTrace();
            }

            String caminhoImagem = "qrcode-" + cliente.getId() + ".png";
            JOptionPane.showMessageDialog(null, criarJOptionPaneComImagem(caminhoImagem), "Seu QRCode", JOptionPane.PLAIN_MESSAGE);

        }

    }//GEN-LAST:event_btCadastrarActionPerformed

    public static JPanel criarJOptionPaneComImagem(String caminhoImagem) {
        ImageIcon icon = new ImageIcon(caminhoImagem);
        JLabel label = new JLabel(icon);
        JPanel panel = new JPanel();
        panel.add(label);
        return panel;
    }

    private void carregarAlteracaoCliente(Cliente cliente1) {
        this.cliente = cliente1;
        varNome.setText(cliente1.getNome());
        varEmail.setText(cliente1.getEmail());
        varCpf.setText(cliente1.getCpf());
        varTelefone.setText(cliente1.getTelefone());

    }

    private void buscarValorAtivoBotao() {
        if (btSituacao.getText().equals("Ativo")) {
            cliente.setAtivo(true);
        } else {
            cliente.setAtivo(false);
        }
    }
    private void btSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSituacaoActionPerformed
        System.out.println("Valor botão: " + btSituacao.getText());
        if (btSituacao.getText().equals("Ativo")) {
            btSituacao.setText("Inativo");
        } else {
            btSituacao.setText("Ativo");
        }
    }//GEN-LAST:event_btSituacaoActionPerformed

    private boolean validarFormulario() {
        String nome = varNome.getText().trim();
        if (validarCampoMenor3Caracter(nome)) {
            JOptionPane.showMessageDialog(null, "Preencha o nome corretamente!");
            return false;
        }
        String login = varEmail.getText().trim();
        if (validarCampoMenor3Caracter(login)) {
            JOptionPane.showMessageDialog(null, "Preencha o login corretamente!");
            return false;
        }
        String cpf = varCpf.getText().trim();
        if (cpf.length() < 14) {
            JOptionPane.showMessageDialog(null, "Digite um CPF correto");
            return false;
        }

        return true;
    }

    private boolean validarCampoMenor3Caracter(String campo) {
        return campo.length() < 3;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarCliente().setVisible(true);
            }
        });
    }

    private void gerarImagem() {
        JOptionPane.showMessageDialog(null, sessao);

        // Carrega a imagem do arquivo
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("caminho/para/imagem.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Cria um ImageIcon com a imagem carregada
        ImageIcon icon = new ImageIcon(img);
    }

//    private void gerarQRCode() {
//        String nome = varNome.getText();
//        String telefone = varTelefone.getText();
//
//        MyQRCode qrCode = new MyQRCode();
//        String data = "Nome: " + nome + "\nTelefone: " + telefone;
//        String path = "qrCode.png";
//        String charset = "UTF-8";
//        Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
//        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
//        try {
//            qrCode.createQR(data, path, charset, hashMap, 200, 200);
//
//            // carregar a imagem do QR Code e definir como ícone do JLabel
//            ImageIcon icon = new ImageIcon(path);
////            lblQRCode.setIcon(icon);
//
//            JOptionPane.showMessageDialog(CadastrarCliente.this, "QR Code gerado com sucesso!");
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(CadastrarCliente.this, "Erro ao gerar QR Code: " + ex.getMessage());
//      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JToggleButton btSituacao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_nome1;
    private javax.swing.JLabel lb_saldo;
    private javax.swing.JLabel lb_situacao;
    private javax.swing.JLabel lb_telefone;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JFormattedTextField varCpf;
    private com.toedter.calendar.JDateChooser varData;
    private javax.swing.JTextField varEmail;
    private javax.swing.JTextField varNome;
    private javax.swing.JFormattedTextField varSaldo;
    private javax.swing.JFormattedTextField varTelefone;
    // End of variables declaration//GEN-END:variables
}
