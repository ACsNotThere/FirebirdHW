import java.util.Scanner;
public class FirebirbHW2 { 
    public static void main(String[] args) {
        // Setup for code
        Scanner asker = new Scanner(System.in); 
        Human namer[] = new Human[5];
        int chooser[] = new int[2];
        namer[0] = new Human("A",7,0.00);
        namer[1] = new Human("B",25,61450.50);
        namer[2] = new Human("C",16,18070.10);
        namer[3] = new Human("D",43,96847.31);
        namer[4] = new Human("E",0,0.00);

        // Actual code execution
        namer[0].greet();
        namer[3].netIncomeReveal();
        namer[1].futureBirthday();
        for(int i = 0; i <= 1; i++) {
            System.out.println("Choose a number from 1-5 (corresponding to A-E respectively) and I will pick two people to determine a (random) relationship for: ");
            chooser[i] = Integer.parseInt(asker.nextLine()) - 1;
        }
        System.out.println(relationDeterminer(namer[chooser[0]].name, namer[chooser[1]].name));
        asker.close();
        Student student = new Student("AC", 14, 90.5);
        PTconference(student.name, student.classAverages);
    }
    // Method for #3
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
    // PTconference method prompt (2nd prompt)
    public static void PTconference(String name, double classAverages) {
        if(classAverages <= 100 && classAverages >= 90) {
            System.out.println(name + " is doing very well in classes with a " + classAverages + "% average. Their teachers are really proud of them!");
        }
        else if(classAverages <= 89 && classAverages >= 80) {
            System.out.println(name + " is doing great in classes with a " + classAverages + "% average. Their teachers are happy of their performance and will provide next steps.");
        }
        else if(classAverages <= 79 && classAverages >= 70) {
            System.out.println(name + " is doing OK in classes with a " + classAverages + "% average. Their teachers wish for some improvements that could boost their grade, but they are content.");
        }
        else if(classAverages <= 69) {
            System.out.println(name + " is struggling in classes with a " + classAverages + "% average. Their teachers are concerned for this student's performance, and want major improvements to elevate their grade.");
        }
    }
}
// Classes & methods for #1-2
class Human {
    protected String name;
    protected int age;
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
// Same constructors for each subclass (1st prompt for lesson 3)
class Teacher extends Human {
    public Teacher(String name, int age, double netIncome) {
        super(name, age, netIncome);
    }
}
class Student extends Human {
    public double classAverages;
    public Student(String name, int age, double classAverages) {
        super(name, age, classAverages);
        this.classAverages = classAverages;
    }
    @Override // Assuming they don't have a part-time job
    public void netIncomeReveal() {
        System.out.println(name + " does not have a net income!");
    }
}
class Parent extends Human {
    public Parent(String name, int age, double netIncome) {
        super(name, age, netIncome);
    }
}
