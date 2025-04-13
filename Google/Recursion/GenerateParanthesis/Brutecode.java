class Solution {
    public boolean checkP(StringBuilder s){
        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push('(');
            }else{
                if(st.size() == 0 || st.peek() != '(') return false;
                st.pop();
            }
        }
        return st.size() == 0;
    }

    private List<String> ans;
    public void rec(StringBuilder temp,int ind){
        //System.out.print(temp+" ");
        if(ind >= temp.length()){
            if(checkP(temp)){
                //StringBuilder temp2 = new StringBuilder(temp);
                ans.add(temp.toString());
            }
            return;
        }
        rec(temp,ind+1);
        temp.setCharAt(ind,')');
        rec(temp,ind+1);
        temp.setCharAt(ind,'(');
    }
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder("");
        for(int i=0;i<2*n;i++){
            temp.append('(');
        }
        rec(temp,0);
        return ans;
    }
}
