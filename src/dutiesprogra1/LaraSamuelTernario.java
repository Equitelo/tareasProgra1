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
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
    
        /*
        Operador Ternario

        El operador ternario cuenta con una estructura un tanto distinta a las demas,
        este cuenta con la siguiente estructura:

        (Prueba Logica)?"True":"False"

        de antemano nos damos cuenta que es un tipo booleano y este te devuelve 
        verdadero, si y solo si la prueba logica es cierta y falso si la prueba logica 
        es falsa. Algunos afirman que es como la estructura condicional if-else, aunque 
        a una solo linea de codigo
        */
        
        //Ejemplo valor constante
        
        String nombre="Samuel";
        
        String presentarse = (nombre.equals("Samuel"))?"En efecto, es mi nombre":"Ese no es mi nombre";
        
        System.out.println(" ''Tu nombre es "+nombre+"?'' ");
        System.out.println("Respuesta: "+presentarse);
        
        //Ejemplo con variables
        
        int colores;
        
        System.out.println(" ");
        System.out.print("Cuantos colores tiene Honduras en su bandera?: ");
        colores=lea.nextInt();
        
        if(colores>0){
            String revision=(colores==2)?"Su respuesta es correcta!":"La bandera cuenta con dos solamente.";
            System.out.println(revision);
        }
        //Ejemplo con formulas
        
        double pi=3.14;
        double diametro;
        
        System.out.println("");
        System.out.print("Ingrese el diametro del circulo: ");
        diametro=lea.nextDouble();
        
        if(diametro>0){
            double radio=(diametro>=0)?radio=diametro/2:0;

            System.out.println("Teniendo el radio equivalente: "+radio);
            System.out.println("Podemos calcular el area multiplicandolo por pi");
            System.out.println("Para ello escribe el valor de pi (redonder a la centesima mas cercana): ");
            double comprobar=lea.nextDouble();
            
            double area=(comprobar==pi)?area=diametro*pi:0;
            
            System.out.println("El area es de: "+area);        
        }
    }    
}