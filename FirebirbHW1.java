import java.util.Scanner;
public class FirebirbHW1 {
    public static void main(String[] args) {
        // Decision Statements
        Scanner fruit = new Scanner(System.in);
        System.out.println("1 for fruits, 2 if you would like a drink");
        int fruits = Integer.parseInt(fruit.nextLine());
        switch(fruits) {
            case 1: // Offers fruits
                System.out.println("OK, what fruit? (1-5 for fruits A-E)");
                fruits = Integer.parseInt(fruit.nextLine());
                switch (fruits) {
                    case 1: //Fruit A
                        System.out.println("OK, that will be $2.00");
                        break;
                    case 2: //Fruit B
                        System.out.println("OK, that will be $3.00");
                        break;
                    case 3: //Fruit C
                        System.out.println("OK, that will be $4.00");
                        break;
                    case 4: //Fruit D
                        System.out.println("OK, that will be $5.00");
                        break;
                    case 5: //Fruit E
                        System.out.println("OK, that will be $6.00");
                        break;
                    default: //Anything else that is inputted
                        System.out.println("Pick a fruit!");
                        break;
                }
                break;
            case 2: // Offers drinks
                System.out.println("OK, what drink? We offer all kinds of drinks!");
                String drink = fruit.nextLine();
                System.out.println("OK, we will be getting you " + drink);
                break;
            default: // If 1 or 2 aren't chosen
                System.out.println("Input either 1 or 2!");
                break;
        }
        // Loops
        int a = 5; // Starting value
        do {
            System.out.println(a);
            a += 3;
        } while (a <= 100); //Increments starting value by 3 then prints new value until it reaches the highest value lower than 100

        Scanner message = new Scanner(System.in);
        System.out.println("Input anything and watch it go poof");
        String myMessage = message.nextLine();
        if (myMessage.length() <= 0) { // If there is nothing inputted
            System.out.println("You need something!");
        }
        else {
            for (int i = myMessage.length()-1; i >= 0; i--) {
                myMessage = myMessage.substring(0, i);
                System.out.println(myMessage);
            } // Removes a letter from the right all the way to the left then prints the new message
        }
        // Variable Initialization
        double bankMoney; // Dollars have decimals
        long naturalNumberSum; // Positive integers greater than 0
        char letter; // Represents a letter (A-Z)
        String robotName; // Name of a robot
        double sphereVolume; // Measurements and pi have decimals in them
        int brainNeurons; // You can't have a fraction of a neuron

        // Scanner closes
        fruit.close(); // From Decision Statements
        message.close(); // From Loops
    }
}
