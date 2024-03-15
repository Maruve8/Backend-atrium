
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String secuencia = "9876543210";
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + " - " + secuencia.substring(0, secuencia.length() - i));
		}
		
	}

}