public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {

        if(B.length()==0 || A.length()==0) return -1;

        int lps[] = new int[B.length()];
        char str[] = A.toCharArray(), pat[] = B.toCharArray();

        computelps(pat, lps);

        int i=0,j=0;

        while(i < A.length()) {
            if(str[i] == pat[j]) {
                i++;
                j++;
            }

            if(j == B.length()) {
                return i-j;
            }

            else if(i<A.length() && str[i]!=pat[j]) {
                if(j>0) j = lps[j-1];
                else i++;
            }
            
        }
        
        return -1;
    }

    public void computelps(char[] pat, int lps[]) {
        lps[0] = 0;
        int i=1, len = 0;

        while(i<pat.length) {
            if(pat[i] == pat[len]) {
                len++;
                lps[i] = len;
                i++;
            }

            else if(pat[i] != pat[len]) {
                if (len > 0) len = lps[len-1];
                else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}
