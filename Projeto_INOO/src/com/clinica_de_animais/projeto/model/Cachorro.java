package com.clinica_de_animais.projeto.model;

public class Cachorro extends Animal {
    
    public Cachorro(String nome, int idade, String especie){
        super(nome, idade, especie);
    }
    public Cachorro(String nome, String especie){
        super(nome, especie);
    }

    public void exibirFoto(){
        System.out.println("\n    ___");
        System.out.println(" __/_  `.  .-\"\"\"-.");
        System.out.println(" \\_,` | \\-'  /   )`-')");
        System.out.println("  \"\") `\"`    \\  ((`\"`");
        System.out.println(" ___Y  ,    .'7 /|");
        System.out.println("(_,___/...-` (_/_/");
    }
}
