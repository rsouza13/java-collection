package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    //Atributos
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosDoAutor = new ArrayList<>();
        for(Livro l:this.livroList){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosDoAutor.add(l);
            }
        }
        return livrosDoAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
        for(Livro l:this.livroList){
            if (l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao()<=anoFinal){
                livrosPorIntervaloDeAno.add(l);
            }
        }
        return livrosPorIntervaloDeAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        for(Livro l:this.livroList){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                return l;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2024);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 5", 2025);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAno(2023, 2024));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 4"));
    }

}
