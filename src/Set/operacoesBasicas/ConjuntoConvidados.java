package Set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //Atributo que representa um conjunto de convidado com a interface Set
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        //Iniciado o conjunto de convidados com  implemtação do HashSet
        this.convidadoSet = new HashSet<>();
    }

    /**
     *  Adiciona um convidado ao conjunto.
     * @param nome
     * @param codigoConvite
     */
    public void adicionarConvidado(String nome, int codigoConvite){
        this.convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    /**
     * Remove um convidado do conjunto com base no código do convite.
     * @param codigoConvite
     */
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for (Convidado c : this.convidadoSet){
            if (c.getCodConvite()==codigoConvite){
                this.convidadoSet.remove(c);
                break;
            }
        }
    }

    /**
     *  Conta o número total de convidados no Set.
     * @return int
     */
    public int contarConvidados(){
        return this.convidadoSet.size();
    }

    /**
     * Exibe todos os convidados do conjunto.
     */
    public void exibirConvidados(){
        System.out.println(this.convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.adicionarConvidado("Nome 1", 1);
        convidados.adicionarConvidado("Nome 2", 2);
        convidados.adicionarConvidado("Nome 22", 2);
        convidados.adicionarConvidado("Nome 3", 3);
        convidados.adicionarConvidado("Nome 4", 4);

        System.out.println("Número de convidados: "+convidados.contarConvidados());
        convidados.exibirConvidados();
        convidados.removerConvidadoPorCodigoConvite(2);
        System.out.println("Número de convidados: "+convidados.contarConvidados());
        convidados.exibirConvidados();
    }
}
