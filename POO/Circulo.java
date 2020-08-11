import java.util.*;
public class Circulo{
    

    private double radio;
    
    public Circulo(){
        this.radio = 1;
    }
    
    public Circulo(double r){
        this.radio = r;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public void setRadio(double r){
        this.radio = r;
    }
    
    public double getPerimetro(){
        return 2 * this.radio * Math.PI;
    }  
}