public class subArreglo{
    
    public static int [] subArregloPares(int [] arreglo){
        int cont = 0;
        int [] pares;
        int j = 0;
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i]%2==0){
                cont++;
            }
        }
        pares = new int [cont];
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i]%2==0){
                pares[j]=arreglo[i];
                j++; 
            }
        }        
        return pares;
    }
    
    public static int [] subArregloMayor(int [] arreglo){
        int cont = 0;
        int [] ans;
        int j = 0;
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i]>arreglo[0]){
                cont++;
            }
        }
        ans = new int [cont];
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i]>arreglo[0]){
                ans[j]=arreglo[i];
                j++; 
            }
        }        
        return ans;
    }
    
    public static double [] subArregloMenor(double [] arreglo){
        int cont = 0;
        double [] ans;
        int j = 0;
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i]<arreglo[arreglo.length-1]){
                cont++;
            }
        }
        ans = new double [cont];
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i]<arreglo[arreglo.length-1]){
                ans[j]=arreglo[i];
                j++; 
            }
        }        
        return ans;
    }
    
    public static String [] subArregloVocal(String [] arreglo){
        int cont = 0;
        String [] ans;
        int j = 0;
        String key = "aeiouAEIOU";
        for(int i = 0; i < arreglo.length; i++){
            /**switch(arreglo[i].charAt(0)){
                case 'a':
                cont ++;
                break;
                
                case 'e':
                cont ++;
                break;
                
                case 'i':
                cont ++;
                break;
                
                case 'o':
                cont ++;
                break;
                
                case 'u':
                cont ++;
                break;
                
                deafult:
                break;
            }**/

            //if(arreglo[i].charAt(0) == ('A'|'a'|'E'|'e'|'I'|'i'|'O'|'o'|'U'|'u')){
            //    cont ++;
            //}
            if(key.indexOf(arreglo[i].charAt(0))!= -1){
                cont ++;
            }
        }
        ans = new String [cont];
        for(int i = 0; i < arreglo.length; i++){
            if(key.indexOf(arreglo[i].charAt(0))!= -1){
                ans[j]=arreglo[i];
                j++; 
            }
        }        
        return ans;
    }
    
    public static void main(String [] Args){
        int [] enteros = {6, 7, 2, 4, 9, 8};
        double [] reales = {-2, 0, 9, 4, 6, 8, 7};
        String [] strings = {"hola", "alv", "alchilewe","chingatumadre", "edith", "Ed",
                            "urna", "Ontas"};              
        int [] entp = subArregloPares(enteros);
        int [] entm = subArregloMayor(enteros);
        double [] doum = subArregloMenor(reales);
        String [] strv = subArregloVocal(strings);
        for(int i = 0 ; i<entp.length; i ++){
            System.out.println(entp[i]);
        }
        for(int i = 0 ; i<entm.length; i ++){
            System.out.println(entm[i]);
        }
        for(int i = 0 ; i<doum.length; i ++){
            System.out.println(doum[i]);
        }
        for(int i = 0 ; i<strv.length; i ++){
            System.out.println(strv[i]);
        }
    }
}
