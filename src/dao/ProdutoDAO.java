/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import beans.Produto;
import java.sql.PreparedStatement;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hugo Lopes
 */
public class ProdutoDAO {
    
    private Conexao conexao;
    private Connection conn;
    
    public ProdutoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    public void inserir(Produto produto){
        String sql = "INSERT INTO produto(nome, descricao, grupo, qtd, estoque) VALUES "
                + "(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
              stmt.setString(1, produto.getNome());
              stmt.setString(2, produto.getDescricao());
              stmt.setString(3, produto.getGrupo());
              stmt.setInt(4, produto.getQtd());
              stmt.setInt(5, produto.getEstoque());
            
              stmt.execute();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso:");
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir produto:" + ex.getMessage());
        }
    }
    
    //criar metodo para editar;
    public void editar(Produto produto)
    {
        String sql = "UPDATE produto SET nome=?, descricao=?, grupo=?, qtd=?, estoque=? WHERE id=?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
              stmt.setString(1, produto.getNome());
              stmt.setString(2, produto.getDescricao());
              stmt.setString(3, produto.getGrupo());
              stmt.setInt(4, produto.getQtd());
              stmt.setInt(5, produto.getEstoque());
              stmt.setInt(6, produto.getId());
              stmt.execute();
        } catch (Exception e) {
             System.out.println("Erro ao editar produto:" + e.getMessage());
        }
    }
    
    //metodo deletar
    public void excluir(int id)
    {
        String sql = "DELETE FROM produto WHERE id = ?";
        try {
           PreparedStatement stmt = this.conn.prepareStatement(sql); 
           stmt.setInt(1, id);
           stmt.execute();
           
            } 
        catch (Exception e) {
            System.out.println("Erro ao excluir produto:" + e.getMessage());
            }
    }
    
    //cria um metodo para buscar o produto no banco de dados;
    public Produto getProduto(int id)
    {
        String sql = "SELECT * FROM produto WHERE id = ?";
        try {
             PreparedStatement stmt = this.conn.prepareStatement(sql);
               stmt.setInt(1, id);
               ResultSet rs = stmt.executeQuery(); //me retorna um resultset;
               Produto produto = new Produto();
               //trazer meu resultset da pesquisa para a variavel  produto;
              rs.first();
               produto.setId(id);
               produto.setNome(rs.getString("nome"));
               produto.setDescricao(rs.getString("descricao"));
               produto.setGrupo(rs.getString("grupo"));
               produto.setQtd(rs.getInt("qtd"));
               produto.setEstoque(rs.getInt("estoque"));
               return produto;
            } 
        catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao buscar produto!/nErro:" + e.getMessage());
            
            return null;
        }
    }
    
    //metodo para acessar varios produtos
    public List<Produto> getProduto()
    {
    String sql = "SELECT * FROM produto";
        try {
             PreparedStatement stmt = this.conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();
             List<Produto> listaProduto = new ArrayList<>();
             
             //percoore meu Resultset e salva as informações numa var Produto, e dps salva numa lista.
             while(rs.next()){
                 Produto produto = new Produto();
                  produto.setId(rs.getInt("id"));
                  produto.setNome(rs.getString("nome"));
                  produto.setDescricao(rs.getString("descricao"));
                  produto.setGrupo(rs.getString("grupo"));
                  produto.setQtd(rs.getInt("qtd"));
                  produto.setEstoque(rs.getInt("estoque"));
                  listaProduto.add(produto);
                 
             }
             return listaProduto;
            } 
        catch (Exception e) {
            return null;
            }
    }
    //criar metodo para editar;
    public void Comprar(int qtd)
    {
        String sql = "UPDATE produto SET WHERE qtd=?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
              stmt.setInt(1, qtd);
             
              stmt.execute();
        } catch (Exception e) {
             System.out.println("Erro ao comprar produto:" + e.getMessage());
        }
    }
    
            
    
}
