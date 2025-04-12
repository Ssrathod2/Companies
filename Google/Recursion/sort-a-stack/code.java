/*Complete the function below*/
class GfG {
    public void put(Stack<Integer> st, int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        
        if(st.peek() > ele){
            int curr = st.pop();
            put(st,ele);
            st.push(curr);
        }else{
            st.push(ele);
        }
        return;
    }
    public Stack<Integer> sort(Stack<Integer> st) {
        // add code here.
        if(st.size() == 1) return st;
        
        int ele = st.pop();
        sort(st);
        put(st,ele);
        return st;
    }
}
