class Solution {
    List<List<Integer>> ans;
    public void rec(int [] cnds,int target,List<Integer> temp,int idx){
        if(target==0){
            ans.add(new ArrayList(temp));
            return;
        }
        if(idx==cnds.length) return;
        if(target >= cnds[idx]){
            temp.add(cnds[idx]);
            target -= cnds[idx];
            //System.out.println(target+" "+ idx);
            rec(cnds,target,temp,idx);
            temp.remove(temp.size()-1);
            target+=cnds[idx];
            rec(cnds,target,temp,idx+1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ans = new ArrayList<>();

        rec(candidates,target,new ArrayList<>(),0);
        return ans;
        
    }
}

/*
if(target==0) ans.add;

if(target > nums[idx]){
   temp.add(nums[idx]);
   sum+=
   rec(idx,)
   temp.rem
   sum-=

}
*/
