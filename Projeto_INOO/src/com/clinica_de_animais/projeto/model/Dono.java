package com.clinica_de_animais.projeto.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Dono {
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String senha;

    public Dono(String nome, String email, String telefone, String endereco, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.senha = senha;
    }

    private static ArrayList<Dono> donos = new ArrayList<>();

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

    public static void cadastrarDono(Scanner leitura) {
        System.out.print("Nome: ");
        String nome = leitura.nextLine();
        System.out.print("Email: ");
        String email = leitura.nextLine();
        System.out.print("Telefone: ");
        String telefone = leitura.nextLine();
        System.out.print("Endereço: ");
        String endereco = leitura.nextLine();
        System.out.print("Digite a senha: ");
        String senha = leitura.nextLine();
        System.out.print("Confirme a senha: ");
        String senha_temp = leitura.nextLine();
       
        while (!senha.equals(senha_temp) || senha.length() < 4) {
            if (senha.length() < 4) {
                System.out.println("A senha deve ter pelo menos 4 caracteres.");
            } else {
                System.out.println("As senhas devem ser iguais!");
            }

            System.out.print("Digite a senha: ");
            senha = leitura.nextLine();

            System.out.print("Confirme a senha: ");
            senha_temp = leitura.nextLine();

        Dono novoDono = new Dono(nome, email, telefone, endereco, senha);
        donos.add(novoDono);
        System.out.println("\nDono cadastrado com sucesso!");
        }
    }

    public static void realizarLoginDono(Scanner leitura) {
        System.out.print("Email: ");
        String email = leitura.nextLine();

        System.out.print("Digite a senha: ");
        String senha = leitura.nextLine();

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
