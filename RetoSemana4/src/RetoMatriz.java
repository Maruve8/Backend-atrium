import java.util.Scanner;
public class RetoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear matriz
		
	
		
		String[][] reto = new String[9][10];
		
		reto [0][7]= "DAW";
		reto [1][3]= "DAW";
		reto [1][6]= "DAW";
		reto [2][1]= "DAM";
		reto [2][4]= "DAM";
		reto [2][8]= "DAM";
		reto [3][0]= "DAW";
		reto [3][6]= "DAM";
		reto [4][1]= "DAM";
		reto [4][4]= "DAW";
		reto [5][2]= "DAW";
		reto [5][3]= "DAW";
		reto [5][6]= "DAM";
		reto [5][9]= "DAW";
		reto [6][2]= "DAW";
		reto [7][3]= "DAM";
		reto [7][5]= "DAM";
		reto [7][7]= "DAM";
		reto [8][1]= "DAM";
		reto [8][8]= "DAW";
		
		
		//contadores
		int contadorDAM=0;
		int contadorDAW=0;
		
		
		for(int i=0; i<reto.length; i++) {
			for(int j=0; j<reto[i].length; j++) {
				//meto comprobación porque salta excepción
				if (reto[i][j] != null) {
					if (reto[i][j].equals("DAM")) {
						contadorDAM++;
				} else if (reto [i][j].equals("DAW")) {
					contadorDAW++;
				}
			}
		}
		
		}
		
		//imprimir nº daw y dam
		System.out.println("El número de elemntos con DAM es: " + contadorDAM);
		System.out.println("El número de elementos con DAW es: " + contadorDAW);
		
		
		//imprimir todos los datos del array
		for(int i=0; i<reto.length; i++) {
			for(int j=0; j<reto[i].length; j++) {
				System.out.println("Los datos de la matriz son: " + reto[i][j]);
			}
		}
		
		//reemplazar textos dam y daw
		for(int i=0; i<reto.length; i++) {
			for(int j=0; j<reto[i].length; j++) {
				if (reto[i][j] !=null) {
					if (reto[i][j].equals("DAM")) {
						reto[i][j]="Multiplataforma";
				}else if (reto [i][j].equals("DAW")) {
					reto[i][j]="WEB";
				}
			}
		}
		
		
	}
		
		//imprimo de nuevo
		for(int i=0; i<reto.length; i++) {
			for(int j=0; j<reto[i].length; j++) {
				System.out.println("Los datos de la matriz son: " + reto[i][j]);
			}
		}
		
		
		
		//escáner, pedir filas, columnas, textos
		
		Scanner scanner = new Scanner(System.in);
        String respuesta;
        
		do {
			System.out.println("Fila:");
			int fila =scanner.nextInt();
			
			System.out.println("Columna:");
			int columna = scanner.nextInt();
			
			System.out.println("Texto:");
			String texto = scanner.next();
			
			 if (reto[fila][columna] != null) {
				 
				 System.out.println("¿Quieres cambiar el texto " + reto[fila][columna] + "por " + texto + " ? (S/N): ");
				 respuesta = scanner.next();
				 if(respuesta.equalsIgnoreCase("S")) {
					 reto[fila][columna] = texto;
				 }
			 }else {
				 reto[fila][columna] = texto;
			 }
			 
			 System.out.println("¿Quieres ingresar otro texto? (S/N:");
			 respuesta = scanner.next();
			
			
		}while (!respuesta.equalsIgnoreCase("N"));
		
		scanner.close();
		
		
		//imprimir todos los datos del array
				for(int i=0; i<reto.length; i++) {
					for(int j=0; j<reto[i].length; j++) {
						System.out.println("Los datos de la matriz son: " + reto[i][j]);
					}
				} 

}

}

