import java.util.ArrayList;
import java.util.Scanner;
public class RandomArray {
        public static ArrayList ArrList(int n) {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        for (int i=0; i<n; i++){
        int x = (int)(Math.random()*(100));
        arr.add(x);
        }
        //System.out.println(arr);
        return arr;
    }
    public static int EnterNamber(){
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = scanner.nextInt();
        return n;
        }
        catch (Exception ex) {
            System.out.println("!Вводите корректные данные!");
        return 0;
            }
    }
    }

