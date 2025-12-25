import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        System.out.println("Original ArrayList:");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayList.size() - 1; i += 2) {
            Collections.swap(arrayList, i, i + 1);
        }
        System.out.println("Swapped ArrayList:");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
    }
}

