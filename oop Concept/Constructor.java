class base {
    int x, y;

    base() {
        System.out.println("Default Constructor");
    }

    base(int p, int q) {
        x = p;
        y = q;
        System.out.println("Parametrise Constructor");
        System.out.println(x + y);

    }

    base(base b) {
        x = b.x;
        y = b.y;
        System.out.println("Copy Constructor");
        System.out.println(x + y);
    }
}

public class Constructor {
    public static void main(String[] args) {
        base b1 = new base();
        base b2 = new base(5, 9);
        base b3 = new base(b2);
    }
}