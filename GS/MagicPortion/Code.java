class MagicPotion {
    private static int minimalSteps(String ing) {
       StringBuilder ings = new StringBuilder(ing);
       int n = ings.length(),ans=0;
        
       for(int i=n-1;i>=0;i--){
           if(i%2 == 0){
               ans++;
           }else if(ings.substring(0,i/2+1).equals(ings.substring(i/2+1,i+1))){
               ans++;
               i = i/2 + 1;
           }else ans++;
       }

       return ans;

    }

    public static void main(String[] args) {
        if (minimalSteps("ABABCABABCE") == 6
                && minimalSteps("ABCDABCE") == 8
                && minimalSteps("ABCABCE") == 5
                && minimalSteps("AAA") == 3
                && minimalSteps("AAAA") == 3
                && minimalSteps("BBB") == 3
                && minimalSteps("AAAAAA") == 4) {
            System.out.println();
            System.out.println("Pass");
        } else {
            System.out.println();
            System.out.println("Fail");
        }
    }
}
