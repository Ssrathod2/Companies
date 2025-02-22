class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] premins = new int[n];
        int[] postmins = new int[n];
        premins[0] = height[0];
        postmins[n-1] = height[n-1];
        for(int i=1;i<n;i++){
            premins[i] = Math.max(premins[i-1],height[i]);
            postmins[n-i-1] = Math.max(postmins[n-i] , height[n-i-1]);
        }

        int ans = 0;

        for(int i=0;i<n;i++){
            //System.out.println(premins[i] + " " + postmins[i]);
            ans += Math.max((Math.min(premins[i] , postmins[i])) - height[i],0);
        }

        return ans;

    }
}


