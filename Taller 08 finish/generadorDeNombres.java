 public class generadorDeNombres{
    public  String [] nombresHombre = {"Ben ", "Paul ", "Leon ", "Noah ", "Finn ", "Omar ",
                                   "Ali ", "Oliver ", "Thomas ", "Miguel ", "Arthur ",
                                   "Gabriel ", "Lucas ", "Freddie ", "Angelo "};
                                   
    public  String [] nombresMujer = {"Sophia ", "Emma ", "Isabella ", "Olivia ", "Ava ",
                                  "Emily ", "Abigail ", "Mia ", "Madison ", "Elizabeth ",
                                   "Emma ","Chiara ","Zoe ","Camila ","Nur "};
                                   
    private  String [] apellidos = {"Calderon ", "Henao ","Rave ","Sosa ","Martinez ","Ortega ",
                              "Rivero ", "Rojas ", "Diaz ", "Florez ", "Acosta ", "Suarez ",
                              "Ortiz ", "Wong ", "Lee ", "Smith ", "Morales ", "Carrizo ",
                              "Trejo ", "Correa "};
    
    public  String generarNombre(String sexo){
        String ans = "";
        
        switch(sexo){
            case "F":
            int nm = (int) (Math.random()*14);
            int am0 = (int) (Math.random()*19);
            int am1 = (int) (Math.random()*19);
            ans = nombresMujer[nm]+apellidos[am0]+apellidos[am1];
            break;
            
            case "M":
            int nh = (int) (Math.random()*14);
            int ah0 = (int) (Math.random()*19);
            int ah1 = (int) (Math.random()*19);
            ans = nombresHombre[nh]+apellidos[ah0]+apellidos[ah1];
            break;
        }
        return ans;
    }
    
    
    
     /**public static persona [] ordenarAlfabetico0(persona [] p){
        String key = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        persona [] ans = p;
        //Arrays.sort(p);
        int n = p.length;
        persona temp;
        int cont = 0;
        for(int i = 0; i<key.length(); i++){
            for(int j = 0; j<ans.length; j++){
               if(key.charAt(i)==ans[j].getNombre().charAt(0)){
                   
                   temp = p[n-1-cont];
                   ans[ans.length-1-cont]= p[j];
                   ans[j]= temp;
                   cont ++;
                   
                }
                cont =0;
            }  
       }
       return ans;
      }**/
    
    public static void main(String [] Args){
        persona [] p = new persona [15];
        for(int i=0; i<15; i++){
          p[i]= new persona("M");  
        }
        //persona[] ans= ordenarAlfabetico(p);
        for(int i=0; i<p.length; i++){
          System.out.println(p[i].getNombre());  
        }
    }
}