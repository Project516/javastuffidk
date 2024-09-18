public class beerwall {
	public static void main (String [] args) {
		int bottleNum = 99;
		String word = " bottles ";

		while (bottleNum > 0) {
			if (bottleNum == 1) { 
				word= " bottle ";
			}
		System.out.println (bottleNum + word + "of beer on the wall!");
		System.out.println (bottleNum + word + "of beer!");
		System.out.println ("Take one down, pass it around!");
		bottleNum = bottleNum - 1;
		if (bottleNum > 0) {
		System.out.println (bottleNum + word + "of beer on the wall!");
		System.out.println (" ");
		} else {
			System.out.println ("No more bottles of beer on the wall!");
		}
	}
}
}