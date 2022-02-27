# FIND LARGEST SUM SUBARRAY

## OVERVIEW
You’ll be given an array of (positive and negative) integers with size N . For any pair 1 ≤i ≤
j ≤N it would be possible to add up the values in positions i through j. One of these totals would be the
largest. Your goal is to find the largest possible total in time O(N lg N ) using divide and conquer. Note
that checking all pairs (i, j) is time O(N^2) and will get very few points.

## DETAILS
The input will come from a file called input.txt which will be placed in the same directory as your
java file. The first line of the file will have a single value which will be the value of N . The remainder of the
file will be N integer values seperated by whitespace.
   
You program will read in this file, place the integers in an array (or linked list or ArrayList or ...), and
then use a divide and conquer algorithm to determine the largest possible sum for any subarray (note that
subarrays contain a consecutive subset of the array). For a hint, note the subarray that sums to the maximum
value fulfills one of the following 3 conditions:
1) 1 ≤i ≤j ≤N/2 −1   
2) N/2 + 1 ≤i ≤j ≤N  
3) i ≤N/2 and j ≥N/2  

## SAMPLE EXECUTION
If input.txt contains:   
10   
9 8 7 -100 3 2 4 1 5 -4    
then your program should ouput   
24
because the first 3 entries sum to 24 and no other subarray has a larger value.   

If input.txt contains   
10   
5 7 9 2   
-6   
2  
-4  
10 12 14   
then your program should output  
51  
because the entire array sums to 51 and no other subarray has a larger value.


If input.txt contains   
10  
2 -3  
4 5 6 -2  
8 -5 1 2  
then your program should output  
21  
because summing from 4+5+6-2+8=21.

