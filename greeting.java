import java.util.Scanner;

public class greeting {
	public static void main(String [] args) {
		System.out.println("Hi there who are you?");
		Scanner scanner = new Scanner(System.in);
		String message = scanner.nextLine();
		System.out.println("Hello " + message + " !");
	}
}
