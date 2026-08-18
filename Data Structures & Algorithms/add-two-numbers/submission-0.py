# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        lis1 = []
        lis2 = []
        lis3 = []
        def arrayToLinkedList(arr):
            dummy = ListNode(0)
            curr = dummy

            for x in arr:
                curr.next = ListNode(x)
                curr = curr.next

            return dummy.next
        
        while l1 != None:
            lis1.append(l1.val)
            l1 = l1.next
        while l2 != None:
            lis2.append(l2.val)
            l2 = l2.next
        res1 = 0
        res2 = 0
        for i in range(len(lis1)):
            res1 = 10 * res1 + lis1[len(lis1) - i - 1]
        for i in range(len(lis2)):
            res2 = 10 * res2 + lis2[len(lis2) - i - 1]
        res3 = res1 + res2
        for i in range(len(str(res3)) - 1 , -1, -1):
            lis3.append(int(str(res3)[i]))
        res = arrayToLinkedList(lis3)
        return res




        