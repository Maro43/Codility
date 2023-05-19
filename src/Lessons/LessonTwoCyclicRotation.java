package Lessons;

/*


An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

        The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

        Write a function:

class Solution { public int[] solution(int[] A, int K); }

that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.

        For example, given
        A = [3, 8, 9, 7, 6]
        K = 3

        the function should return [9, 7, 6, 3, 8]. Three rotations were made:
        [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
        [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
        [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]

        For another example, given
        A = [0, 0, 0]
        K = 1

        the function should return [0, 0, 0]

        Given
        A = [1, 2, 3, 4]
        K = 4

        the function should return [1, 2, 3, 4]

        Assume that:

        N and K are integers within the range [0..100];
        each element of array A is an integer within the range [−1,000..1,000].

        In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
*/


import java.util.Arrays;

public class LessonTwoCyclicRotation {
    public int[] solution(int[] a, int k) {

        int arrLen = a.length;

        if (arrLen == 0)
            return a;

//        for (int i = 0; i < k; i++) {
//            int result = (i + k) - arrLen;
//        }

        for (int i = 0; i < k; i++){
            int sol = a[arrLen - 1];
            for (int j = arrLen - 1; j > 0; j--){
                a[j] = a[j - 1];
            }
            a[0] = sol;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {3,2,1,5,6,7,8};
        int k = 3;

        LessonTwoCyclicRotation solution = new LessonTwoCyclicRotation();
        int[] result = solution.solution(a, k);

        System.out.println(Arrays.toString(result));
    }


}