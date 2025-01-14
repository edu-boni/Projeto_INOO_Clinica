package com.clinica_de_animais.projeto.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Dono {
    private static ArrayList<Dono> donos = new ArrayList<>();
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    public Dono(String nome, String email, String telefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
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

    public static void cadastrarDono(Scanner leitura) {
        System.out.print("Digite o nome do dono: ");
        String nome = leitura.nextLine();
        System.out.print("Digite o email do dono: ");
        String email = leitura.nextLine();
        System.out.print("Digite o telefone do dono: ");
        String telefone = leitura.nextLine();
        System.out.print("Digite o endereço do dono: ");
        String endereco = leitura.nextLine();

        Dono novoDono = new Dono(nome, email, telefone, endereco);
        donos.add(novoDono);
        System.out.println("\nDono cadastrado com sucesso!");
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
