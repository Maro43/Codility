package Lessons;

import java.util.ArrayList;
import java.util.Stack;

public class LessonSevenFish {

    public int solution(int[] a, int[] b) {
        Stack<Integer> fishStack = new Stack<>();
        int upDirection = 0;

        for (int i = 0; i < a.length; i++) {
            if (b[i] == 1) {
                fishStack.push(a[i]);
            } else {
                boolean eaten = false;
                while (!fishStack.isEmpty()) {
                    int downDirection = fishStack.peek();
                    if (downDirection > a[i]) {
                        eaten = true;
                        break;
                    } else {
                        fishStack.pop();
                    }
                }

                if (!eaten) {
                    upDirection++;
                }

            }
        }
        return upDirection + fishStack.size();
    }
    public int solution2(int[] a, int[] b){

        Stack<Integer> stackFish = new Stack<>();
        int survive = a.length;

        for (int i = 0; i < a.length ; i++) {
            if (b[i]==1){
                stackFish.push(a[i]);
            } else {
                while (!stackFish.isEmpty()){
                    int downSize = stackFish.peek();
                    if (downSize >a[i]){
                        survive--;
                        break;
                    } else {
                        stackFish.pop();
                        survive--;
                    }
                }
            }
        }

        return survive;
    }


    public int solutionWrong(int[] a, int[] b) {
        if (a.length == 0)
            return 0;
        ArrayList<Fish> fish = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            fish.add(new Fish(a[i], b[i]));
        }
        for (int i = 0; i < a.length; i++) {
            fish.get(i);
            if (b[i] == 1 && a[i] > a[i + 1] && b[i + 1] == 0) {
                while (i != a.length) {
                    fish.remove(i + 1);
                    if (b[i + 1] == 1 || a[i + 1] > a[i]) {
                        break;
                    }
                }

            } else if (b[i] == 0 && i != 0) {
                while (true) {
                    if (b[i - 1] == 0 || i == 0) {
                        break;
                    } else if (a[i] > a[i - 1] && b[i - 1] == 1) {
                        fish.remove(i - 1);
                    }

                }
            }
        }
        return fish.size();
    }

    class Fish {
        int size;
        int direction;

        public Fish(int size, int direction) {
            this.size = size;
            this.direction = direction;
        }

    }

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1, 5};
        int[] b = {0, 1, 0, 0, 0};
        System.out.println(new LessonSevenFish().solution2(a, b));
    }


}


    /*        for (int i = 0; i < fish.size(); i++) {
                if (fish.get(i)[1] == 1 && i != fish.size() - 1) {
                    while (fish.get(i + 1)[1] == 0) {
                        if (fish.get(i)[0] < fish.get(i + 1)[0]) {
                            fish.remove(i);
                            if (i < 0) {
                                while (fish.get(i - 1)[0] < fish.get(i + 1)[0])
                                    fish.remove(i - 1);
                                if (fish.get(i - 1)[0] > fish.get(i + 1)[0])
                                    fish.remove(i + 1);
                                break;
                            }

                        } else {
                            fish.remove(i + 1);
                        }
                        if (i == fish.size() - 1)
                            break;
                    }
                }
            }
            return fish.size();
        }*/
//        int[][] fish = new int[a.length][2];
//
//        for (int i = 0; i < a.length; i++) {
//            fish[i][0] = a[i];
//            fish[i][1] = b[i];
//            System.out.println(fish);
//        }