package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    if (!tarefaList.isEmpty()) {
      for (Tarefa t : tarefaList) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
          tarefasParaRemover.add(t);
        }
      }
      tarefaList.removeAll(tarefasParaRemover);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTarefas() {
    if (!tarefaList.isEmpty()) {
      System.out.println(tarefaList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public static void main(String[] args) {

    ListaTarefa listaTarefa = new ListaTarefa();

    listaTarefa.adicionarTarefa("Comprar leite");
    listaTarefa.adicionarTarefa("Estudar para o exame");
    listaTarefa.adicionarTarefa("Fazer exercícios");

    System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

    listaTarefa.obterDescricoesTarefas();

    listaTarefa.removerTarefa("Trabalhar");

    System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

    listaTarefa.obterDescricoesTarefas();

    listaTarefa.removerTarefa("Estudar para o exame");

    System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
  }
}
