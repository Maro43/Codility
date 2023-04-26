package Lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LessonSixTriangle {
    public int solution(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            int sumC = a[i] + a[i + 1];
            int sumA = a[i + 1] + a[i + 2];
            int sumB = a[i] + a[i + 2];

            if (sumC > a[i + 2]) {
                if (sumB > a[i + 1]) {
                    if (sumA > a[i])
                        return 1;
                }
            }
        }
        return 0;
    }
    public int solution2(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < list.size()-2; i++) {
            int sumC = list.get(i) + list.get(i+1);
            int sumA = list.get(i+1) + list.get(i+2);
            int sumB = list.get(i) + list.get(i+2);

            if (sumC > a[i + 2]) {
                if (sumB > a[i + 1]) {
                    if (sumA > a[i])
                        return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
        System.out.println(new LessonSixTriangle().solution(a));
    }
}
