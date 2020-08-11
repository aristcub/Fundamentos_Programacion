import java.util.*;
public class Contador{
        private int cont;
        
        //public Contador(){
           //this.cont = 0;
        //}

        //public Contador(int cont){
            //this.cont = cont;
        //}        
        
        public void reiniciar(){
            this.cont = 0;
        }
        
        public int obtCont(){
           return this.cont;        
        }
        
        
        public void incr(){
           this.cont ++;        
        }
}