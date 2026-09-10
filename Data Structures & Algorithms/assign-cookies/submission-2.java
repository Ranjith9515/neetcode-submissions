class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length,nn=s.length;
            if(nn == 0){return 0;}
        int i=0; int j=0; int count=0; 
        Arrays.sort(g);Arrays.sort(s);
        while((i<n) && (j<nn)){
            if(g[i] <= s[j]){
                count++;
                i++; j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}