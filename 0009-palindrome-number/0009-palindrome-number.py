class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x>=0:
            y=x
            if y==int(str(x)[::-1]):
                return True
            return False
        else:
            return False