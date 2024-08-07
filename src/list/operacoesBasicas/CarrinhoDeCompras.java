package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //Atributos
    private List<Item> listaDeItens;

    public CarrinhoDeCompras() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.listaDeItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i: this.listaDeItens){
           if(i.getNome().equalsIgnoreCase(nome)){
               itensParaRemover.add(i);
           }
        }
        this.listaDeItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double total=0d;
        for (Item i: this.listaDeItens){
            total+=i.getPreco()*i.getQuantidade();
        }
        return total;
    }

    public void imprimirItensDoCarrinho(){
        if(this.listaDeItens.isEmpty()){
            System.out.println("O carrinho está vazio!");
        }else{
            System.out.println(this.listaDeItens);
        }
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("Valor total do carrinho R$ "+carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.adicionarItem("Notebook", 1500.99, 1);
        carrinhoDeCompras.adicionarItem("Teclado", 99.99, 1);
        carrinhoDeCompras.adicionarItem("Monitor", 600, 2);
        carrinhoDeCompras.imprimirItensDoCarrinho();
        System.out.println("Valor total do carrinho R$ "+carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Notebook");
        carrinhoDeCompras.imprimirItensDoCarrinho();
        System.out.println("Valor total do carrinho R$ "+carrinhoDeCompras.calcularValorTotal());
    }
}
