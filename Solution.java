class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int n : nums1){
            s1.add(n);
        }

        for(int n : nums2){
            s2.add(n);
        }

        Set<Integer> a = new HashSet<>(s1);
        a.removeAll(s2);

        Set<Integer> b = new HashSet<>(s2);
        b.removeAll(s1);

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(a));
        ans.add(new ArrayList<>(b));

        return(ans);
    }
}
