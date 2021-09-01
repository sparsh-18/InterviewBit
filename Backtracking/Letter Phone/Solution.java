public class Solution {
    public ArrayList<String> letterCombinations(String A) {
        HashMap<Character, StringBuffer> map = new HashMap<>();
        map.put('0',new StringBuffer("0"));
        map.put('1',new StringBuffer("1"));
        map.put('2',new StringBuffer("abc"));
        map.put('3',new StringBuffer("def"));
        map.put('4',new StringBuffer("ghi"));
        map.put('5',new StringBuffer("jkl"));
        map.put('6',new StringBuffer("mno"));
        map.put('7',new StringBuffer("pqrs"));
        map.put('8',new StringBuffer("tuv"));
        map.put('9',new StringBuffer("wxyz"));
        
        ArrayList<String> ans = new ArrayList<>();

        letterCombinations(ans, A, map, new StringBuffer(), 0);

        return ans;
    }

    public void letterCombinations(ArrayList<String> ans, String A, HashMap<Character, StringBuffer> map, StringBuffer a, int x) {

        if(x>=A.length()) {
            ans.add(String.valueOf(a));
            a = new StringBuffer();
            return;
        }

        StringBuffer letters = map.get(A.charAt(x));

        for(int i=0; i<letters.length(); i++) {
            a.append(letters.charAt(i));
            letterCombinations(ans, A, map, a, x+1);
            a.deleteCharAt(a.length()-1);
        }
    }
}
