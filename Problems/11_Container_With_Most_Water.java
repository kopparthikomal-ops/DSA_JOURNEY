class Solution {
    public int maxArea(int[] arr) {
        int maxArea=0,left=0,right=arr.length-1;
        while(left<right){
            int minheight = Math.min(arr[left],arr[right]);
            int width = right-left;
            int currArea = minheight*width;
            maxArea = Math.max(currArea,maxArea);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
