public class EdificioComercial extends Edificio{
    private int negocios;
    private String tipoDeNegocio;
    public EdificioComercial(String n, String d, int p, int ne, String tn){
        super(n,d,p);
        this.negocios = ne;
        setTipoDeNegocio(tn);
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
    
    public void setNegocios(int n){
        this.negocios = n ;
    }
    
    public int getNegocios(){
        return negocios;
    }
    
    public void setTipoDeNegocio(String t){
        if(t.equalsIgnoreCase("Publico") || t.equalsIgnoreCase("Comercial")){
            this.tipoDeNegocio = t;
        }else{
            this.tipoDeNegocio = "Publico";
        }
    }
    
    public String getTipoDeNegocio(){
        return tipoDeNegocio;
    }
    
    @Override
    public String toString(){
        return "|*****Informacion Edificio *****|\n"+
               " Nombre: "+this.nombre+
               "\n Direccion: "+this.direccion+
               "\n Numero de Pisos: "+this.pisos+
               "\n Negocios: "+this.negocios+ 
                "\n Tipo de Negocios: "+ this.tipoDeNegocio;
    }
}