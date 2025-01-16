package com.clinica_de_animais.projeto.model;

public abstract class Animal {
    protected String nome;
    protected float idade;
    protected boolean saudavel = true;
    protected boolean limpo = true;
    protected boolean paraAdocao = true;

    public Animal(String nome, float idade, boolean paraAdocao){
        this.nome = nome;
        this.idade = idade;
    }
    public Animal(String nome, boolean paraAdocao){
        this.nome = nome;
    }

    public void sujar(){
        limpo = false;
        System.out.println(getNome()+" está sujo(a)");
    }

    public void adoecer(){
        saudavel = false;
        System.out.println(getNome()+" está doente");
    }

    //public abstract void assustar();
    public abstract void som();
    public abstract void exibirFoto();

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

    public boolean isParaAdocao() {
        return paraAdocao;
    }
}
