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
public class TDA_P {
public Nodo primero;
public Nodo siguiente;
 public Nodo dato;
  public TDA_P(int dato){
      primero = new Nodo(dato);
       primero.siguiente=primero;
      siguiente=primero;
  }

//es la funcion pila solo que con modificacion sin el nodo directamente un TDA, revisar que te piden en la tarea casi lo tenes todo
  public void Apilar(int dato){
    Nodo nuevo = new Nodo(dato);
      siguiente.siguiente=nuevo;
    siguiente=nuevo;
    siguiente.siguiente=primero;
    
  }

  public Object Sacar(){
   Object  dato1 = primero.dato;
   primero = primero.siguiente;
   siguiente.siguiente=primero;
      return dato1;
  }
public void Vacia(){

        if (primero==null){
            System.out.println("la lista esta vacia");
        }else{
        
            System.out.println("la lista tiene elementos");
        }
}
public void Contar(){
        int contador=0;
        Nodo auxiliar = primero;
        if(primero==null){
             System.out.println("la lista esta vacia");
        }else{
            do {
                  contador++;
            auxiliar = auxiliar.siguiente;

                } while (auxiliar!=primero);
            System.out.println("los elementos son: "+contador);
        }

      
}
  public void Imprimir(){
     Nodo auxiliar = primero;
      do {
        auxiliar.Imprimir();
           
        auxiliar = auxiliar.siguiente;
           
      } while (auxiliar!=primero);
  }
}
