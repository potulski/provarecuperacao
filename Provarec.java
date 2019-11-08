import java.util.Calendar;

public class Provarec{

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR,1998);
        calendario.set(Calendar.MONTH,8);
        calendario.set(Calendar.DATE,25);
        
        Cliente cliente1 = new Cliente("lucas", calendario.getTime(), 5.0);
        Cliente cliente2 = new Cliente("maicon", calendario.getTime(), 10.0);
        Cliente cliente3 = new Cliente("matue", calendario.getTime(), 15.0);
        Cliente cliente4 = new Cliente("garcia", calendario.getTime(), 10.0);
        Cliente cliente5 = new Cliente("Raul", calendario.getTime(), 15.0); 
               
        Produto produto1 = new Produto("sofa", 2200.00, 3) ;
        Produto produto2 = new Produto("celular", 1800.00,3 );
        Produto produto3 = new Produto("tv", 2700.00,3 );
        Produto produto4 = new Produto("pc", 3300.00,3 );
        Produto produto5 = new Produto("geladeira", 1800.00,3 );
        Produto produto6 = new Produto("fone", 200.00, 3 );
        Produto produto7 = new Produto("relogio", 300.00,3 );
        Produto produto8 = new Produto("tenis", 430.00,3 );
        Produto produto9 = new Produto("camiseta", 120.00,3 );
        Produto produto10 = new Produto("mochila", 320.00,3 );

        Carrinho carrinho1 = new Carrinho(cliente1);
        carrinho1.adicionarProduto(produto1);


    }
}
    
