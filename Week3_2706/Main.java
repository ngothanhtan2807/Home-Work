package Week3_2706;

public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        switch (today) {
            case MONDAY:
            case TUESDAY:
                System.out.println("work");
                break;
            case FRIDAY:
            case SATUDAY:
                System.out.println("off");
                break;
        }
    }
}
