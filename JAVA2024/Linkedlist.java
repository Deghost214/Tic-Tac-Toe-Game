import java.util.ArrayList;
import java.util.Scanner;

public class Linkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println("Enter the elements of the linked list (type 'done' to finish):");

        while (sc.hasNextInt()) {
            l1.add(sc.nextInt());
        }

        if (l1.size() < 3) {
            System.out.println("Please enter at least 3 numbers.");
            return;
        }
        ArrayList<Integer> l2 = new ArrayList<>();

        for (int i = 2; i < l1.size(); i++) {
            int p = l1.get(i - 2) * l1.get(i - 1);
            l2.add(p);
        }
        System.out.println("Processed list is:");
        for (int e : l2) {
            System.out.print(e + " ");
        }
    }
}
