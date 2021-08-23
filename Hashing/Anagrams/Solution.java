public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
    HashMap<HashMap<Integer, Integer>, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0;i<A.size();i++) {
            String s = A.get(i);

            //Integer[] chc = new Integer[26];
            HashMap<Integer, Integer> hs = new HashMap<>();

            for(int k=0; k<s.length(); k++) {
                char ch = s.charAt(k);
                Integer in = (int)(ch - 'a');
               // if(chc[in] == null) chc[in] = 1;
                //else chc[in] += 1;
                if(hs.containsKey(in)){
                    Integer key = hs.get(in);
                    hs.put(in, key+1);
                } else {
                    hs.put(in, 1);
                }
            }

            if(map.containsKey(hs)) {
                map.get(hs).add(i+1);
            } else {
                ArrayList<Integer> a = new ArrayList<>();
                a.add(i+1);
                map.put(hs, a);
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(ArrayList<Integer> ar : map.values()) {
            ans.add(ar);
        }

        return ans;
    }
}
