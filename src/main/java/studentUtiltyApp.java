import java.util.Scanner;

public class studentUtiltyApp {
    // method to add two number
    public static void addNumber(Scanner input) {
        System.out.println("enter ur first number");
        int num1 = input.nextInt();
        System.out.println("enter ur second number");
        int num2 = input.nextInt();
        int res = num1 + num2;
        System.out.println(res);
    }
    public static void evenOdd(Scanner input){
        System.out.println("enter number");
        int num = input.nextInt();
        String res = ( num % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(res);
    }
    public static void numberP(Scanner input) {
        System.out.println("enter number");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.println(i + " ");
        }
    }
    public static void weekDays(Scanner input) {
        System.out.println("enter a number from (1 - 7 )");
        int days = input.nextInt();
        switch (days){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thurday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("the number is invalid");
        }
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n=== student untility App");
            System.out.println("1.Add two number");
            System.out.println("2.Check EVEN or ODD");
            System.out.println("3.Print number from 1 to N");
            System.out.println("4.Diaplay Day of the week");
            System.out.println("5.Exit");
            System.out.println("choose ur option");

             choice = input.nextInt();

             switch (choice){
                 case 1:
                     addNumber(input);
                     break;
                 case 2:
                     evenOdd(input);
                     break;
                 case 3:
                     numberP(input);
                     break;
                 case 4:
                     weekDays(input);
                     break;
                 case 5:
                     System.out.println("Thank you for using the app");
                 break;
                 default:
                     System.out.println("invalid input");
             }
        } while (choice != 5);
    }
}
