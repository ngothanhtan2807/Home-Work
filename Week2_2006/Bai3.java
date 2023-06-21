package Week2_2006;

public class Bai3 {
    public static String replace(String str, String param) {
        String result = "";
        if (param == null) {
            result = str;
        } else {

            String[] toArray = str.split(" ");
            for (String string : toArray) {
                if (string.equals("{}")) {
                    string = param;
                }
                result += string + " ";
            }
        }
        return result;
    }

    public static String replace(String str) {
        String result = "";

        result = str;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(replace("Local Host Server IP is {}", "{}"));
    }
}
