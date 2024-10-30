package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static Scanner scanner = new Scanner(System.in);
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    public static void main(String[] arg) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

    public static void notifyUser(boolean qualified) {
        if(qualified) {
            System.out.println("You have been approved!");
        }
        else {
            System.out.println("Sorry, you have been declined!");
        }
    }

    public static double getSalary() {
        System.out.println("What is your salary?");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("What is your credit score?");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
}
