package ConditionalStatements;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the operator(+,-,*,*) : ");
        char op = sc.next().charAt(0);
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();

        int result;

        switch (op){
            case '+':
                result= num1+num2;
                System.out.println(result);
                break;
            case '-':
                result= num1-num2;
                System.out.println(result);
                break;
            case '*':
                result= num1*num2;
                System.out.println(result);
                break;
            case '/':
                result= num1/num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operator");
        }


    }
}
