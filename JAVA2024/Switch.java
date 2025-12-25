import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit)
        {
            case "Mango":
                System.out.println("The kung of fruits");
                break;
            case "Apple":
                System.out.println("The red color fruits");
                break;
            case "Guava":
                System.out.println("The sweet fruits");
                break;
            default:
                System.out.println("Invalid Fruits");
        }


    }
}
