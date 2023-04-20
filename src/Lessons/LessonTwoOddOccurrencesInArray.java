package Lessons;

import java.util.HashSet;
import java.util.Set;

public class LessonTwoOddOccurrencesInArray {

    public int solution(int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int number : A) {
            if (!set.contains(number)) {
                set.add(number);
            } else {
                set.remove(number);
            }
        }
        int result = 0;
        for (int el : set) {
            result = el;
        }
        return result;
//        return set.stream().findFirst().orElseThrow();
    }

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 7, 9, 3, 9};
        new LessonTwoOddOccurrencesInArray().solution(A);

    }
}
