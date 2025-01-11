import java.util.*;

class DiceSim {
    public static void main(String[] args) {
        //int
        Scanner intInput = new Scanner(System.in);
        Scanner numInput = new Scanner(System.in);
        Random randomNum = new Random();
        int userInput;
        int dice;
        int userImput = 1;
        int loop = 1;
        
        //text
        System.out.println("Running on " + Runtime.version());
        System.out.println(" ");
        System.out.println("Welcome to DiceSim!");
        
        //start
        try {
            System.out.println("How many sides will the dice have?");
            userInput = intInput.nextInt();
            while (userImput == 1) {
            dice = randomNum. nextInt(userInput) + 1;
            System.out.println(" ");
            System.out.println(dice);
            System.out.println(" ");
            System.out.println("Roll again? (1 for yes, 2 for No, and 3 for yes All");
            userImput = numInput.nextInt();
            if (userImput == 2) {
                break;
            }
            if (userImput == 3) {
                while (userImput == 3) {
                dice = randomNum. nextInt(userInput) + 1;
                System.out.println(dice);
                System.out.println(" ");
                }
            }
            }
        }
        
        catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}