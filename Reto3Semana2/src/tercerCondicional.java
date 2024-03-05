
import java.util.Scanner;

public class tercerCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿En qué año nace o nacerá?");
		int year = scanner.nextInt();
		
		switch (year) {
		case 2020:
			System.out.println("Su signo es una Rata");
			break;
		case 2021:
			System.out.println("Su signo es un Buey");
			break;
		case 2022:
			System.out.println("Su signo es un Tigre");
			break;
		case 2023:
			System.out.println("Su signo es un Conejo");
			break;
		case 2024:
			System.out.println("Su signo es un Dragón");
			break;
		case 2025:
			System.out.println("Su signo es una Serpiente");
			break;
		case 2026:
			System.out.println("Su signo es un Caballo");
			break;
		case 2027:
			System.out.println("Su signo es una Cabra");
			break;
		case 2028:
			System.out.println("Su signo es un Mono");
			break;
		case 2029:
			System.out.println("Su signo es un Gallo");
			break;
		case 2030:
			System.out.println("Su signo es un Perro");
			break;
			
			default:
				System.out.println("Año fuera de rango");
		}
		
	}

}
