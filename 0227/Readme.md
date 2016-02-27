# Feb 27

## Problem 1. Search in two sorted arrays
The k-th smallest element in a sorted array A is simply A[k − 1] which takes O(1) time to compute. Suppose you are given two sorted arrays A and B, of length n and m respectively, and you need to find the k-th smallest element of the array C consisting of the n + m elements of A and B arranged in sorted order. We'll refer to this array as the union of A and B, although strictly speaking union is a set-theoretic operation that does not have a notion of order, or duplicate elements.

You could merge the two arrays into a third sorted array and then look for the answer, but the merge would take O(n + m) time. You can build the merged array on the first k elements, which would be an O(k) operation.

You are given two sorted arrays A and B of lengths m and n, respectively, and a positive integer k ∈ [1, m + n]. Design an algorithm that runs in O(log k) time for computing the k-th smallest element in array formed by merging A and B. Array elements may be duplicated within and between A and B.
