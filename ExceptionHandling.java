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

    class Addition {
        void add() {
            System.out.println("Addition is:" + (a + b));
        }
    }

    class Subtraction {
        void subtract() {
            System.out.println("Subtraction is:" + (a - b));
        }
    }

    class Multiplication {
        void multiple() {
            System.out.println("Multiplication is:" + (a * b));
        }
    }

    class Division {
        void divide() {
            try {
                System.out.println("Division is:" + (a / b));
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }
        }
    }

    public void dispayOperation() {
        Addition ad = new Addition();
        ad.add();

        Subtraction sub = new Subtraction();
        sub.subtract();

        Multiplication mult = new Multiplication();
        mult.multiple();

        Division div = new Division();
        div.divide();
    }

}

class ExceptionHandling {
    public static void main(String[] args) {
        ArithmeticOperation ao = new ArithmeticOperation();
        ao.getNumbers();
        ao.dispayOperation();
    }
}