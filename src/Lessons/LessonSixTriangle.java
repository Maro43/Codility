package Lessons;

/*
An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

        A[P] + A[Q] > A[R],
        A[Q] + A[R] > A[P],
        A[R] + A[P] > A[Q].

For example, consider array A such that:
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20

Triplet (0, 2, 4) is triangular.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

For example, given array A such that:
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20

the function should return 1, as explained above. Given array A such that:
  A[0] = 10    A[1] = 50    A[2] = 5
  A[3] = 1

the function should return 0.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
*/

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
