import java.util.*;
public class ContIncr2{
        private int cont;
        private int incr;
        public int init;
        public ContIncr2(){
            this.init = 0;  //Agrego un valor prederteminado
            this.cont = 0;
            this.incr = 1;
        }
        
        public ContIncr2(int in){
            this.init = in;
        }
        
        public ContIncr2(int c , int i){
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
            this.init ++;
        }
        
        /**public int prueba(){
            return this.init;  Esta funcion la hice para probar el conteo del init.
        }**/
}