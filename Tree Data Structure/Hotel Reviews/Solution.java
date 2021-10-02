public class Solution {
    TrieNode root;
    public Solution() {
        root=new TrieNode();
    }

    public void insert(String k) {
        TrieNode t=root;
        for(int i=0;i<k.length();i++) {
            char ch=k.charAt(i);
            if(t.children[ch-'a'] == null)
                t.children[ch-'a'] = new TrieNode();
            t=t.children[ch-'a'];
        }
        t.end=true;
    }

    public boolean search(String k) {
        TrieNode t=root;
        for(int i=0;i<k.length();i++) {
            char ch=k.charAt(i);
            if(t.children[ch-'a'] == null)
                return false;
            t=t.children[ch-'a'];
        }
        return t.end;
    }
 
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        String[] gw = A.split("_");
        for(String k: gw) insert(k);

        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<B.size();i++) ans.add(i);
       Comparator c= Collections.reverseOrder(new mycom(B));
       Collections.sort(ans, c);
      // Collections.reverse(ans);

       // ArrayList<Integer> ans=new ArrayList<>();

        // for(String x: B) {
        //     String[] xar = x.split("_");
        //     int xcount=0;

        //     for(String k: xar) {
        //         if(search(k)) xcount++;
        //     }

        //     ans.add(xcount);
        // }

        return ans;
    }

    class mycom implements Comparator<Integer> {
        ArrayList<String> B;
        public mycom(ArrayList<String> B){
            this.B=B;
        }
        public int compare(Integer ix, Integer iy) {
            String x=B.get(ix), y=B.get(iy);
            String[] xar = x.split("_"), yar = y.split("_");
            int xcount=0,ycount=0;

            for(String k: xar) {
                if(search(k)) xcount++;
            }

            for(String k: yar) {
                if(search(k)) ycount++;
            }

            return xcount - ycount;
        }
    }
}


class TrieNode {
    boolean end;
    TrieNode children[];

    public TrieNode() {
        end=false;
        children=new TrieNode[26];
        for(int i=0;i<25;i++) children[i]=null;
    }
}
