public class SameLength {
    public static void main(String[] args) {
        int[] arr1 = { 5, 7, 10, 4 };
        int[] arr2 = { 3, 9, 13, 8 };

        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i] + arr2[i]) < 20) {
                System.out.println("The sum is: " + (arr1[i] + arr2[i]));
            }
        }
    }
}
