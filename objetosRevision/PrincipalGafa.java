public class PrincipalGafa{
    public static void main(String [] Args){
        gafa.imprimirDatosGenerales();
        System.out.println(Math.pow(2,2)); //math es metodo de clase static por que
                                           //no necesita una instancia.
        //gafa g1 = new gafa("Super Gafa wn", 200);
        //System.out.println("Accediendo a la variable static desde objeto"+g1.IVA);
        //System.out.println("Accediendo a la variable static sin objeto"+gafa.IVA);
        
        gafa g0 = new gafa("gafitica", 200);
        gafa g1 = new gafa("gafita", 200);
        gafa g2 = new gafa("gafa", 200);
        gafa g3= new gafa("gafota", 200);
        gafa g4 = new gafa("gafotota", 200);
        
        System.out.println(gafa.cont);
        
    }
}