package to_do_list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class GerenciarTarefa {


    ArrayList<Tarefas> listaTarefas = new ArrayList<>();

    public GerenciarTarefa() {
        //Classe representa um objeto de controle:
        // precisa ser instanciada sem parâmetros, pra o programa poder chamá-la no main, estando  vazia
    }


    public void criarTarefa(Scanner sc) {


        IO.println("Digite o título: ");
        String titulo = sc.nextLine().toLowerCase();
        IO.println("Digite a descrição da tarefa: ");
        String descricao = sc.nextLine();
        IO.println("Digite a data de entrega no formato(yyyy-mm-dd): ");
        LocalDate dataEntrega = LocalDate.parse(sc.nextLine());
        // Lê a data digitada pelo usuário (no formato AAAA-MM-DD) e converte a String para um objeto LocalDate.


        Tarefas novaTarefa = new Tarefas(titulo, descricao, dataEntrega);
        listaTarefas.add(novaTarefa);


        IO.println(listaTarefas);

    }

    public void tarefaPendente() {
        IO.println("****** TAREFAS PENDENTES ******\n");
        for (Tarefas tarefa : listaTarefas) {
            if (tarefa.getStatus() == true) {
                IO.println(tarefa);
            }

        }
    }

    public void buscarTitulo(Scanner sc) {
        IO.println("Digite o título desejado: ");
        String buscar = sc.nextLine();

        for (Tarefas tarefa : listaTarefas) {
            if (tarefa.getTitulo().toLowerCase().contains(buscar.toLowerCase())) {
                IO.println(tarefa);
            }
        }
    }

    public void alterarStatus(Scanner sc) {
        IO.println("Qual tarefa foi concluída? ");
        String buscar = sc.nextLine();

        for (Tarefas tarefa : listaTarefas) {
            if (tarefa.getTitulo().toLowerCase().contains(buscar.toLowerCase())) {
                tarefa.setStatus(false);
                IO.println("Tarefa concluída com sucesso!");
            } else {
                return;
            }
        }
    }

    public void apagarTarefa(Scanner sc) {
        IO.println("Qual tarefa deseja apagar? ");
        String buscar = sc.nextLine();

        for (Tarefas tarefa : listaTarefas) {

            if (tarefa.getTitulo().toLowerCase().contains(buscar.toLowerCase())) {
                System.out.printf("Você tem certeza que deseja apagar a tarefa: " + tarefa + " ? (S/N)");
                String confirmar = sc.nextLine();

                if (confirmar.equalsIgnoreCase("S")) {
                    listaTarefas.removeIf(t -> t.getTitulo().toLowerCase().contains(buscar.toLowerCase()));
                    IO.println("Tarefa apagada com sucesso!");
                } else {
                    IO.println("Operação cancelada. ");

                }
                ;

            } else {
                IO.println("Tarefa não encontrada. ");
            }
            break;
        }
    }

    public void listarTodasTarefas() {
        IO.println("****** TAREFAS CADASTRADAS ******\n");
        for (Tarefas tarefa : listaTarefas) {
            IO.println(tarefa);
        }
    }
}







