package treino;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

public class CaixaSupermercado {
    private List<Produto> produtos;

    public CaixaSupermercado() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (Produto produto : produtos) {
            subtotal += produto.getPreco() * produto.getQuantidade();
        }
        return subtotal;
    }

    public double calcularTotal() {
        double subtotal = calcularSubtotal();
        double total = subtotal * 1.1; // Adiciona 10% de imposto sobre o subtotal
        return total;
    }

    public Map<Double, Integer> calcularTroco(double valorPago) {
        double total = calcularTotal();
        double troco = valorPago - total;
        
        Map<Double, Integer> notasTroco = new HashMap<>();
        double[] notas = {100, 50, 20, 10, 5, 2, 1};
        for (double nota : notas) {
            int qtdNotas = (int) (troco / nota);
            if (qtdNotas > 0) {
                notasTroco.put(nota, qtdNotas);
                troco -= qtdNotas * nota;
            }
        }
        
        return notasTroco;
    }

    public static void main(String[] args) {
        CaixaSupermercado caixa = new CaixaSupermercado();

        // Adicionando produtos
        caixa.adicionarProduto(new Produto("Arroz", 5.0, 2));
        caixa.adicionarProduto(new Produto("Feijão", 4.0, 1));

        // Calculando o total
        double total = caixa.calcularTotal();
        System.out.println("Total a ser pago: " + total);

        // Calculando o troco
        double valorPago = 20.0;
        Map<Double, Integer> notasTroco = caixa.calcularTroco(valorPago);
        System.out.println("Troco:");
        for (Map.Entry<Double, Integer> entry : notasTroco.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
