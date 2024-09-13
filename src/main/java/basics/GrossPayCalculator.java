package basics;

import java.util.Scanner;

// class declaration
public class GrossPayCalculator {
    public static void main(String[] args) {
        System.out.println("How many hows did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?");
        double rate = scanner.nextDouble();
        scanner.close();

        double payRate = hours * rate;

        System.out.println("Gross Pay: " + payRate);
    }
}
`