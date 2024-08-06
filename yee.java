import java.util.Scanner;

public class yee {
	public static void main(String [] args) {
		System.out.println("type a message");
		Scanner scanner = new Scanner(System.in);
		String message = scanner.nextLine();
		System.out.println(message + " is ok?");
	}
}