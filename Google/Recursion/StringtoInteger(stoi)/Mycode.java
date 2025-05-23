class Solution {
    public int myAtoi(String s) {

        s = s.trim();
        int i=0,result=0;
        if(s.isEmpty()) return 0;

        int sign = 1;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if(s.charAt(i) == '+') i++;

        while(i<s.length() && Character.isDigit(s.charAt(i))){
           
           int digit = s.charAt(i) - '0';

           if(result > ((Integer.MAX_VALUE - digit)/10)) {
               return sign==-1? Integer.MIN_VALUE : Integer.MAX_VALUE;
           }

           result = (result*10) + digit; i++;
           
        } 

        return (result*sign);
        
    }
}
