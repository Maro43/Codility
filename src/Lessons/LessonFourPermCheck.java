package Lessons;

import java.util.HashSet;

public class LessonFourPermCheck {

    public int solution(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        int max = a[0];
        int x = a.length;
        int result = 0;
        for (int i = 0; i < x; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < x; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        if (set.size() == x) {
            if (x == max) {
                result = 1;
                return result;
            }
        }
        return result;
    }

    public int solution2(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        int x = a.length;
        int result = 0;
        for (int i = 0; i < x; i++) {
            set.add(a[i]);
        }
        if (x == set.size()) {
            result = 1;
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5};
        int[] b = {1, 2, 3, 4};
        int[] c = {1, 3, 4, 5, 6, 7};
        int[] d = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
        LessonFourPermCheck permCheck = new LessonFourPermCheck();
        System.out.println(permCheck.solution(a));
        System.out.println(permCheck.solution(b));
        System.out.println(permCheck.solution(c));
        System.out.println(permCheck.solution(d));
    }
}
