package dutiesprogra1;

import java.util.Random;
import java.util.Scanner;

public class LaraSamuelBiArray {
    public static void main(String[] args) {
        Random rndm=new Random();
        Scanner lea=new Scanner(System.in);
        int cantidad=0;
        int random=0;
        int totalUno=0;
        int totalDos=0;
        
        do {
            System.out.print("Ingresar el numero de filas y columnas al mismo tiempo: ");
            cantidad = lea.nextInt();
        } while (cantidad < 1);
        
        int [][]arregloBi=new int[cantidad][cantidad];
        
        for (int i = 0; i < arregloBi.length; i++) {
            for (int j = 0; j < arregloBi.length; j++) {
                random=rndm.nextInt();
                while(random<10||random>99){
                    random=rndm.nextInt();
                }
                arregloBi[i][j]=random;
            }
        }
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                System.out.print(arregloBi[i][j]+" ");
                if(i==j){
                    totalUno+=arregloBi[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("La suma diagonal principal: "+totalUno);
        System.out.println("La suma diagonal secundaria: ");
    }
}
