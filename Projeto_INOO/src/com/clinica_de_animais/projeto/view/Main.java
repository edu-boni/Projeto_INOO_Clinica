package com.clinica_de_animais.projeto.view;
import com.clinica_de_animais.projeto.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Bem-vindo à Clínica de Animais!");
        while (true) {
            System.out.println("\nMenu Principal:\n" +
                               "1. Cadastrar Dono\n" +
                               "2. Cadastrar Animal\n" +
                               "3. Cadastrar Funcionário\n" +
                               "4. Listar Funcionários\n" +
                               "5. Listar Animais\n" +
                               "6. Listar Donos e Seus Animais\n" +
                               "7. Gerar Relatório de Atendimentos\n" +
                               "8. Remover ou Editar Registro\n" +
                               "9. Alterar Status de Saúde e Higiene dos Animais\n" +
                               "0. Sair\n");
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();
            ler.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarDono();
                    break;
                case 2:
                    cadastrarAnimal();
                    break;
                case 3:
                    cadastrarFuncionario();
                    break;
                case 4:
                    listarFuncionarios();
                    break;
                case 5:
                    listarAnimais();
                    break;
                case 6:
                    listarDonosEAnimais();
                    break;
                case 7:
                    gerarRelatorioAtendimentos();
                    break;
                case 8:
                    editarOuRemoverRegistro();
                    break;
                case 9:
                    alterarStatusAnimal();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}