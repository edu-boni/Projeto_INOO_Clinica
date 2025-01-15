package com.clinica_de_animais.projeto.model;

public class Tartaruga extends Animal {
    
    public Tartaruga(String nome, int idade, String especie){
        super(nome, idade, especie);
    }
    public Tartaruga(String nome, String especie){
        super(nome, especie);
    }

    public void saltar(){
        System.out.println("A tartaruga não consegue saltar e se esconde no casco.");
    }

    public void exibirFoto(){
        System.out.println("\n                    __");
        System.out.println("         .,-;-;-,. /'_\\");
        System.out.println("       _/_/_/_|_\\_) /");
        System.out.println("     '-<_><_><_><_>=/\\");
        System.out.println("    `/_/====/_/-'\\_\\");
    }
}
