public class persona{
    private String nombre;
    private String sexo;
    private double peso;
    private double estatura;
    
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
    
    public static double generarPeso(){
        double p = Math.random()*110+45;
        return p;
    }
    
    public static double generarEstatura(){
        double e = Math.random()*1.95+0.5;
        return e;
    }
    
    public persona(String x){
        this.sexo = x;
        this.nombre = generarNombre(x);
        this.peso = generarPeso();
        this.estatura = generarEstatura();
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public static void listado(persona [] p){
        for(int i = 0; i < p.length; i++){
           
            System.out.println(p[i].getNombre());
        
        }
    }
    
    
    
    
    
}