public class LinerSearch {
    public static void main(String[] args) {
        int[] arr = {12,3,6,87,89,43,56};
        int target = 12;
        int ans = LinearSearch(arr ,target);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr,int target){
        if(arr.length == 0)
        {
            return -1;
        }
        for (int index=0; index < arr.length; index++) {
            int element = arr[index];
            if (target == element) {

                return index;
            }
        }
        return -1;
    }
}
