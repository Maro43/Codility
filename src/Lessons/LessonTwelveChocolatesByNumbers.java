package Lessons;

public class LessonTwelveChocolatesByNumbers {

    public int solution(int n, int m) {
        return n / prime(n, m);
    }

    int prime(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return prime(b, a % b);
        }
    }


    public static void main(String[] args) {
        int n = 24;
        int m = 18;
        System.out.println(new LessonTwelveChocolatesByNumbers().solution(n, m));
    }
}
