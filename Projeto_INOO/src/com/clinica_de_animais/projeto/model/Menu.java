package com.clinica_de_animais.projeto.model;
import java.util.Scanner;

public class Menu {
    private Scanner leitura;

    public Menu(Scanner leitura) {
        this.leitura = leitura;
    }

    public void exibirMenuFuncionario() {

        //Acho que não precisa escolher qual tipo de funcionário é
        //Quando cadastrar já vai ter escrito na função e aí a gente faz um get
        //e verifica qual é a área de atuação
        System.out.println("\nSelecione qual funcionário você é:\n" +
                           "1. Administrador\n" +
                           "2. Groomer\n" +
                           "3. Veterinário\n" +
                           "0. Voltar");
        System.out.print("Escolha uma opção: ");

        if (!leitura.hasNextInt()) {
            System.out.println("Por favor, insira um número válido.");
            leitura.nextLine();
            return;
        }

        int opcao = leitura.nextInt();
        leitura.nextLine();

        switch (opcao) {
            case 1:
                exibirMenuAdministrador(); 
                break;
            case 2:
                //gromer
                break;
            case 3:
                //vet
                break;
            case 0:
                System.out.println("Voltando ao menu principal.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    public void exibirMenuAdministrador() {
        while (true) {
            System.out.println("__________________________________");
            System.out.println("|                                 |");
            System.out.println("| Bem-vindo, Administrador!       |");
            System.out.println("|                                 |");
            System.out.println("| Como deseja acessar?            |");
            System.out.println("|                                 |");
            System.out.println("| 1. Cadastrar novo funcionário   |");
            System.out.println("| 2. Cadastrar animal para adoção |");
            System.out.println("| 3. Listar todos os cadastros    |");
            System.out.println("| 0. Sair                         |");
            System.out.println("|_________________________________|");
            System.out.print("\n> Escolha uma opção: ");

            if (!leitura.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                leitura.nextLine();
                continue;
            }

            int opcao_adm = leitura.nextInt();
            leitura.nextLine();

            switch (opcao_adm) {
                case 1:
                //cadastarr funcinoario
                    break;
                case 2:
                //cadastarar nimal
                    break;
                case 3:
                    //listar tuido
                    Dono.listarDonos();
                    break;
                case 0:
                    System.out.println("Voltando ao menu.");
                    return; 
                default:
                    if(opcao_adm !=0){
                    System.out.println("Opção inválida. Tente novamente.");
                    }
            }
        }
    }

    public void exibirMenuDono(){
        while (true) {
            System.out.println("________________________");
            System.out.println("|                       |");
            System.out.println("| > Dono de Pet         |");
            System.out.println("|                       |");
            System.out.println("| 1. Realizar cadastro  |");
            System.out.println("| 2. Realizar login     |");
            System.out.println("| 0. Voltar             |");
            System.out.println("|_______________________|");
            System.out.print("\n> Escolha uma opção: ");

            if (!leitura.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                leitura.nextLine();
                continue;
            }

            int opcao_login = leitura.nextInt();
            leitura.nextLine();

            switch (opcao_login) {
                case 1:
                    Dono.cadastrarDono(leitura);
                    break;
                case 2:
                    menuLogar();
                    break;
                case 0:
                    System.out.println("Voltando ao menu.");
                    return; 
                default:
                    if(opcao_login !=0){
                    System.out.println("Opção inválida. Tente novamente.");
                    }
            }
        }
    }

    public void menuLogar(){
        while (true) {
            System.out.println("__________________________");
            System.out.println("|                         |");
            System.out.println("| > Dono de Pet           |");
            System.out.println("|                         |");
            System.out.println("| 1. Logar usando email   |");
            System.out.println("| 2. Logar usando CPF     |");
            System.out.println("| 0. Voltar               |");
            System.out.println("|_________________________|");
            System.out.print("\n> Escolha uma opção: ");

            if (!leitura.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                leitura.nextLine();
                continue;
            }

            int opcao_login = leitura.nextInt();
            leitura.nextLine();

            if (opcao_login == 0){
                System.out.println("Voltando ao menu.");
                return; 
            }else if (opcao_login != 0 && opcao_login != 1 && opcao_login != 2){
                System.out.println("Opção inválida. Tente novamente.");
            }else{
                Dono.realizarLoginDono(leitura, opcao_login);
            }
        }
    }
}

