public class busquedBinaria{
    public static void main(String[] args){
            int[] arr_edades = {10,20,30,40,50};
            int buscar = 20; //elemento a buscar
            int resul = -1; //resultado
            int ini = 0; //posición inicial
            int fin = arr_edades.length-1; //pos final
            int pos; //posición actual de búsqueda
            while(ini<=fin){
                pos = (ini+fin)/2;
                if(buscar == arr_edades[pos]){
                    resul = pos;
                    break;
                }else if (buscar < arr_edades[pos]){
                    fin = pos-1;
                }else{
                    ini = pos+1;
                }  
            }
            System.out.print("La pos en la que se encuentra");
            System.out.print(buscar+" es: "+resul);
        }   
}
