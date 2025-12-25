@FunctionalInterface
interface demo3 {
    int show(int a, int b);
}

public class Name {
    public static void main(String[] args) {
        demo3 d1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println(d1.show(23,56));
    }
}
