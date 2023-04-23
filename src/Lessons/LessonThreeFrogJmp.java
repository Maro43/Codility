package Lessons;

public class LessonThreeFrogJmp {

    /*public int solution(int x, int y, int d) {
        int distance = y - x;
        int count;
        for (count = 0; distance > 0; count++) {
            distance -= d;
        }
        return count;
    }*/
    /*public int solution2(int x, int y, int d){
        int distance = y - x;
        int count = 0;
        while (distance > 0){
            distance -= d;
            count++;
        }
        return count;
    }*/
    public int solution3(int x, int y, int d){
        return (int)Math.ceil((double)(y-x)/d);
    }

    public static void main(String[] args) {
        int x = 8;
        int y = 110;
        int d = 20;
        LessonThreeFrogJmp frogJmp = new LessonThreeFrogJmp();
        int result = frogJmp.solution3(x, y, d);
        System.out.println(result);
    }
}
