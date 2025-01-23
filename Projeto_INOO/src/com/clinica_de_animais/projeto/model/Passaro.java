package com.clinica_de_animais.projeto.model;

import com.clinica_de_animais.projeto.model.Animal.Caracteristicas;

public class Passaro extends Animal implements Caracteristicas{
    
    public Passaro(String nome, int idade){
        super(nome, idade);
    }
    public Passaro(String nome, int idade, String tutor){
        super(nome, idade, tutor);
    }
    public Passaro(String nome){
        super(nome);
    }


    @Override
    public void exibirFoto(){
        System.out.println("                           .");
        System.out.println("                          | \\/|");
        System.out.println("  (\\   _                  ) )|/|");
        System.out.println("      (/            _----. /.'.'");
        System.out.println(".-._________..      .' @ _\\  .'   ");
        System.out.println("'.._______.   '.   /    (_| .')");
        System.out.println("  '._____.  /   '-/      | _.' ");
        System.out.println("   '.______ (         ) ) \\");
        System.out.println("     '..____ '._       )  )");
        System.out.println("        .' __.--\\  , ,  // (( ");
        System.out.println("        '.'     |  \\/   (_.'(  ");
        System.out.println("                '   \\ .' ");
        System.out.println("                 \\   (");
        System.out.println("                  \\   '.'");
        System.out.println("                   \\ \\ '.)");
        System.out.println("                    '-'-'");
    }
}
