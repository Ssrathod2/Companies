class Solution {
    private int mod = 1_000_000_007;
    public long powbin(long x, long n){
        long res = 1;
        while(n > 0){
            if(n%2 == 1) res = (res*x)%mod;
            n = n>>1;
            x = (x*x)%mod;
        }
        return res;
    }
    public long pow(long x, long n){
        if(n==0) return 1;
        
        if(n%2 != 0) return (x * pow((x*x)%mod , n/2))%mod;
        else return pow((x*x)%mod , n/2);
    }
    public int countGoodNumbers(long n) {
        return (int) (powbin(5 , (n+1)/2) * powbin(4 , n/2) % mod);
    }
}
