package Day3;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        int age = currentYear - birthYear;
        String ageStr = String.valueOf(age);

        System.out.println("Your age is: " + age);
        System.out.println("Your age in string format: " + ageStr);
    }
}
