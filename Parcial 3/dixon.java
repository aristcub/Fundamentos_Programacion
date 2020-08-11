public class dixon{
    public static void main(){
        Persona p1 = new Persona();
        EmpleadoAsalariado ea1 = new EmpleadoAsalariado();
        Empleado e1 = ea1;
        Object o1 =p1;
        //Empleado e2 = p1;
        EmpleadoAsalariado ea2 = (EmpleadoAsalariado)e1;
        
    }
}

class Persona{
    
}
class Empleado extends Persona{
    
}
class EmpleadoAsalariado extends Empleado{}