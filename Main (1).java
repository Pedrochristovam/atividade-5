import java.util.ArrayList;
import java.util.Scanner;

class Produto {
  private String nome;
  private double preco;

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }
}

class Funcionario {
  public void ajudarCliente() {
    System.out.println("Funcionario: Posso ajudar?");
  }

  public void processarCompra(ArrayList<Produto> carrinho) {
    double total = 0;
    System.out.println("Funcionário: Vamos processar sua compra.");
    for (Produto produto : carrinho) {
      System.out.println("Produto: " + produto.getNome() + " - Preço: R$ " + produto.getPreco());
      total += produto.getPreco();
    }
    System.out.println("Total a pagar: R$ " + total);
    System.out.println("Funcionário:Pagamento feito com sucesso.");
  }
}

public class supermercado {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        ArrayList<Produto> carrinho = new ArrayList<>();

        
        Produto p1 = new Produto("Arroz", 10.50);
        Produto p2 = new Produto("Feijão", 8.75);
        Produto p3 = new Produto("Leite", 4.25);
        produto p4 = new produto("macarrão", 3.50);
        
        carrinho.add(p1);
        carrinho.add(p2);
        carrinho.add(p3);
        carrinho.add(p4);
      
        System.out.println("Cliente: Muito obrigado.");
        funcionario.ajudarCliente();

        
        System.out.println("Funcionario: Volte sempre");
        for (Produto produto : carrinho) {
        funcionario.processarCompra(carrinho);
    }
}
