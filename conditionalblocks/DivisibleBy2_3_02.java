package conditionalblocks;

import java.util.Scanner;

public class DivisibleBy2_3_02 {
    public static void main(String[] args) {
        //Code to take the user input
        Scanner scan = new Scanner(System.in);//Here we are creating the object of the scanner class
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        if(n%2==0){
            if(n%3==0){
                System.out.println(n+" is divisible by both 2 and 3");
            }
            else
                System.out.println(n+" is divisible by 2 only");
        }
        if(n%3==0){
            System.out.println(n+" is divisible by 3 only");
        }
    }
}
