import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1= new ArrayList<>();
        System.out.println("Enter the list element (type 'done' to finish):");
        while (sc.hasNextInt()){
        l1.add(sc.nextInt());
        }
        ArrayList<Integer> l2= new ArrayList<>();
        for(int i:l1)
        {
            if(i%2==0)
            {
                l2.add(i*2);
            }
            else{
                l2.add(i*i);
            }
        }
        System.out.println("Proccesed list is: ");
        for(int i:l2)
        {
            System.out.println(i+ " ");
        }
    }

}
