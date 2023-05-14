package Lessons;

public class LessonTenCountFactors {
    public int solution(int n) {
        int count = 0;
        int i = 1;
        while (i * i < n) {
            if (n % i == 0) {
                count = count + 2;
            }
            i++;
        }
        if (i * i == n) {
            count++;
        }
        return count;
}

    public static void main(String[] args) {
        int n = 25;
        System.out.println(new LessonTenCountFactors().solution(n));
    }
}
