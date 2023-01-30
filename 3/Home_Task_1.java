import java.util.ArrayList;
/**
Задание 1.

Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.

 */
public class Home_Task_1 {
public static void main(String[] args) {
System.out.print("\033\143");
ArrayList arr = new ArrayList<Integer>();
for (int i=0; i<10; i++){
int x = (int)(Math.random()*(100));
arr.add(x);
}
System.out.println(arr);
int count = 0;
int n = arr.size();
for (int i=0; i< n; i++){

    if ((int)arr.get(count) % 2 == 0) 
        arr.remove(count);
    else{
        count++;
        }
}
System.out.println(arr);
}
}
