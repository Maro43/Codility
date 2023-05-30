package Lessons;

/*

A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.

        You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

        The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

        For example, you are given integer X = 5 and array A such that:
        A[0] = 1
        A[1] = 3
        A[2] = 1
        A[3] = 4
        A[4] = 2
        A[5] = 3
        A[6] = 5
        A[7] = 4

        In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

        Write a function:

class Solution { public int solution(int X, int[] A); }

that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.

        If the frog is never able to jump to the other side of the river, the function should return −1.

        For example, given X = 5 and array A such that:
        A[0] = 1
        A[1] = 3
        A[2] = 1
        A[3] = 4
        A[4] = 2
        A[5] = 3
        A[6] = 5
        A[7] = 4

        the function should return 6, as explained above.

        Write an efficient algorithm for the following assumptions:

        N and X are integers within the range [1..100,000];
        each element of array A is an integer within the range [1..X].

*/

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