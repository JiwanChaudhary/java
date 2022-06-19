import java.util.Scanner;

class ArithmeticOperation {
    int a, b;
    Scanner scn = new Scanner(System.in);

    public void getNumbers() {
        System.out.println("Enter First Number:");
        a = scn.nextInt();
        System.out.println("Enter Second Number:");
        b = scn.nextInt();
    }

    void addition() {
        System.out.println("Addition is:" + (a + b));
    }

    void subtraction() {
        System.out.println("Subtraction is:" + (a - b));
    }

    void multiplication() {
        System.out.println("Multiplication is:" + (a * b));
    }

    void division() {
        try {
            System.out.println("Division is:" + (a / b));
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }

    public void display() {
        ArithmeticOperation ai = new ArithmeticOperation();
        ai.addition();
        ai.subtraction();
        ai.multiplication();
        ai.division();
    }

}

class ExceptionHandling {
    public static void main(String[] args) {
        ArithmeticOperation ao = new ArithmeticOperation();
        ao.getNumbers();
        ao.display();
    }
}