import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente{


    String nome;
    Date dataNascimento;
    double desconto;
    List<Carrinho> carrinhos = new ArrayList<>();
    Cliente(String nome, Date dataNascimento, double desconto){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.desconto = desconto;

    }

    void adicionarCarrinho(Carrinho carrinho){
        this.carrinhos.add(carrinho);
    }
}