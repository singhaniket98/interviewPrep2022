class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int len = numbers.length-1;
        for(int i = 0; i < len; i++) {
            int sum = numbers[start] + numbers[end];
            if(sum == target) 
                return new int[]{start+1,end+1};
            else if(sum > target)
                end--;
            else 
                start++;
        }

        return new int[0];
    }
}