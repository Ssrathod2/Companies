// "static void main" must be defined in a public class.
public class Main {
    public static boolean isOk(String word1,String word2){
        int ans = -5;
        if(word1.length() != word2.length()) return false;
        else{            
            for(int i=0;i<word1.length();i++){
                ans ^= (word1.charAt(i) - 'a');
                ans ^= (word2.charAt(i) - 'a');
            }
        }
        return ans == -5;       
    }
    public static ArrayList<String>[] findMinPages(String[] q, String[] w){
        Arrays.sort(q);
        int n = w.length;
        int m = q.length;
        ArrayList<String>[] ans = new ArrayList[n];
        for(int i=0;i<n;i++){
            ans[i] = new ArrayList<String>();
        }     
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isOk(w[i] , q[j])){
                    ans[i].add(q[j]);
                }
            }
        }
        return ans;
     }


    public static void main(String[] args) {
        String [] q = {"peach", "cat", "cheap", "tac", "duel"};
        String [] w = {"act", "peahc"};
        ArrayList<String>[] ans = findMinPages(q,w);        
        for(ArrayList<String> ws : ans){
            for(String s : ws){
                System.out.print(s + " ");
            }
            System.out.println("");
        }    
    }
}

