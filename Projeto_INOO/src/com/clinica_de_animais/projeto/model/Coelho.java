package com.clinica_de_animais.projeto.model;

public class Coelho extends Animal{
    
    public Coelho(String nome, int idade, boolean paraAdocao){
        super(nome, idade, paraAdocao);
    }
    public Coelho(String nome, boolean paraAdocao){
        super(nome, paraAdocao);
    }

    public void saltar(){
        System.out.println("O Coelho dá uma duplo twist carpado");
    }

    public void som(){
        System.out.println("Squick squick");
    }

    public void exibirFoto(){
        System.out.println("\n             ,\\");
        System.out.println("             \\\\_,");
        System.out.println("              \\` ,\\");
        System.out.println("         __,.-\" =__)");
        System.out.println("       .\"        )");
        System.out.println("    ,_/   ,    \\/\\_");
        System.out.println("    \\ |    )_-\\ \\_-`");
        System.out.println("    `-----` `--`");
    }

    
}
