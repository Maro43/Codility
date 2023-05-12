package Lessons;

public class LessonNineMaxProfit {
    public int solution(int[] a) {
        int profit = 0;
        int sold = 0;
        int max = 0;


        if (a.length < 2) {
            return 0;
        }

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
            sold = min - a[i];
            max = Math.min(sold, max);
        }
        profit = Math.abs(max);

        return profit;
    }

    public static void main(String[] args) {
        int[] a = {};
        System.out.println(new LessonNineMaxProfit().solution(a));
    }
}
