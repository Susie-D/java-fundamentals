package object;
import java.util.Scanner;


public class HomeAreaCalculator {
   private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Rectangle room1 = new Rectangle();
//        room1.setLength(50);
//        room1.setWidth(25);
//
//        double areaOfRoom1 = room1.calculateArea();
//
//        Rectangle room2 = new Rectangle(30, 75);
//        double areaOfRoom2 =  room2.calculateArea();
//
//        double totalArea = areaOfRoom1 + areaOfRoom2;

        HomeAreaCalculator calculator = new HomeAreaCalculator();

        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();

        double totalArea = calculator.calculateAreaOfRoom(room1, room2);

        System.out.println("Total area: " + totalArea);
    }

    public Rectangle getRoom() {
        System.out.println("Enter the length of the room");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the room");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateAreaOfRoom(Rectangle room1, Rectangle room2) {
        return (room1.calculateArea() + room2.calculateArea());
    }
}