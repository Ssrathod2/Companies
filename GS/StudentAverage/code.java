import java.util.*;

public class Problem{

    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
 
       int r = in.nextInt();
       in.nextLine();
        
       String[][] data = new String[r][2];
        
       for(int i=0;i<r;i++){
           System.out.print("Enter Name : ");
           String name = in.nextLine();

           System.out.print("Enter Marks : "); 
           String marks = in.nextLine();

           data[i][0] = name;
           data[i][1] = marks;
           System.out.println("");
       }
 
       System.out.println("Highest Average : "+ calcAverage(data));
 
       
       
        
    }
 
    public static int calcAverage(String[][] arr){
        
        Map<String,List<Integer>> mp = new HashMap<>();
        
        
        for(int i=0;i<arr.length;i++){
            List<Integer> marks = mp.getOrDefault(arr[i][0],null);
            
            if(marks==null){
                List<Integer> currMarks = new ArrayList<>();
                
                currMarks.add(Integer.valueOf(arr[i][1]));
                mp.put(arr[i][0],currMarks);
            }else{
                marks.add(Integer.valueOf(arr[i][1]));
                mp.put(arr[i][0],marks);
            }
        }
 
        int ans = Integer.MIN_VALUE;
         
 
        
        for(Map.Entry<String,List<Integer>> entry : mp.entrySet()){
            List<Integer> temp = entry.getValue();
            int tempavg = calcAvg(temp);
            
            ans = Math.max(ans,tempavg);
        }
        
        return ans;
    }
 
        public static int calcAvg(List<Integer> vals){
            int sum = 0;
            int len = vals.size();
            for(int val:vals){
                sum += val;
            }
            float ans = sum/len;
            return (int) Math.floor(ans);
        }
 
 }
