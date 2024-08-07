/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dutiesprogra1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LaraSamuelTryCatch {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        int opcion=0;
        while(opcion!=4){
            System.out.println("1 - Triangulos");
            System.out.println("2 - MCM y MCD");
            System.out.println("3 - ");
            System.out.println("4 - Salir del sistema");
            System.out.print("Escoger una opcion: ");
            opcion=lea.nextInt();

            if(opcion==1){
                System.out.println("");
                int base=0;
                int altura=0;
                double area=0;
                double areaMayor=0;
                int encontradoEn=0;
                for(int contador=1;contador<=8;contador++){
                try{
                    System.out.print("Ingresar la base del triangulo #"+contador+": ");
                    base=lea.nextInt();
                    while(base<0){
                        System.out.println("Ingresar la base del triangulo #"+contador+": ");
                        base=lea.nextInt();
                        contador--;
                    }
                    System.out.print("Ingresar la altura del triangulo #"+contador+": ");
                    altura=lea.nextInt();
                    area=(base*altura)/2;
                    System.out.println("Reultado del triangulo #"+contador+": "+area);
                    
                    while(areaMayor<area){
                        areaMayor=area;
                        encontradoEn=contador;
                    }
                
                    }catch(InputMismatchException e){
                        System.out.println("No debe ingresar letras!");
                        lea.nextLine();
                        contador--;
                    }
                }
                System.out.println("El area mayor es: "+areaMayor+" encontrado en el traingulo #"+encontradoEn);
            }else if(opcion==2){
                System.out.println("MCM y MCD");
                System.out.println("Vamos a ingresar dos numeros para versus respectivos MCM y MCD");
                System.out.print("Ingresar el numero #1: ");
                int numeroUno=lea.nextInt();
                System.out.print("Ingresar el numero #2: ");
                int numeroDos=lea.nextInt();
                
                
            }else if(opcion==3){
                int verificar=0;
                
                System.out.println("Verificaremos si es numero perfecto");
                System.out.println("");
                System.out.print("Ingresar un numero: ");
                int numeroP=lea.nextInt();
                
                verificar=2^(numeroP-1)*(2^numeroP-1);
                System.out.println("");
            }else{
                System.out.println("Termino.");
            }
        }
    }
}
