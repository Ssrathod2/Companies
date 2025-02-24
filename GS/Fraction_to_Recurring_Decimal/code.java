class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0) return new String("0");
        StringBuilder ans = new StringBuilder();

        if((numerator < 0 && denominator >0) || (numerator > 0 && denominator < 0)) ans.append("-");
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        ans.append(num/den);
        num %= den;

        if(num == 0) return ans.toString();
        ans.append(".");

        HashMap<Long,Integer> mp = new HashMap<>();
        mp.put(num,ans.length());

        while(num != 0){
            num*= 10;
            ans.append(num/den);
            num %= den;

            if(mp.containsKey(num)){
                int idx = mp.get(num);
                ans.insert(idx,"(");
                ans.append(")");
                break;
            }else mp.put(num,ans.length());

        }
        return ans.toString();        
    }
}
