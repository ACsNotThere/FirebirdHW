import java.util.Scanner;
public class FirebirbHW1 {
    public static void main(String[] args) {
        //Fruit problem
        Scanner fruit = new Scanner(System.in);
        System.out.println("1 for fruits, 2 if you would like a drink");
        int fruits = Integer.parseInt(fruit.nextLine());
        switch(fruits) {
            case 1:
                System.out.println("OK, what fruit? (1-5 for fruits A-E)");
                fruits = Integer.parseInt(fruit.nextLine());
                switch (fruits) {
                    case 1:
                        System.out.println("OK, that will be $2.00");
                        break;
                    case 2:
                        System.out.println("OK, that will be $3.00");
                        break;
                    case 3:
                        System.out.println("OK, that will be $4.00");
                        break;
                    case 4:
                        System.out.println("OK, that will be $5.00");
                        break;
                    case 5:
                        System.out.println("OK, that will be $6.00");
                        break;
                    default:
                        System.out.println("Pick a fruit!");
                        break;
                }
                break;
            case 2:
                System.out.println("OK, what drink?");
                String drink = fruit.nextLine();
                System.out.println("OK, we will be getting you " + drink);
                break;
            default:
                System.out.println("Type something!");
                break;
        }
        //Other loop problems
        int a = 5;
        do {
            System.out.println(a);
            a += 3;
        } while (a <= 100);
        Scanner sting = new Scanner(System.in);
        System.out.println("Input anything and watch it go poof");
        String mySting = sting.nextLine();
        if (mySting.length() <= 0) {
            System.out.println("You need something!");
        }
        else {
            for (int i = mySting.length()-1; i >= 0; i--) {
                mySting = mySting.substring(0, i);
                System.out.println(mySting);
            }
        }
        sting.close();
        fruit.close();
    }
}