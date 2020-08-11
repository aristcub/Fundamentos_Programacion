import java.util.*;
public class ContIncr{
        private int cont;
        private int incr;
        public ContIncr(){
            this.cont = 0;
            this.incr = 1;
        }

        public ContIncr(int c , int i){
            this.cont = c;
            this.incr = i;
        }        
        
        public void estIncr(int i){
            this.incr = i;
        }
        
        public void incr(){
           this.cont += this.incr;        
        }
        
        public int obtCont(){
           return this.cont;        
        }
        
        public void reiniciar(){
            this.cont = 0;
            this.incr = 1;
        }
          
}