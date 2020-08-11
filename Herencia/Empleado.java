public class Empleado extends Persona
{
    private String empresa;
   
    public void setEmpresa(String e){
        this.empresa = e;
    }
   
    public String getEmpresa(){
        return this.empresa;
    }
   
    @Override
    public String toString(){
        String texto = "Empleado{" + "nombre=" + getNombre();
        texto = texto + " empresa=" + this.empresa + "}";
        return texto;
    }
}