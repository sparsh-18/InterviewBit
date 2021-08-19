public class Solution {
    public int colorful(int A) {
        HashSet<Integer> h = new HashSet<>();

        int l=0, c=0 ,t=A;
        

        while(t!=0) {
            l++;
            t/=10;
        }

        int ar[] = new int[l];

        t=A;
        
        while(t!=0) {
            ar[c++] = t%10;
            t/=10;
        }


        for(int i=0; i<ar.length; i++) {
            int p=1;
            for(int j=i;j<ar.length;j++) {
                p*=ar[j];

                if(h.contains(p)) return 0;
                else h.add(p);
            }
        }

        return 1;
    }
}
