package ConditionalStatements;


import java.util.Scanner;

public class PositiveNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number by your choice : ");
        int num = sc.nextInt();
        if (num >0){
            System.out.println("Number is Positive");
        }
        else if (num<0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is Zero");
        }
    }

}
