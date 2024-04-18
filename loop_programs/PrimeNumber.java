package loop_programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int counter = 0;

        //Time complexity for the below solution is O(n)
        for(int i=1; i<=n; i++){
            if (n%i==0)
                counter++;
        }
        if (counter>2)
            System.out.println(n+" is not prime");
        else
            System.out.println(n+" is prime");
    }
}
/*
Logic: If the number is divisble by 1 and itself only. In other words if the number has only 2 factors i.e. 1 and itself
Dry run:
Ex: n=11
Start number from i=1 go till i=11
if n%i==0 ---> increase the counter
At the end: if the counter>2 -----> then not prime else prime
 */
