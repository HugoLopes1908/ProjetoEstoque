/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JOptionPane;



/**
 *
 * @author Hugo Lopes
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        Sair = new javax.swing.JButton();
        Acessar = new javax.swing.JButton();
        senha = new javax.swing.JPasswordField();
        jLabelFundoimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela login");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(61, 87, 50, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(73, 125, 40, 14);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(122, 84, 196, 20);

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/door_out.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(230, 160, 90, 25);

        Acessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/application_go.png"))); // NOI18N
        Acessar.setText("Acessar");
        Acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcessarActionPerformed(evt);
            }
        });
        getContentPane().add(Acessar);
        Acessar.setBounds(120, 160, 100, 25);

        senha.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        getContentPane().add(senha);
        senha.setBounds(122, 122, 196, 20);

        jLabelFundoimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/unnamed.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoimg);
        jLabelFundoimg.setBounds(0, 0, 390, 270);

        setSize(new java.awt.Dimension(402, 297));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void AcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcessarActionPerformed
        // TODO add your handling code here:
        //chamar tela
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
        
        //fiz um laço para adicionar a tela login a senha e o usario de inicio;
        if(txtUsuario.getText().equals("usuario")&& senha.getText().equals("1234")){
            
            JOptionPane.showMessageDialog(null, "Bem vindo");
            }
        else{
            JOptionPane.showMessageDialog(null, "Acesso negado"); 
        }
    }//GEN-LAST:event_AcessarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acessar;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFundoimg;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}