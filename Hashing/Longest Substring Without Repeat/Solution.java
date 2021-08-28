public class Solution {
    public int lengthOfLongestSubstring(String A) {
        char[] ar = A.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0,j=0,max=0;

        while(j < A.length() && i < A.length()) {
            if(!map.containsKey(ar[j])) {
                map.put(ar[j],j);
                j++;
            } else {
                max=Math.max(max,j-i);
                map.remove(ar[i]);
                i++;
            }
        }
        max=Math.max(max,j-i);;
        return max;
    }
}
