package Lessons;

public class LessonEightEquiLeader {

    public int solution(int[] a) {
        int domSize = 0;
        int size = 0;
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

        for (int i = 0; i < a.length; i++) {
            if (a[i] == dom) {
                domSize++;
            }
        }
        if (!(domSize > a.length / 2)) {
            return 0;
        }

        int sizeDomEqui = 0;
        int notDom = 0;
        int nodDomSize = a.length - domSize;
        int equi = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == dom) {
                sizeDomEqui++;
                domSize--;
            } else {
                notDom++;
                nodDomSize--;
            }
            if (sizeDomEqui > notDom && domSize > nodDomSize) {
                equi++;
            }

        }


        return equi;
    }

//    public int solution(int[] a) {
//        int count = 0;
//        int equi = 0;
//        Arrays.sort(a);
//        int dom = a[a.length / 2];
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == dom) {
//                count++;
//            }
//        }
//        if (!(count > a.length / 2)) {
//            return 0;
//        }
//
//
//        return equi;
//    }

    public static void main(String[] args) {
        int[] a = {4, 4, 2, 5, 3, 4, 4, 4};
        System.out.println(new LessonEightEquiLeader().solution(a));
    }
}
