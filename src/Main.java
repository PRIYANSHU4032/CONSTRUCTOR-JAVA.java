import java.util.*;
class Rectangle {
    int l, b, area;

    Rectangle() {
        l = b = 5;
    }

    Rectangle(int x, int y) {
        l = x;
        b = y;
    }


    void GetData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        l = sc.nextInt();
        b = sc.nextInt();
    }

    void CalculateArea() {
        area = l * b;
        System.out.println("Area of Rectangle : " + area);

    }

    public static void main(String ar[]) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(7, 9);
        Rectangle r3 = new Rectangle();

        r1.CalculateArea();
        r2.CalculateArea();
        r3.GetData();
        r3.CalculateArea();

    }
}

