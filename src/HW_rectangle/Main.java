package HW_rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

        System.out.println(rectangle.areaCalculator());
        System.out.println(rectangle.perimeterCalculator());
    }
}
