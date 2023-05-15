package Lessons;

import java.util.ArrayList;

public class LessonTenMinPerimeterRectangle {
    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        int count = Integer.MAX_VALUE;

        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                list.add(j);
            }
        }
        int index = 1;
        for (int i = 0; i < list.size(); i++) {
            int x = list.size() - index;
            result = (2 * list.get(i)) + (2 * list.get(x));
            count = Math.min(count, result);
            index++;
        }
        return count;
    }

    public int solution2(int n) {
        int square = (int) Math.sqrt(n);
        int result = Integer.MAX_VALUE;
        int rectangle = 0;
        int secondLength = 0;
        if (Math.pow(square, 2) != n) {
            square++;
        } else {
            result = 2 * (square + square);
        }
        for (int i = 1; i < square; i++) {
            if (n % i == 0) {
                secondLength = n / i;
                rectangle = 2 * secondLength + 2 * i;
                result = Math.min(rectangle, result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LessonTenMinPerimeterRectangle().solution2(48));
    }
}
