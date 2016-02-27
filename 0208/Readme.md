# Feb 08

## Problem 1. Search a sorted array for first occurrence of k

Write a method that takes a sorted array A and a key k and returns the index of the first occurrence of k in A. Return −1 if k does not appear in A. For example, with the following array

-14   -10   2   108  108  243  285  285  285  401 
A[0] A[1] A[2] A[3] A[4] A[5] A[6] A[7] A[8] A[9]

your algorithm should return 3 if k = 108; if k = 285, your algorithm should return 6. Use the provided interface. 

Plan to solve: implement binary search.
Other questions: search a rotated array for first occurance of k.


## Problem 2. Partition into anagrams 

Anagrams are popular word play puzzles, where by rearranging letters of one set of words, you get another set of words. For example, “eleven plus two” is an anagram for “twelve plus one”. Crossword puzzle enthusiasts would like to be able to generate all possible anagrams for a given set of letters. 

Write a function that takes as input a dictionary of English words, and returns a partition of the dictionary into subsets of words that are all anagrams of each other. Use the provided interface.

Plan to solve: first write a isAnagram method (take two Strings as input, parse them into arrays of chars, create another array of length 26 to store the number of each alphabet, iterate the second char array to subtract the number of alpabet, if we have every element in length-26 array be 0, then they are anagrams), then write two for-loops to iterate the dictionary, if any two are anagrams, put them in an ArrayList.
 
