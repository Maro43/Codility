package Lessons;

public class LessonThreeTapeEquilibrium {
    public int solution(int[] a) {

        int n = a.length;
        int p = n - 1;
        int sum = 0;
        int sumPartOne = 0;
//        int sumPartTwo;
//        int difference = 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
//        for (int j = 0; j < p; j++) {
//            sumPartOne += a[j];
//            sumPartTwo = sum - sumPartOne;
//            difference = Math.abs(sumPartOne - sumPartTwo);
//            result = Math.min(difference, result);
//        }
        for (int j = 0; j < p; j++) {
            sumPartOne += a[j];
            result = Math.min(Math.abs(sumPartOne - (sum - sumPartOne)), result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 4, 3};
        LessonThreeTapeEquilibrium equilibrium = new LessonThreeTapeEquilibrium();
        System.out.println(equilibrium.solution(a));
    }
}