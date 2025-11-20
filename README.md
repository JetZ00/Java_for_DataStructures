# Java Library for Data Structures (University of Málaga)

This library contains a comprehensive implementation of fundamental data structures used in the **Data Structures** course at the University of Málaga. It serves as a reference implementation for students and educators.

## 📦 Library Contents

The library is organized into packages corresponding to different Abstract Data Types (ADTs) and their specific implementations.

### 1. Linear Structures
Fundamental collections for storing elements in a sequential order.

* **Stack** (`org.uma.ed.datastructures.stack`)
    * `ArrayStack`: LIFO structure implemented using a dynamic array.
    * `LinkedStack`: LIFO structure implemented using linked nodes.
* **Queue** (`org.uma.ed.datastructures.queue`)
    * `ArrayQueue`: FIFO structure implemented using a circular array.
    * `LinkedQueue`: FIFO structure implemented using linked nodes with head/tail pointers.
* **List** (`org.uma.ed.datastructures.list`)
    * `ArrayList`: List implementation optimized for random access.
    * `LinkedList`: List implementation optimized for insertions and deletions.

### 2. Sets and Bags
Collections that focus on element uniqueness or occurrence counting.

* **Set** (`org.uma.ed.datastructures.set`)
    * `AVLSet`: High-performance sorted set based on AVL trees.
    * `SortedArraySet` & `SortedLinkedSet`: Basic sorted set implementations.
* **Bag** (`org.uma.ed.datastructures.bag`)
    * `SortedLinkedBag`: A collection that allows and counts duplicate elements.

### 3. Dictionaries and Maps
Key-Value stores for efficient data retrieval.

* **Dictionary** (`org.uma.ed.datastructures.dictionary`)
    * `AVLDictionary`: An optimized dictionary implementation based on balanced AVL trees.
    * `SortedLinkedDictionary`: A simpler dictionary implementation based on sorted linked lists.

### 4. Trees and Heaps
Hierarchical structures and priority-based collections.

* **Trees** (`org.uma.ed.datastructures.tree` / `searchtree`)
    * `BinaryTree`: Generic binary tree structure.
    * `BST` (Binary Search Tree): Standard sorted tree implementation.
    * `AVL`: Self-balancing binary search tree.
* **Heaps** (`org.uma.ed.datastructures.heap`)
    * `BinaryHeap`: Classic binary heap implementation.
    * `MaxiphobicHeap`: Efficient mergeable heap variant.
    * `WBLeftistHeap`: Weight-Biased Leftist Heap.
* **Priority Queue** (`org.uma.ed.datastructures.priorityqueue`)
    * `LinkedPriorityQueue`: Basic priority queue.
    * `MaxiphobicHeapPriorityQueue`: High-performance priority queue based on maxiphobic heaps.

### 5. Utilities
Helper classes and common tools used across the library.

* **Utils**: `Equals`, `HashCode`, and `ToString` generators.
* **Types**: `Tuple2`, `Tuple3` for compound values, and `Either` for functional error handling.
* **Range**: Integer range generator.

---

#### 🛠️ Requirements
* Requires **JDK 22** (SDK default) or higher.