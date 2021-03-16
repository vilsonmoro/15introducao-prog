/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author vilso
 */
public class Animal {
    private int id;
    private String nome;
    private String raca;
    private String especie;
    private float peso;
    private String tipoPele;

    public Animal() {
    }

    public Animal(int id, String nome, String raca, 
            String especie, float peso, String tipoPele) {
        this.setId(id);
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
        this.peso = peso;
        this.tipoPele = tipoPele;
    }
    
    
    //encapsulamento visa proteger o atributo da classe
    //metodos get e set
    public int getId(){
        return id; 
    }
    public void setId(int id){
       if(id < 0){
           System.err.println("Informe numeros positivos");
       }else
          this.id = id; 
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        if(nome.length() < 3){
            System.err.println("O nome da espécie deve"
                    + " ter no minimo 3 caracteres");
        } 
        else
           this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipoPele() {
        return tipoPele;
    }

    public void setTipoPele(String tipoPele) {
        this.tipoPele = tipoPele;
    }  

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + 
                ", raca=" + raca + ", especie=" + especie + 
                ", peso=" + peso + ", tipoPele=" + tipoPele + '}';
    }
    
    
    
}
