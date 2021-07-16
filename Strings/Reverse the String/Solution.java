public class Solution {
    public String solve(String A) {
        
        StringBuffer sb = new StringBuffer(), ans = new StringBuffer();
        
        for(int i=0;i<A.length();i++) {
            char ch = A.charAt(i);
            if(ch!=' ') sb.append(ch);

            if(ch == ' ' || i==A.length()-1) {
                
                if(sb.length()!=0) {
                    
                    ans.insert(0," "+sb.toString());
                    sb.delete(0, sb.length());
                }
            } 
        }
        
        return ans.toString().trim();
        




        // another Solution

        // String[] words = a.split(" ");
	    // StringBuilder stringBuilder = new StringBuilder();
	    // for(int i = words.length - 1; i >= 0; i--) {
	    //     stringBuilder.append(words[i].trim());
	        
	    //     if(i != 0) {
	    //         stringBuilder.append(" ");
	    //     }
	    // }
	    // return stringBuilder.toString();
    }
}
