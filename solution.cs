public class Solution {
    public IList<IList<int>> FindDifference(int[] nums1, int[] nums2) {
        HashSet<int> s1 = new HashSet<int>(nums1);
        HashSet<int> s2 = new HashSet<int>(nums2);

        HashSet<int> a = new HashSet<int>(s1);
        a.ExceptWith(s2);

        HashSet<int> b = new HashSet<int>(s2);
        b.ExceptWith(s1);

        IList<IList<int>> ans = new List<IList<int>>();
        ans.Add(a.ToList());
        ans.Add(b.ToList());

        return ans;
    }
}
