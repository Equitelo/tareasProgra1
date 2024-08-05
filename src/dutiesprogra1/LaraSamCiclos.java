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
        
        while(opcion!=4){
            do{
                System.out.println("");
                System.out.println("1 - Palabra Diagonal \n2 - Verificar Palindroma\n3 - Piramide\n4 - Salir");
                System.out.print("Ingresar la opcion que guste: ");
                opcion=lea.nextInt();
            }while(opcion<0||opcion>4);
            
            if(opcion==1){
                System.out.println(" ");
                System.out.print("Ingresar palabra: ");
                String word=lea.next().toUpperCase();

                int contador = 0;
                
                while (contador < word.length()) {
                    int espacio=0;
                    
                    char letras = word.charAt(contador);
                    while(espacio<contador){
                        System.out.print("  ");
                        espacio++;
                    }   
                    System.out.println(letras);
                    contador+=1;
                }
                
                int descontador=word.length()-1;
                
                
                while(descontador >= 0){
                    
                    int espacio=0;
                    char letraAlreves=word.charAt(descontador);
                    
                    
                    while(espacio<descontador){
                        System.out.print("  ");
                        espacio++;
                    }
                    System.out.println(letraAlreves);
                    descontador--;
                }
            }else if(opcion==2){
                //palabra
                String palabra="";
                String siEs="";
                String noEs="";
                //ciclos
                int contador=0;
                int reversa;
                //contadores para impresion de pantalla
                int palindroCont=1;
                int noPalindro=1;
                
                System.out.println("");
                System.out.println("***VERIFICACION DE PALABRA PALINDROMA***");
                System.out.print("Ingresar la cantidad de palabras: ");
                int cantidad=lea.nextInt();
                
                while(contador<cantidad){
                    contador++;
                    System.out.print("Ingresar palabra #"+contador+": ");
                    palabra=lea.next();
                   
                    reversa=palabra.length();
                    String contenedor="";
                    while(reversa>0){
                        reversa--;
                        char palindroma=palabra.charAt(reversa);
                        contenedor+=palindroma;
                    }   
                    if(palabra.equals(contenedor)){
                        siEs+=palindroCont+"-"+palabra+"\n";
                        palindroCont++;
                    }else{
                        noEs+=noPalindro+"-"+palabra+"\n";
                        noPalindro++;
                    }
                }
                System.out.println("\nPALABRAS PALINDROMAS:");
                System.out.println(siEs);
                System.out.println("\nPALABRAS NO PALINDROMAS:");
                System.out.println(noEs);
            }else if(opcion==3){
                
                System.out.print("Ingresar numero principal de piramide al reves: ");
                int numeroP=lea.nextInt();
                //ciclo principal
                for(int contPrincipal=1;contPrincipal<=numeroP;contPrincipal++){
                    //ciclo para el espacio
                    for(int espacio=1;espacio<=contPrincipal-1;espacio++){
                        System.out.print(" ");
                    }
                    //ciclo contador de menor a mayor
                    for(int cont=contPrincipal;cont<=numeroP;cont++){
                        System.out.print(cont+" ");
                    }
                    //ciclo contador de mayor a menor
                    for(int contAlreves=numeroP-1;contAlreves>=contPrincipal;contAlreves--){
                        System.out.print(contAlreves+" ");
                    }
                    //salto de linea para la realizacion de las filas
                    System.out.println();
                }
            }else{
                System.out.println("Saliendo del sistema");
            }
        }
    }
}
