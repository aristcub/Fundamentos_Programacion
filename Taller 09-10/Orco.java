public class Orco extends Monstruo {
    String rugido;
    Orco(String n, int s, String r){
        super(n,s);
        this.rugido = r;
    }
    
    public void imprimirNombre () { 
        System.out.println("Mi nombre es: " + nombre);
    }
    
    public void moverse () {
        System.out.println("Soy un orco, estoy corriendo");
    }
}