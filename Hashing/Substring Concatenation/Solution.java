public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findSubstring(String A, final List<String> B) {
        StringBuffer str = new StringBuffer(A);

        HashMap<String, Integer> map = new HashMap<>();

        for(String i: B) {
            if(!map.containsKey(i)) 
                map.put(i,1);
            else
                map.put(i, map.get(i)+1);
        }

        int lt = B.get(0).length();
        int totalwords = lt*B.size();
        
        ArrayList<Integer> ans = new ArrayList<>();

        // if len(string) = 15 and each letter of list i 3 and 2 letters then 
        // i has to run to 10 as  j < i+ total words i.e. 10+6 = 16 
        // 10,11,12 ,, 13,14,15
        for(int i=0; i<A.length() +1 - totalwords; i++) {
            HashMap<String, Integer> tempMap = (HashMap<String, Integer>)map.clone();

            int count = B.size();

            for(int j=i; j < i+totalwords; j+=lt) {
                String subs = str.substring(j, j+lt);

                if(tempMap.containsKey(subs) && tempMap.get(subs) >0)  { //second condition to check if any word of list appears more thwn once
                    tempMap.put(subs, tempMap.get(subs)-1);
                    count--; //all words of list found
                }
                else 
                    break;
            }

            if(count == 0)
                ans.add(i);
        }

        return ans;
    }
}
