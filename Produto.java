import java.util.ArrayList;
import java.util.List;

public class Produto {

    String nome;
    double valor ;
    int quantidade;
    List<Carrinho> carrinhos = new ArrayList<>();

    Produto(String nome, double valor, int quantidade ){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

}