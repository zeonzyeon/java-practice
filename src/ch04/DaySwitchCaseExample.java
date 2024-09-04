package ch04;

public class DaySwitchCaseExample {
    public static void main(String[] args) {
        String month = args[0];

        String monthString = switch (month) {
            case "월요일" -> "Start of the work week";
            case "금요일" -> "Almost weekend";
            default -> "Midweek";
        };

        System.out.println(monthString);
    }
}
