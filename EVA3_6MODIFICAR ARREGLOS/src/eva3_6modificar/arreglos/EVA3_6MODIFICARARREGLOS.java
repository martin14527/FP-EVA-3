public class EVA3_6MODIFICARARREGLOS {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        llenarArreglo(arreglo);
        imprimirArreglo(arreglo);
    }

    public static void llenarArreglo(int arreglo[]){
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random() * 100);
        }
    }

    public static void imprimirArreglo(int arreglo[]){
        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}
