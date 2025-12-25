import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Original LinkedList:");
        for (int i = 1; i <= 20; i++) {
            linkedList.add(i);
        }
        for (int num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();
        List<Integer> arrayList = new ArrayList<>(linkedList);
        System.out.println("Converted ArrayList:");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
    }
}

