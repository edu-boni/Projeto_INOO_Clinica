package com.clinica_de_animais.projeto.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Colaborador {
    private static ArrayList<Colaborador> colaboradores = new ArrayList<>();
    private String nome;
    private String cpf;
    private String cargo;
    private String senha;

    public Colaborador(String nome, String cpf, String cargo, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public String getSenha() {
        return senha;
    }

    public static void cadastrarColaborador(Scanner leitura) {
        System.out.println("\n> Cadastro de Colaborador");
        System.out.print("\nNome: ");
        String nome = leitura.nextLine();

        System.out.print("CPF: ");
        String cpf = leitura.nextLine();
        for (Colaborador colaborador : colaboradores) {
            if (cpf.equalsIgnoreCase(colaborador.getCpf())) {
                System.out.println("\nEste CPF já está cadastrado. Tente outro ou faça login.");
                return;
            }
        }

        String cargo = "";
        int opcao;

        do {
            System.out.println("________________________");
            System.out.println("|                      |");
            System.out.println("| > Escolha o cargo:   |");
            System.out.println("|                      |");
            System.out.println("| 1. Groomer           |");
            System.out.println("| 2. Veterinário       |");
            System.out.println("|______________________|");
            System.out.print("\n> Digite o número correspondente: ");

            if (!leitura.hasNextInt()) {
                System.out.println("\nEntrada inválida! Digite 1 para Groomer ou 2 para Veterinário.");
                leitura.nextLine(); 
                continue;
            }

            opcao = leitura.nextInt();
            leitura.nextLine();

                switch (opcao) {
                    case 1:
                        cargo = "Groomer";
                        break;
                    case 2:
                        cargo = "Veterinário";
                        break;
                    default:
                        System.out.println("\nOpção inválida! Escolha 1 para Groomer ou 2 para Veterinário.");
                }
            } while (cargo.isEmpty());

            String senha, senhaTemp = "";;
            do {
                System.out.print("\nDigite a senha (mínimo 4 caracteres): ");
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

        Colaborador novoColaborador = new Colaborador(nome, cpf, cargo, senha);
        colaboradores.add(novoColaborador);
        System.out.println("\nColaborador cadastrado com sucesso!");
    }

    public static void realizarLoginColaborador(Scanner leitura) {
        System.out.println("\n> Login Colaborador");
        System.out.print("\nCPF: ");
        String identificador = leitura.nextLine().trim();

        System.out.print("\nDigite a senha: ");
        String senha = leitura.nextLine();

        for (Colaborador colaborador : colaboradores) {
            if (identificador.equalsIgnoreCase(colaborador.getCpf())) {
                if (senha.equals(colaborador.getSenha())) {
                    System.out.println("\nLogin realizado com sucesso! Bem-vindo, Colaborador(a) " + colaborador.getNome() + "!");
                    //chama o menu colaborador provavelmente?
                    return;
                } else {
                    System.out.println("\nSenha incorreta. Tente novamente.");
                    return;
                }
            }
        }

        System.out.println("\nDados de login não encontrados. Contate o Administrador!");
    }

    public static void listarColaboradors() {
        if (colaboradores.isEmpty()) {
            System.out.println("\nNenhum colaborador cadastrado.");
            return;
        }
        System.out.println("\nLista de Colaboradores:");
        for (Colaborador colaborador : colaboradores) {
            System.out.println("- Nome: " + colaborador.getNome() + ", Cargo: " + colaborador.getCargo() + ", CPF: " + colaborador.getCpf());
        }
    }
}
