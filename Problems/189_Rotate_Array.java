class Solution {
    static void rev(int left ,int right, int [] arr){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        rev(0,n-k-1,nums);
        rev(n-k,n-1,nums);
        rev(0,n-1,nums);

    }
}
