package loop_programs;

/*

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/
public class Pattern1 {
    public static void main(String[] args) {//----> O(n^2)
        for (int r=1; r<=5; r++){//------> O(5)
            for (int c=1; c<=5; c++){//-----> O(5)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
m -> 1 to 5
n -> 1 to 5
m1 -> n1, n2, n3, n4, n5 -> *
m2 -> n1, n2, n3, n4, n5 -> *
m3 -> n1, n2, n3, n4, n5 -> *
m4 -> n1, n2, n3, n4, n5 -> *
m5 -> n1, n2, n3, n4, n5 -> *


*/
