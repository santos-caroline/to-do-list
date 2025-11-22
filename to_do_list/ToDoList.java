package to_do_list;
//Elas+ Tech - Aula técnica 1

import java.util.Scanner;

public class ToDoList {

    static void main(String[] args) {

        GerenciarTarefa gerenciadorTarefa = new GerenciarTarefa(); //cria o objeto responsável por gerenciar as tarefas.
        boolean executando = true;
        while (executando) {

            IO.println("""

                    ********** TO-DO LIST **********\
                    
                    ************* MENU *************\
                    \n
                    1. Criar nova tarefa.\
                    
                    2. Listar tarefas pendentes. \
                    
                    3. Buscar tarefa por título. \
                    
                    4. Marcar como concluída.\
                    
                    5. Excluir tarefa.\
                    
                    6. Listar todas as tarefas.\
                    
                    0. Sair. \
                    
                    Digite apenas o número da opção desejada:""");

            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();
            sc.nextLine(); // limpa o Enter deixado pelo nextInt()

            executando = switch (opcao) {
                case 1 -> {
                    gerenciadorTarefa.criarTarefa(sc);
                    yield true;
                }
                case 2 -> {
                    gerenciadorTarefa.tarefaPendente();
                    yield true;
                }
                case 3 -> {
                    gerenciadorTarefa.buscarTitulo(sc);
                    yield true;
                }
                case 4 -> {
                    gerenciadorTarefa.alterarStatus(sc);

                    yield true;
                }
                case 5 -> {
                    gerenciadorTarefa.apagarTarefa(sc);
                    yield true;
                }
                case 6 -> {
                    gerenciadorTarefa.listarTodasTarefas();
                    yield true;
                }
                case 0 -> false;
                default -> {
                    IO.println("Opção inválida! Tente novamente. ");
                    yield true;
                }
            };

        }
    }
}