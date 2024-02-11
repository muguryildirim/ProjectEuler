class Solution {
    public static boolean isPalindrome(String s) {
        //* String Manipulation */
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

class Solution {
    public static boolean isPalindrome(String s) {
        /** Best Answer for Runtime and Memory */
        int left = 0, right = s.length() - 1;
        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } 
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } 
            if(left < right && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
