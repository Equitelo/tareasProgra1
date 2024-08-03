/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dutiesprogra1;

import java.util.Scanner;

public class LaraSamCiclos {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        
        int opcion=0;
        String respuesta;
        
        while(opcion!=3){
        System.out.println("");
        System.out.println("1 - Palabra Palindroma \n2 - Palabra Flecha\n3 - Terminar");
        System.out.print("Ingresar la opcion que guste: ");
        opcion=lea.nextInt();
        
            if(opcion==1){
                System.out.println(" ");
                System.out.print("Ingresar palabra: ");
                String word=lea.next().toUpperCase();

                int contador = 0;
                
                while (contador < word.length()) {
                    int espacio=word.length()+contador;
                    String empty="  ";
                    char letras = word.charAt(contador);
                    while(espacio>1){
                        System.out.print(empty);
                        espacio--;
                    }   
                    System.out.println(letras);
                    contador+=1;
                }
                
                int descontador=word.length()-1;
                
                String vacio="  ";
                
                while(descontador >= 0){
                    
                    int espacio=word.length()+descontador;
                    char letraAlreves=word.charAt(descontador);
                    System.out.println(letraAlreves);
                    
                    while(espacio>0){
                        System.out.print(vacio);
                        espacio--;
                    }
                    descontador--;
                }
            }else if(opcion==2){
                
//                System.out.println("Ingresar numero principal de piramide al reves: ");
//                int numeroP=lea.nextInt();
//                
//                for(int contPrincipal=0;contPrincipal<numeroP;contPrincipal++){
//                    
//                    for(){
//                    
//                    }
//                    
//                    for(int contAlreves=0;;contAlreves){
//                        
//                    }
//                    
//                }
            }else{
                System.out.println("No");
            }
        }
    }
}
