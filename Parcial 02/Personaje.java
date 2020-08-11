public class Personaje{
    private String nombre;
    private double ataque;
    private double salud;
    
    public Personaje(){
        this("Hada1", 5, 10);
    }
    
    public Personaje(String n, double a, double s){
        this.nombre=n;
        this.ataque=a;
        this.salud=s;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getAtaque(){
        return ataque;
    }
    
    public double getSalud(){
        return salud;
    }
    
    public void setNombre(String n){
        this.nombre=n;
    }
    
    public void setAtaque(double a){
        if(a<0){
            System.out.println("El valor ingresado debe ser mayor a 0");
        }else{
            this.ataque=a;
        }
    }
    
    public void setSalud(double s){
        if(s<0){
            System.out.println("El valor ingresado debe ser mayor a 0");
        }else{
            this.salud=s;
        }
    }
    
    public static void pelea(Personaje p1, Personaje p2){
        if(p1.getSalud()==0||p2.getSalud()==0){
            System.out.println("|**********  PELEA  **********|\n"+
                               "Personaje "+p1.getNombre()+" no puede atacar a\n"+
                               p2.getNombre()+" porque esta muerto");
        }else{
            double s = p2.getSalud() - p1.getAtaque();
            if(s<=0){
                p2.setSalud(0);
                System.out.println("|**********  PELEA  **********|\n"+
                                   "Personaje "+p1.getNombre()+" ha atacado a\n"+
                                    p2.getNombre()+" y su salud disminuyo -"+p1.getAtaque()+
                                   "\nquedando en "+p2.getSalud());
                System.out.println("Personaje "+p2.getNombre()+" muerto");
            
            }else{
            
                p2.setSalud(s);
                System.out.println("|**********  PELEA  **********|\n"+
                               "Personaje "+p1.getNombre()+" ha atacado a\n"+
                               p2.getNombre()+" y su salud disminuyo -"+p1.getAtaque()+
                               "\nquedando en "+p2.getSalud());
            }
        }
    }
    
    public String toString(){
        return " Nombre: "+this.nombre+
               "\n Ataque: "+this.ataque+
               "\n Salud "+this.salud;
    }
}