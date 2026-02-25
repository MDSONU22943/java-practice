package ConditionalStatements;

import java.util.Scanner;

public class TemperatureCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature :");
        int temperature = sc.nextInt();

        if(temperature<10){
            System.out.println("Very Cold");
        }
        else if(temperature>=10 && temperature<25){
            System.out.println("Moderate");
        }
        else{
            System.out.println("Hot");
        }
    }
}
