package Exercicio01;

public class Fatura {
    String numero;
    String descricao;
    int quantComprada;
    double preco;

    public double valorFatura() {
        double total = quantComprada * preco;
        return total;
    }

}
