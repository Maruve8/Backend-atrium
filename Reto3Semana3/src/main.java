import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		int suma = 0;
		int numero;
		
		do { System.out.println("Dame un número del 1 al 100");
			numero = scanner.nextInt();
			
			if (numero>=1 && numero<=100) {
			suma += numero;
			System.out.println("Sumatorio: " + suma);
			}
		}
		
		while (numero !=0);
		System.out.println("Fin del juego. Recuento: " + suma);
		
	}

}
