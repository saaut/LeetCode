class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result= new ArrayList<>();
        Stack<Character> stack=new Stack<>();
        generateParenthesisHelper(0,0,n,stack,result);
            return result;
        }
        static public void generateParenthesisHelper(int opening,int closing,int n, Stack<Character> stack,List<String> result){
            if (opening == n && closing == n) {
                StringBuilder sb = new StringBuilder();
                for (char c : stack) {
                    sb.append(c);
                }
                result.add(sb.toString());
                return;
            }

            if (opening < n) {
                stack.push('(');
                generateParenthesisHelper(opening + 1, closing, n, stack, result);
                stack.pop();
            }

            if (closing < opening) {
                stack.push(')');
                generateParenthesisHelper(opening, closing + 1, n, stack, result);
                stack.pop();
            }
        }
}