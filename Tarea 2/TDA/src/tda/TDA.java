/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;

/**
 *
 * @author José David
 */
public class TDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TDA_P dato= new TDA_P(1);
           dato.Vacia();
           dato.Sacar(); 
           dato.Contar();
           dato.Imprimir();
           System.out.println(" ");
        dato.Apilar(2);
        dato.Apilar(3);
        dato.Apilar(4);
        dato.Apilar(5);
        dato.Apilar(6);
        dato.Apilar(7);
        dato.Apilar(8);
        dato.Apilar(9);
        dato.Apilar(10);
        dato.Imprimir();
        dato.Contar();
        dato.Vacia();
        System.out.println(" ");
        dato.Sacar();
        dato.Contar();
        System.out.println(" ");
        dato.Imprimir();
    }
    
}
