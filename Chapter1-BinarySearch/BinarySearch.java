import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BinarySearch {
    private static final int LEN_OF_LINE = 10;
    private ArrayList<Integer> nums;

    BinarySearch(int sizeOfNums) {
        if (sizeOfNums <= 0) {
            return;
        }
        nums = new ArrayList<>();
        for (int i = 0; i < sizeOfNums; i++) {
            nums.add(i + 1);
        }
    }

    public void ShowData() {
        int lineOfNUmber = 0;
        for (int m : nums) {
            System.out.print(m + " ");
            lineOfNUmber++;
            if (LEN_OF_LINE == lineOfNUmber) {
                lineOfNUmber = 0;
                System.out.println();
            }

        }
        System.out.println();
    }

    public int Search(int target) {
        int left = 0;
        int right = nums.size() - 1;
        if (nums.size() <= 0) {
            return -1;
        }
        while (left <= right) {
            System.out.println("left " + left + " right " + right);
            int mid = (left + right) / 2;
            if (nums.get(mid) == target) {
                return mid;
            }
            if (nums.get(mid) > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int Search(int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (nums.get(mid) == target) {
            return mid;
        }
        if (nums.get(mid) < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        return Search(left, right, target);
    }

    public boolean swap(int i, int j) {
        if (i < 0 || j < 0) {
            return false;
        }
        Collections.swap(nums, i, j);
        return true;
    }

    public static void main(String[] args) {
        BinarySearch bin = new BinarySearch(2);
        //bin.ShowData();
        System.out.println(bin.Search(0, 1, 9));

    }
}
