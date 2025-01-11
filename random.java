import java.util.*;

public class random {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("How many numbers?");
		int answer = scan.nextInt();
		System.out.println(" ");
			while (answer != 0) {
			int random = rand.nextInt(1000);
			System.out.println(random);
			answer--;
				}
	}
}