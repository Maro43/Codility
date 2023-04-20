package Lessons;

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