package xyz.superdev.practice.algorithm;

/**
 * <h3><a href="https://leetcode.com/problems/palindrome-number/">"Palindrome Number"</a></h1>
 * <p>· 문제: 숫자 x를 앞으로 뒤로 읽어도 똑같이 읽히는 PalindromeNumber인지 여부를 반환</p>
 * <p>· 조건</p>
 * <ol>
 *   <li>-2의 31승 <= x <= (2의 31승 - 1)</li>
 * </ol>
 */
public class PalindromeNumber {

    public boolean solve(final int x) {
        if (x < 0) {
            return false;
        }

        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            boolean isMiddleIndex = i == str.length() / 2;
            if (isMiddleIndex) {
                break;
            }

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

}
