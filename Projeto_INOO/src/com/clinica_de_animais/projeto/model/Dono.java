package com.clinica_de_animais.projeto.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Dono {
    private static ArrayList<Dono> donos = new ArrayList<>();
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;
    private String senha;

    public Dono(String nome, String email, String cpf, String telefone, String endereco, String senha) {
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

    public static void cadastrarDono(Scanner leitura) {
        System.out.print("Nome: ");
        String nome = leitura.nextLine();

        System.out.print("Email: ");
        String email = leitura.nextLine();
        for (Dono dono : donos) {
            if (email.equalsIgnoreCase(dono.getEmail())) {
                System.out.println("Este e-mail não está disponível.\nSe você é o dono deste e-mail, tente realizar o login");
                return;
            }
        }

        System.out.print("CPF: ");
        String cpf = leitura.nextLine();
        for (Dono dono : donos) {
            if (cpf.equalsIgnoreCase(dono.getCpf())) {
                System.out.println("Este CPF não está disponível.\nSe você é o dono deste CPF, tente realizar o login");
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
                System.out.println("A senha deve ter pelo menos 4 caracteres.");
                continue; 
            }

            System.out.print("Confirme a senha: ");
            senhaTemp = leitura.nextLine();

            if (!senha.equals(senhaTemp)) {
                System.out.println("As senhas devem ser iguais!");
            }
        } while (senha.length() < 4 || !senha.equals(senhaTemp));

        Dono novoDono = new Dono(nome, email, cpf, telefone, endereco, senha);
        donos.add(novoDono);
        System.out.println("\nDono cadastrado com sucesso!");

        System.out.println("Deseja cadastrar um animal agora?");
        System.out.println("1. Sim");
        System.out.println("2. Não");
        int opcao = leitura.nextInt();
        leitura.nextLine(); 

        if (opcao == 1) {
            //Animal.cadastrarAnimal(leitura);
        } else {
            System.out.println("Cadastro do dono finalizado. Você pode cadastrar um animal mais tarde.");
        }
    }

    public static void realizarLoginDono(Scanner leitura, int opcao_login) {
        String identificador;
        if (opcao_login == 1) { 
            System.out.print("Email: ");
            identificador = leitura.nextLine();
        } else {
            System.out.print("CPF: ");
            identificador = leitura.nextLine();
        }
    
        System.out.print("Digite a senha: ");
        String senha = leitura.nextLine();
    
        for (Dono dono : donos) {
            if ((opcao_login == 1 && identificador.equalsIgnoreCase(dono.getEmail())) ||
                (opcao_login == 2 && identificador.equalsIgnoreCase(dono.getCpf()))) {
                if (senha.equals(dono.getSenha())) { 
                    System.out.println("\nLogin realizado com sucesso! Bem-vindo, " + dono.getNome() + "!");
                    return; // por eqt 
                } else {
                    System.out.println("\nSenha incorreta. Tente novamente.");
                    return;
                }
            }
        }
    
        System.out.println("\nDados de login não encontrados. Verifique as informações ou cadastre-se.");
    }
    

    public static void listarDonos() {
        if (donos.isEmpty()) {
            System.out.println("\nNão há donos cadastrados.");
        } else {
            for (Dono dono : donos) {
                System.out.println("Nome: " + dono.getNome());
                System.out.println("Email: " + dono.getEmail());
                System.out.println("Telefone: " + dono.getTelefone());
                System.out.println("Endereço: " + dono.getEndereco());
                System.out.println("-------------------------");
            }
        }
    }
}
