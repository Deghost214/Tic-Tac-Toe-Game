public class ObjectCreation{
    int a;
    String name;
    ObjectCreation()
    {
        a = 100;
        name = "Harsh";
        System.out.println(a+" "+name);
    }
    ObjectCreation(ObjectCreation obj1)
    {
        a = obj1.a;
        name = obj1.name;
        System.out.println(a+" "+name);

    }

    public static void main(String[] args) {
        ObjectCreation obj1 = new ObjectCreation();
        ObjectCreation ref = new ObjectCreation(obj1);

    }
}
