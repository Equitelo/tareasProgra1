/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dutiesprogra1;

import java.util.Scanner;

public class LaraSamuelTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
    
        //El Operador ternario
        /*
        El operador ternario es una condicion que se posee un valor que si se cumple (Osea si es verdadero)
        ejecuta una accion, caso contrario (falso) ejecuta otra opcion.
        El formato es el siguiente
        (Toipo de dato)(variable)=(condicion logica)? Accion si es verdadera:Accion si es falsa
        */
        
        //Ejemplo valor constante
        
        String nombre="Samuel";
        
        String presentarse = (nombre.equals("Samuel"))?"En efecto, es mi nombre":"Ese no es mi nombre";
        
        System.out.println(" ''Tu nombre es "+nombre+"?'' ");
        System.out.println("Respuesta: "+presentarse);
        
        //Ejemplo con variables
        
        
        //Ejemplo con formulas
        
    }    
}