package chapter15.example;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class GcArray2 {
    static ArrayList<WeakReference<int[]>> list = new ArrayList<WeakReference<int[]>>();

    public static void main(String[] args) {
        while (true) {
            int[] a = new int[1000];
            for (int i = 0; i < a.length; i++) {
                a[i] = i;
            }
            list.add(new WeakReference<int[]>(a));
            System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory() + " 配列list = " + list.size());

            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i).get() == null) {
                    list.remove(i);
                }
            }
        }
    }
}
