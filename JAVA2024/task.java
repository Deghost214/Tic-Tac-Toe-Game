public class task{

    String str;
    task(String s)
    {
        str = s;
    }
    void Show()
    {
        int i;
        for(i=0;i<3;i++)
        {
            System.out.println(str);
        }
    }
    public static  void main(String[] args) {
        task t1 = new task("Task-1");
        task t2 = new task("Task-2");
        task t3 = new task("Task-3");
        t1.Show();
        t2.Show();
        t3.Show();
    }

}



