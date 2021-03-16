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
public class Calculadora {
   public void somar(){
       int x = 10;
       int y = 20;
       System.out.println("sem parametors-> " + (x + y));
   } 
   
   public void somar(int x, int y){
       System.out.println("parametors inteiros-> " + (x + y));
   }
   
   public void somar(float x, float y){
      System.out.println("parametors float -> " + (x + y)); 
   }
   
   public void somar(float x, int y){
      System.out.println("parametors float e int -> " + (x + y)); 
   }
}
