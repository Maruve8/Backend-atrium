import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		
		System.out.println("Escribe nombres de personas:");
		
		String nombre = scanner.nextLine();
		
		while (!nombre.equals("quit")) {
			contador++;
			nombre = scanner.nextLine();
		}
		
		System.out.println("Has introducido " + contador + " nombres.");
		
		scanner.close();
		
}
}