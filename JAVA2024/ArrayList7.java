import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);
        numbers.add(6);

        ArrayList<Integer> processedNumbers = new ArrayList<>();

        for (int i = 2; i < numbers.size(); i++) {

            int product = numbers.get(i - 2) * numbers.get(i - 1);
            processedNumbers.add(product);
        }

        System.out.println("Processed numbers:");
        for (int num : processedNumbers) {
            System.out.print(num + " ");
        }
    }
}
