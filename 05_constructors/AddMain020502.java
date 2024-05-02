package class_methods;

class Add020502{
    int a, b;
    public void add(){
        System.out.println(a+b);
    }
    public Add020502(){
        a=15;
        b=20;
    }
}

public class AddMain020502 {
    public static void main(String[] args) {
        Add020502 addition = new Add020502();
        addition.add();
        //Can I access a & b from Add class inside this Main class? Yes
        System.out.println(addition.a);
    }
}
