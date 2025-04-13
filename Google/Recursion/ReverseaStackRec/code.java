
//User function Template for Java

class Solution
{ 
    static void put(Stack<Integer> st , int ele){
        if(st.size() == 0){
            st.push(ele);
            return;
        }
        
        int curr = st.pop();
        put(st,ele);
        st.push(curr);
    }
    static void reverse(Stack<Integer> st)
    {
        // add your code here
        if(st.size() == 0) return;
        
        int ele = st.pop();
        reverse(st);
        put(st,ele);
    }
}
