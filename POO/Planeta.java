public class Planeta{
   
    public String nombre;
    public float masa;
    
    public Planeta(String n, float m){
        this.nombre = n;
        this.masa = m;
    }
    

    public String getNombre(){
        return this.nombre;
    }
    
    public float getMasa(){
            return this.masa;
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setMasa(float m){
        this.masa = m;
    }
    
}