public class Solution {
	public static void main(String[] args) {
        int a[] = {4, 3, 2, 6};
        System.out.println(new Solution().maxRotateFunction(a));
    }
	
    public int maxRotateFunction(int[] arr) {
        int sum = 0;
        int f = 0;
        int n = arr.length;
        for (int index = 0; index < n; index++) {
            sum += arr[index];
            f += index * arr[index];
        }
        int max = f;
        for (int index = 1; index < n; index++) {
            max = Math.max(max, f + sum - arr[n - index] * n);
            f += sum - arr[n - index] * n;
        }
        return max;
    }
}