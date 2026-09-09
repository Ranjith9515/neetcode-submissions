class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length; 
        int ans[]=new int [n]; int pointer=n-1;
        int i=0; int j=n-1;
        while(i <= j){
            if( nums[i]*nums[i] > nums[j]*nums[j]){
                ans[pointer] = nums[i]*nums[i]; pointer--; i++;
            }
            else{
                 ans[pointer] = nums[j]*nums[j]; pointer--;j--;
            }
        }
        return ans;
    }
}