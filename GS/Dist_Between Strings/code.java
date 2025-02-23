// "static void main" must be defined in a public class.
public class Main {
    public static double calc(String Doc , String word1, String word2){
        int n = Doc.length();
        int p = word1.length();
        int q = word2.length();
        if(word1.length() >= Doc.length()) return -1;
        else if(word2.length() >= Doc.length()) return -1;
        int wd1=-1,wd2=-1;
        
        for(int i=0;i<n-p+1;i++){
            if(Doc.charAt(i) == ' ' && word1.equals(Doc.substring(i+1,Math.min(i+p+1,n)))){ 
              wd1=i+1;
              break;
             }
        }
        if(wd1==-1) return -1;
        for(int i=0;i<n-q+1;i++){
            if(Doc.charAt(i) == ' ' && word2.equals(Doc.substring(i+1,Math.min(i+q+1,n)))){
                wd2=i+1;
                break;
            }
        }
        if(wd2==-1) return -1;
        //System.out.println(wd1+ " " + wd2);
        return (Math.abs((wd1+(double)p/2) - (wd2+(double)q/2)));
    }
    public static void main(String[] args) {
        String document="This is a sample document we just made up";
        
        System.out.println(calc(document,"just", "we" )+ " " + calc(document, "is", "a") + " " + calc(document, "is", "not" ) );
    }
}
