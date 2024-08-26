package Set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{

    //Atributos
    private int cod;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int cod, String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /**
     * Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
     */
    @Override
    public int compareTo(Produto p) {
        return this.getNome().compareToIgnoreCase(p.nome);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCod());
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

/**
 * Exibe todos os produtos do cadastro em ordem crescente de preço.
 */
class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}


