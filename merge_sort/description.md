# Merge Sort

Merge sort works on the principle of _Divide and Conquer_ based on the idea of breaking down a list into several sub-lists until each sublist consists of a single element and merging those sublists in a manner that results into a sorted list.

**Merge Sort Working Rule**

![merge-sort](https://journaldev.nyc3.cdn.digitaloceanspaces.com/2019/07/MergeSort.png)

So, the merge sort working rule involves the following steps:

1. Divide the unsorted array into subarray, each containing a single element.
2. Take adjacent pairs of two single-element array and merge them to form an array of 2 elements.
3. Repeat the process till a single sorted array is obtained.

An array of Size ‘N’ is divided into two parts ‘N/2’ size of each. then those arrays are further divided till we reach a single element. The base case here is reaching one single element. When the base case is hit, we start merging the left part and the right part and we get a sorted array at the end. Merge sort repeatedly breaks down an array into several subarrays until each subarray consists of a single element and merging those subarrays in a manner that results in a sorted array.

<br/>

Reference: [Merge Sort Algorithm - Digital Ocean](https://www.digitalocean.com/community/tutorials/merge-sort-algorithm-java-c-python)
