import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Set to keep track of numbers we have seen
        HashSet<Integer> seen = new HashSet<>();
        
        // Go through each number in the array
        for (int n : nums) {
            // If we have already seen this number, it's a duplicate
            if (seen.contains(n)) {
                return true;
            }
            // Otherwise, remember this number
            seen.add(n);
        }
        
        // If we reach here, all numbers are unique
        return false;
    }
}