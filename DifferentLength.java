public class DifferentLength {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2};

        for(int i = 0; i<arr2.length ; i++) {
            arr1[i] = arr1[i] + arr2[i];
        }
        for(int j = 0; j<arr1.length ; j++) {
            System.out.print("Ths sum is: " + arr1[j] +",");
        }
    }
}
