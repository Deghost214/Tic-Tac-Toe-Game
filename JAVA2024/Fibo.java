import java.util.Scanner;

public class Fibo {
   public static void main(String[] args) {
       fibon(6);
       System.out.println(fibon(6));

//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while(count <= n){
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
    }
    static int fibon(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else{
            return fibon(n-1)+fibon(n-2);
        }
    }
}
