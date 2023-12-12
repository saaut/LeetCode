class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> parens=new HashMap<>();
        parens.put('(',')');
        parens.put('{', '}');
        parens.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for(Character c:s.toCharArray()){
            if(parens.containsKey(c)) stack.push(c);
            else{
                if(stack.empty()||c!=parens.get(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }
}