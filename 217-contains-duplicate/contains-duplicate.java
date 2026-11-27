class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dp = new HashSet<>();
        for (int num : nums) {
            if (dp.contains(num))
                return true;
            dp.add(num);
        }
        return false;
    }
}