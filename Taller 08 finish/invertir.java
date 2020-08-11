public class invertir{
    
    public static int [] invertirArreglo(int [] arreglo){
        int j = arreglo.length - 1;
        int aux;
        for(int i = 0; i<(arreglo.length/2); i++){
            aux = arreglo[i];
            arreglo[i]=arreglo[j];
            arreglo[j]=aux;
            j--;
        }  
        return arreglo;
    }
    
    public static double [] invertirReales(double [] arreglo){
        int j = arreglo.length - 1;
        double aux;
        for(int i = 0; i<(arreglo.length/2); i++){
            aux = arreglo[i];
            arreglo[i]=arreglo[j];
            arreglo[j]=aux;
            j--;
        }  
        return arreglo;
    }
    
    public static String [] invertirString(String [] arreglo){
        int j = arreglo.length - 1;
        String aux;
        for(int i = 0; i<(arreglo.length/2); i++){
            aux = arreglo[i];
            arreglo[i]=arreglo[j];
            arreglo[j]=aux;
            j--;
        }  
        return arreglo;
    }
    
    public static int [] invertirEnteros(int [] arreglo){
        int j = arreglo.length - 1;
        int aux;
        for(int i = 0; i<(arreglo.length/2); i++){
            aux = (arreglo[i]*2);
            arreglo[i]=(arreglo[j]*2);
            arreglo[j]=aux;
            j--;
        }  
        return arreglo;
    }
    
    public static String [] invertirStringMayusculas(String [] arreglo){
        int j = arreglo.length - 1;
        String aux;
        for(int i = 0; i<arreglo.length; i++){
            aux = arreglo[i].toUpperCase();
            arreglo[i] = aux;
        }
        for(int i = 0; i<(arreglo.length/2); i++){
            aux = arreglo[i];
            arreglo[i]=arreglo[j];
            arreglo[j] = aux;
            j--;
        }  
        return arreglo;
    }
    
    
    public static void main(String [] Args){
        int [] enteros = {3, 8, 7, 12, 9};
        double [] doubles = {5.6, 4.5, 7.6, 12.4, 9.3};
        String [] strings = {"zoe","ANGELO","camila","nur","AngeLy"};
        //Para comproba los valores voy a asignarlos a nuevos arreglos para 
        //imprimirlos.
        int [] invArre = invertirArreglo(enteros);
        double [] invRea = invertirReales(doubles);
        //String [] invStr = invertirString(strings);
        //int [] invEnt = invertirEnteros(enteros);
        //String [] invStrMay = invertirStringMayusculas(strings);
        for(int i = 0; i < 5; i++){ 
            //Le puse intencionalmente largo de 5 a todos los arreglos
            //para poder probarlos con un for bien definido sin necesidad
            //de hacer varios.
            //System.out.println(invArre[i]);
            System.out.println(invRea[i]);
            //System.out.println(invStr[i]);
            //System.out.println(invEnt[i]);
            //System.out.println(invStrMay[i]);
        }
    }
}