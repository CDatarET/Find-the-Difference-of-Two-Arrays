class Solution:
    def findDifference(self, nums1, nums2):
        s1 = set(nums1)
        s2 = set(nums2)
        ans = []

        c = []
        for n in s1:
            if n not in s2:
                c.append(n)
        ans.append(c)

        c = []
        for n in s2:
            if n not in s1:
                c.append(n)
        ans.append(c)

        return(ans)
