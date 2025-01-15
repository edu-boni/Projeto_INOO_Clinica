package com.clinica_de_animais.projeto.view;
import com.clinica_de_animais.projeto.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Menu menu = new Menu(leitura);

        Tartaruga t1 = new Tartaruga("brice","Tartaruga");
        t1.exibirFoto();
        Coelho c1 = new Coelho("brice","Coelho");
        c1.exibirFoto();
        Cachorro c2 = new Cachorro("bruno", "Cachorro");
        c2.exibirFoto();

        while (true) {
            System.out.println("_______________________________");
            System.out.println("Bem-vindo à Clínica Pet Repete!\n");
            System.out.println("Como deseja acessar?\n" +
                               "1. Sou dono de pet\n" +
                               "2. Sou funcionário\n" +
                               "0. Sair");
            System.out.println("_______________________________|");
            System.out.print("\nEscolha uma opção: ");

            if (!leitura.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                leitura.nextLine();
                continue;
            }

            int opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    Dono.cadastrarDono(leitura);
                    break;
                case 2:
                    menu.exibirMenuFuncionario();
                    break;
                case 0:
                    System.out.println("O sistema será encerrado. Obrigado por utilizar!");
                    leitura.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}


/* while (true) {
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
            if (!ler.hasNextInt()) { 
                System.out.println("Por favor, insira um número válido.");
                ler.nextLine(); 
                continue;
            } */
