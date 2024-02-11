class Solution {
    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(char c : s.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return s.equals(reversed.toString());
    }
}
