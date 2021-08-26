public class Solution {
    public String fractionToDecimal(int A, int B) {
        
        boolean neg=false;

        long a=(long)A, b= (long)B;

        if(a>0&&b<0 || a<0&&b>0) neg = true;

        a=Math.abs(a);
        b=Math.abs(b);
        
        long q=a/b;
        StringBuffer ans=new StringBuffer(),res=new StringBuffer();

        HashMap<Long,Integer> map = new HashMap<>();

        long rem = a%b;

        while(rem != 0){
            if(!map.containsKey(rem)){
                map.put(rem, res.length());

                rem*=10;

                long p = rem/b;
                res.append(p);

                rem=rem%B;

            } else {
                break;
            }
        }

        if(rem==0){
            ans.append(q);
            if(res.length()!=0) {
                ans.append(".");
                ans.append(res);
            }
        } else {
            String nonrep = res.substring(0, map.get(rem));
            String rep = res.substring(map.get(rem));

            //ans = String.valueOf(q)+"."+nonrep+"("+rep+")";
            ans.append(q);
            ans.append(".");
            ans.append(nonrep);
            ans.append("(");
            ans.append(rep);
            ans.append(")");
        }
        
        String ans2="";

        if(neg) ans2="-";

        ans2 += ans.toString();

        return ans2;
    }
}
