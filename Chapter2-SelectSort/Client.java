import com.jasoyang.sort.ISort;
import com.jasoyang.sort.InsertSort;
import com.jasoyang.sort.SelectSort;

import java.util.Random;

public class Client {
    public static final int START = 50;
    public static final int END = 100;

    public static void main(String[] args) {
        int data[] = new int[10];
        CreateRandonm(data);
        ShowData(data);
        ISort sort = new InsertSort();
        sort.Sort(data);
        ShowData(data);
    }

    public static void CreateRandonm(int[] data) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(END - START + 1) + START;
            data[i] = number;
        }
    }

    public static void ShowData(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
