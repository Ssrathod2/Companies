class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int ans = nums[0];

        while(left<=right){
            int mid = (left+right)/2;

            ans = Math.min(ans,nums[mid]);
            if(nums[mid] > nums[n-1]){
                left = mid+1;
            }else{      
                right = mid-1;
            }
        }

        return ans;
        
    }

}

