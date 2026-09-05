class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        if(n==1){return new int[]{-1};}
        int ans[]=new int[n]; ans[n-1]=-1;
        int maxval=arr[n-1];
        for(int i=n-2; i>=0; i--){
            ans[i]=maxval;
             maxval=Math.max(maxval,arr[i]);
        }
            return ans;
    }
}