package Lessons;

/*

A non-empty array A consisting of N integers is given. The consecutive elements of array A represent consecutive cars on a road.

        Array A contains only 0s and/or 1s:

        0 represents a car traveling east,
        1 represents a car traveling west.

        The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.

        For example, consider array A such that:
        A[0] = 0
        A[1] = 1
        A[2] = 0
        A[3] = 1
        A[4] = 1

        We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

        Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the number of pairs of passing cars.

        The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

        For example, given:
        A[0] = 0
        A[1] = 1
        A[2] = 0
        A[3] = 1
        A[4] = 1

        the function should return 5, as explained above.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer that can have one of the following values: 0, 1.
*/

public class LessonFivePassingCars {
/*    public int solution(int[] a) {

        ArrayList<Object> carsEast = new ArrayList<>();
        int sum = 0;
        int sum0 = 0;
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (a[i] == 0) {
                if (sum == 0) {
                    sum0 = 0;
                } else {
                    sum0 += 1;
                }
            } else if (a[0] == 0) {
                if (sum == 0) {
                    sum1 = 0;
                } else {
                    sum1 = 1;
                }
            }
        }
        sum = (sum0 * sum) - sum0 + sum1;
        return sum;

    }*/

    public int solution2(int[] a) {
        int all = 0;
        int pair = 0;

       for (int i = 0; i < a.length; i++) {
            if (a[i] == 0){
                pair++;
            } else {
                all += pair;
            }
            if (all > 1000000000){
                return -1;
            }
        }

        return all;
    }

    public static void main(String[] args) {
        int[] a = {0,0,0,0};
        LessonFivePassingCars passingCars = new LessonFivePassingCars();
        System.out.println(passingCars.solution2(a));
    }
}

