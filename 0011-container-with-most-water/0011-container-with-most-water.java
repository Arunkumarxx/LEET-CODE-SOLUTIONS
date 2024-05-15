class Solution {
    public int maxArea(int[] height) {
       
        int n=height.length;
        int left=0;
        int right=n-1;
        int sum=0;
        int max=0;
        
        while(left<right)
        {
            int area=(right-left)*Math.min(height[left],height[right]);
            max=Math.max(area,max);
                if(height[left]<height[right]) {
                    left++;
                   
                }
                else {
                    right--;
                    
                }
        }
        return max;
    }
}