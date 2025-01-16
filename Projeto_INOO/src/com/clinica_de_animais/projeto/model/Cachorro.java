package com.clinica_de_animais.projeto.model;

public class Cachorro extends Animal {
    
    public Cachorro(String nome, int idade, boolean paraAdocao){
        super(nome, idade, paraAdocao);
    }
    public Cachorro(String nome, boolean paraAdocao){
        super(nome, paraAdocao);
    }

    public void som(){
        System.out.println("Au au au");
    }

    public void exibirFoto(){
        System.out.println("\n       ___");
        System.out.println("    __/_  `.  .-\"\"\"-.");
        System.out.println("    \\_,` | \\-'  /   )`-')");
        System.out.println("     \"\") `\"`    \\  ((`\"`");
        System.out.println("    ___Y  ,    .'7 /|");
        System.out.println("   (_,___/...-` (_/_/");
    }
}
