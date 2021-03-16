/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1introducaoprogramacao;

import entities.Animal;
import entities.Calculadora;

import java.util.Scanner;

/**
 *
 * @author vilso
 */
public class Main {
    
    static int[] vetorIdade = {0};
    public static void main(String[] args) { 
        Veiculo veiculo = new Veiculo();
        veiculo.placa = "ABC-1234";
        veiculo.modelo = "Corsa";
        veiculo.marca = "Chevrolet";
        veiculo.display();
        
        System.out.println("-----");
        
        Automovel auto = new Automovel();
        auto.nrportas = 4;
        auto.placa = "def-1234";
        auto.modelo = "Fiesta";
        auto.marca = "Ford";
        auto.display();
        
        System.out.println("-----"); 
        
        Moto moto = new Moto();
        moto.cilindradas = 300;
        moto.placa = "wer-8970";
        moto.modelo = "D180";
        moto.marca = "yamaha";
        moto.display();
        
       /* ItemVenda item;
        item = new ItemVenda(10, "feijão");
        System.out.println(item.getId());
        System.out.println(item.getDescricao());
        System.out.println(item.getPreco());
        //instanciar -> criar o objeto
        //new -> chamar o metodo construtor
        ItemVenda item1 = new ItemVenda();
        item1.setId(10);
        System.out.println(item1.getId());
        
        ItemVenda item2 = new ItemVenda(15, "soja", 150);
        System.out.println(item2.getId());
        System.out.println(item2.getDescricao());
        System.out.println(item2.getPreco());
        
        /*Calculadora calculadora = new Calculadora();
        calculadora.somar();
        calculadora.somar(50, 60);
        calculadora.somar(50.5f, 60.5f);
        calculadora.somar(50.5f, 60);
        
       /* Animal animal = new Animal();
        animal.setId(-1);
        animal.setNome("Papagaio louro jose");
        animal.setEspecie("ave");
        animal.setRaca("caturita");
        animal.setPeso(0.8f);
        animal.setTipoPele("penas");
        System.out.println(animal.toString());
                       
        Animal animal2 = new Animal(-10, "ze", "pitbull",
                "canina", 2.0f, "couro");
        System.out.println(animal2.toString());
        
        /*Pessoa p = new Pessoa("Mariazinha", 69, 1.70f, Instant.parse("2000-03-03T00:00:50.243Z"));
        System.out.println(p.nome);
        System.out.println(p.altura);
        System.out.println(p.peso);
        System.out.println(p.dataNascimento);
        /* Pessoa p1 = new Pessoa();
        p1.nome = "Jose";
        p1.altura = 1.69f;
        p1.peso = 69;
        p1.dataNascimento = Instant.now();
        p1.salvar();
        
        Pessoa recebido = p1.consultar(1);
        System.out.println(recebido.nome);
        /*
        Pessoa p3 = new Pessoa("João");
        System.out.println(p3.nome + " " + p3.peso);
        
      /*  Pessoa p2 = new Pessoa();
        p2.nome = "Maria ";
        p2.salvar();*/
      
       /* System.out.println(p1.nome);
        System.out.println(p1.altura);
        System.out.println(p1.peso);
        System.out.println(p1.dataNascimento);*/
    }
    
    public static void doisVetores(){
       int[] v1 = {1,2,3,4,5,6,7,8,9}; 
       int[] v2 = {1,2,3,4,5,6,7,8,9};
       
       int aux = v1.length - 1;
       for(int i = 0; i < v1.length; i++){
          System.out.println(v1[i] * v2[aux]);
          aux--; 
       }
    }
    
    public static void vetor(){
        String carros;
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
         String[] cars = new String[4];
         cars[3] = "fusca";
         //| | | |
         for (int i = 0; i < cars.length; i++) {
           System.out.println(cars[i]);
         }
    }
    
    public static void matriz(){
        //| | | |
        //| | | |
        //| | | |
      /*  int[][] myNumbers = {  
                          {1, 2, 3, 4}, //0
                          {5, 6, 7} ,   //1
                          {4, 5, 6, 8} //2
                          };
        int x = myNumbers[2][3];
        System.out.println(x); 
        */
                
        //instancia matriz quadrada
        String[][] campo = new String[5][5];
        campo[0][4] = "M";
        campo[4][4] = "N";
        campo[2][2] = "A"; 
        
        for (int linha = 0; linha < campo.length; linha++) {
           System.out.println("");
           for (int coluna = 0; coluna < campo.length; coluna++) {
             System.out.print(campo[linha][coluna] + " ");
            }
         }  
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
