[Link : https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/?envType=study-plan-v2&envId=top-interview-150](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/?envType=study-plan-v2&envId=top-interview-150)

Populating Next Right Pointers in Each Node II

Given a binary tree

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

 

Example 1:
![image](https://github.com/Viv0508/100-days-of-code/assets/95094911/c8b4a849-4892-4aa8-a016-cf5bd618aee9)


Input: root = [1,2,3,4,5,null,7]

Output: [1,#,2,3,#,4,5,7,#]

Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
