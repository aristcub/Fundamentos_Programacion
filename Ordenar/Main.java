import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			int contador = 0;
			String vector[] = new String[30];
			while(contador != 30) {
				System.out.println("Ingresa una cadena: ");
				vector[contador++] = in.readLine();
			}
			Ejemplo01 e = new Ejemplo01(vector);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}