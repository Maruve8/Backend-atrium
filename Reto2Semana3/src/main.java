import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int prestamo;
		int deuda;
		prestamo = 1000;
		
		
		
		do {
			System.out.println("¿Qué cantidad de dinero vas a aportar?");
			int aportacion = scanner.nextInt();
			deuda = prestamo - aportacion;
			prestamo = deuda;
			System.out.println("Ya te queda menos: " + deuda);
			
		}
		
		while (deuda>=1);
		
		if (deuda <=0) {
		System.out.println("Saldaste tu deuda");
		
		}
		
	}

}
