import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrinho{

    Date dataDaCompra;
    Cliente cliente;
    List<Produto> produtos = new ArrayList<>();

    Carrinho(Cliente cliente){
        this.dataDaCompra = new Date();
        this.cliente = cliente;
        cliente.adicionarCarrinho(this);
    }

    void adicionarProduto(Produto produto){
        this.produtos.add(produto);
        produto.carrinhos.add(this);
    }

}