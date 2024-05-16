class Solution {
    public int findMin(int[] nums) {
         int ans=Integer.MAX_VALUE; 
         int low=0;
         int high=nums.length-1;

       while(low<=high)
       {
           int mid=(low+high)/2;
           if(nums[low]<=nums[high]){
           ans=Math.min(ans,nums[low]);
           break;
           }
            if(nums[low]<=nums[mid]){
            low=mid+1;
             ans=Math.min(ans,nums[mid]);
           }
           else if(nums[mid]<=nums[high]){
           high=mid-1;
           ans=Math.min(ans,nums[mid]);
           }
       }
       return ans;
    }
}