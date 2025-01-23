package com.clinica_de_animais.projeto.model;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Animal {
    private static ArrayList<Animal> animais = new ArrayList<>();
    protected int id;
    protected String nome;
    protected int idade;
    protected boolean saudavel = true;
    protected boolean limpo = true;
    protected String tutor;

    private static int contador = 0;

    public interface Caracteristicas {
        void som();
        void exibirFoto();
    }

    public Animal(String nome, int idade) {
        this.id = ++contador;
        this.nome = nome;
        this.idade = idade;
        this.tutor = "CLINICAPETREPETE";  // Default tutor
    }

    public Animal(String nome, int idade, String tutor) {
        this.id = ++contador;
        this.nome = nome;
        this.idade = idade;
        this.tutor = tutor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTutor() {
        return tutor;
    }

    public static void listarAnimaisCadastrados() {
        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Tutor: " + animal.getTutor());
        }
    }

    public static void cadastrarAnimal(Scanner leitura, String cpf) {
        int opcao;

        do {
            System.out.println("\n> Cadastro de Pet");
            System.out.println("_____________________________");
            System.out.println("|                           |");
            System.out.println("| > Escolha a espécie       |");
            System.out.println("|                           |");
            System.out.println("| 1. Cachorro               |");
            System.out.println("| 2. Gato                   |");
            System.out.println("| 3. Pássaro                |");
            System.out.println("| 4. Coelho                 |");
            System.out.println("| 5. Jabuti                 |");
            System.out.println("| 0. Sair                   |");
            System.out.println("|___________________________|");
            System.out.print("\n> Escolha uma opção: ");

            while (!leitura.hasNextInt()) {
                System.out.println("\nPor favor, insira um número válido.");
                leitura.nextLine(); 
            }
            opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao < 0 || opcao > 5) {
                System.out.println("\nOpção inválida! Escolha um número entre 0 e 5.");
            }
        } while (opcao < 0 || opcao > 5);

        System.out.print("\nNome: ");
        String nome = leitura.nextLine();

        System.out.print("\nIdade: ");
        int idade = leitura.nextInt();
        leitura.nextLine(); 

        Animal novoAnimal = null;
        String tutor = cpf;

        switch (opcao) {
            case 1:
                novoAnimal = new Cachorro(nome, idade, tutor);
                break;
            case 2:
                novoAnimal = new Gato(nome, idade, tutor);
                break;
            case 3:
                novoAnimal = new Passaro(nome, idade, tutor);
                break;
            case 4:
                novoAnimal = new Coelho(nome, idade, tutor);
                break;
            case 5:
                novoAnimal = new Jabuti(nome, idade, tutor);
                break;
            case 0:
                System.out.println("Saindo do cadastro...");
                return; 
            default:
                System.out.println("Opção inválida.");
                return;
        }

        if (novoAnimal != null) {
            animais.add(novoAnimal);
            System.out.println(novoAnimal.getClass().getSimpleName() + " foi adicionado(a)!");
        }

        listarAnimaisCadastrados();
    }
}
