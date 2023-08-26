package dados;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Regi
 */
public class Produtodao {

    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public boolean conectar() { // método que vai fazer a conexão com o banco de dados 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lojas_tanger_2", "root", "81397848");
            System.out.println("Conectado");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }

    public void desconectar() { // método que vai desconectar do banco de dados 
        try {
            conn.close();
            System.out.println("Desconectado!");
        } catch (SQLException ex) {

        }
    }

    public int salvar(Produto produto) {  // método que vai salvar o filme no banco de dados
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO produtos VALUES(?,?,?)");
            st.setString(1, produto.getNome());
            st.setInt(2, produto.getCodigo());
            st.setInt(3, produto.getQuantidade());
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public boolean excluir(int id) { // método para excluir um filme do banco de dados
        try {
            st = conn.prepareStatement("DELETE FROM produtos WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public int atualizar(Produto produto) { // método que vai fazer uptade de uma informação insetida no banco de dados
        int status;
        try {
            st = conn.prepareStatement("UPDATE produtos SET nome=?, quantidade=? WHERE id=?");
            st.setString(1, produto.getNome());
            st.setInt(2, produto.getQuantidade());
            st.setInt(3, produto.getCodigo());
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
            
        }
    }

    public Produto consultar(int id) { // método que vai consultar e retornar um objeto pelo seu nome 

        try {
            Produto produto = new Produto();
            st = conn.prepareStatement("SELECT * from produtos WHERE id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                produto.setNome(rs.getString("nome"));
                produto.setCodigo(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
                return produto;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    public List<Produto> listagem(String filtro) { // método que vai listar todos os filmes do banco de dados
        String sql = "select * from produtos";
        if (!filtro.isEmpty()) {
            sql = sql + " where id like?";
        }
        try {
            st = conn.prepareStatement(sql);
            if (!filtro.isEmpty()) {
                st.setString(1, "%" + filtro + "%");
            }
            rs = st.executeQuery();
            List<Produto> listaproduto = new ArrayList<>();
            //verificar se a consulta encontrou o filme informado
            while (rs.next()) { // se encontrou o filme, vamos carregar os dados
                Produto produto = new Produto();
                produto.setNome(rs.getString("nome"));
                produto.setCodigo(rs.getInt("id"));
                produto.setQuantidade(rs.getInt("quantidade"));
                listaproduto.add(produto);

            }
            return listaproduto;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

}
