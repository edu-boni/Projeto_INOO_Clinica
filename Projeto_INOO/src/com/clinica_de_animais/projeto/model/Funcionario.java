package com.clinica_de_animais.projeto.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private String nome;
    private String cpf;
    private String cargo;
    private String senha;

    public Funcionario(String nome, String cpf, String cargo, String senha) {
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

    public static void cadastrarFuncionario(Scanner leitura) {
        System.out.print("Nome: ");
        String nome = leitura.nextLine();

        System.out.print("CPF: ");
        String cpf = leitura.nextLine();
        for (Funcionario funcionario : funcionarios) {
            if (cpf.equalsIgnoreCase(funcionario.getCpf())) {
                System.out.println("Este CPF já está cadastrado. Tente outro ou faça login.");
                return;
            }
        }

        String cargo = "";
        int opcao;

        do {
            System.out.println("Escolha o cargo:");
            System.out.println("1. Groomer");
            System.out.println("2. Veterinário");
            System.out.print("> Digite o número correspondente: ");

            if (!leitura.hasNextInt()) {
                System.out.println("Entrada inválida! Digite 1 para Groomer ou 2 para Veterinário.");
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
                        System.out.println("Opção inválida! Escolha 1 para Groomer ou 2 para Veterinário.");
                }
            } while (cargo.isEmpty());

            String senha, senhaTemp = "";;
            do {
                System.out.print("Digite a senha (mínimo 4 caracteres): ");
                senha = leitura.nextLine();

                if (senha.length() < 4) {
                    System.out.println("A senha deve ter pelo menos 4 caracteres.");
                    continue;
                }

                System.out.print("Confirme a senha: ");
                senhaTemp = leitura.nextLine();

                if (!senha.equals(senhaTemp)) {
                    System.out.println("As senhas devem ser iguais!");
                }
        } while (senha.length() < 4 || !senha.equals(senhaTemp));

        Funcionario novoFuncionario = new Funcionario(nome, cpf, cargo, senha);
        funcionarios.add(novoFuncionario);
        System.out.println("\nFuncionário cadastrado com sucesso!");
    }

    public static void realizarLoginFuncionario(Scanner leitura) {
        System.out.print("CPF: ");
        String identificador = leitura.nextLine().trim();

        System.out.print("Digite a senha: ");
        String senha = leitura.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (identificador.equalsIgnoreCase(funcionario.getCpf())) {
                if (senha.equals(funcionario.getSenha())) {
                    System.out.println("\nLogin realizado com sucesso! Bem-vindo, Funcionário(a)" + funcionario.getNome() + "!");
                    //chama o menu funcionario provavelmente?
                    return;
                } else {
                    System.out.println("\nSenha incorreta. Tente novamente.");
                    return;
                }
            }
        }

        System.out.println("\nDados de login não encontrados. Contate o Administrador!");
    }

    public static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("\nNenhum funcionário cadastrado.");
            return;
        }
        System.out.println("\nLista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("- Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo() + ", CPF: " + funcionario.getCpf());
        }
    }
}
