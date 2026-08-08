# Data Structures & Algorithms — Java

A collection of Java solutions to common data structures and algorithm problems, organized by topic. Covers arrays, strings, linked lists, binary trees, N-ary trees, hash maps, stacks/queues, and matrices.

---

## 📁 Project Structure

```
src/main/java/
├── arrays/        # Array & string manipulation problems
├── binarytree/    # Binary tree algorithms
├── linkedlist/    # Linked list operations
├── maps/          # HashMap & Stack-based problems
├── matrixs/       # Matrix algorithms
├── objects/       # Shared data structure definitions
├── queue/         # Queue-based problems
└── trees/         # N-ary tree algorithms
```

---

## 🔢 Arrays & Strings

| Class | Description |
|---|---|
| `MergeStrings` | Merge two strings by alternating characters |
| `GCDOfStrings` | Find the greatest common divisor of two strings |
| `KidsWithCandies` | Check if a kid can have the greatest number of candies after extras |
| `CanPlaceFlowers` | Check if `n` flowers can be planted without adjacent placement |
| `ReverseVowels` | Reverse only the vowels in a string using two pointers |
| `ReverseWords` | Reverse the order of words in a string |
| `IsSubsequence` | Check if one string is a subsequence of another |
| `ProductExceptSelf` | Return array where each element is product of all others — O(n), no division |
| `IncreasingTriplet` | Determine if an increasing triplet subsequence exists — O(n) |
| `StringCompression` | In-place string compression (e.g., `"aabb"` → `"a2b2"`) |
| `MoveZeros` | Move all zeros to the end while maintaining relative order |
| `PairOfSum` | Two-pointer approach to find a pair that sums to a target |
| `MaxArea` | Container with most water — two pointer approach |
| `MaxOperations` | Maximum number of pair operations where pairs sum to `k` |
| `MaximumAverageSubArrayI` | Find the subarray of length `k` with maximum average (sliding window) |
| `MaxVowels` | Maximum number of vowels in any substring of length `k` (sliding window) |
| `LongestOnes` | Maximum consecutive 1s after flipping at most `k` zeros (sliding window) |
| `PivotIndex` | Find the pivot index where left sum equals right sum |
| `HighestAltitude` | Find the highest altitude reached from a gain array (prefix sum) |
| `TopKFrequentElements` | Find the `k` most frequent elements using a min-heap |
| `SingleNumberII` | Find the element that appears once when all others appear three times |
| `SubsetsII` | Generate all unique subsets from an array with duplicates |
| `TripletSum` | Find all unique triplets that sum to zero |
| `SurroundedRegion` | Capture all regions surrounded by `'X'` on a board using DFS |

---

## 🌲 Binary Tree

| Class | Description |
|---|---|
| `BinaryTree` | Basic binary tree with node insertion |
| `TreeTraversal` | Inorder, preorder, postorder traversals; insert, search, and delete |
| `MaxDepth` | Find the maximum depth (height) of a binary tree |
| `SameTree` | Check if two binary trees are structurally identical with same values |
| `SymmetryTree` | Check if a binary tree is symmetric around its center |
| `InvertBinaryTree` | Invert/mirror a binary tree |
| `PathSum` | Check if any root-to-leaf path sums to a given target |
| `BuildTree` | Build a binary tree from preorder and inorder traversal arrays |
| `BinaryTreeWithInOrderAndPostOrder` | Build a binary tree from inorder and postorder traversal arrays |
| `FlattenBinaryTreeToLinkedList` | Flatten a binary tree into a linked list in-place (preorder) |
| `NextNodePointer` | Populate `next` right-node pointers for each node in a binary tree |

---

## 🔗 Linked List

| Class | Description |
|---|---|
| `ListNode` | Singly linked list node data structure |
| `DeleteMiddleNode` | Delete the middle node of a linked list |
| `OddEvenList` | Group all odd-indexed nodes before even-indexed nodes |
| `ReverseLinkedList` | Reverse a singly linked list |
| `PairSum` | Find the maximum twin sum in an even-length linked list |

---

## 🗺️ Hash Maps & Stacks

| Class | Description |
|---|---|
| `DifferenceInArrays` | Find elements unique to each of two arrays |
| `UniqueOccurrences` | Check if all element occurrence counts are unique |
| `CloseStrings` | Check if two strings are "close" via character swap/transform operations |
| `EqualPairs` | Count equal row-column pairs in a matrix |
| `DecodeString` | Decode nested bracket-encoded strings (e.g., `"3[a2[c]]"` → `"accaccacc"`) |
| `RemoveStars` | Process a string and remove preceding characters when `*` is encountered |
| `AsteroidCollision` | Simulate asteroid collisions using a stack |

---

## 🌳 N-ary Trees

| Class | Description |
|---|---|
| `PreOrderTraversal` | Iterative preorder traversal of an N-ary tree using a stack |
| `PrintGeneralLevelTree` | Level-order (BFS) traversal of an N-ary tree |
| `PrintLeadNodes` | Print all leaf nodes of an N-ary tree using DFS |
| `HeightOfNArrayTree` | Calculate tree height from a parent array representation |
| `DepthOfNArrayTree` | Find the maximum depth of an N-ary tree |
| `NodesGreaterThanX` | Count nodes with a value greater than `x` |
| `NumberOfSpecialNodes` | Count nodes that have all distinct values on the path from root |
| `SumOfOddEvenNodes` | Compute the difference between sums of odd-level and even-level nodes |
| `CountNodesEvenParity` | Count nodes whose value has an even number of set bits |
| `DeleteAllLeafNodes` | Recursively delete all leaf nodes from a tree |
| `AcyclicList` | DFS traversal on an acyclic tree represented as an adjacency list |

---

## 🟦 Queue

| Class | Description |
|---|---|
| `RecentCounter` | Count recent ping requests within a 3000ms sliding window |
| `PredictPartyVictory` | Predict the winning Senate party using queue-based voting simulation |

---

## 🔲 Matrix

| Class | Description |
|---|---|
| `RankTransformMatrix` | Transform a matrix so each element is replaced by its rank, respecting row/column order constraints using Union-Find |

---

## 🧩 Data Structures (objects)

| Class | Description |
|---|---|
| `TreeNode` | Binary tree node definition with `left`, `right`, and `next` pointers |
| `Node` | N-ary tree node definition with a `List<Node>` children field |

---

## 🛠️ Build & Run

This project uses **Maven**. Java 11+ is required.

```bash
# Compile
mvn compile

# Run all tests
mvn test

# Package
mvn package
```

---

## 📊 Summary

| Package | # Problems |
|---|---|
| Arrays & Strings | 24 |
| Binary Tree | 11 |
| N-ary Trees | 11 |
| Hash Maps & Stacks | 7 |
| Linked List | 5 |
| Queue | 2 |
| Matrix | 1 |
| **Total** | **61** |
