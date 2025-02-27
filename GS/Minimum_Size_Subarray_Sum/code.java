class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int Sum = 0;
        int n = nums.length;
        int ans = n;
        int i=0;
        if(Arrays.stream(nums).sum() < target) return 0;

        for(int j=0;j<n;j++){
            if(nums[j] >= target) return 1;
            
            Sum += nums[j];
            
            while(i<j && Sum >= target){
                ans = Math.min(ans,j-i+1);
                Sum -= nums[i];
                i++;
            }
        }

        return ans;
        
    }
}

