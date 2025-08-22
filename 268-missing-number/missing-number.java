class Solution {
    public int missingNumber(int[] nums) {
        int k=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]!=i) return i;
             k=i;
        }
        return ++k ;
    }
}