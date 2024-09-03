package ch03;

public class Example {
    public static void main(String[] args) {
        int score = 80;
        char grade = (score > 90) ? 'A' : ((score > 85) ? 'B' : 'C');

        System.out.println("당신의 학점은 : " + grade);
    }
}