package loop_programs;

/*

* * * * *
* * * *
* * *
* *
*

*/
public class Pattern3 {
    public static void main(String[] args) {
        for (int r=5; r>=1; r--){
            for (int c=r; c>=1; c--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
r -> 1 to 5
c -> 1 to 5
r1 -> c1 --> *
r2 -> c1, c2 --> *
r3 -> c1, c2, c3 --> *
r4 -> c1, c2, c3, c4 --> *
r5 -> c1, c2, c3, c4, c5 --> *

*/
