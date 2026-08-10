class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int org = x;
        while(x>0){
            int last = x%10;
            sum = sum*10 + last;
            x=x/10;
        }
        if(sum == org){
            return true;
        }
        return false;
        
    }
}
