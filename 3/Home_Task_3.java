/* Задание 3 *.

Реализовать алгоритм сортировки пузырьком */
import java.util.ArrayList;

import javax.tools.ForwardingJavaFileManager;
public class Home_Task_3 {
    public static void main(String[] args) {
        System.out.print("\033\143");
        int n = 0;
        while( n == 0){
        n = RandomArray.EnterNamber();
        }
        ArrayList arr = RandomArray.ArrList(n);
        System.out.println(arr);
        Integer[] arrInt = (Integer[])arr.toArray(new Integer[arr.size()]);
        int prom;
        for (int i = 0; i < arrInt.length-1; i++) {
            for (int j = 0; j < arrInt.length-i-1; j++) {
                if (arrInt[j]>arrInt[j+1]){
                    prom = arrInt[j+1];
                    arrInt[j+1] = arrInt[j];
                    arrInt[j] = prom;
                }
            }
        }
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i]+" ");
        }
    }
}
