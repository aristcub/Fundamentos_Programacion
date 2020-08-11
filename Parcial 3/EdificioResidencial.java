public class EdificioResidencial extends Edificio{
    private int viviendas;
    
    public EdificioResidencial(String n, String d, int p, int v){
        super(n,d,p);
        this.viviendas = v;
    }
    
    public void setNombre(String n){
        this.nombre = n ;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDireccion(String d){
        this.direccion = d;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setPisos(int p ){
        this.pisos = p;
    }
    
    @Override
    public int getPisos(){
        return pisos;
    }
    
    public void setViviendas(int v){
        this.viviendas = v ;
    }
    
    public int getViviendas(){
        return viviendas;
    }
    
    @Override
    public String toString(){
        return "|*****Informacion Edificio *****|\n"+
               " Nombre: "+this.nombre+
               "\n Direccion: "+this.direccion+
               "\n Numero de Pisos: "+this.pisos +
               "\n Viviendas: "+this.viviendas;         
    }
}