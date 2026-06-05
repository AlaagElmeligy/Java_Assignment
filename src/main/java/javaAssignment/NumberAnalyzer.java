package javaAssignment;
import java.util.Scanner;
public class NumberAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("Number Analyzer Menu");
            System.out.println("====================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("====================");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case (1):
                    printNumbersDescending();
                    break;
                case (2):
                    printEvenOrOdd();
                    break;
                case (3):
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println(checkNumberType(num));
                    break;
                case (4):
                    System.out.print("Enter 1st number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter 2nd number: ");
                    int num2 = sc.nextInt();
                    calculateSum(num1, num2);
                    break;
                case (5):
                    System.out.println("Thank you for using Number Analyzer.");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        }


        while (flag); // True

       //  printNumbersDescending();
       // printEvenOrOdd();
       // System.out.println(checkNumberType(-12));
       // calculateSum(15, 25);

    }

// 1.This method prints numbers starting from 10 down to 1 in descending order.
    public static void printNumbersDescending() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

// 2.This method goes through numbers 1 to 10 and prints whether each number is Even or Odd.
public static void printEvenOrOdd(){
        for (int i = 1; i <= 10;i++) {
            if (i % 2 ==0)
                System.out.println(i+" -> Even");
            else
                System.out.println(i+" -> Odd");
            }
    }

/* 3.This method checks whether a given number is positive, negative, or zero.
     @param number the integer value entered by the user to be checked
     @return a String saying "Positive", "Negative", or "Zero" */
public static String checkNumberType(int number){
    if (number>0)
        return"Positive";
    else if (number<0)
        return"Negative";
    else
        return"Zero";
    }
/* 4.This method takes two integers and returns their sum.
     @param number1 the first integer entered by the user
     @param number2 the second integer entered by the user
     @return sum the result of adding number1 and number2 together */
public static int calculateSum(int number1, int number2){
    int sum = number1 + number2 ;
    System.out.println("Sum = "+sum);
    return sum;
 }
}

