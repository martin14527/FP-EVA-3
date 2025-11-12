/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_referencia;

import java.util.Scanner;

/**
 *
 * @author anoni
 */
public class EVA3_7_REFERENCIA {

    public static void main(String[] args) {
        String cliente[]= new String[5];
        double credito[]= new double[5];
     CapturarClientes(cliente, credito);
     imprimir(cliente,credito);
    }
    public static void CapturarClientes(String[] nombre, double[]credito){ //
        Scanner captu = new Scanner(System.in);
        for(int i =0; i<credito.length; i++){
        System.out.print("nombre del cliente:");
        nombre[i] = captu.nextLine();
        System.out.print("credito del cliente:");
        credito[i] = captu.nextDouble();
    }
    } // 
public static void imprimir(String[] nombre, double[] credito){
for(int i =0; i<credito.length; i++){
    System.out.println("nombre" + nombre[i] + ", credito "+ credito[i]);
    
}
}
}
    





