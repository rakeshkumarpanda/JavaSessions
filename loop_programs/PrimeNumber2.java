package loop_programs;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        boolean flag = false;

        //Time complexity for the below solution is O(n/2) ----> O(n)
        for(int i=2; i<(n/2); i++){
            if (n%i==0){
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println(n+" is not prime");
        else
            System.out.println(n+" is prime");
    }
}