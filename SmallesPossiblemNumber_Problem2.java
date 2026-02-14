/*Given string num representing a non-negative integer num, and an
integer k, return the smallest possible integer after removing k digits from
num.

Example 1:
Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219
which is the smallest.

Example 2:
Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the
output must not contain leading zeroes.
*/
//using array and Stack


//CODE:
class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        char[] stack = new char[n];  // acts as stack
        int top = 0;  // stack pointer

        for (int i = 0; i < n; i++) {
            char digit = num.charAt(i);

            // Remove larger digits from stack
            while (top > 0 && k > 0 && stack[top - 1] > digit) {
                top--;
                k--;
            }

            stack[top++] = digit; // push
        }

        // If k still remains, remove from end
        top -= k;

        // Remove leading zeros
        int start = 0;
        while (start < top && stack[start] == '0') {
            start++;
        }

        // If all digits removed
        if (start == top) {
            return "0";
        }

        return new String(stack, start, top - start);
    }
}
