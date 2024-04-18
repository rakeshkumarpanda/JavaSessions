package loops;

public class ForLoop {
    public static void main(String[] args) {
        //printing 1-5
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        //case - 1
        for (int i=1; i<=5; i=i+1){
            System.out.println(i);
        }
        //case - 2
        int i=1;
        for (; i<=5; i=i+1){
            System.out.println(i);
        }
        //case - 3 -> compilation error as j is local varirable declared directly inside main method and with the same variable name
        // we are trying to declare inside the for loop
//        int j=1;
//        for (int j=1; i<=5; i=i+1){
//            System.out.println(i);
//        }
        //case - 4
        for (int k=1; i<=5; i=i+1){
            System.out.println(i);
        }
        for (int k=10; i>=6; i=i-1){
            System.out.println(i);
        }
        //case - 5
        for (int n=1; n<1; n++){
            System.out.println(n);
        }
        //case - 6
        for (int n = 1; n<=10; n++){
            if (n==7)
                break;//in this case break is used to exit from the current loop
            System.out.println(n);
        }
        //case - 7 -> print only even numbers
        for (int n = 1; n<=10; n++){
            //1st approach
//            if(n%2==1)
//                continue;//it skips the current iteration
//            System.out.println(n);
            //2nd approach
            if(n%2==0)
                System.out.println(n);
        }

    }
}
/*
syntax:
for (statement1; statement2; statement3){
    //code
}
In the above syntax:
statement1 -----> initialization
statement2 -----> condition
statement3 -----> operational statement i.e. increment/decrement/multiplication ....

Process to execute
initialization -> condition check -> statement execution -> operational statement -> condition check -> so on
 */
