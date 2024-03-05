import java.util.Scanner;

public class PrimerCondicional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Dime una edad entre 0 y 100");
        edad = sc.nextInt();

        if (edad > 18 && edad <= 100) {
            System.out.println("Eres mayor de edad");
        } else if (edad < 18 && edad >= 1) {
            System.out.println("Eres menor de edad, te faltan " + (18 - edad) + " años para tener 18");
        } else {
            System.out.println("La edad debe estar comprendida entre 1 y 100");
        }
    }
}