Question: Given an array of integers <nums> and an integer <target>, return indicies of teh two nummbers such that they add up to <target>.

You may assume that each input would have exactly one solution, and you may use the same element twice. You can return the answer in any order

Follow-up: can you come up with an algoithm that is less than O(n^2) time complexity?

Thoughts

I can try a bruteforce solution where I pick the element with the first index and add it up with all other elements and see if it is equal to target... 
.
We are starting from the first index so we hold the first value of the array and add it to all other values of the array and compare if any of these are = target
.
Variables:
	- nums: an array
	- target: result of the sum
	- 
Loop: to go through the entire array
if statements to check if it is equal to target


