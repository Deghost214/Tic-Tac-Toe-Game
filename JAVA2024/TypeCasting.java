import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("कृपया प्रथम सङ्ख्या प्रविशतु : ");
        int num1 = input.nextInt();
        System.out.println("कृपया  द्वितीयं सङ्ख्या प्रविशतु : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;

        System.out.println("द्वयोः संख्ययोः योगः अस्ति " +sum);
    }
}
