class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1=nums1.length;
        if(n == 0){
            for(int i=0; i<n1; i++){
                System.out.print(nums1[i]);
            }
        }

            int j=0;
            for(int i=m; i<n1; i++){
                nums1[i]=nums2[j]; j++;
            }
            Arrays.sort(nums1);
            for(int i=0; i<n1; i++){
                System.out.print(nums1[i]);
            }
        }
    }
