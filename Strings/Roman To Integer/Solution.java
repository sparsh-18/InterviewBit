public class Solution {
    public int romanToInt(String A) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans=0;

        for(int i = 0; i<A.length(); i++) {
            if(i<A.length()-1 && map.get(A.charAt(i+1)) > map.get(A.charAt(i))) {
                int diff = map.get(A.charAt(i+1)) - map.get(A.charAt(i));
                ans+=diff;
                i++;
            }
            else {
                ans += map.get(A.charAt(i));
            }
        }
        return ans;
    }
}
