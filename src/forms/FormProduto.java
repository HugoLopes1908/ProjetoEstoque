/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;
import beans.Produto;
import dao.ProdutoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hugo Lopes
 */
public class FormProduto extends javax.swing.JFrame {
   
    /**
     * Creates new form FormProduto
     */
    public FormProduto() {
        initComponents();
        preencheTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jComboBoxGrupo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEstoqueMinimo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        Salvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        PesquisarProd = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabelFundoTelaCadProdInfo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jLabelFundoTelaCadProd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de estoque");
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Produto"));
        jPanel2.setLayout(null);

        jLabel1.setText("Nome");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(81, 30, 40, 14);
        jPanel2.add(txtNome);
        txtNome.setBounds(81, 53, 240, 20);

        jComboBoxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Alimento", "Bebida", "Limpeza" }));
        jPanel2.add(jComboBoxGrupo);
        jComboBoxGrupo.setBounds(331, 53, 91, 20);

        jLabel2.setText("Grupo");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(331, 30, 40, 14);

        jLabel3.setText("Descrição");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(16, 84, 60, 14);
        jPanel2.add(txtDescricao);
        txtDescricao.setBounds(16, 104, 325, 20);

        jLabel4.setText("Quantidade");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(402, 30, 70, 14);
        jPanel2.add(txtQtd);
        txtQtd.setBounds(475, 27, 47, 20);

        jLabel5.setText("Estoque Minimo");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(378, 107, 90, 14);
        jPanel2.add(txtEstoqueMinimo);
        txtEstoqueMinimo.setBounds(478, 104, 44, 20);

        jLabel6.setText("Cod");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(16, 30, 30, 14);

        txtId.setEnabled(false);
        jPanel2.add(txtId);
        txtId.setBounds(16, 53, 38, 20);

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        jPanel2.add(Salvar);
        Salvar.setBounds(20, 160, 63, 23);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEditar);
        jButtonEditar.setBounds(90, 160, 61, 23);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonExcluir);
        jButtonExcluir.setBounds(163, 160, 70, 23);
        jPanel2.add(txtPesquisa);
        txtPesquisa.setBounds(250, 160, 116, 20);

        PesquisarProd.setText("Pesquisar");
        PesquisarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarProdActionPerformed(evt);
            }
        });
        jPanel2.add(PesquisarProd);
        PesquisarProd.setBounds(369, 160, 90, 23);

        jButton8.setText("Sair");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(470, 160, 51, 23);

        jLabelFundoTelaCadProdInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/c2e271e7c2c54ae4157c092f89185114.jpg"))); // NOI18N
        jPanel2.add(jLabelFundoTelaCadProdInfo);
        jLabelFundoTelaCadProdInfo.setBounds(10, 20, 520, 180);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 11, 540, 216);

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome do Produto", "Descrição", "Grupo", "Qtd", "Estq Minimo"
            }
        ));
        jScrollPane3.setViewportView(tblProduto);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 233, 540, 130);

        jLabelFundoTelaCadProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/c2e271e7c2c54ae4157c092f89185114.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoTelaCadProd);
        jLabelFundoTelaCadProd.setBounds(0, 0, 1180, 380);

        setSize(new java.awt.Dimension(572, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // TODO add your handling code here:
        String nome = txtNome.getText();
        String descricao = txtDescricao.getText();
        String grupo =  (String) jComboBoxGrupo.getSelectedItem();
        int qtd = Integer.parseInt(txtQtd.getText());
        int estoque = Integer.parseInt(txtEstoqueMinimo.getText());

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setDescricao(descricao);
        produto.setGrupo(grupo);
        produto.setQtd(qtd);
        produto.setEstoque(estoque);

        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.inserir(produto);
        
        
        txtNome.setText("");
        txtDescricao.setText("");
        txtQtd.setText("");
        txtEstoqueMinimo.setText("");
        
        

    }//GEN-LAST:event_SalvarActionPerformed

    private void PesquisarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarProdActionPerformed
        // TODO add your handling code here:
        int idPesquisa = Integer.parseInt(txtPesquisa.getText());
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = produtoDAO.getProduto(idPesquisa);
        if(produto == null){
            JOptionPane.showMessageDialog(this, "Produto não encontrado!");
        }
        else{
            //preencher os campos do meu form
            txtId.setText(String.valueOf(produto.getId()));
            txtNome.setText(produto.getNome());
            txtDescricao.setText(produto.getDescricao());
            jComboBoxGrupo.setSelectedItem(produto.getGrupo());
            txtQtd.setText(Integer.toString(produto.getQtd()));
            txtEstoqueMinimo.setText(Integer.toString(produto.getEstoque()));
            
        }
    }//GEN-LAST:event_PesquisarProdActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        String nome = txtNome.getText();
        String descricao = txtDescricao.getText();
        String grupo =  (String) jComboBoxGrupo.getSelectedItem();
        int qtd = Integer.parseInt(txtQtd.getText());
        int estoque = Integer.parseInt(txtEstoqueMinimo.getText());

        Produto produto = new Produto();
        produto.setId(id);
        produto.setNome(nome);
        produto.setDescricao(descricao);
        produto.setGrupo(grupo);
        produto.setQtd(qtd);
        produto.setEstoque(estoque);

        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.editar(produto);

        txtId.setText("");
        txtNome.setText("");
        txtDescricao.setText("");
        txtQtd.setText("");
        txtEstoqueMinimo.setText("");
        
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.excluir(id);
        
        txtId.setText("");
        txtNome.setText("");
        txtDescricao.setText("");
        txtQtd.setText("");
        txtEstoqueMinimo.setText("");
    }//GEN-LAST:event_jButtonExcluirActionPerformed
    public void preencheTabela(){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        List<Produto> listaProduto = produtoDAO.getProduto();
        //converter a estrutura da jtble para um default
        DefaultTableModel tabelaProduto = (DefaultTableModel) tblProduto.getModel();//import da default pode ser um erro!
        
        //percorrer a lista curso e salvar na jtable
        for(Produto p : listaProduto){
            Object[] obj = new Object[]{
                p.getId(),
                p.getNome(),
                p.getDescricao(),
                p.getGrupo(),
                p.getQtd(),
                p.getEstoque()
            };
            //pegar minha tabela e adicional as linhas do meu Obj;
            tabelaProduto.addRow(obj);
            
        }
    }
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
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PesquisarProd;
    private javax.swing.JButton Salvar;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JComboBox<String> jComboBoxGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFundoTelaCadProd;
    private javax.swing.JLabel jLabelFundoTelaCadProdInfo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueMinimo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables

    void setVisable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
