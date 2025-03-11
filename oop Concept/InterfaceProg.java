interface polygon {
    void getArea(int length, int breadth);
}

class Rectangle implements polygon {
    public void getArea(int length, int breadth) {
        System.out.println("Product of l and b " + length * breadth);
    }
}

public class InterfaceProg {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea(10, 20);
    }

}
