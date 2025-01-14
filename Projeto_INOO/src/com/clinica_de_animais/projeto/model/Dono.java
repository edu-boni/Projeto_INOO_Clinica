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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarDono() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do dono: ");
        String nome = ler.nextLine();
        System.out.print("Digite o email do dono: ");
        String email = ler.nextLine();
        System.out.print("Digite o telefone do dono: ");
        String telefone = ler.nextLine();
        System.out.print("Digite o endereço do dono: ");
        String endereco = ler.nextLine();

        Dono novoDono = new Dono(nome, email, telefone, endereco);
        donos.add(novoDono);
        System.out.println("Dono cadastrado com sucesso!");

        ler.close(); 
    }
}
