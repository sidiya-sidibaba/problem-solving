import length_of_the_longest_substring.SlidingWindow;
import length_of_the_longest_substring.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("longest sub string: " + solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println("max sub array: " + SlidingWindow.maxSumSubArray(new int[]{8,3,-2,4,5,-1,0,5,3,9,-6}, (short) 5));
    }
}