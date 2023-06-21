package Week2_2006;

public class Bai2_Array {
    public static String[] dedupe(String[] arr) {
        // String[] result = new String[3];
        String output = "";
        int count = 1;
        int i, j;
        // String start = arr[0];
        for (i = 0; i < arr.length; i++) {

            for (j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count > 1) {
                if (!output.contains(arr[i])) {

                    output += arr[i];
                    count = 0;
                }
            }
        }
        System.out.println(output);
        return output.split("");
    }

    public static void print(String[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            result += arr[i] + ",";
        }
        result += arr[arr.length - 1] + "]";
        System.out.println(result);
    }

    public static void main(String[] args) {
        print(dedupe(new String[] { "a", "b", "a", "a", "b", "c", "c" }));
    }
}
