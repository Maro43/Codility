package Lessons;

/*

You are going to build a stone wall. The wall should be straight and N meters long, and its thickness should be constant; however, it should have different heights in different places. The height of the wall is specified by an array H of N positive integers. H[I] is the height of the wall from I to I+1 meters to the right of its left end. In particular, H[0] is the height of the wall's left end and H[N−1] is the height of the wall's right end.

The wall should be built of cuboid stone blocks (that is, all sides of such blocks are rectangular). Your task is to compute the minimum number of blocks needed to build the wall.

Write a function:

    class Solution { public int solution(int[] H); }

that, given an array H of N positive integers specifying the height of the wall, returns the minimum number of blocks needed to build it.

For example, given array H containing N = 9 integers:
  H[0] = 8    H[1] = 8    H[2] = 5
  H[3] = 7    H[4] = 9    H[5] = 8
  H[6] = 7    H[7] = 4    H[8] = 8

the function should return 7. The figure shows one possible arrangement of seven blocks.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array H is an integer within the range [1..1,000,000,000].

*/

import java.util.Stack;

public class LessonSevenStoneWall {

    public int solution(int[] h) {

        Stack<Integer> stack = new Stack<>();
        int stones = 0;
        int currentStone;
        for (int i = 0; i < h.length; i++) {
            currentStone = h[i];
            while (!stack.isEmpty()&&currentStone<stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                stack.push(currentStone);
                stones++;
            } else if (currentStone == stack.peek()) {
                continue;
            } else if (currentStone > stack.peek()) {
                stack.push(currentStone);
                stones++;
            }
        }
        return stones;
    }


    public static void main(String[] args) {
        int[] h = {8, 8, 5, 7, 9, 8, 7, 5, 8};
        System.out.println(new LessonSevenStoneWall().solution(h));
    }
}

/*
    public int solutionWrong(int[] h) {

        Queue<Integer> list = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = h[0];
        int currentStone;
        int stones = h.length;


        list.add(map.put(h[0], h[0]));

        for (int i = 1; i < h.length; i++) {
            currentStone = h[i];
            min = Math.min(currentStone, min);
            if (h[i - 1] > currentStone) {
                list.remove();
                stones--;
            } else if (map.containsKey(currentStone)) {
                stones--;
            } else if (currentStone < min) {
                map.clear();
            } else if (currentStone > min) ;
            list.add(map.put(currentStone, currentStone));
        }


        return stones;
    }

    public int solutionWrong2(int[] h) {

        Queue<Integer> list = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = h[0];
        int currentStone;
        int stones = 1;


        list.add(map.put(h[0], h[0]));

        for (int i = 1; i < h.length; i++) {
            currentStone = h[i];
            min = Math.min(currentStone, min);
            if (h[i - 1] > currentStone) {
                map.remove(h[i - 1]);
                stones++;
            } else if (map.containsKey(currentStone)) {
                continue;
            } else if (currentStone < min) {
                map.clear();
            } else if (currentStone > min) {
                stones++;
            }
            list.add(map.put(currentStone, currentStone));
        }


        return stones;
    }

    public int solutionWrong3(int[] h) {
//        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int stones = 1;
        int currentStone;
        int min = h[0];
        stack.push(h[0]);

        for (int i = 1; i < h.length; i++) {
            currentStone = h[i];
            int lastStone = h[i - 1];

            if (currentStone == lastStone) {
                continue;
            } else if (currentStone > lastStone) {
                stones++;
                stack.push(currentStone);
            } else if (lastStone > currentStone) {
                if (currentStone > stack.peek()) {
                    stack.pop();
                    stones++;
                    stack.push(currentStone);
                } else if (currentStone == stack.peek()) {
                    stack.clear();
                    stack.push(currentStone);
                    continue;
                } else if (currentStone<min){
                    min = currentStone;
                    stack.clear();
                    stones++;
                    stack.push(currentStone);
                }
                    stack.pop();
                    stack.push(currentStone);
                stones++;

            }
        }
*/
