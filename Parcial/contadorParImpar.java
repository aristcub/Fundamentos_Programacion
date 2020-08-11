import java.util.Scanner;
class contadorParImpar{
    private int nImpar;
    private int nPar;
    
    // constructo para inicializar las variables se puede obviar por que 
    //el sistema las incializa automaticamente a 0.
    public int obtPar(){
        return this.nPar;
    }
    
    public int obtImpar(){
        return this.nImpar;
    }
    
    public void contar(int n){
        if((n % 2) == 0){
            nPar ++;
        }else{
            nImpar ++;
        }
    }
    
    
} 