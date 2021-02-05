package TA_Lab1;

import java.util.ArrayList;

public class Task9 {
    public static void main(String[] args) {
        algorithm(12);
    }

    public static void algorithm(int a) {
        int start = a;
        ArrayList<Integer> list = new ArrayList<>();
        if (a > 0) {
            for (int i = 2; i <= a; i++) {
                int j = 0;
                while (a % i == 0) {
                    a = a / i;
                    list.add(i);
                    j++;
                }
            }
        } else {
            System.out.println("Введіть число, більше нуля!");
        }
        finish(list, start);
    }

    public static void finish(ArrayList<Integer> a, int b) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (Integer i : a) {
            if ((i == 2) | (i == 3) | (i == 5)) {
                list1.add(i);
            }
        }
        if (list1.size() == a.size()) {
            System.out.println("Число: " + b + " є 'нудним'");
        } else {
            System.out.println("Число: " + b + " НЕ є 'нудним'");
        }
    }

}
