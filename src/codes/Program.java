package codes;

import java.util.Scanner;

public class Program {

    public static void tableFromNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = sc.nextInt();

        sc.close();

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void IsLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        sc.close();

        if (year % 4 ==0 && year % 100 == 0 && year % 400 == 0){
            System.out.println("It is a leap year");
        }else if(year % 4 == 0 && year % 100 != 0){
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }

    public static void checkVowels(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a vowel");
        sc.next().charAt(0);
        sc.close();

        
    }

}
