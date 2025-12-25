public class MethodOverriding {
    void show()
    {
        System.out.println("Method of MethodOverriding");
    }
}
class B extends MethodOverriding{
    void show()
    {
        super.show();
        System.out.println("Method of B");
    }
}
class check{
    public static void main(String[] args) {
        B b1=new B();
        b1.show();
    }
}
