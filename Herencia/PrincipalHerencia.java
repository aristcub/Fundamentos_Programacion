public class PrincipalHerencia
{
    public static void main(String[] args){
        EmpleadoAsalariado ea1 = new EmpleadoAsalariado();
        ea1.setEmpresa("Apple");
        ea1.setNombre("Maria");
        ea1.setSalario(100);
        System.out.println(ea1.getNombre());
        System.out.println(ea1.toString());
    }
}