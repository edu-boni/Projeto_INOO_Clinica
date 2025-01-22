package com.clinica_de_animais.projeto.model;

public abstract class Animal {
    protected int id;
    protected String nome;
    protected float idade;
    protected boolean saudavel = true;
    protected boolean limpo = true;
    protected String tutor;

    private static int contador = 0;

    //Animal para adoção
    public Animal(String nome, float idade){
        this.id = ++contador;
        this.nome = nome;
        this.idade = idade;
        this.tutor = "CLINICAPETREPETE";
    }

    //Animal pertencente a um tutor
    public Animal(String nome, float idade, String tutor){
        this.id = ++contador;
        this.nome = nome;
        this.idade = idade;
        this.tutor = tutor;
    }

    //Animal para adoção sem idade
    public Animal(String nome){
        this.id = ++contador;
        this.nome = nome;
        this.tutor = "CLINICAPETREPETE";
    }

    public interface Caracteristicas {
        public abstract void som();
        public abstract void exibirFoto();
    }

    public void sujar(){
        limpo = false;
        statusLimpeza();
    }

    public void limpar(){
        limpo = true;
        statusLimpeza();
    }

    public void statusLimpeza(){
        if(isLimpo()){
            System.out.println(getNome()+" está limpo(a)");
        }else{
            System.out.println(getNome()+" está sujo(a)!");
        }
    }

    public void adoecer(String relatorio){
        saudavel = false;
        statusSaude();
        System.out.println("Relatório: "+relatorio);
    }

    public void curar(){
        saudavel = true;
        statusSaude();
    }

    public void statusSaude(){
        if(isSaudavel()){
            System.out.println(getNome()+" está saudável(a)");
        }else{
            System.out.println(getNome()+" está doente(a)!");
        }
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getIdade() {
        return idade;
    }

    public boolean isLimpo() {
        return limpo;
    }

    public boolean isSaudavel() {
        return saudavel;
    }
}
