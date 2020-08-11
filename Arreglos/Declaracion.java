public class Declaracion{
    public static void main(String [] Args){
        //int[] arreglo_enteros;
        //String[] arreglo_String;
        //double[] arreglo_doubles;
        
        //int[] arr_int = new int[3];
        //System.out.println(arr_int[2]);
        
        int[] arr_int = new int[3];
        arr_int[1] = 4;
        System.out.println(arr_int[1]);
        int [] arr_int2 = arr_int;
        arr_int2[1] = 8;
        System.out.println(arr_int[1]);
        System.out.println(arr_int2[1]);
    }
}