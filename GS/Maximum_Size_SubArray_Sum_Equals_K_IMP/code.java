class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int ans = 0;
        int preS = nums[0];
        if(preS != 0) mp.put(preS,0);
        if(preS == k) ans++;

        for(int i=1;i<n;i++){
            preS += nums[i];
            if(mp.containsKey(preS-k)){
                ans = Math.max(i - mp.get(preS-k), ans);
            }
            if(!mp.containsKey(preS)){
                mp.put(preS,i);
            }
        }

        return ans;
        
    }
}
