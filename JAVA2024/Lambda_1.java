import java.util.function.BiFunction;

public class Lambda_1 {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> repeat = (str, count)->{
            String result = " ";
            for(int i=0; i < count; i++)
            {
                result = result + str;
            }
            return  result;
        };
        System.out.println(repeat.apply("Hii", 3));
    }
}


