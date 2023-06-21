package Week2_2006;

public class Exercise {
    public String chia2So(double num1, double num2) {
        if (num2 == 0) {
            return "invalid number";
        } else {
            return num1 / num2 + "";
        }
    }

    public char firstCharString(String input) {
        return input.toCharArray()[0];
    }

    public boolean isEven(int number) {
        return (number % 2 == 0 ? true : false);
    }

    public int sumShort(short num1, short num2) {
        return num1 + num2;
    }

    public int factorial(int number) {
        int result = 1;
        if (number == 0) {
            result = 1;
        } else if (number > 0) {

            for (int i = 1; i <= number; i++) {
                result = result * i;
            }

        } else {
            result = -1;
        }
        return result;
    }

    public double plusAverage(double[] arr) {
        double sum = 0;
        for (double d : arr) {
            sum += d;
        }
        return (sum / arr.length);
    }

    public int findMax(int num1, int num2) {
        return (num1 > num2 ? num1 : num2);
    }

    public String triangle(double num1, double num2) {
        if (num1 <= 0 || num2 <= 0) {
            return "invalid";
        } else {
            return Math.sqrt((Math.pow(num1, 2) + Math.pow(num2, 2))) + "";
        }
    }

    public char lastChartString(String input) {
        return input.toCharArray()[input.length() - 1];
    }

    public void pyramic(int num1) {
        int i, j;
        for (i = 0; i < num1; i++) {
            System.out.print(" ".repeat(num1 - i - 1));
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("*".repeat(j - 1));

            System.out.println();
        }
    }

}
