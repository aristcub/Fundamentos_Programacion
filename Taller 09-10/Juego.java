import java.util.ArrayList;
public class Juego{
    //Monstruo m1;
    //public void asignarMonstruo ( Monstruo m1) { 
    //    this.m1 = m1;
    //}
    
    ArrayList <Monstruo> arrm ;
    ArrayList <Humano> arrh ;
    public Juego () {
        arrm = new ArrayList<>();
        arrm.add(new Orco("Garnag", 10, "garr")); 
        arrm.add(new Dragon("Brenton", 20, "metal")); 
        arrm.add(new Orco("Rogthun", 5, "purr"));
        arrm.add(new Dragon("Draco", 40, "cuero")); 
    }
       
    public void moverMonstruos () {
        for(Monstruo m: arrm){
            m.moverse();
        }
    }
    
    public void moverHumanos(){
    
    }
}
