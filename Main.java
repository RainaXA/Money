import java.util.Scanner;

class coins {
    public static int nickels = 0;
    public static int dimes = 0;
    public static int quarters = 0;
    public static double money = 0.00;
}
public class Main {
    public static void main(String[] args) {
        boolean add = true;
        System.out.printf("\033[H\033[2J\u001B[92mCurrent amount: $%.2f\u001B[0m", coins.money);
        System.out.println("\n\u001B[94mYou have " + coins.nickels + " nickels, " + coins.dimes + " dimes, and " + coins.quarters + " quarters.\nPlease write add, or subtract.\u001B[0m");
        Scanner scnr = new Scanner(System.in);
        String message = scnr.next();
        switch(message) {
            case "add":
                break;
            case "sub":
            case "subtract":
                add = false;
                break;
            default:
                System.out.println("\u001B[91mPlease add or subtract.\u001B[0m");
                main(null); //restart
                return;
        }
        System.out.print("\n\u001B[94mPlease write quarters, nickels, or dimes: \u001B[0m");
        message = scnr.next();
        System.out.print("\n\u001B[94mPlease write amount: \u001B[0m");
        int number = scnr.nextInt();
        switch(message) {
            case "quarters":
            case "quarter":
                if(add) {
                    coins.quarters += number;
                    coins.money += (0.25) * number;
                } else {
                    coins.quarters -= number;
                    coins.money -= (0.25) * number;
                }
                break;
            case "nickel":
            case "nickels":
                if(add) {
                    coins.nickels += number;
                    coins.money += (0.05) * number;
                } else {
                    coins.nickels -= number;
                    coins.money -= (0.05) * number;
                }
                break;
            case "dime":
            case "dimes":
                if(add) {
                    coins.dimes += number;
                    coins.money += (0.1) * number;
                } else {
                    coins.dimes -= number;
                    coins.money -= (0.1) * number;
                }
                break;
            default:
                System.out.println("\u001B[91mPlease input nickels, dimes, or quarters.\u001B[0m");
                break;
        }
        scnr.reset();
        main(null); //restart
    }
}
