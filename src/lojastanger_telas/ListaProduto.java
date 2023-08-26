package lojastanger_telas;
import dados.Produto;
import java.util.ArrayList;
import java.util.List;


public class ListaProduto {
    
    private static final List<Produto> listaProduto = new ArrayList<>();
    public static List<Produto> Listar(){
        return listaProduto;
        
    }
    public static void Adicionar(Produto prod){
        listaProduto.add(prod);
    }
}
