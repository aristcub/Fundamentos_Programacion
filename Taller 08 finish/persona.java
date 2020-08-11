import java.util.*;
public class persona{
    private  String nombre;
    private  String sexo;
    private  double peso;
    private  double estatura;
    
    private String [] nombresHombre = {"Ben ", "Paul ", "Leon ", "Noah ", "Finn ", "Omar ",
                                   "Ali ", "Oliver ", "Thomas ", "Miguel ", "Arthur ",
                                   "Gabriel ", "Lucas ", "Freddie ", "Angelo "};
                                   
    private  String [] nombresMujer = {"Sofia ", "Emma ", "Isabella ", "Olivia ", "Ava ",
                                  "Emily ", "Abigail ", "Mia ", "Madison ", "Elizabeth ",
                                   "Emma ","Chiara ","Zoe ","Camila ","Nur "};
                                   
    private String [] apellidos ={"Calderon ", "Henao ","Rave ","Sosa ","Martinez ","Ortega ",
                              "Rivero ", "Rojas", "Diaz ", "Florez ", "Acosta ", "Suarez ",
                              "Ortiz ", "Wong ", "Lee ", "Smith ", "Morales ", "Carrizo ",
                              "Trejo ", "Correa "};
    
    public String generarNombre(String sexo){
        String ans = "";
        int nM=nombresHombre.length;
        int nH=nombresMujer.length;
        int a= apellidos.length;
        switch(sexo){
            case "F":
            int nm = (int) (Math.random()*nM);
            int am0 = (int) (Math.random()*a);
            int am1 = (int) (Math.random()*a);
            ans = nombresMujer[nm]+apellidos[am0]+apellidos[am1];
            break;
            
            case "M":
            int nh = (int) (Math.random()*nH);
            int ah0 = (int) (Math.random()*a);
            int ah1 = (int) (Math.random()*a);
            ans = nombresHombre[nh]+apellidos[ah0]+apellidos[ah1];
            break;
        }
        return ans;
    }
    
    public double generarPeso(){
        double max = 110;
        double min = 45;
        //double p = Math.random()*((max-(min+1))+min);FORMA PARA HACEN ENTEROS CON MATH.FLOOR
        double p = Math.random()*((max-min)+min);
        return p;
    }
    
    public double generarEstatura(){
        double max = 1.95;
        double  min= 0.50;
        double e = Math.random()*((max-min)+min);
        return e;
    }
    
    public persona(String x){
        this.sexo = x;
        this.nombre = generarNombre(x);
        this.peso = generarPeso();
        this.estatura = generarEstatura();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public double getEstatura(){
        return estatura;
    }
    
    public static void listado(persona [] p){
        
        System.out.println("LISTA DE EMPLEADOS");            
        for(int i = 0; i < p.length; i++){
            int j = i+1;
            System.out.println("Empleado Nro. "+(j)+": "+p[i].getNombre());
        }
    }
    
    public static persona [] seleccionSexo(String s, persona [] p){
        int cont = 0;
        persona [] seleccion;
        int j = 0;
        for(int i = 0; i < p.length; i++){
            if(p[i].getSexo()==s){
                cont++;
            }
        }
        seleccion = new persona [cont];
        for(int i = 0; i < p.length; i++){
            if(p[i].getSexo()==s){
                seleccion[j]=p[i];
                j++; 
            }
        }        
        return seleccion;
    }
    
    public static persona masAlto(persona [] p){
        persona ans = p[0];
        for(int i = 1; i < p.length; i++){
            if(p[i].getEstatura() > ans.getEstatura()){
                ans = p[i];
            }
        }
        return ans;
    }
    
    public static persona sexoMasAlto(String s, persona [] p){
        persona ans;
        ans = masAlto(seleccionSexo(s, p));
        return ans;
    }
    
    public static String masPesada(persona [] p){
        persona ans = p[0];
        for(int i = 1; i < p.length; i++){
            if(p[i].getPeso() > ans.getPeso()){
                ans = p[i];
            }
        }
        return ans.getNombre();
    }
    
    public static double diferenciaMasPesados(persona [] p){
        double ans;
        persona [] M = seleccionSexo("M",p);
        persona [] F = seleccionSexo("F",p);
        persona ansM = M[0];
        persona ansF = F[0];
        for(int i = 1; i < M.length; i++){
            if(M[i].getPeso() > ansM.getPeso()){
                ansM = M[i];
            }
        }
        for(int i = 1; i < F.length; i++){
            if(F[i].getPeso() > ansF.getPeso()){
                ansF = F[i];
            }
        }
        ans =  (ansM.getPeso() > ansF.getPeso())?ansM.getPeso() - ansF.getPeso():
                                                   ansF.getPeso()-ansM.getPeso() ;
        return ans;
    }
    
    public static persona [] ordenarEstatura(persona [] p){
        persona [] ans = p;
        //Arrays.sort(p);
        int n = p.length;
        persona temp;
        for(int i = 1; i < n; i++){
            for(int j = 0; j<n-i;j++){
                if(ans[j].getEstatura()>ans[j+1].getEstatura()){
                    temp = ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=temp;
                }
            }
        }
        return ans;
    }
    
    public static persona [] ordenarAlfabeto(persona [] p){
        persona [] ans = p;
        //Arrays.sort(p);
        int n = p.length;
        persona temp;
        for(int i = 1; i < n; i++){
            for(int j = 0; j<n-i;j++){
                if(ans[j].getNombre().compareTo(ans[j+1].getNombre())<0){
                    temp = ans[j+1];
                    ans[j+1]=ans[j];
                    ans[j]=temp;
                }
            }
        }
        return ans;
    }
    
    public static double promedioPeso(persona [] p){
        double ans = 0;
        for(int i = 0; i <p.length; i ++ ){
            ans = ans + p[i].getPeso();
        }
        ans = ans/p.length;
        return ans;
    }
}