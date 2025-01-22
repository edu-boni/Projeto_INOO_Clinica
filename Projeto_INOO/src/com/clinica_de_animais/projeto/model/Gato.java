package com.clinica_de_animais.projeto.model;

import com.clinica_de_animais.projeto.model.Animal.Caracteristicas;

public class Gato extends Animal implements Caracteristicas{
    
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    public Gato(String nome, int idade, String tutor){
        super(nome, idade, tutor);
    }
    public Gato(String nome){
        super(nome);
    }

    @Override
    public void som(){
        System.out.println("Miaaau");
    }

    @Override
    public void exibirFoto(){
        System.out.println("\n       |\\---/|");
        System.out.println("       | , , |");
        System.out.println("      =\\_   _/=..---.");
        System.out.println("     ___/ `   ' ,\"+ \\");
        System.out.println("    (__...'   __\\    |`.___.';");
        System.out.println("      (_,...'(_,.`__)/'.....+");
    }
}
