import java.util.Scanner;

class Rectangle {
    int length, breadth;
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int AreaRectangle() {
        return length * breadth;
    }

    class Triangle extends Rectangle {
        public Triangle(int x, int y) {
            super(x,y);
        }
    }

    public float AreaTriangle() {
        return (length * breadth)/2;
    }
}



public class rectangleArea {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int f_num = scn.nextInt();
        int s_num = scn.nextInt();
        Rectangle rec = new Rectangle(f_num, s_num);
        System.out.println("Area of rectangle is:"+rec.AreaRectangle());
        System.out.println("Area of triangle is:"+rec.AreaTriangle());
    }
}
