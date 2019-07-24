package ejercicio2.edd;

import java.util.Scanner;

public class matriz {
    
    int [] matriz;
    int operacion;
    int x;
    
    public void crearMatriz(){
        int numero;
        System.out.print("Ingrese un numero: ");
        Scanner num = new Scanner(System.in);
        numero=Integer.parseInt(num.nextLine());
        matriz=new int[numero];
       // x=2;
        for(int i=0;i<numero;i++){
            matriz[i]=i;

        }
        
        int bandera=0;
        for(int i=2;i<=numero;i++){
            if(i>2){
                bandera=i*i;
                if(bandera>=numero){
                break;
                }else{
                 for(int j=2;j<=numero;j++){
                operacion=i*j;
            
                int contador=2;
                if(operacion>=numero){
                break;
                }else{
                do{
              if(operacion==matriz[contador]){
              matriz[contador]=0;
              }
              contador++;
              }
              while(contador<numero);
                }
              
            }
                }
            }else{
             for(int j=2;j<=numero;j++){
                operacion=i*j;
                int contador=2;
                if(operacion>=numero){
                break;
                }else{
                do{
              if(operacion==matriz[contador]){
              matriz[contador]=0;
              }
              contador++;
              }
              while(contador<numero);
                }
              
            }
            }
           
        }
       for(int i=2;i<numero;i++){
           if(matriz[i]==0){
           
           }else
           {
              System.out.print(matriz[i]+" ");   
           }
            if(i%10==0){
                System.out.println("");
            }       
        }
        
    }
    
}
