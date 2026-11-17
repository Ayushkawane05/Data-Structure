class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);

        }
        List<Integer> li = new ArrayList<>();

        for (int i : map.keySet()) {
            if (map.get(i) > (nums.length / 3))
                li.add(i);
        }
        return li;

    }
}