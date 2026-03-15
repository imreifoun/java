# Merge two lists into one sorted list.

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

more : https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=problem-list-v2&envId=linked-list

_______________________________________________________

# Time Complexity  : O(n + m) visit every node once

# Space Complexity : O(1) constant memory

# What is n and m

If we have two lists:

list1: 1 → 2 → 4
list2: 1 → 3 → 4

Number of nodes:

n = length of list1 = 3
m = length of list2 = 3

# Why not O(n × m)

Because we do not nest loops.

for each node in list1
    for each node in list2

But our algorithm moves one pointer forward each step,
never going backward.
_______________________________________________________
