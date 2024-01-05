[Link : https://leetcode.com/problems/linked-list-cycle/?envType=study-plan-v2&envId=top-interview-150](https://leetcode.com/problems/linked-list-cycle/?envType=study-plan-v2&envId=top-interview-150)

Linked List Cycle

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.


Example 1:
![image](https://github.com/Viv0508/100-days-of-code/assets/95094911/bddd8da7-6dbd-43e9-8db2-aeb115883e82)


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
