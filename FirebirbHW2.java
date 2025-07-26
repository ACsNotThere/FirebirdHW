import java.util.Scanner;
public class FirebirbHW2 { 
    public static void main(String[] args) {
        Scanner asker = new Scanner(System.in);
        Human namer[] = new Human[5];
        int chooser[] = new int[2];
        namer[0] = new Human("A",7,0.00);
        namer[1] = new Human("B",25,61450.50);
        namer[2] = new Human("C",16,18070.10);
        namer[3] = new Human("D",43,96847.31);
        namer[4] = new Human("E",0,0.00);
        namer[0].greet();
        namer[3].netIncomeReveal();
        namer[1].futureBirthday();
        for(int i = 0; i <= 1; i++) {
            System.out.println("Choose a number from 1-5 (corresponding to A-E respectively) and I will pick two people to determine a (random) relationship for: ");
            chooser[i] = Integer.parseInt(asker.nextLine()) - 1;
        }
        System.out.println(relationDeterminer(namer[chooser[0]].name, namer[chooser[1]].name));
    }
    public static String relationDeterminer(String partnerA, String partnerB) {
        int a = (int)(Math.random() * 3);
        switch(a) {
            case 0:
                System.out.println("Lowkey " + partnerA + " and " + partnerB + " would be chill with each other");
                return "Friend";
            case 1:
                System.out.println("Lowkey " + partnerA + " and " + partnerB + " would fight");
                return "Enemy";
            case 2:
                System.out.println("Lowkey " + partnerA + " and " + partnerB + " wouldn't interact at all");
                return "Neutral";
        }
        return "";
    }
}
class Human {
    public String name;
    private int age;
    protected double netIncome;
    public Human(String name, int age, double netIncome) {
        this.name = name;
        this.age = age;
        this.netIncome = netIncome;
    }
    public void greet() {
        System.out.println(name + " is greeting you!");
    }
    public void netIncomeReveal() {
        System.out.println(name + " says his net income is $" + netIncome);
    }
    public void futureBirthday() {
        System.out.println(name + " will be " + (age + 1) + " next year!");
    }
}