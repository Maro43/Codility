package Lessons;

import java.util.HashSet;

public class LessonFourFrogRiverOne {
//    public int solution(int x, int[] a) {
//
//        HashSet<Integer> bridge = new HashSet<>();
//        int result = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            int leaves = a[i];
//            if (!bridge.contains(leaves)) {
//                bridge.add(leaves);
//                bridge.stream().count();
//                if (bridge.stream().count() == x) {
//                    result = i;
//                    return result;
//                } else {
//                    result = -1;
//                }
//            }
//        }
//        return result;
//    }

    public int solution(int x, int[] a) {

        HashSet<Integer> bridge = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            bridge.add(a[i]);
            if (bridge.size() < x) {
                bridge.add(a[i]);
            } else if (bridge.size() == x) {
                return i;
            }
        }
        return -1;
    }

/*    public int solution2(int x, int[] a) {
        int sumX = 0;
        int sumLeaves = 0;
        int sum2X = (x * (x + 1)) / 2;
//        for (int i = 0; i < x; i++) {
//            sumX = sumX + (i+1);
//        }
        for (int i = 0; i < a.length; i++) {
            sumLeaves += a[i];
        }
        return sum2X;
    }*/

    /*public int solution3(int x, int[] a) {
        HashSet<Integer> bridge = new HashSet<>();
        for (int i = 0; i < x; i++) {
            bridge.add(i);
        }
        int result = 0;
        HashSet<Integer> leaves = new HashSet<>();

        for (int j = 0; j < a.length; j++) {
            leaves.add(a[j]);
            if (x > leaves.size()) continue;
            if (leaves.containsAll(bridge)) {
                result = j;
                return result;
            } else {
                result = -1;
                return result;
            }
        }
        return result;
    }*/

    public static void main(String[] args) {
        int[] a = {1, 3, 1, 4, 2, 3, 5, 4};
        int x = 5;
        LessonFourFrogRiverOne riverOne = new LessonFourFrogRiverOne();
        System.out.println(riverOne.solution(x, a));
    }
}