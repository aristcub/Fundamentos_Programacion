 public class generadorDeNombres{
    private  String [] nombresHombre = {"Ben ", "Paul ", "Leon ", "Noah ", "Finn ", "Omar ",
                                   "Ali", "Oliver ", "Thomas ", "Miguel ", "Arthur ",
                                   "Gabriel ", "Lucas ", "Freddie ", "Angelo "};
                                   
    private  String [] nombresMujer = {"Sophia ", "Emma ", "Isabella ", "Olivia ", "Ava ",
                                  "Emily ", "Abigail ", "Mia ", "Madison ", "Elizabeth ",
                                   "Emma ","Chiara ","Zoe ","Camila ","Nur "};
                                   
    private String [] apellidos ={"Calderon ", "Henao ","Rave ","Sosa ","Martinez ","Ortega ",
                              "Rivero ", "Rojas", "Diaz ", "Florez ", "Acosta ", "Suarez ",
                              "Ortiz ", "Wong ", "Lee ", "Smith ", "Morales ", "Carrizo ",
                              "Trejo ", "Correa "};
    
    public String generarNombre(String sexo){
        String ans = "";
        int n = 14;
        int m = 19;
        
        switch(sexo){
            case "F":
            int nm = (int) (Math.random()*n);
            int am0 = (int) (Math.random()*m);
            int am1 = (int) (Math.random()*m);
            ans = nombresMujer[nm]+apellidos[am0]+apellidos[am1];
            break;
            
            case "M":
            int nh = (int) (Math.random()*n);
            int ah0 = (int) (Math.random()* m);
            int ah1 = (int) (Math.random()*m);
            ans = nombresHombre[nh]+apellidos[ah0]+apellidos[ah1];
            break;
        }
        return ans;
    }
    
    public static void main(String [] Args){
        persona [] p = new persona[15];
        for(int i = 0; i< p.length;i++){
            String sexo = ((int) (Math.random()*10)<5)?"M":"F";
            p[i]= new persona(sexo);
        }
        
        persona.listado(p);
        for(int i=0; i<1000; i++){
          double max = 1.95;
          double min = 0.50;
          //Math.random()*(max-min+1)+min;
          double ans = Math.random()*(max-min)+min;
          System.out.println(ans); 
        }
    }
}