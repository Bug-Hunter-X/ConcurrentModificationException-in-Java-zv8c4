# ConcurrentModificationException in Java
This repository contains a Java program that demonstrates a `ConcurrentModificationException` and its solution.

The `ConcurrentModificationException` is a common error that occurs when a thread attempts to modify a collection while another thread is iterating over it using an iterator or for-each loop.  This example showcases the error and provides a corrected version.

## Problem
The original code iterates over a list and attempts to remove an element from the list during iteration. This directly violates the iterator's contract, resulting in a `ConcurrentModificationException`. 

## Solution
The solution uses an iterator to safely remove elements from the list while iterating.  This allows for modification without throwing the exception.  Alternatively, creating a new list and adding elements to avoid modifying the list directly while iterating is another common solution. 