/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proestq;

import conexao.Conexao;
import forms.TelaPrincipal;

/**
 *
 * @author Hugo Lopes
 */
public class ProEstq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexao c = new Conexao();
        c.getConexao();
        
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }
    
}
