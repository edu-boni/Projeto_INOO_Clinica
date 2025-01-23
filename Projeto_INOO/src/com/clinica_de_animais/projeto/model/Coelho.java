package com.clinica_de_animais.projeto.model;

import com.clinica_de_animais.projeto.model.Animal.Caracteristicas;

public class Coelho extends Animal implements Caracteristicas{
    
    public Coelho(String nome, int idade){
        super(nome, idade);
    }
    public Coelho(String nome, int idade, String tutor){
        super(nome, idade, tutor);
    }
    public Coelho(String nome){
        super(nome);
    }


    @Override
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
