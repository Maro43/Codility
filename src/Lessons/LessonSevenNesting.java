package Lessons;

import java.util.HashMap;
import java.util.Stack;

public class LessonSevenNesting {
    public int solution(String s) {
        HashMap<String, String> map = new HashMap<>();
        map.put(")", "(");
        Stack<String> stack = new Stack<>();

        if (s.length() % 2 != 0)
            return 0;

        for (int i = 0; i < s.length(); i++) {
            String current = String.valueOf(s.charAt(i));
            if (map.containsKey(current)) {
                if (stack.isEmpty()) {
                    return 0;
                }
                String c = stack.pop();
                if (!map.get(current).equals(c))
                    return 0;
            } else{
                stack.push(current);
            }
        }
        if (stack.isEmpty()) return 1;

        return 0;
    }

    public static void main(String[] args) {
        String s = "(()(())())";
        System.out.println(new LessonSevenNesting().solution(s));
    }
}
