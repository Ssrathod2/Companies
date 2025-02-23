class Solution {
    public static boolean isOk(int [] pages, int pageL , int k){
        int cnt = 1,pageS = 0;
        for(int i=0;i<pages.length;i++){
            if(pageS + pages[i] > pageL){
                cnt++;
                pageS = pages[i];
            }else pageS += pages[i];
        }
        
        return cnt<=k;
        
    }
    public static int findPages(int[] pages, int k) {
       int n = pages.length;
       if(n < k) return -1;
       
       int minL = Arrays.stream(pages).max().getAsInt();
       int maxL = Arrays.stream(pages).sum();
       int ans = Integer.MAX_VALUE;
       while(minL <= maxL){
           int midL = (minL + maxL)/2;
           
           if(isOk(pages,midL,k)){
               maxL = midL-1;
               ans = Math.min(midL,ans);
           }else{
               minL = midL+1;
           }
       }
       
       return ans;
       
       
    }
}
