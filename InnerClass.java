class outerDemo {
    private class InnerDemo {
        void display() {
            System.out.println("I am inner class.");
        }
    }

    void displayInner() {
        InnerDemo idc = new InnerDemo();
        idc.display();
    }
}

class InnerClass {
    public static void main(String[] args) {
        outerDemo odc = new outerDemo();
        odc.displayInner();
    }
}
