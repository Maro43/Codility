package Lessons;

/*
A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

        For example, array A such that:
        A[0] = -3
        A[1] = 1
        A[2] = 2
        A[3] = -2
        A[4] = 5
        A[5] = 6

        contains the following example triplets:

        (0, 1, 2), product is −3 * 1 * 2 = −6
        (1, 2, 4), product is 1 * 2 * 5 = 10
        (2, 4, 5), product is 2 * 5 * 6 = 60

        Your goal is to find the maximal product of any triplet.

        Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A, returns the value of the maximal product of any triplet.

        For example, given array A such that:
        A[0] = -3
        A[1] = 1
        A[2] = 2
        A[3] = -2
        A[4] = 5
        A[5] = 6

        the function should return 60, as the product of triplet (2, 4, 5) is maximal.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [3..100,000];
        each element of array A is an integer within the range [−1,000..1,000].
*/


import java.util.ArrayList;
import java.util.Comparator;

public class LessonSixMaxProductOfThree {


    public int solution(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        list.sort(Comparator.naturalOrder());

        int sum1 = list.get(0) * list.get(1) * list.get(2);
        int sum2 = list.get(list.size() - 1) * list.get(list.size() - 2) * list.get(list.size() - 3);
        int sum3 = list.get(0) * list.get(1) * list.get(list.size() - 1);
        int sum4 = list.get(0) * list.get(list.size() - 1) * list.get(list.size() - 2);

        int check1 = Math.max(sum1, sum2);
        int chcck2 = Math.max(sum3, sum4);
        int result = Math.max(check1, chcck2);
        return result;
    }



    public static void main(String[] args) {
        int[] a = {-3, 1, 2, -2, 5, 6};
        LessonSixMaxProductOfThree productOfThree = new LessonSixMaxProductOfThree();
        System.out.println(productOfThree.solution(a));
    }

}
