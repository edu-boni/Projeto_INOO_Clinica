package com.clinica_de_animais.projeto.view;
import com.clinica_de_animais.projeto.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Menu menu = new Menu(leitura);
        Jabuti t1 = new Jabuti(null, false);
        Coelho c1 = new Coelho(null, false);
        Cachorro c2 = new Cachorro(null, false);
        Gato g1 = new Gato(null, false);
        Passaro p2 = new Passaro(null, false);

        t1.som();
        t1.saltar();
        t1.exibirFoto();

        c1.som();
        c1.adoecer();
        c1.exibirFoto();
        
        g1.som();
        g1.exibirFoto();
        
        c2.som();
        c2.sujar();
        c2.exibirFoto();
        
        p2.som();
        p2.exibirFoto();
        //c3.exibirFoto();

        while (true) {
            System.out.println("__________________________________");
            System.out.println("|                                 |");
            System.out.println("| Bem-vindo à clínica Pet Repete! |");
            System.out.println("|                                 |");
            System.out.println("| Como deseja acessar?            |");
            System.out.println("|                                 |");
            System.out.println("| 1. Sou dono de pet              |");
            System.out.println("| 2. Sou funcionário              |");
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
                    menu.exibirMenuDono();
                    break;
                case 2:
                    menu.exibirMenuFuncionario();
                    break;
                case 0:
                    System.out.println("O sistema será encerrado. Obrigado por utilizar!");
                    leitura.close();
                    return;
                case 1357:
                    menu.exibirMenuAdministrador();
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
