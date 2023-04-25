package Lessons;

import java.util.HashSet;

public class LessonSixDistinct {
    public int solution(int[] a) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 3, 1, 1};
        LessonSixDistinct distinct = new LessonSixDistinct();
        System.out.println(distinct.solution(a));
    }
}
