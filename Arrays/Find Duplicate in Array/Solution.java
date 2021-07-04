public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        HashMap<Integer, Integer> hp = new HashMap<>();

        for (int e: A) {
            if(hp.containsKey(e)){
                return e;
            }
            hp.put(e,1);
        }
        return -1;
    }
}
