package Set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    //Conjunto de objetos do tipo "Contato" com a interface Set
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        //Utilizando a implementação do HashSet
        this.contatoSet = new HashSet<>();
    }

    /**
     * Adiciona um contato à agenda.
     * @param nome
     * @param numero
     */
    public void adicionarContato(String nome, int numero){
        this.contatoSet.add(new Contato(nome, numero));
    }

    /**
     *  Exibe todos os contatos da agenda.
     */
    public void exibirContatos(){
        System.out.println(this.contatoSet);
    }

    /**
     * Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
     * @param nome
     * @return
     */
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: this.contatoSet){
            if(c.getNome().toLowerCase().startsWith(nome.toLowerCase())){
                contatosPorNome.add(c);
            }
        }
        if (contatosPorNome.isEmpty()){
            System.out.println("Contato com o nome {"+nome+"} não existe.");
        }
        return contatosPorNome;
    }

    /**
     * Atualiza o número de telefone de um contato específico.
     * @param nome
     * @param novoNumero
     */
    public void atualizarNumeroContato(String nome, int novoNumero){
        for (Contato c: this.contatoSet){
            if(c.getNome().toLowerCase().startsWith(nome.toLowerCase())){
                c.setNumero(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("Tiago", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria", 123);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Vanessa", 88889999);
        agendaContatos.adicionarContato("Christian", 77778888);
        agendaContatos.adicionarContato("Maria da Silva", 55555555);

        // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();

        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        // Atualizando o número de um contato
        agendaContatos.atualizarNumeroContato("Christian", 44443333);
        System.out.println("Contato atualizado: " + agendaContatos);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }

}
