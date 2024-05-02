package class_methods;

class Add020501{
    int a=16, b=14;
    public void add(){
        System.out.println(a+b);
    }
    //Java adds the below code virtually
//    Add020501(){
//
//    }
}

public class AddMain020501 {
    public static void main(String[] args) {
        Add020501 a = new Add020501();
        a.add();
    }
}
