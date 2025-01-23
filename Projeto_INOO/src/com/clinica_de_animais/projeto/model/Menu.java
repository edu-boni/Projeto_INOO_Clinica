package com.clinica_de_animais.projeto.model;
import java.util.Scanner;

public class Menu {
    private Scanner leitura;

    public Menu(Scanner leitura) {
        this.leitura = leitura;
    }
    
    public void exibirMenuAdministrador() {
        while (true) {
            System.out.println("__________________________________");
            System.out.println("|                                 |");
            System.out.println("| Bem-vindo, Administrador!       |");
            System.out.println("|                                 |");
            System.out.println("| Como deseja acessar?            |");
            System.out.println("|                                 |");
            System.out.println("| 1. Cadastrar novo colaborador   |");
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
                    Colaborador.cadastrarColaborador(leitura);
                    break;
                case 2:
                    //Animal.cadastrarAnimal(leitura, cpf);
                    break;
                case 3:
                    //listar tuido
                    Tutor.listarTutores();
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

    public void exibirMenuTutor(){
        while (true) {
            System.out.println("________________________");
            System.out.println("|                       |");
            System.out.println("| > Tutor de Pet        |");
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
                    Tutor.cadastrarTutor(leitura);
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
            System.out.println("| > Tutor de Pet          |");
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
                Tutor.realizarLoginTutor(leitura, opcao_login);
            }
        }
    }


    public static void exibirMenuLogadoTutor(Scanner leitura){
        Tutor tutorLogado = Tutor.getTutorLogado();
        if (tutorLogado == null) {
            System.out.println("\nNenhum tutor está logado.");
            return;
        }
        while (true) {
            System.out.println("_________________________________________");
            System.out.println("|                                        |");
            System.out.println(  "| Olá, " + tutorLogado.getNome() + "!    |");
            System.out.println("|                                        |");
            System.out.println("| 1. Exibir perfil                       |");
            System.out.println("| 2. Cadastrar novo pet                  |");
            System.out.println("| 3. Animais disponíveis para adoção     |");
            System.out.println("| 4. Ver seus pets                       |");
            System.out.println("| 5. Atualizar estado do pet             |");
            System.out.println("| 0. Sair                                |");
            System.out.println("|________________________________________|");
            System.out.print("\n> Escolha uma opção: ");

            if (!leitura.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                leitura.nextLine();
                continue;
            }

            int opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao){
                case 1: 
                    Tutor.exibirTutorLogado(leitura);
                    break;
                
                case 2:
                    Animal.cadastrarAnimal(leitura, tutorLogado.getCpf());
                    break;
                
                case 3:
                    Animal.exibirAnimaisDisponiveis(leitura, tutorLogado);
                    break;
                
                case 4:
                    Animal.exibirAnimalPorTutor(tutorLogado.getCpf(), leitura);
                    break;
                
                case 5:
                    Animal.exibirMenuEstadoPet(tutorLogado, leitura);
                    break;
                case 0:
                    System.out.println("Você foi deslogado com sucesso!");
                    Tutor.setTutorLogado(null);
                    return;
            }
        }
    }
}

