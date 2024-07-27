import java.util.Scanner;

class Solution {
    public boolean check(int[] nums) {
        int ans = 0;
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            if (nums[i - 1] > nums[i]) {
                ans++;
            }
        }
        if (nums[size - 1] > nums[0]) {
            ans++;
        }
        return ans <= 1;
    }
}

public class sortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        boolean result = solution.check(nums);
        System.out.println("Can the array be sorted? " + result);
    }
}
