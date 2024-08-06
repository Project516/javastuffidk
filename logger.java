import java.util.Scanner;
	public class logger {
		public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("i know what u type!"); System.out.println("so what is ur name?"); System.out.println("and btw im writing this code by memory!"); 	System.out.println("but actually ur name plz.");
		String name = scanner.nextLine();
		System.out.println("nvm i looked at my greeting.java code because i forgo the scanner stuff"); System.out.println("any way, whats ur favorite food?"); 
		String food = scanner.nextLine();
		System.out.println("nice!" + name + " do u play any sports?");
		String sports = scanner.nextLine();
		System.out.println(name + "i like " + sports + " too!");
		System.out.println(name + " ok so u like " + food + " and u play " + sports + " !");
	}
}
