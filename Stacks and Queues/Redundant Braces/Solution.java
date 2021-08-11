public class Solution {
    public int braces(String A) {
        Stack<Character> s = new Stack<>();

        char ar[] = A.toCharArray();

        int flag = 1;

        for(char ch: ar) {
            if(ch == '(' || ch== '+' || ch=='-' || ch=='*' || ch=='/') {
                s.push(ch);
            }

            else if(ch == ')') {
                flag=1;
                char t = s.peek();
                s.pop();

                while(t!='(') {
                    if(t== '+' || t=='-' || t=='*' || t=='/')
                        flag=0;
                    t=s.peek();
                    s.pop();
                }

                if(flag == 1) return flag;
            }
         } 

         return 0;
    }
}
