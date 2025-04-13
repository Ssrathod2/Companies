class Solution {
    public double rec(double x,int n){
        if(n==0) return 1;

        if(n%2 != 0) return x * rec(x*x , n/2);
        else return rec(x*x , n/2);
    }
    public double myPow(double x, int n) {
        if(n<0) x = 1/x;
        return rec(x,n);
    }
}
