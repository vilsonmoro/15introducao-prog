/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.Instant;

/**
 *
 * @author vilso
 */
public class Pessoa {
   public String nome;
   public float peso;
   public float altura;
   public Instant dataNascimento;

   public Pessoa(){
       //
   }
   
   public Pessoa(String nome){
     this.nome = nome;
   }

    public Pessoa(String nome, float peso, float altura, Instant dataNascimento) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
    }
   
   
   
   public void salvar(){
       System.out.println(nome.toUpperCase() + " salva com sucesso");
   }   
   
   public Pessoa consultar(int id){
    //acessar base de dados pesquisando pelo id  
    
    return this;       
   }
}
