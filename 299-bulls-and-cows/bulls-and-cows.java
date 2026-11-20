class Solution {
    public String getHint(String s, String g) {
        int a = 0, b = 0;
        int[] arr = new int[g.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == g.charAt(i)) {
                arr[i] = 1;
                b++;
            } else
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < g.length(); i++) {
            if (arr[i] == 1)
                continue;
            if (map.containsKey(g.charAt(i))) {
                a++;
                map.put(g.charAt(i), map.get(g.charAt(i)) - 1);
                if (map.get(g.charAt(i)) <= 0)
                    map.remove(g.charAt(i));
            }
        }
        String ans = b + "A" + a + "B";
        return ans;
    }
}