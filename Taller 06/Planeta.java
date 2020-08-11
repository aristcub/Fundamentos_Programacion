public class Planeta{
    private String nombre;
    private double masa;
    public static int contador = 0;
    
    public Planeta(){
        this("Tierra",5.972);
    }
    
    
    
    public Planeta (String n , double m){
        this.nombre = n;
        if(m >= 5.8){
            this.masa = m;
            PrincipalPlaneta.planetasMalignos ++;
        }else{
            this.masa = m;
        }
        contador ++;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getMasa(){
        return this.masa;
    }
    
    public void setNombre(String n){
        this.nombre =  n;
    }
    
    public void setMasa(double m){
        this.masa = m;
    }
    
    public static Planeta planetaMedio(Planeta p){
        double m = p.getMasa()/2;
        Planeta pm = new Planeta();
        pm.setMasa(m);
        pm.setNombre(p.getNombre());
        return pm;
    }
}