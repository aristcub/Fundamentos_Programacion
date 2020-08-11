import java.util.Scanner;
public class SensorLuz{
    private int intensidadMin;
    private int intensidadMax;
    private int intensidad;
    
    public SensorLuz(int min, int max){
        intensidadMax = max;
        intensidadMin = min;
        intensidad = min;
    }
    
    public void setIntensidad(int i){
        if(i >= intensidadMin && i <= intensidadMax){ 
            intensidad = i;
        }
    }
    
    public int getIntensidad(){
        return this.intensidad;
    }
    
    public int duplicarIntensidad(){
        if(intensidad <= intensidadMax){
            intensidad *=2;
            if(intensidad > intensidadMax){
                intensidad = intensidadMax;
            }
        }
        return this.intensidad;
    }
    
}