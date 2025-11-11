
package eva3_5.paso.valor;

/**
 *
 * @author anoni
 */
public class EVA3_5PASOVALOR {

    public static void main(String[] args) {
       int valor[] = new int [1];
       valor[0] = 5;
        System.out.println(valor);
       System.out.println("valor (antes) =" + valor[0]);
       incremento(valor);
        System.out.println("valor (despues) =" + valor[0]);
    }
    public static void incremento(int[] val){
        System.out.println(val);
        for(int i =0; i<val.length; i++){
            val[i]=val[i] + 1;
        }
    }
    
}
