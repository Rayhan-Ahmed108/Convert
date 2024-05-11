package CircleProperties;

import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        double volume = (4 / 3.00) * Math.PI * radius * radius * radius;
        double surfaceArea = 4 * Math.PI * radius * radius;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Volume = " + volume);
        System.out.println("Surface Area = " + surfaceArea);

    }

}