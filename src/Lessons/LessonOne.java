package Lessons;

/*
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

        For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

        Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

        For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..2,147,483,647].
*/


public class LessonOne {
    //    public static void main(String[] args) {
//
//        int n = 450;
//        int maxG = 0;
//        int currG = 0;
//        boolean counting = false;
//
//        while (n > 0) {
//            int rem = n % 2;
//            n /= 2;
//
//            if (rem == 1) {
//                if (!counting) {
//                    counting = true;
//                } else {
//                    maxG = Math.max(maxG, currG);
//                    currG = 0;
//                }
//            } else if (counting) {
//                currG++;
//            }
//        }
//        System.out.println(maxG);
//    }
    public static int solution(int n) {
        String bin = Integer.toBinaryString(n);
        int count = 0;
        int result = 0;
        boolean counting=false;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                if (!counting){
                    counting=true;
                } else
                result = Math.max(result, count);
                count=0;
            } else if (counting) {
                count++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(solution(33));
    }
}

//
//
//        int n = 11;
//        int x;
//        int y;
//        int z;
////        for (int i = 1; i <= n; i++) {
////            for (int j = 0; j < i; j++) {
////                System.out.print("0");
////            }
////            System.out.println("1");
////        }
//
//            x = n / 2;
//            y = n % 2;
//            if (x >= 1) {
//
//            }
//    }


