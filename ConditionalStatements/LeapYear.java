package ConditionalStatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        boolean isleapYear;
        if(year%400 ==0){
            isleapYear =true;
            System.out.println("Leap Year");

        } else if (year%4==0 && year%100!=0) {
            isleapYear=true;
            System.out.println("Leap Year");

        }else{
            isleapYear=false;
            System.out.println("Not Leap Year");
        }

    }
}
