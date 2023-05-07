package Lessons;

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
