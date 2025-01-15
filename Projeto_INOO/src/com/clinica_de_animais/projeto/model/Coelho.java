package com.clinica_de_animais.projeto.model;

public class Coelho extends Animal{
    
    public Coelho(String nome, int idade, String especie){
        super(nome, idade, especie);
    }
    public Coelho(String nome, String especie){
        super(nome, especie);
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

    public void saltar(){
        System.out.println("O Coelho dá uma duplo twist carpado");
    }
}
