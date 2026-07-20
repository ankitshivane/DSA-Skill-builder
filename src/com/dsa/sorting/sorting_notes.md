# Sorting Algorithm Learning Roadmap

The ideal order to learn sorting algorithms goes from **simplest brute-force methods to advanced divide-and-conquer and non-comparison approaches**.

Following this structured path ensures you master basic loops before tackling complex programming concepts like recursion and tree structures.

## Phase 1: The Basics (Quadratic Time: O(n²))
Start here to build your intuition for looping, indices, and swapping elements.

*   **Bubble Sort**: The most intuitive sort. It repeatedly compares adjacent elements and swaps them if they are in the wrong order.
*   **Selection Sort**: Teaches you how to find a minimum value. It loops through the array, picks the smallest element, and places it at the front.
*   **Insertion Sort**: Works exactly like sorting a hand of playing cards. It picks one element at a time and shifts other values to insert it into its correct position.

## Phase 2: Efficient Sorting (Logarithmic Time: O(n log n))
Learn these next to transition into advanced algorithmic paradigms like recursion and tree manipulation.

*   **Merge Sort**: Introduces the "Divide and Conquer" strategy. It recursively splits arrays in half, sorts the smaller pieces, and merges them back together.
*   **Quick Sort**: The most practically used comparison sort. It selects a "pivot" element and partitions the other elements into smaller or greater groups.
*   **Heap Sort**: Connects sorting to advanced data structures. It visualizes the array as a binary tree (a max/min heap) to sort data efficiently.

## Phase 3: Non-Comparison Sorting (Linear Time: O(n))
Study these specialized algorithms that break the mathematical limits of standard sorting by using object characteristics instead of direct value comparisons.

*   **Counting Sort**: Sorts data by counting the frequency of each unique key in a restricted range.
*   **Radix Sort**: Performs multi-pass sorting from the least-significant digit to the most-significant digit.
*   **Bucket Sort**: Distributes elements into various mathematical "buckets" and then sorts those individual buckets separately.

## Overview Table

| Sorting Algorithm | Best Time Complexity | Average Time Complexity | Worst Space Complexity | Recommended Prerequisites |
| :--- | :--- | :--- | :--- | :--- |
| **Bubble Sort** | O(n) | O(n²) | O(1) | Basic For-Loops |
| **Selection Sort** | O(n²) | O(n²) | O(1) | Finding Min/Max Values |
| **Insertion Sort** | O(n) | O(n²) | O(1) | Array Traversals |
| **Merge Sort** | O(n log n) | O(n log n) | O(n) | Basic Recursion |
| **Quick Sort** | O(n log n) | O(n log n) | O(log n) | Recursion & Two-Pointers |
| **Heap Sort** | O(n log n) | O(n log n) | O(1) | Binary Trees / Heaps |
| **Counting Sort** | O(n + k) | O(n + k) | O(k) | Hash Maps / Frequencies |
