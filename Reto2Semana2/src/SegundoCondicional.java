import java.util.Scanner;

public class SegundoCondicional {

	 public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int bit;
		
		System.out.println("¿Cuántos bits tiene la consola?");
		bit = sc.nextInt();
		
		if (bit == 1) {
			System.out.println("Es una consola de Primera generación, creada entre 1972 y 1983");
		} else if (bit == 4) {
			System.out.println("Es una consola de Segunda Generación, creada entre 1976 y 1992");
		} else if (bit == 8) {
			System.out.println("Es una consola de Tercera Generación, creada entre 1983 y 1988");
		} else if (bit == 16) {
			System.out.println("Es una consola de Cuarta Generación, creada entre 1987 y 2003");
		} else if (bit >= 32 && bit <= 64) {
			System.out.println("Es una consola de Quinta Generación, creada entre 1993 y 2006");
		} else if (bit == 128){
			System.out.println("Es una consola de sexta, séptima, octava o novena generación, según su año de creación, entre 1998 hasta la actualidad");
		} else {
			System.out.println("No existen consolas con ese número de bits");
		}
		
		
	}

}