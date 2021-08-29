public class Solution {
    public String solve(String A, int B) {
            Res r = new Res();
            r.max = A;
            findMaximumNum(A,B, r);
            return r.max;
    }

       public static void findMaximumNum(String str, int k, Res r)
        {
               char ar[] = str.toCharArray();
               
               if(k==0) return;
       
               for(int i=0; i< ar.length-1; i++) {
                   
                   for(int j=i+1; j<ar.length; j++) {
                       if(ar[j] > ar[i]) {
                           swap(ar, i ,j);
                           
                           String st = String.valueOf(ar);
                           
                           if(r.max.compareTo(st) < 0) r.max = st;
                           
                           findMaximumNum(st, k-1, r);
                           
                           swap(ar,i,j);
                       }
                   }
               }
               
        }

    public static void swap(char ar[], int i , int j) {
            char t=ar[i];
            ar[i]=ar[j];
            ar[j] =t;
    }

    class Res {
        String max;
    }
}
