public class EmpleadoAsalariado extends Empleado
{
    private float salario;
   
    public float getSalario(){
        return this.salario;
    }
   
    public void setSalario(float s){
        this.salario = s;
    }
   
    @Override
    public String toString(){
        String texto = "EmpleadoAsalariado{" + "nombre=" + getNombre();
        texto = texto + " empresa=" + getEmpresa();
        texto = texto + " salario=" + this.salario + "}";
        return texto;
    }
}