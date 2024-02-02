[Link : https://leetcode.com/problems/surrounded-regions/description/?envType=study-plan-v2&envId=top-interview-150](https://leetcode.com/problems/surrounded-regions/description/?envType=study-plan-v2&envId=top-interview-150)

Surrounded Regions

Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

 

Example 1:

![image](https://github.com/Viv0508/100-days-of-code/assets/95094911/9bd9d4f9-2b58-46ea-bdb2-efc26b589d32)

Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]

Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]

Explanation: Notice that an 'O' should not be flipped if:
- It is on the border, or
- It is adjacent to an 'O' that should not be flipped.
The bottom 'O' is on the border, so it is not flipped.
The other three 'O' form a surrounded region, so they are flipped.
