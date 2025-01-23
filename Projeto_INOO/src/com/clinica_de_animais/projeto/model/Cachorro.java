package com.clinica_de_animais.projeto.model;

import com.clinica_de_animais.projeto.model.Animal.Caracteristicas;

public class Cachorro extends Animal implements Caracteristicas {
    
    public Cachorro(String nome, int idade){    
        super(nome, idade);
    }
    public Cachorro(String nome, int idade, String tutor){
        super(nome, idade, tutor);
    }

    @Override
    public void exibirFoto(){
        System.out.println("\n       ___");
        System.out.println("    __/_  `.  .-\"\"\"-.");
        System.out.println("    \\_,` | \\-'  /   )`-')");
        System.out.println("     \"\") `\"`    \\  ((`\"`");
        System.out.println("    ___Y  ,    .'7 /|");
        System.out.println("   (_,___/...-` (_/_/");
    }


     
}
