package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefalist;

    public ListaTarefas() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefalist) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O número total de tarefas que você tem pra fazer hoje é: "
                + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tomar banho");
        listaTarefas.adicionarTarefa("Ir pra casa da minha namorada");
        listaTarefas.adicionarTarefa("Estudar Angular");
        listaTarefas.adicionarTarefa("Estudar Java");

        System.out.println("O número total de tarefas que você tem pra fazer hoje é: "
                + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tomar banho");
        System.out.println("O número total de tarefas que você tem pra fazer hoje é: "
                + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
