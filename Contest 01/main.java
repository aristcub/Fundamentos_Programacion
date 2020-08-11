import java.util.Scanner;
import java.util.ArrayList;
public class main{
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int [n];
        ArrayList<Integer> answer = new ArrayList<>();
        int aux = 0;
        int cont= 0;
        for(int i=0; i<n; i++){
            array[i]=scan.nextInt();
        }
        for(int i=0; i<n-1; i++){
  
            while(){
                int j = i + 1;
                if(array[i]==array[j]  ){
                    cont ++;
                    
                    
                }
                
                
            }
            
        }
        System.out.println(cont);
    }
}
