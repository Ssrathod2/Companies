class Solution {
    List<List<Integer>> ans;
    public void rec(int [] nums, List<Integer> temp,int idx){
        if(idx >= nums.length){
            ans.add(new ArrayList(temp));
            return;
        }
        rec(nums,temp,idx+1);
        temp.add(nums[idx]);
        rec(nums,temp,idx+1);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<>();
        rec(nums,new ArrayList<>(),0);
        return ans;   
    }
}
