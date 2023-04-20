package Lessons;

import java.util.Arrays;

public class LessonTwoCyclicRotation {
    public int[] solution(int[] A, int K) {

        int N = A.length;

        if (N == 0)
            return A;
        for (int i = 0; i < K; i++){
            int sol = A[A.length - 1];
            for (int j = N - 1; j > 0; j--){
                A[j] = A[j - 1];
            }
            A[0] = sol;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {3,2,1,5,6,7,8};
        int K = 3;

        LessonTwoCyclicRotation solution = new LessonTwoCyclicRotation();
        int[] result = solution.solution(A, K);

        System.out.println(Arrays.toString(result));
    }
}