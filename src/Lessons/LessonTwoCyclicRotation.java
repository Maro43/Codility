package Lessons;

import java.util.Arrays;

public class LessonTwoCyclicRotation {
    public static void main(String[] args) {


        int K = 7;
        int[] A = {1, 2, 3, 4, 5};
        int N = A.length;

        for (int i = 0; i < K; i++){
            int temp = A[A.length - 1];
            for (int j = N - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = temp;
        }
        System.out.println(Arrays.toString(A));

    }

}