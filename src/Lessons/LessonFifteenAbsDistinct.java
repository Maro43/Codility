package Lessons;

import java.util.HashSet;

public class LessonFifteenAbsDistinct {
    public int solution(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int b;
            b=Math.abs(a[i]);
            set.add(b);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] a = {-1, -1, -1, -1, 0, 1, 1, 1, 1};
        System.out.println(new LessonFifteenAbsDistinct().solution(a));
    }
}
