package numberPowers;

import java.util.Scanner;

public class NumberPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double square = number * number;
        double cube = number * number * number;
        double forthPower = Math.pow(number,4);
        System.out.println(square);
        System.out.println(cube);
        System.out.println(forthPower);
    }

}
