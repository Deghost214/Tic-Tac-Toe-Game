class MethodOverLoading{
   MethodOverLoading(int a)
   {
       int c=23+a;
       System.out.println(c);
   }
   MethodOverLoading(int a,String b)
   {
       System.out.println(a+" "+b);
   }
    public static void main(String[] args) {
        MethodOverLoading obj1 = new MethodOverLoading(65);
        MethodOverLoading obj2 = new MethodOverLoading(100, "harsh");
    }
}