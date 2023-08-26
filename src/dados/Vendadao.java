package dados;

import com.mysql.cj.xdevapi.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import java.sql.ResultSet;

/**
 *
 * @author Regi
 */
public class Vendadao {

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

    public int salvar(Venda venda) {
        int status;
        
        try {
            st = conn.prepareStatement("INSERT INTO vendas VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            st.setInt(1, venda.getId());
            st.setDate(2, venda.getData());
            st.setString(3, venda.getNomeCliente());
            st.setInt(4, venda.getCodCliente());
            st.setString(5, venda.getCpfCliente());
            st.setInt(6, venda.getCodVendedor());
            st.setInt(7, venda.getCodProduto());
            st.setDouble(8, venda.getValorTotal());
            st.setString(9, venda.getCupom());
            st.setInt(10, venda.getQntdProd());
            st.setString(11, venda.getPrimeiraCompra());

            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    public boolean excluir(int id) {
        try {
            st = conn.prepareStatement("DELETE FROM vendas WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public int atualizar(Venda venda) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE vendas SET data=?, nome=?,id_cliente=?,cpf=?,id_vendedor=?,id_produto=?,valor=?,cupom=?,quantidade=?,primeira_compra=? WHERE id=?");
            st.setDate(1, venda.getData());
            st.setString(2, venda.getNomeCliente());
            st.setInt(3, venda.getCodCliente());
            st.setString(4, venda.getCpfCliente());
            st.setInt(5, venda.getCodVendedor());
            st.setInt(6, venda.getCodProduto());
            st.setDouble(7, venda.getValorTotal());
            st.setString(8, venda.getCupom());
            st.setInt(9, venda.getQntdProd());
            st.setString(10, venda.getPrimeiraCompra());
            st.setInt(11, venda.getId());
            
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();

        }
    }

    public Venda consultar(int id) {

        try {
            Venda venda = new Venda();
            st = conn.prepareStatement("SELECT * from vendas WHERE id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                venda.setId(rs.getInt("id"));
                venda.setData(rs.getDate("data"));
                venda.setNomeCliente(rs.getString("nome"));
                venda.setCodCliente(rs.getInt("id_cliente"));
                venda.setCpfCliente(rs.getString("cpf"));
                venda.setCodVendedor(rs.getInt("id_vendedor"));
                venda.setCodProduto(rs.getInt("id_produto"));
                venda.setValorTotal(rs.getDouble("valor"));
                venda.setCupom(rs.getString("cupom"));
                venda.setQntdProd(rs.getInt("quantidade"));
                venda.setPrimeiraCompra(rs.getString("primeira_compra"));
                return venda;

            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

    public List<Venda> listagem(String filtro) {

        String sql = "select * from vendas";
        if (!filtro.isEmpty()) {
            sql = sql + " where id like?";
        }
        try {
            st = conn.prepareStatement(sql);
            if (!filtro.isEmpty()) {
                st.setString(1, "%" + filtro + "%");
            }
            rs = st.executeQuery();
            List<Venda> listavenda = new ArrayList<>();

            while (rs.next()) {
                Venda venda = new Venda();
                venda.setId(rs.getInt("id"));
                venda.setData(rs.getDate("data"));
                venda.setNomeCliente(rs.getString("nome"));
                venda.setCodCliente(rs.getInt("id_cliente"));
                venda.setCpfCliente(rs.getString("cpf"));
                venda.setCodVendedor(rs.getInt("id_vendedor"));
                venda.setCodProduto(rs.getInt("id_produto"));
                venda.setValorTotal(rs.getDouble("valor"));
                venda.setCupom(rs.getString("cupom"));
                venda.setQntdProd(rs.getInt("quantidade"));
                venda.setPrimeiraCompra(rs.getString("primeira_compra"));
                listavenda.add(venda);

            }
            return listavenda;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }

}
