package ch04;

public class IfExample {
    public static void main(String[] args) {

        int score = Integer.parseInt(args[0]);
        char grade;

        if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else
            grade = 'D';

        System.out.println(grade);
    }
}
