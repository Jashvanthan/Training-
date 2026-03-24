class Solution {
    public int findNumbers(int[] nums) {
        int Array_pos=0,count=0,dig=0;
        while(Array_pos!=nums.length)
        {
           dig=(int)Math.log10(nums[Array_pos])+1;
           if(dig%2==0)
           {
             count++;
           }
           Array_pos++;
        }
        return count;
    }
}