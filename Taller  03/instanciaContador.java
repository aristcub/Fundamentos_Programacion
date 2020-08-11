public class instanciaContador{
    public static void main(String[] args){
        ContadorLimiteRegreso cont1 = new ContadorLimiteRegreso(2);
        System.out.println(cont1.obtActual());
        System.out.println(cont1.obtActual());
        System.out.println(cont1.obtActual());
        System.out.println(cont1.obtActual());
        System.out.println(cont1.obtActual());
        System.out.println(cont1.obtActual());
        System.out.println(cont1.obtActual());
    }
}