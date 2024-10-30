package arrays;

import java.util.Random;
import java.util.Arrays;

public class LotteryTicket {
    // CONST, cannot be changed;
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main (String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i=0; i < LENGTH; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt((MAX_TICKET_NUMBER) + 1);
            }
            while (search(ticket, randomNumber));
                    ticket[i] = randomNumber;
        }
        return ticket;
    }
    public static boolean search(int[] array, int numberToSearchFor) {
        for (int value: array) {
            if(value == numberToSearchFor) return true;
        }
        return false;
    }
    public static void printTicket(int[] array) {
        Arrays.sort(array);
        for(int number: array) {
            System.out.print(number + " | ");
        }
    }
}