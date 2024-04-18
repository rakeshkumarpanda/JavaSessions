package conditionalblocks;

import java.util.Scanner;

public class DivisibleBy2_3 {
    public static void main(String[] args) {
//        int n = 11;
        //Code to take the user input
        Scanner scan = new Scanner(System.in);//Here we are creating the object of the scanner class
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        if(n%2==0 && n%3==0)
            System.out.println("Divisible by both 2 & 3");
        else if(n%2==0)
            System.out.println("Divisible by 2");
        else if(n%3==0)
            System.out.println("Divisible by 3");
        else
            System.out.println("Not divisible either by 2 or 3");
    }
}
