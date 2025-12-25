import java.util.Scanner;
public class Division {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = in.nextInt();
        System.out.println("Enter first number : ");
        int num2 = in.nextInt();
        int div = num1/num2;
        System.out.println("The division " + div);
    }
}
