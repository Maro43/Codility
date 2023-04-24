package Lessons;

import java.util.ArrayList;

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

