package conditionalblocks;

public class FindEvenOdd_SwitchCase {
    public static void main(String[] args) {
        int n = 14;
        int value = n%2;
        switch (value){
            case 0:System.out.println("Even");break;
            case 1:System.out.println("Odd");break;
            default:System.out.println("Not a valid input");
        }
    }
}
