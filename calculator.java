import java.util.Scanner;
class calculator {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)){;
        System.out.println("First Number:");
        double num1 = sc.nextDouble();
        System.out.println("First Number = " + num1);
        System.out.println(num1);
        System.out.println("Second Number:");
        double num2 = sc.nextDouble();
        System.out.println("Second Number = " + num2);
        System.out.println("First Number + Second Number = " + (num1 + num2));
        System.out.println("First Number - Second Number = " + (num1 - num2));
        System.out.println("First Number * Second Number = " + (num1 * num2));
        System.out.println("First Number / Second Number = " + (num1 / num2));}
}}