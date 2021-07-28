public class Solution {
    public ArrayList<String> prettyJSON(String A) {
          StringBuffer sb=new StringBuffer();

        char arr[] = A.toCharArray();

        int openBrace =0, closedBrace=0;

        ArrayList<String> ans=new ArrayList<>();

        for(char ch: arr) {
            if(ch=='{' || ch=='['){
                
                if(sb.length()!=0){
                    ans.add(String.join("",Collections.nCopies(openBrace - closedBrace, "\t"))+sb.toString());
                }
                
                ans.add(String.join("",Collections.nCopies(openBrace - closedBrace, "\t"))+Character.toString(ch));
                openBrace++;
                sb.setLength(0);
                //continue;
            }
            
            else if(ch==',') {
                
                
                if(sb.length()!=0) {
                    ans.add(String.join("",Collections.nCopies(openBrace - closedBrace, "\t"))+sb.toString()+",");
                    sb.setLength(0);
                } else {
                    String l = ans.get(ans.size()-1);
                    if(l.charAt(l.length()-1) == '}' || l.charAt(l.length()-1) == ']'){
                        ans.set(ans.size()-1,l+",");    
                    }
                }
            }
                
            else if(ch=='}' || ch==']') {
                
                if(sb.length()!=0){
                    ans.add(String.join("",Collections.nCopies(openBrace - closedBrace, "\t"))+sb.toString());
                }
                closedBrace++;
                ans.add(String.join("",Collections.nCopies(openBrace - closedBrace, "\t"))+Character.toString(ch));
                sb.setLength(0);
            }
            
            else {
                //if(sb.length() == 0) sb.append(Collections.nCopies(openBrace - closedBrace, "\t"));
                sb.append(ch);
            }
        }

        return ans;
    }
}
