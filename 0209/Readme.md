# Feb 09

## Problem 1. 
An array A of length n is said to be cyclically sorted if the smallest element in the array is at index i, and the sequence {A[i], A[i+1], ..., A[n−1], A[0], A[1], ..., A[i−1]} is sorted in increasing order. An example is 

378  478  550  631  103  203  220  234  279  368
A[0] A[1] A[2] A[3] A[4] A[5] A[6] A[7] A[8] A[9]

Design an O(log n) algorithm for finding the position of the smallest element in a cyclically sorted array. Assume all elements are distinct. For example, for the array illustrated above, your algorithm should return 4.
