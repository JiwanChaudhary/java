import java.util.Scanner;

class ArithmeticOperation {
    private int a,b;
    Scanner scn = new Scanner(System.in);
    void getNumbers() {
        System.out.println("Enter First Number:");
        a = scn.nextInt();
        System.out.println("Enter Second Number:");
        b = scn.nextInt();
    }

     class ArithmeticInner{
        void addition() {
            System.out.println("Addition is:"+(a+b));
        }
        void subtraction() {
            System.out.println("Subtraction is:"+(a-b));
        }
        void multiplication() {
            System.out.println("Multiplication is:"+(a*b));
        }
        void division() {
            System.out.println("Division is:"+(a/b));
        }
        void display() {
            ArithmeticInner ai = new ArithmeticInner();
            ai.addition();
            ai.subtraction();
            ai.multiplication();
            ai.division();
        }
    }
}

class ExceptionHandling() {
    public static void main(String[] args) {
        ArithmeticOperation ao = new ArithmeticOperation();
        ao.display();
    }
}