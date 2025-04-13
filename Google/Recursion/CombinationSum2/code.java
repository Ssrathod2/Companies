class Solution {
    List<List<Integer>> ans;
    public void rec(int [] cnds,int target,List<Integer> temp,int idx){
       // System.out.print(idx + " ");
        //if(idx==cnds.length){
            if(target==0){ ans.add(new ArrayList(temp));
            return;
        }
        //if(idx==cnds.length) return;

        for(int i=idx;i<cnds.length;i++){
           if(i>idx && cnds[i]==cnds[i-1]) continue;
           if(target < cnds[i]) break;
           temp.add(cnds[i]);
           rec(cnds,target-cnds[i],temp,i+1);
           temp.remove(temp.size()-1);   
        }
    
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ans = new ArrayList<>();

        rec(candidates,target,new ArrayList<>(),0);
        return ans;
    }
}
