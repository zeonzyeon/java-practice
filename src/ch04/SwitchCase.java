package ch04;

public class SwitchCase {
    public static void main(String[] args) {

        String day = args[0];
        String dayString=" ";

        switch (day) {
            case "월요일":
                dayString = "Start of the work week";
                break;
            case "금요일":
                dayString = "Almost weekend";
                break;
            default:
                dayString = "Midweek";
                break;
        }
        System.out.println(dayString);
    }
}
