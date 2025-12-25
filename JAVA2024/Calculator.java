import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input takes character x or X when user not press these;
        int ans = 0;
        while (true) {
            System.out.print("संचालकः इति प्रविशन्तु : ");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
                System.out.print("प्रथमाङ्कं प्रविशन्तु : ");
                int num1 = in.nextInt();
                System.out.println();
                System.out.print("द्वितीयं सङ्ख्यां प्रविशन्तु : ");
                int num2 = in.nextInt();
                System.out.println();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }

                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("अमान्य संचालक !!!");
            }
            System.out.println("गणितम् उत्तरम् अस्ति... " + ans);
            System.out.println();
        }
    }
}
