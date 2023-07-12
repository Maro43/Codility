package Lessons;

/*
A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

        S is empty;
        S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
        S has the form "VW" where V and W are properly nested strings.

For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

    class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..200,000];
        string S is made only of the following characters: '(', '{', '[', ']', '}' and/or ')'.
*/

import java.util.HashMap;
import java.util.Stack;

public class LessonSevenBrackets {

    public int solution(String s) {
        HashMap<String, String> map = new HashMap<>();
        map.put("}", "{");
        map.put("]", "[");
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
                String c=stack.pop();
                if (!map.get(current).equals(c)) {
                    return 0;
                }
            } else {
                stack.push(current);
            }
        }
        if (stack.isEmpty()) return 1;
        return 0;
    }

    public static void main(String[] args) {
        String s = "{[(()(())())]}";
        System.out.println(new LessonSevenBrackets().solution(s));
    }
}
