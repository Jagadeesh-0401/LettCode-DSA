class Solution {
    public int[] getConcatenation(int[] nums) {
       int[] arr=new int[nums.length+nums.length];
       int k=0;
       for(int i=0;i<nums.length;i++){
        arr[k++]=nums[i];
       }
       for(int i=0;i<nums.length;i++){
        arr[k++]=nums[i];
       } 
       return arr;
    }
}