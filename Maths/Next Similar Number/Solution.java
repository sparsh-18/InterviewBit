public class Solution {
    public String solve(String A) {
        char ar[] = A.toCharArray();

        int i = 0;
        while(i<ar.length-1) {
            if(ar[i] < ar[i+1]) break;
            i++;
        }

        if(i == ar.length-1) return "-1";

        else {
            boolean f = false;
            int indexOfSmall = -1;
            for(i=ar.length-1;i>0;i--) {
                if(ar[i-1] < ar[i]) {
                    indexOfSmall = i-1;
                    f=true;
                    break;
                }
            }

            if(f) {
                for(i=ar.length-1;i>=0;i--) {
                    if(ar[i] > ar[indexOfSmall]) {
                        char t =ar[i];
                        ar[i] = ar[indexOfSmall];
                        ar[indexOfSmall] = t;

                        reverse(ar, indexOfSmall+1, ar.length-1);

                        return String.valueOf(ar);
                    }
                }
            }
            return "-1";
        }
    }

    public void reverse(char ar[], int k, int l) {
       // int c = 1;
        while(k<l) {
            char t = ar[k];
            ar[k] = ar[l];
            ar[l] = t;

            k++;
            l--;
        }
    } 
}
