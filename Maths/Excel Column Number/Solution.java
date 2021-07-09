public class Solution {
    public int titleToNumber(String A) {
        StringBuilder sb = new StringBuilder(A);

        int p = 1,res=0;

        for(int i=sb.length()-1;i>=0;i--) {
            int val = sb.charAt(i) - 'A' + 1;
            res+=p*val;
            p*=26;
        }
        return res;
    }
}
