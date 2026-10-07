# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        
        def check(root, low, high):
            if root == None:
                return True
            
            if root.val <= low or root.val >= high:
                return False
            
            return check(root.right, root.val, high) and check(root.left, low, root.val)
        
        return check(root, float('-inf'), float('inf'))

        