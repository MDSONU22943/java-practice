package ConditionalStatements;

import java.util.Scanner;

public class GreaterOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number :");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is greater");
        }
        else if(num1==num2){
            System.out.println("Both number are equal");
        }
        else{
            System.out.println(num2 + " is greater");
        }
    }
}
