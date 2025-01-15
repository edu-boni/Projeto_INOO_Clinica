package com.clinica_de_animais.projeto.model;

public class Cavalo extends Animal{
    
    public Cavalo(String nome, int idade, boolean paraAdocao){
        super(nome, idade, "Cavalo", paraAdocao);
    }
    public Cavalo(String nome, boolean paraAdocao){
        super(nome, "Cavalo", paraAdocao);
    }

    public void saltar(){
        System.out.println("O Cavalo dá um coice");
    }

    public void som(){
        System.out.println("O Cavalo relincha");
    }

    public void exibirFoto(){
        System.out.println("                                     \\       ,");
        System.out.println("                                     |\\.--._/|");
        System.out.println("                                    /\\ )  )\\\\/");
        System.out.println("                                   /(   \\  / \\");
        System.out.println("                                  /(   J `(   \\");
        System.out.println("                                 / ) | _\\     /");
        System.out.println("                                /|)  \\  eJ    L");
        System.out.println("                               |  \\ L \\   L   L");
        System.out.println("                              /  \\  J  `. J   L");
        System.out.println("                              |  )   L   \\/   \\");
        System.out.println("                             /  \\    J   (\\   /");
        System.out.println("           _....___         |  \\      \\   \\```");
        System.out.println("    ,.._.-'        '''--...-||\\     -. \\   \\");
        System.out.println("  .'.=.'                    `         `.\\ [ Y");
        System.out.println(" /   /                                  \\]  J");
        System.out.println("Y / Y                                    Y   L");
        System.out.println("| | |          \\                         |   L");
        System.out.println("| | |           Y                        A  J");
        System.out.println("|   I           |                       /I\\ /");
        System.out.println("|    \\          I             \\        ( |]/|");
        System.out.println("J     \\         /._           /        -tI/ |");
        System.out.println(" L     )       /   /'-------'J           `'-:.");
        System.out.println(" J   .'      ,'  ,' ,     \\   `'-.__          \\");
        System.out.println("  \\ T      ,'  ,'   )\\    /|        ';'---7   /");
        System.out.println("   \\|    ,'L  Y...-' / _.' /         \\   /   /");
        System.out.println("    J   Y  |  J    .'-'   /         ,--.(   /");
        System.out.println("     L  |  J   L -'     .'         /  |    /\\");
        System.out.println("     |  J.  L  J     .-;.-/       |    \\ .' /");
        System.out.println("     J   L`-J   L____,.-'`        |  _.-'   |");
        System.out.println("      L  J   L  J                  ``  J    |");
        System.out.println("      J   L  |   L                     J    |");
        System.out.println("       L  J  L    \\                    L    \\");
        System.out.println("       |   L  ) _.'\\                    ) _.'\\");
        System.out.println("       L    \\('`    \\                  ('`    \\");
        System.out.println("        ) _.'\\`-....'                   `-....'");
        System.out.println("       ('`    \\");
        System.out.println("        `-.___/");
    }
}
