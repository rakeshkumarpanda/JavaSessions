package conditionalblocks;

public class FindEvenOdd_TernaryOperator {
    public static void main(String[] args){
        int n = 11;
        String result = (n%2==0)?"Even":"Odd";
        System.out.println(result);
    }
}
/*
Syntax for ternary operator
<condition>?true:false
 */