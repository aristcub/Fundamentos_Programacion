public class PrincipalPersonaje{
    public static Personaje [] personajes = new Personaje[3];
    
    public static void mostrarPersonajes(){
        for(int i = 0; i < personajes.length; i++ ){
            System.out.println("|*****Informacion Personaje "+(i+1)+"*****|\n"+
                               personajes[i].toString());
        }
    }
    
    public static void main(String [] Args){
        personajes[0]= new Personaje();
        personajes[1]= new Personaje("Mago1",5,20);
        personajes[2]= new Personaje("Humano1",2,10);
        mostrarPersonajes();
        Personaje.pelea(personajes[1],personajes[2]);
        Personaje.pelea(personajes[0],personajes[2]);
        Personaje.pelea(personajes[1],personajes[0]);
        Personaje.pelea(personajes[1],personajes[0]);
        Personaje.pelea(personajes[0],personajes[2]);
        Personaje.pelea(personajes[0],personajes[1]);
        mostrarPersonajes();
    }
} 