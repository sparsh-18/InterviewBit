public class Solution {
    public int solve(String A) {
        StringBuilder sb= new StringBuilder();
        sb.append(A);
        StringBuilder rev= new StringBuilder(A);
        sb.append("$");
        sb.append(rev.reverse());
        
        int lps[] = new int[sb.length()];
        calcLPS(sb, lps);
        
        // System.out.println(sb.toString()+"\n"+rev.toString());
        // for(int i:lps) System.out.print(i+" ");
        // System.out.println("\n\n");
        return A.length() - lps[sb.length()-1];
    }
    
    public void calcLPS(StringBuilder s, int ar[]) {
        int i=1;
        int len=0;
        ar[0]=0;
        
        while(i<s.length()){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                ar[i]=len;
                i++;
            }
            
            else if(s.charAt(i) != s.charAt(len)) {
                if(len>0)
                    len=ar[len-1];
                else 
                    ar[i++]=len;
            }
            
        }
    }
}
