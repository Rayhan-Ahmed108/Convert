package seesaw;

import java.util.Scanner;

public class Seesaw {
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    public int sum(){
        return num1 + num2;
    }
    public int difference(){
        return num1 - num2;
    }
    public int product(){
        return num1 * num2;
    }
    public double average(){
        return (num1 + num2) / 2.00;
    }
    public int absolute(){
        return Math.abs(num1 - num2);
    }
    public int maximum(){
        return Math.max(num1, num2);
    }
    public int minimum(){
        return Math.min(num1, num2);
    }

}
