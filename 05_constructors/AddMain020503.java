package class_methods;

class Add020503{
    int x, y;
    public Add020503(int a/*12*/, int b/*15*/){
        x=a;//x=12
        y=b;//y=15
    }
    public void add(){
        System.out.println(x+y);//12+15=27
    }
}

public class AddMain020503 {
    public static void main(String[] args) {
        Add020503 a1 = new Add020503(12, 15);
        a1.add();
    }
}
