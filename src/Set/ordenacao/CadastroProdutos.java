package Set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    /**
     * Adiciona um produto ao cadastro.
     * @param cod
     * @param nome
     * @param preco
     * @param quantidade
     */
    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        this.produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    /**
     * Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
     * @return produtosPorNome
     */
    public void exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(this.produtoSet);
        System.out.println(produtosPorNome);
    }

    /**
     * Exibe todos os produtos do cadastro em ordem crescente de preço.
     * @return
     */
    public void exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(this.produtoSet);
        System.out.println(produtosPorPreco);
    }

    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();
        produtos.adicionarProduto(1, "Produto 3", 20d, 3);
        produtos.adicionarProduto(2, "Produto 1", 20.5d, 1);
        produtos.adicionarProduto(3, "Produto 2", 15d, 2);
        produtos.adicionarProduto(3, "Produto 2.2", 10d, 2);
        produtos.adicionarProduto(1, "Produto 3.3", 20d, 3);
        System.out.println(produtos.produtoSet);
        produtos.exibirProdutosPorNome();
        produtos.exibirProdutosPorPreco();
    }
}


