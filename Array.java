public class Array {
    public static void main(String[] args) {
        int[] arr1 = {4,9,8,7,20,21};
        System.out.println("The numbers are:");
        for(int i = 0; i<arr1.length ; i++) {
            if(arr1[i] != 7) {
                System.out.print(arr1[i] + ",");
            }
        }
    }
}
