public class Producto {
    
    private String nombre = "";
    private String precio = "";
    private String marca = "";
    
    
    public Producto(){
        this.nombre = "";
        this.precio = "";
        this.marca="";
    }
    
    public Producto(String n){
        this.nombre = n;
    }
    
    public Producto(Producto p2){
        this.precio = p2.getPrecio();
        this.nombre = p2.getNombre();
        this.marca = p2.getMarca();
    }
    
    public void setPrecio(String p){
        this.precio = p;
    }
    
    public void setMarca(String m){
        this.marca = m;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getPrecio(){
        return this.precio;
    }
    
    public String getMarca(){
        return this.marca;
    }
}