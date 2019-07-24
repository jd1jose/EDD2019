/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerecicio.pkg1.edd;

import java.util.Scanner;

/**
 *
 * @author José David
 */
public class Ejerecicio1EDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendario();
    }
  public static void Calendario(){
  String fecha="",diasemana="";
  Integer dia, mes, año_real, años_atras, año_b, dias_años_atras, dias_año_presente, dia_total;
        String[] dato= new String [2];
        String [] Dias_Semana= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    Scanner entrada = new Scanner(System.in);
    
    while(fecha!="si"){
          System.out.println("Escriba Fecha entre el año 1700 a la fecha actual "
              + "separando los datos con '/'");
      fecha= entrada.nextLine();
    dato=fecha.split("/");
      //hacer la verificacion del dia, del mes y año esten en el rango
       dia=Integer.parseInt(dato[0]);
       mes=Integer.parseInt(dato[1]);
       año_real=Integer.parseInt(dato[2]);
       dias_años_atras=0;
       if(año_real==1700){
       
       }else{
           
       
           años_atras=(año_real-1700);
           año_b=años_atras/4;
       
       if(año_b>0){
       if(1800>año_real&&año_real>=1700){      
       dias_años_atras=(año_b-1)*366+(años_atras-año_b+1)*365; 
        }else if(1900>año_real&&año_real>=1800){
       dias_años_atras=(año_b-2)*366+(años_atras-año_b+2)*365; 
        }else if(año_real>=1900){
       dias_años_atras=(año_b-3)*366+(años_atras-año_b+3)*365; 
         
        }
      }else{
          if(1800>año_real&&año_real>=1700){ 
           dias_años_atras=años_atras*365; 
        }
      }   
     }
       año_b=añobis(año_real);
       dias_año_presente=0;
       switch(mes)
            {
               case 1 : dias_año_presente=dia;break; 
               case 2 : dias_año_presente=31+dia;break;
               case 3 : dias_año_presente=31+año_b+dia;  break; 
               case 4 : dias_año_presente=31+año_b+31+dia;  break;
               case 5 :dias_año_presente=31+año_b+31+30+dia;  break;
               case 6 :dias_año_presente=31+año_b+31+30+31+dia;  break;              
               case 7 :dias_año_presente=31+año_b+31+30+31+30+dia;  break; 
               case 8 :dias_año_presente=31+año_b+31+30+31+30+31+dia;  break;
               case 9 :dias_año_presente=31+año_b+31+30+31+30+31+31+dia;  break;
               case 10 :dias_año_presente=31+año_b+31+30+31+30+31+31+30+dia;  break;
               case 11 :dias_año_presente=31+año_b+31+30+31+30+31+31+30+31+dia;  break;
               case 12 :dias_año_presente=31+año_b+31+30+31+30+31+31+30+31+30+dia;  break;
            }
       dia_total=dias_años_atras+dias_año_presente;
       int contador=4;
       for(int i=0;i<dia_total;i++){
           diasemana=Dias_Semana[contador];
           contador++;
           if(contador>6){
            contador=0;
           }
           
           
       }

       System.out.println("El dia de la semana es "+diasemana);
    }
      }
  public static int añobis(int año){
      if(año==1700||año==1800||año==1900){
      return 28;
      }else{
      año=año%4;
      if (año==0){
      return 29;
      }else{
      return 28;
      }      } 
      
      
  }
}
