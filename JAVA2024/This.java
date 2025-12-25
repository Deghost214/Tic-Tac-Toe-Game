public class This {
    int x,y;
    This(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    void show()
    {
        System.out.println(x+" "+y);
    }

    public static void main(String[] args) {
        This r = new This(34,67);
        r.show();
    }
}
