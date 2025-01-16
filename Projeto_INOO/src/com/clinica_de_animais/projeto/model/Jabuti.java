package com.clinica_de_animais.projeto.model;

public class Jabuti extends Animal {
    
    public Jabuti(String nome, int idade, boolean paraAdocao){
        super(nome, idade, paraAdocao);
    }
    public Jabuti(String nome, boolean paraAdocao){
        super(nome, paraAdocao);
    }

    public void saltar(){
        System.out.println("O jabuti não consegue saltar e se esconde no casco");
    }

    public void som(){
        System.out.println("O jabuti te encara silenciosamente");
    }

    public void exibirFoto(){
        System.out.println("\n                    __");
        System.out.println("         .,-;-;-,. /'_\\");
        System.out.println("       _/_/_/_|_\\_) /");
        System.out.println("     '-<_><_><_><_>=/\\");
        System.out.println("    `/_/====/_/-'\\_\\");
    }
}
