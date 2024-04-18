package loop_programs;

import java.util.Scanner;

public class PrimeNumber3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        boolean flag = false;

        //Time complexity for the below solution is O(sqrt(n))
        for(int i=2; i*i<n; i++){
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
/*
Factors of 10: 1, 2, 5, 10 ---> (1,10) (2,5)
 */