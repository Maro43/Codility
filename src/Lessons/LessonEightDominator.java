package Lessons;

public class LessonEightDominator {
    public int solution(int[] a) {

        int size = 0;
        int index = -1;
        int current = 0;
        int dom = 0;

        for (int i = 0; i < a.length; i++) {
            if (size == 0) {
                size++;
                current = a[i];
            } else {
                if (current != a[i]) {
                    size--;
                } else {
                    size++;
                }
            }
        }
        if (size > 0)
            dom = current;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == dom) {
                count++;
            }
        }
        if (count > a.length / 2) {
        } else return -1;
        for (int i = 0; i < a.length; i++) {
            if (dom == a[i]) {
               index=i;
               break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 3, 1, 3, -1, 3, 3,3,4,2,3,3};
        System.out.println(new LessonEightDominator().solution(a));
    }
}
