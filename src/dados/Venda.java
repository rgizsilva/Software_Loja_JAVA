package dados;

import java.sql.Date;

public class Venda {

    Date data;
    String nomeCliente;
    int codCliente;
    String cpfCliente;
    int codVendedor;
    int codProduto;
    int qntdProd;
    double valorTotal;
    String primeiraCompra;
    int id;
    String cupom;

    public Venda() {

    }

    public Venda(int id,Date data, String nomeCliente, int codCliente, String cpfCliente, int codVendedor, int codProduto, int qntdProd, Double valorTotal, String primeiraCompra, String cupom) {
        this.id = id;
        this.data = data;
        this.nomeCliente = nomeCliente;
        this.codCliente = codCliente;
        this.cpfCliente = cpfCliente;
        this.codVendedor = codVendedor;
        this.codProduto = codProduto;
        this.qntdProd = qntdProd;
        this.valorTotal = valorTotal;
        
        this.primeiraCompra = primeiraCompra;
        this.cupom = cupom;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimeiraCompra() {
        return primeiraCompra;
    }

    public void setPrimeiraCompra(String primeiraCompra) {
        this.primeiraCompra = primeiraCompra;
    }

    public String getCupom() {
        return cupom;
    }

    public void setCupom(String cupom) {
        this.cupom = cupom;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQntdProd() {
        return qntdProd;
    }

    public void setQntdProd(int qntdProd) {
        this.qntdProd = qntdProd;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }


}
