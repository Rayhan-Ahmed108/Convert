package meterConvert;

import java.util.Scanner;

public class MeterToOther {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double meters = scanner.nextDouble();
    //convert meter to miles,feet and inches
    double miles = meters * 0.000621371;
    double feet = meters * 3.28084;
    double inches = meters * 39.3701;
    //print convert answer
    System.out.println("Miles: "+miles);
    System.out.println("Feet: "+feet);
    System.out.println("Inches: "+inches);

}
}
