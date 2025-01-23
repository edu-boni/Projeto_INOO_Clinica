package com.clinica_de_animais.projeto.view;
import com.clinica_de_animais.projeto.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Menu menu = new Menu(leitura);

        while (true) {
            System.out.println("__________________________________");
            System.out.println("|                                 |");
            System.out.println("| Bem-vindo à clínica Pet Repete! |");
            System.out.println("|                                 |");
            System.out.println("| Como deseja acessar?            |");
            System.out.println("|                                 |");
            System.out.println("| 1. Sou tutor de pet             |");
            System.out.println("| 2. Sou colaborador              |");
            System.out.println("| 0. Sair                         |");
            System.out.println("|_________________________________|");
            System.out.print("\n> Escolha uma opção: ");

            if (!leitura.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                leitura.nextLine();
                continue;
            }

            int opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    menu.exibirMenuTutor();
                    break;
                case 2:
                    Colaborador.realizarLoginColaborador(leitura);
                    break;
                case 0:
                    System.out.println("\nO sistema será encerrado. Obrigado por utilizar!");
                    leitura.close();
                    return;
                case 1357:
                    menu.exibirMenuAdministrador();
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }
}