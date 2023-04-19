package Lessons;

public class LessonOne {
    public static void main(String[] args) {

        int n = 450;
        int maxG = 0;
        int currG = 0;
        boolean counting = false;

        while (n > 0) {
            int rem = n % 2;
            n /= 2;

            if (rem == 1) {
                if (!counting) {
                    counting = true;
                } else {
                    maxG = Math.max(maxG, currG);
                    currG = 0;
                }
            } else if (counting) {
                currG++;
            }
        }
        System.out.println(maxG);
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


