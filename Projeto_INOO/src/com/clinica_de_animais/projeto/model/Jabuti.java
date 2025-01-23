package com.clinica_de_animais.projeto.model;

import com.clinica_de_animais.projeto.model.Animal.Caracteristicas;

public class Jabuti extends Animal implements Caracteristicas{
    
    public Jabuti(String nome, int idade){
        super(nome, idade);
    }
    public Jabuti(String nome, int idade, String tutor){
        super(nome, idade, tutor);
    }
    public Jabuti(String nome){
        super(nome);
    }

    @Override
    public void exibirFoto(){
        System.out.println("\n                    __");
        System.out.println("         .,-;-;-,. /'_\\");
        System.out.println("       _/_/_/_|_\\_) /");
        System.out.println("     '-<_><_><_><_>=/\\");
        System.out.println("    `/_/====/_/-'\\_\\");
    }
}
