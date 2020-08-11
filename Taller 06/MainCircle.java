import java.util.Scanner;
public class MainCircle{
    public static void main(String [] Args){
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(i ==0){
            double radio = scan.nextDouble();
            if(radio > 0){
                Circle c = new Circle(radio);
            }else{
                i ++;
                System.out.println(Circle.numberOfObjects);
            }
        }
    }
}