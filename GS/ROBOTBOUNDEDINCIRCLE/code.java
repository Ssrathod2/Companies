class Solution {
    public boolean isRobotBounded(String inst) {

        int [][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int s = 0, x = 0, y = 0;

        for(int i=0;i<inst.length();i++){
            if(inst.charAt(i) == 'L'){
                s = (s+3) % 4;
            }else if(inst.charAt(i) == 'R'){
                s = (s+1) % 4;
            }else{
                x = x + dir[s][0];
                y = y + dir[s][1];
            }
        }

        return x == 0 && y==0 || s!= 0;
        
    }
}