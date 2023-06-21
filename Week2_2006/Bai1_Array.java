package Week2_2006;

public class Bai1_Array {
    public static int[][] groupBy(int[] arr) {
        int countEven = 0;
        int countOdd = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int[] evenArray = new int[countEven];
        int[] oddArray = new int[countOdd];
        int indexOdd = 0, indexEven = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[indexEven] = arr[i];
                indexEven++;
            } else {
                oddArray[indexOdd] = arr[i];
                indexOdd++;
            }
        }
        int[][] result = { evenArray, oddArray };
        return result;
    }

    public static void print(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.print("]");
            System.out.print(",");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        print(groupBy(new int[] { 1, 3, 5, 7 }));
    }
}
