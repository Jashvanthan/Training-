class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st=-1,ed=-1;
        for(int i=0;i<nums.length;i++)
        {
           if(target==nums[i]){
            st=i;
            break;
           }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(target==nums[i]){
            ed=i;
            break;
            }
        }
        return new int[]{st,ed};
    }
}