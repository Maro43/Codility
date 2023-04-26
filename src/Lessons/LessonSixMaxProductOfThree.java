package Lessons;

import java.util.ArrayList;
import java.util.Comparator;

public class LessonSixMaxProductOfThree {
/*    public int solutionWrong(int[] a) {
        int sum = 0;
        Arrays.sort(a);
        int[] lastThree = Arrays.copyOfRange(a, a.length - 3, a.length);
        sum = lastThree[0] * lastThree[1] * lastThree[2];
        return sum;
    }*/

    public int solution(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        int result = Integer.MIN_VALUE;
        int sum;

        for (int number : a) {
            list.add(number);
        }
        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < list.size() - 2; i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                sum = list.get(i) * list.get(j) * list.get(list.size() - 1);
                result = Math.max(sum, result);
            }

        }
        return result;
    }

    public int solution2(int[] a) {
        int x = a.length;
        int result = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < x - 2; i++) {
            for (int j = i + 1; j < x - 1; j++) {
                for (int k = j + 1; k < x; k++) {
                    sum = a[i] * a[j] * a[k];
                    result = Math.max(sum, result);
                }
            }
        }
        return result;
    }

    public int solution3(int[] a) {
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

//            set.add(a);
//   set.stream().sorted().
//            sum = a[0]*a[1]*a[2];
//


    public static void main(String[] args) {
        int[] a = {-3, 1, 2, -2, 5, 6};
        LessonSixMaxProductOfThree productOfThree = new LessonSixMaxProductOfThree();
        System.out.println(productOfThree.solution3(a));
    }
}
