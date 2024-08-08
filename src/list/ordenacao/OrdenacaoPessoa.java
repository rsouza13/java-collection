package list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    //Atributos
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> orderPorIdade(){
        List<Pessoa> pessoaListSortIdade = pessoaList;
        Collections.sort(pessoaListSortIdade);
        return pessoaListSortIdade;
    }

    public List<Pessoa> orderPorAltura(){
        List<Pessoa> pessoaListSortAltura = pessoaList;
        //Collections.sort(pessoaListSortAltura, new ComparatorPorAltura());
        pessoaListSortAltura.sort(new ComparatorPorAltura());
        return pessoaListSortAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 22, 1.85);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 20, 1.75);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 18, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 25, 1.70);

        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.orderPorIdade());
        System.out.println(ordenacaoPessoa.orderPorAltura());
    }

}
