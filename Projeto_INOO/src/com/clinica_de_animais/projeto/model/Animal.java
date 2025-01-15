package com.clinica_de_animais.projeto.model;

public class Animal {
    private String nome;
    private float idade;
    private String especie;
    private boolean saudavel = true;
    private boolean limpo = true;

    public Animal(String nome, float idade, String especie){
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }
    public Animal(String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public float getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public boolean isLimpo() {
        return limpo;
    }

    public boolean isSaudavel() {
        return saudavel;
    }

    public void sujar(){
        limpo = false;
        System.out.println(getNome()+" está sujo(a)");
    }

    public void adoecer(){
        saudavel = false;
        System.out.println(getNome()+" está doente");
    }

    public void saltar(){
        System.out.println("O "+getEspecie()+" salta. Tóin tóin tóin.");
    }

    public void dormir(){
        System.out.println("O "+getEspecie()+" está dormindo zZzZzZZ");
    }

    public void exibirFoto(){
        System.out.println("Esse animal não tem foto");
    }
}
