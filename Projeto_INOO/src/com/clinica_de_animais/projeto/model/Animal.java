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

    protected static int contador = 0;

    public interface Caracteristicas {
        void exibirFoto();
    }

    public Animal (String nome){
        this.nome = nome;
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

    static{
        animais.add(new Cachorro("Rex", 5));
        animais.add(new Gato("Mia", 3));
        animais.add(new Coelho("Branquinho", 2));
        animais.add(new Passaro("Loro", 4));
        animais.add(new Jabuti("Nemo", 1));
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

    public void setSaudavel(boolean saudavel) {
        this.saudavel = saudavel;
    }
    
    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
    

    public boolean isDisponivelAdocao(){
        if (this.tutor.equals("CLINICAPETREPETE")){
            return true;
        }else{
            return false;
        }
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

       // listarAnimaisCadastrados();
    }

    public static void exibirAnimalPorTutor(String tutorLogado, Scanner leitura) {
        System.out.println("_________________________________________");
        System.out.println("|                                        |");
        System.out.println("|         Animais do Tutor Logado        |");
        System.out.println("|________________________________________|");
    
        boolean encontrou = false;  
    
        for (Animal animal : animais) {
            if (animal.getTutor().equals(tutorLogado)) {
                System.out.println("| Espécie: " + animal.getClass().getSimpleName());
                System.out.println("| Nome: " + animal.getNome());
                System.out.println("| Idade: " + animal.getIdade());
                System.out.println("|________________________________________|");
                encontrou = true;
            }
        }
    
        if (!encontrou) {
            System.out.println("| Você ainda não possui nenhum pet!");
        }
    
        System.out.println("\nPressione a tecla ENTER para retornar ao menu anterior...");
        leitura.nextLine(); 
    }
    
    public static void exibirAnimaisDisponiveis(Scanner leitura, Tutor tutorLogado) {
        System.out.println("_________________________________________");
        System.out.println("|                                        |");
        System.out.println("|        Animais Disponíveis para        |");
        System.out.println("|              Adoção                    |");
        System.out.println("|________________________________________|");
    
        boolean encontrou = false;  
    
        for (Animal animal : animais) {
            if (animal.isDisponivelAdocao()) {
                System.out.println("| Espécie: " + animal.getClass().getSimpleName());
                System.out.println("| Nome: " + animal.getNome());
                System.out.println("| Idade: " + animal.getIdade());
                System.out.println("|________________________________________|");
                encontrou = true;
            }
        }
    
        if (!encontrou) {
            System.out.println("| Não há animais disponíveis para adoção no momento.");
        }
    
        System.out.println("\nPressione a tecla ENTER para retornar ao menu anterior...");
        leitura.nextLine(); 
    }
    

    public static void exibirMenuEstadoPet(Tutor tutorLogado, Scanner leitura) {
        int contador = 1;
        boolean petEncontrado = false; 
        ArrayList<Animal> petsEstadoTutor = new ArrayList<>();
        
        System.out.println("_________________________________________");
        System.out.println("|                                        |");
        System.out.println("| Escolha qual pet deseja atualizar      |");
        System.out.println("|                                        |");
        System.out.println("| 0. Voltar                              |");
        for (Animal animal : animais) {
            if (animal.getTutor().equals(tutorLogado.getCpf())) {
                System.out.println("| " + contador + ". [" + animal.getClass().getSimpleName() + "] " + animal.getNome() + " - " + animal.getIdade() + " anos");
                contador++;
                petsEstadoTutor.add(animal);
                petEncontrado = true; 
            }
        }
    
        if (!petEncontrado) {
            System.out.println("Você não tem nenhum pet cadastrado.");
            return;
        }
    
        System.out.print("\n> Escolha uma opção: ");
        
        if (!leitura.hasNextInt()) {
            System.out.println("Por favor, insira um número válido.");
            leitura.nextLine(); 
            return; 
        }
    
        int opcao = leitura.nextInt(); 
        leitura.nextLine();
    
        if (opcao == 0) {
            return;
        }
    
        if (opcao > 0 && opcao <= petsEstadoTutor.size()) {
            Animal animalEscolhido = petsEstadoTutor.get(opcao - 1);  
            System.out.println("Você escolheu o pet: " + animalEscolhido.getNome());
    
            System.out.print("Está saudável? (0 para não, 1 para sim): ");
            int opcaoSaude = leitura.nextInt();
            leitura.nextLine(); 
            animalEscolhido.saudavel = (opcaoSaude == 1);
    
            System.out.print("Está limpo? (0 para não, 1 para sim): ");
            int opcaoLimpeza = leitura.nextInt();
            leitura.nextLine();
            animalEscolhido.limpo = (opcaoLimpeza == 1);
    
            System.out.println("Estado do pet atualizado!");
            System.out.println("\nPressione a tecla ENTER para retornar ao menu anterior...");
    
            leitura.nextLine();
        } else {
            System.out.println("Opção inválida! Por favor, escolha um número válido.");
        }
    }
    
    
    
    

}
