package com.clinica_de_animais.projeto.model;

public class Passaro extends Animal{
    
    public Passaro(String nome, int idade, boolean paraAdocao){
        super(nome, idade, paraAdocao);
    }
    public Passaro(String nome, boolean paraAdocao){
        super(nome, paraAdocao);
    }

    public void saltar(){
        System.out.println("O pássaro sai voando.");
    }

    public void som(){
        System.out.println("[cantando] salve o corinthiaaans");
    }

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
        System.out.println("        '.'  mrf|  \\/   (_.'(  ");
        System.out.println("                '   \\ .' ");
        System.out.println("                 \\   (");
        System.out.println("                  \\   '.'");
        System.out.println("                   \\ \\ '.)");
        System.out.println("                    '-'-'");
    }
}
