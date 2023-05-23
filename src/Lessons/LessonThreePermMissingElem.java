package Lessons;


/*

An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

        Your goal is to find that missing element.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

        For example, given array A such that:
        A[0] = 2
        A[1] = 3
        A[2] = 1
        A[3] = 5

        the function should return 4, as it is the missing element.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        the elements of A are all distinct;
        each element of array A is an integer within the range [1..(N + 1)].
*/


public class LessonThreePermMissingElem {
//    public int solution(int[] a) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int number : a) {
//            set.add(number);
//        }
//        int result = 0;
//        for (int element : set) {
//            result = element - 1;
//        }
//        return result;
//    }

    public int solution2(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int result =(((a.length+1) * ((a.length+1)+1)) / 2) - sum;
        return result;
    }

//    public int solution3(int[] a) {
//        HashSet<Object> set = new HashSet<>();
//        for (int number : a) {
//            set.add(number);
//        }
//
//        return 0;
//    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        LessonThreePermMissingElem missingElem = new LessonThreePermMissingElem();
        int solution = missingElem.solution2(a);
        System.out.println(solution);
    }
}
