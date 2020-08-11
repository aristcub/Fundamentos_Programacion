import java.util.Scanner;
public class ControlAmbiente {
    public static void main (String [] Args){
        Scanner scan = new Scanner(System.in);
        SensorActuador sa1 = new SensorActuador(5,1,10);
        for (int i = 0; i < 4 ; i++) {
            if(i<2){
                sa1.disminuirTemp(scan.nextInt());
            }else{
                sa1.aumentarTemp(scan.nextInt());
            }
        }
        System.out.println(sa1.getTemperatura());
    }
}