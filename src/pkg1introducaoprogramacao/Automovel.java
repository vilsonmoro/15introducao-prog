/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1introducaoprogramacao;

/**
 *
 * @author vilso
 */
public class Automovel extends Veiculo {
    int nrportas;  
    
    @Override
    public void display(){
       super.display();
       System.out.println("Nrportas: " + nrportas); 
    }
    
}
