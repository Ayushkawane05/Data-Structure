class Solution {
    public int minMoves(int[] nums) {
        int i = nums.length - 1;
        int asn = 0;
        Arrays.sort(nums);
        while (i >= 0) {
            asn += nums[nums.length - 1] - nums[i];
            i--;
        }
        return asn;
    }
}