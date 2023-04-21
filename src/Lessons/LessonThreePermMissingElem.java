package Lessons;

import java.util.HashSet;

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
