/*Задание 2:

Создать список целых чисел (заполнить случайными числами).
Найти минимальное, максимальное и среднее из этого списка. */

import java.util.ArrayList;
//import RandomArray.ArrayList;
public class Home_Task_2 {
    public static void main(String[] args) {
        System.out.print("\033\143");
        int n = 0;
        while( n == 0){
        n = RandomArray.EnterNamber();
        }
        ArrayList arr = RandomArray.ArrList(n);
        System.out.println(arr);
        int maxNamber = (int)arr.get(0);
        int minNamber = (int)arr.get(0);
        int midNamber = 0;
        for (int i = 0; i < n; i++){
            if (maxNamber < (int) arr.get(i)){ maxNamber = (int) arr.get(i);}
            if (minNamber > (int) arr.get(i)){ minNamber = (int) arr.get(i);}
            midNamber+= (int) arr.get(i);
        }
        System.out.println("Максимальное число : "+maxNamber);
        System.out.println("Минимальное число : "+minNamber);
        System.out.println("Среднее : "+midNamber/n);
}
} 
