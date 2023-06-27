package Lessons;

/*
A non-empty array A consisting of N integers is given.

        A permutation is a sequence containing each element from 1 to N once, and only once.

        For example, array A such that:
        A[0] = 4
        A[1] = 1
        A[2] = 3
        A[3] = 2

        is a permutation, but array A such that:
        A[0] = 4
        A[1] = 1
        A[2] = 3

        is not a permutation, because value 2 is missing.

        The goal is to check whether array A is a permutation.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

        For example, given array A such that:
        A[0] = 4
        A[1] = 1
        A[2] = 3
        A[3] = 2

        the function should return 1.

        Given array A such that:
        A[0] = 4
        A[1] = 1
        A[2] = 3

        the function should return 0.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [1..1,000,000,000].
*/

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
