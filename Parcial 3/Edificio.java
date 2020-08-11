public class Edificio{
    protected String nombre;
    protected String direccion;
    protected int pisos;
    
    public Edificio(String n, String d, int p){
        this.nombre = n;
        this.direccion = d;
        this.pisos = p;
    }
    
    public String toString(){
        return "|*****Informacion Edificio *****|\n"+
               " Nombre: "+this.nombre+
               "\n Direccion: "+this.direccion+
               "\n Numero de Pisos: "+this.pisos;
    }
    
    public int getPisos(){
        return pisos;
    }
}