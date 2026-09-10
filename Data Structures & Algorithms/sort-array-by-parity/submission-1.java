class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        if(n==1){return nums;}
        int ans[]=new int [n]; int s=0; int e=n-1;
        for(int i=0; i<n; i++){
            if(nums[i]%2 != 0){
                ans[e]=nums[i]; e--;
            }
            else{
                ans[s]=nums[i]; s++;
            }
        }
        return ans;
    }
}