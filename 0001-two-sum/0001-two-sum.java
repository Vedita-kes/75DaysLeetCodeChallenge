import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> storedNumbers = new HashMap<>();

        for (int position = 0; position < numbers.length; position++) {

            int currentValue = numbers[position];
            int valueNeeded = target - currentValue;

            if (storedNumbers.containsKey(valueNeeded)) {
                return new int[] {storedNumbers.get(valueNeeded), position};
            }

            storedNumbers.put(currentValue, position);
        }

        return new int[] {};
    }
}