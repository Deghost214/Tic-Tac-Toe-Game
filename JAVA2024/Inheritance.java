public class Inheritance {
    void Car()
    {
        System.out.println("Car is Starting...");
    }
}
class C extends Inheritance{
    void Human()
    {
        System.out.println("Human is Driving...");
    }
}
class check1{
    public static void main(String[] args) {
        C b2= new C();
        b2.Car();
        b2.Human();
    }
}
