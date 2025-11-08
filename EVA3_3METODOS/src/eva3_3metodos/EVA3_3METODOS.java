
package eva3_3metodos;

import java.util.Scanner;

public class EVA3_3METODOS {

    public static void main(String[] args) {
            Scanner captu = new Scanner(System.in);
            int opcion;
            do{
            imprimirMenu();
            opcion = captu.nextInt();
                if (opcion == 1) {
                    calcularPotencia();
                    
                }else if (opcion == 2) {
                    Sumarnumeros(); 
                }
            }while(opcion != 3);
    }
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Selecciona una opcion: ");
        System.out.println("1. Calcular una potencia");
        System.out.println("2. Sumar 2 numeros");
        System.out.println("3. Salir del sistema");
        System.out.println("Selecciona una opcion: ");
        
        
    }
    public static void calcularPotencia(){
        Scanner captu = new Scanner(System.in);
        int base, exp, resu;
        System.out.println("***********CALCULO DE UNA POTENCIA***************");
        System.out.println("Catura la base: ");
        base = captu.nextInt();
        System.out.println("*************************************************");
        System.out.println("Captura el exponente: ");
        exp = captu.nextInt();
        System.out.println("*************************************************");
        //resu = base*exp;
           System.out.println(base + "elevado a " + exp + "-" + Calcularpot(base, exp));
    }
    public static int Calcularpot(int base, int expo){
     int resu = 1;  
        for (int i = 1; i < expo; i++)
            resu = resu*base;
           
        return resu;
    
    }
    public static void Sumarnumeros(){
        int numero,numeros,re;
        Scanner captu = new Scanner(System.in);
       System.out.println("dime el primer numero");
       numero = captu.nextInt();
       System.out.println("dime el primer numero");
       numeros = captu.nextInt();
       re=numeros+numero;
        System.out.println("la suma de " +  numeros  + "+" + numeros+ "es igual a " + re);
}

}
