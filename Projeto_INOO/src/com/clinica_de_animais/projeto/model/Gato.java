package com.clinica_de_animais.projeto.model;

public class Gato extends Animal {
    
    public Gato(String nome, int idade, boolean paraAdocao){
        super(nome, idade, paraAdocao);
    }
    public Gato(String nome, boolean paraAdocao){
        super(nome, paraAdocao);
    }

    public void som(){
        System.out.println("Miaaau");
    }

    public void exibirFoto(){
        System.out.println("\n       |\\---/|");
        System.out.println("       | , , |");
        System.out.println("      =\\_   _/=..---.");
        System.out.println("     ___/ `   ' ,\"+ \\");
        System.out.println("    (__...'   __\\    |`.___.';");
        System.out.println("      (_,...'(_,.`__)/'.....+");
    }
}
