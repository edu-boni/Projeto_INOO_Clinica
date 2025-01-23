package com.clinica_de_animais.projeto.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Tutor {
    private static ArrayList<Tutor> tutores = new ArrayList<>();
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;
    private String senha;

    public Tutor(String nome, String email, String cpf, String telefone, String endereco, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
       return senha;
    }

    public static void cadastrarTutor(Scanner leitura) {
        System.out.println("\n> Cadastro de Tutor de Pet");

        System.out.print("\nNome: ");
        String nome = leitura.nextLine();

        System.out.print("Email: ");
        String email = leitura.nextLine();
        for (Tutor tutor : tutores) {
            if (email.equalsIgnoreCase(tutor.getEmail())) {
                System.out.println("\nEste e-mail não está disponível.\nSe você é o tutor deste e-mail, tente realizar o login");
                return;
            }
        }

        System.out.print("CPF: ");
        String cpf = leitura.nextLine();
        for (Tutor tutor : tutores) {
            if (cpf.equalsIgnoreCase(tutor.getCpf())) {
                System.out.println("\nEste CPF não está disponível.\nSe você é o tutor deste CPF, tente realizar o login");
                return;
            }
        }

        System.out.print("Telefone: ");
        String telefone = leitura.nextLine();

        System.out.print("Endereço: ");
        String endereco = leitura.nextLine();

        String senha;
        String senhaTemp = "";

        do {
            System.out.print("Digite a senha (mínimo 4 caracteres): ");
            senha = leitura.nextLine();
            if (senha.length() < 4) {
                System.out.println("\nA senha deve ter pelo menos 4 caracteres.");
                continue; 
            }

            System.out.print("Confirme a senha: ");
            senhaTemp = leitura.nextLine();

            if (!senha.equals(senhaTemp)) {
                System.out.println("\nAs senhas devem ser iguais!");
            }
        } while (senha.length() < 4 || !senha.equals(senhaTemp));

        Tutor novoTutor = new Tutor(nome, email, cpf, telefone, endereco, senha);
        tutores.add(novoTutor);

        System.out.println("\nTutor cadastrado com sucesso!");

        System.out.println("________________________________________");
        System.out.println("|                                      |");
        System.out.println("| > Deseja cadastrar um animal agora?  |");
        System.out.println("|                                      |");
        System.out.println("| 1. Sim                               |");
        System.out.println("| 2. Não                               |");
        System.out.println("|______________________________________|");
        System.out.print("\n> Escolha uma opção: ");
        int opcao = leitura.nextInt();
        leitura.nextLine(); 

        //FAZER VERIFICACAO
        if (opcao == 1) {
            Animal.cadastrarAnimal(leitura, cpf);
        } else {
            System.out.println("\nCadastro do tutor finalizado. Você pode cadastrar um animal mais tarde.\n");
        }
        
    }

    public static void realizarLoginTutor(Scanner leitura, int opcao_login) {
        String identificador;
        System.out.println("\n> Login Tutor de Pet");
        if (opcao_login == 1) { 
            System.out.print("\nEmail: ");
            identificador = leitura.nextLine();
        } else {
            System.out.print("\nCPF: ");
            identificador = leitura.nextLine();
        }
    
        Tutor tutorEncontrado = null;
    
        for (Tutor tutor : tutores) {
            if ((opcao_login == 1 && identificador.equalsIgnoreCase(tutor.getEmail())) ||
                (opcao_login == 2 && identificador.equalsIgnoreCase(tutor.getCpf()))) {
                tutorEncontrado = tutor;
                break; 
            }
        }
    
        if (tutorEncontrado == null) {
            System.out.println("\nDados de login não encontrados. Verifique as informações ou cadastre-se.");
            return;
        }
    
        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = leitura.nextLine();
    
            if (!senha.equals(tutorEncontrado.getSenha())) {
                System.out.println("\nSenha incorreta. Tente novamente.");
            }
    
        } while (!senha.equals(tutorEncontrado.getSenha()));
        setTutorLogado(tutorEncontrado);
        System.out.println("\nLogin realizado com sucesso! Bem-vindo, " + tutorEncontrado.getNome() + "!");
        Menu.exibirMenuLogadoTutor(leitura);
    }
    
    private static Tutor tutorLogado;

    public static void setTutorLogado(Tutor tutor) {
        tutorLogado = tutor;
    }

    public static Tutor getTutorLogado() {
        return tutorLogado;
    }

    
    public static void listarTutores() {
        if (tutores.isEmpty()) {
            System.out.println("\nNão há tutores cadastrados.");
        } else {
            for (Tutor tutor : tutores) {
                System.out.println("Nome: " + tutor.getNome());
                System.out.println("Email: " + tutor.getEmail());
                System.out.println("Telefone: " + tutor.getTelefone());
                System.out.println("Endereço: " + tutor.getEndereco());
                System.out.println("-------------------------");
            }
        }
    }

    public static void exibirTutorLogado(Scanner leitura) {
        System.out.println("_________________________________________");
        System.out.println("|                                        |");
        System.out.println("|            Perfil do Tutor             |");
        System.out.println("|________________________________________|");
        System.out.println("| Nome: " + tutorLogado.getNome());
        System.out.println("| Email: " + tutorLogado.getEmail());
        System.out.println("| CPF: " + tutorLogado.getCpf());
        System.out.println("| Telefone: " + tutorLogado.getTelefone());
        System.out.println("| Endereço: " + tutorLogado.getEndereco());
        System.out.println("|________________________________________|");
    
        System.out.println("\nPressione a tecla ENTER para retornar ao menu anterior...");
        leitura.nextLine(); 
    }
    
}
