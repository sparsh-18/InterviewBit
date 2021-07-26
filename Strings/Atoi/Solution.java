public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int atoi(final String A) {
        String str[] = A.split(" ");
        boolean neg = false;
        int i=0;
        long res=0;

        for(i=0;i<str.length;i++) {
            if(str[i].equals(" ")) continue;
            else break;
        }

        StringBuffer sb = new StringBuffer(str[i]);

        for(int j=0;j<sb.length();j++) {
            char ch = sb.charAt(j);
            
            if(Character.isDigit(ch) || ((ch=='-' || ch=='+')&&j==0)) {
                if(ch == '-' || ch=='+') {
                    neg= ch=='-' ? true : false;
                    continue;
                }

                res=res*10+(int)(ch-'0');
                
                if(!neg && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (neg && -1*res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            } else break;
        }

        return neg ? -1*(int)res : (int)res;
    }
}


// Corner cases:
// -99954Dafv lkkfl = -99954
// +7 = 7
// -45671532469874562146ffssgg = Integer MIN VAL
