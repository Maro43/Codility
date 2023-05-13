package Lessons;

public class LessonNineMaxSliceSum {
    public int solution(int[] a) {

            int max = 0;
            int maxSlice = Integer.MIN_VALUE;
            for (int i = a.length-1; i >= 0; i--) {
                max = Math.max(a[i], max + a[i]);
                maxSlice = Math.max(max, maxSlice);

            }
            return maxSlice;
    }

    public static void main(String[] args) {
        int[] a = {5, -7, 3, 5, -2, 4, -1};
        System.out.println(new LessonNineMaxSliceSum().solution(a));
    }
}

