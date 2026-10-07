# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        def bstTolist(root):
            ls = []
            if root == None:
                return ls
            ls+=bstTolist(root.left)
            ls.append(root.val)
            ls+=bstTolist(root.right)
            return ls
        ls = bstTolist(root)
        ls.sort()
        
        return ls[k-1]
            
        