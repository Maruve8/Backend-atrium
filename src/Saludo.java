import java.util.Scanner;

public class Saludo {


String name;
int year;
String language;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);


System.out.println("Dime tu nombre:");
String name = scanner.nextLine();

System.out.println("En qué año estamos:");
int year = scanner.nextInt();
scanner.nextLine();

System.out.println("Dime tu lenguaje de programación preferido:");
String language = scanner.nextLine();

System.out.println("Hola, " + name + ", en este año " + year + " serás un/a gran programador " + language);

scanner.close();

	}

}
