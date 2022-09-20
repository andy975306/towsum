# towsum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

We can use hash map table look back if the current integer's complement already exists in the hash table. If it exists in the hash table we found a solution and return the indices;
