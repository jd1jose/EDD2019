/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;


public class Nodo{
  public Nodo siguiente;
  public Nodo anterior;
  public Object dato;

  public Nodo(int dato){
    this.dato = dato;
  
  }
   public void Imprimir(){
      System.out.print(dato+",");
     
      
  }
}
