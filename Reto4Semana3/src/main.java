import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cuántos números vas a introducir?");
		int cantidad = scanner.nextInt();
		
		int suma = 0;
		int contador = 0;
		
		while (contador<cantidad) {
			System.out.println("Introduce el número " + (contador+1));
					suma += scanner.nextInt();
					contador++;
		}
		
		System.out.println("La suma de los números es: " + suma);
	}

}
