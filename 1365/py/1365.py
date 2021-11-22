import copy


class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        nums_s = copy.copy(nums)
        nums_s.sort()
        hmap = {}
        k = 0
        list = []

        for number in nums_s:
            print(str(k) + " " + str(number))
            if not hmap.has_key(number):
                hmap[number] = k

            k += 1
        print(nums)
        for i in nums:
            list.append(hmap[i])

        return list
