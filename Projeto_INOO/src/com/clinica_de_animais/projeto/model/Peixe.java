package com.clinica_de_animais.projeto.model;

public class Peixe extends Animal{
    
    public Peixe(String nome, int idade, boolean paraAdocao){
        super(nome, idade, "Peixe", paraAdocao);
    }
    public Peixe(String nome, boolean paraAdocao){
        super(nome, "Peixe", paraAdocao);
    }

    public void som(){
        System.out.println("Blub Bloop o°");
    }

    public void exibirFoto(){
        System.out.println("\n          /`·.¸");
        System.out.println("         /¸...¸`:·");
        System.out.println("     ¸.·´  ¸   `·.¸.·´)");
        System.out.println("    : © ):´;      ¸  {");
        System.out.println("     `·.¸ `·  ¸.·´\\`·¸)");
        System.out.println("         `\\\\´´\\¸.·´");
    }
}
