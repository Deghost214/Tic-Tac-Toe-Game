class Area {
    int length;
    int breadth;
    int area;


    Area(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
        System.out.println("Area: " + this.area);
    }
}

class Main {
    public static void main(String[] args)
    {
        Area rectangle = new Area(2, 16);
    }
}

