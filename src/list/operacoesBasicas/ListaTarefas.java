package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    //atributos
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String desc){
        this.tarefaList.add(new Tarefa(desc));
    }

    public void removerTarefa(String desc){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : this.tarefaList){
            if(t.getDescricao().equalsIgnoreCase(desc)){
                tarefasParaRemover.add(t);
            }
        }
        this.tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return this.tarefaList.size();
    }

    public void imprimirDescricoesTarefas(){
        System.out.println(this.tarefaList);
    }


    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();
        System.out.println("Número total de elementos na lista de tarefas é: "+tarefas.obterNumeroTotalTarefas());
        tarefas.adicionarTarefa("Tarefa 1");
        tarefas.adicionarTarefa("Tarefa 2");
        tarefas.adicionarTarefa("Tarefa 3");
        tarefas.adicionarTarefa("Tarefa 3");
        System.out.println("Número total de elementos na lista de tarefas é: "+tarefas.obterNumeroTotalTarefas());
        tarefas.removerTarefa("Tarefa 3");
        System.out.println("Número total de elementos na lista de tarefas é: "+tarefas.obterNumeroTotalTarefas());
        tarefas.imprimirDescricoesTarefas();
    }
}
