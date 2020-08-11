public class PrincipalPlaneta{
    public static final double MASAMALIGNA = 6.2;
    public static int planetasMalignos = 0;
    
    public static void main(String [] args){
        Planeta Planeta = new Planeta();
        Planeta Marte = new Planeta("Marte",0.63);
        Planeta Venus = new Planeta("Venus",4.867);
        Planeta Jupiter = new Planeta("Jupiter", 1898);
        
        System.out.println(Planeta.contador);
        System.out.println(planetasMalignos);
        
        Planeta.planetaMedio(Marte);
        
        System.out.println(Planeta.contador);
        System.out.println(planetasMalignos);        
    }
    
}