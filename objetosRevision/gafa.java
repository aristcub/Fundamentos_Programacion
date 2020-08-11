public class gafa{
    private String nombre;
    private double precio; //atributo de instancia
    public final static int IVA = 19;
    public final static int ENVIO = 2000; //atributo de clase
    public static int cont = 0;
    
    //final hace que no se puede modificar (NO se puede hacer un set)
    //si tiene solo el static se puede modificar y ocupa el mismo espacio de mermoria.
    public gafa(String n, double p){
        this.nombre = n;
        this.precio = p;
        gafa.cont ++;
    }
    
    public double precioConIva(){
        double total = this.precio+(this.precio*this.IVA/100);
        return total;
    }
    
    public double precioConIvaYEnvio(){
        double total = this.precio+(this.precio*this.IVA/100)+this.ENVIO;
        return total;
    }
    
    public static void imprimirDatosGenerales(){
        System.out.println("Todos los productos vendidos tiene un iva de:");
        System.out.println(gafa.IVA);
        System.out.println("Todos los productos vendidos tienen un costo de envio de:");
        System.out.println(gafa.ENVIO);
    }
}