/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1introducaoprogramacao;

import java.util.Scanner;

/**
 *
 * @author vilso
 */
public class Main {
    
    static int[] vetorIdade = {0};
    public static void main(String[] args) {
       /*int feedback = soma(10,20);
       System.out.println("Resultado: " + feedback);
       
       soma(10,20,30);
      */
       exercicio1();
    }
    
    public static void exercicio1(){
        Scanner leitor = new Scanner(System.in);
        int idade = 0;        
        int indice=0;        
        boolean continuar=false;
        do{
          System.out.println("Digite um numero inteiro: ");
          idade = leitor.nextInt();
          
          String retorno = verificaIdade(idade);
          vetorIdade[indice] = idade;
          System.out.println(retorno); 
          
          System.out.println("Deseja continuar? S-para sim");
          String opcao = leitor.next();
          
          //opcao = opcao.toUpperCase();
         // continuar = opcao.equals("s");
          
          continuar = opcao.toUpperCase().equals("S");    
          indice++;
         // System.out.println(vetorIdade.length);
          vetorIdade = expandeArray();
        //  System.out.println(vetorIdade.length);
        }while(continuar);//while(continuar == true)
        ///listar dados
        listarDados();
    }
    
    public static void listarDados(){
        for(int x : vetorIdade){
            System.out.println(verificaIdade(x));
        }
    }
    public static int[] expandeArray(){
        int tam = vetorIdade.length;
        int[] aux = new int[tam+1];
        for(int i=0;i<tam;i++){
             aux[i] = vetorIdade[i];
        }
        return aux;
    }
    
    public static String verificaIdade(int idade){
       String msg = "Maior de idade";
        if (idade < 18)
          msg = "Menor de Idade";
        
       return msg;
    }
    
    //subprograma do tipo funcao ou seja retorna valor
    public static int soma(int n1, int n2){
        int resultado = n1 + n2;
        return resultado;
    }
    
    public static void soma(int n1, int n2, int n3){
        int resultado = n1 + n2 + n3;
        System.out.println("Resultado: " + resultado);
    }
    
}
