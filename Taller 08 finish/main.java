import java.util.*;
public class main{
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero mayor a 100");
        int n = scan.nextInt();
        String sexo;
        persona [] p = new persona[n];
        for(int i=0; i<n; i++){
          sexo = ((int) (Math.random()*11)<4)?"M":"F";
          p[i]=new persona(sexo);  
        }
        
        //RETO 1.
        System.out.println("LISTADO DE EMPLEADOS");
        persona.listado(p);
        
        //RETO 2.
        System.out.println("Todas las mujeres:");
        persona [] ans20 = persona.seleccionSexo("F", p);
        for(int i=0; i<ans20.length; i++){
            int j = i +1;
            System.out.println("Mujer Nro."+(j)+":"+ans20[i].getNombre());
        }
        System.out.println("Todos los hombres:");
        persona [] ans21 = persona.seleccionSexo("M", p);
        for(int i=0; i<ans21.length; i++){
            int j = i +1;
            System.out.println("Hombre Nro."+(j)+": "+ans21[i].getNombre());
        }
        
        //RETO 3.
        System.out.println("PERSONA MAS ALTA");
        System.out.println("La persona mas alta: "+persona.masAlto(p).getNombre()+
                        " midiendo "+persona.masAlto(p).getEstatura()+" metros.");
        
        //RETO 4.
        System.out.println("MUJER MAS ALTA");
        System.out.println("La mujer mas alta: "+persona.sexoMasAlto("F",p).getNombre()+
                 " midiendo "+persona.sexoMasAlto("F",p).getEstatura()+" metros.");
        System.out.println("HOMBRE MAS ALTO");
        System.out.println("El hombre mas alto: "+persona.sexoMasAlto("M",p).getNombre()+
                 "midiendo "+persona.sexoMasAlto("M",p).getEstatura()+" metros.");
        
        //RETO 5.
        System.out.println("NOMBRE PERSONA MAS PESADA");
        System.out.println("Persona mas pesada: "+persona.masPesada(p));
        
        //RETO 6.
        System.out.println("DIFERENCIA ENTRE MAS PESADO Y MAS PESADA");
        System.out.println("Diferencia entre mas pesado y mas pesada:"+
                           persona.diferenciaMasPesados(p)+" kilos");
                 
        //RETO 7.
        System.out.println("LISTADO DE EMPLEADOS AL REVES");
        persona [] ans7 = persona.ordenarAlfabeto(p);  
        int m = ans7.length;
        for(int i = 0; i < ans7.length; i++){
            System.out.println("Empleado Nro."+(m--)+": "+ans7[i].getNombre());
        }
        
        //RETO 8.
        System.out.println("LISTADO DE EMPLEADOS ORDENADOS POR ESTATURA");
        
        persona [] ans8 = persona.ordenarEstatura(p);  
        
        for(int i = 0; i < ans8.length; i++){
            int j = i + 1;
            System.out.println("Empleado Nro."+(j)+": "+ans8[i].getNombre()+
                                "con "+ans8[i].getEstatura()+" metros");
        }
        
        //RETO 9.
        System.out.println("PROMEDIO DE PESO DE LAS PERSONAS");
        System.out.println("El promedio de peso entre todas las personas es de "+
                            persona.promedioPeso(p)+" Kilos");
    }
}