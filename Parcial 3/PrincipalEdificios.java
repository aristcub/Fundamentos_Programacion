public class PrincipalEdificios{
    private static Edificio [] array = new Edificio[3];
    
    public static void mostrarInfo(Edificio [] a){
        for(int i = 0; i<a.length; i ++){
            System.out.println(a[i].toString());
        }
    }
    
    public static void edificioMasAlto(Edificio [] a){
        int ans= 0;
        for(int i = 1; i<a.length; i ++){
            int j = a[0].getPisos();
            if(j < a[i].getPisos()){
                ans = i;
            }
        }
        System.out.println(a[ans].toString());
    }
    
    public static void main(String [] Args){
        array[0]= new EdificioComercial("Edificio Dixon","Carrera 1 #1",100,50,"Comercial");
        array[1]= new EdificioComercial("Edificio Calderon","Carrera 1 #2",101,70,"lol");
        array[2]= new EdificioResidencial("Edifico YaNoSeQuePonerProfe","Carrera 1 #3",99,100);
        mostrarInfo(array);
        edificioMasAlto(array);
    }
}