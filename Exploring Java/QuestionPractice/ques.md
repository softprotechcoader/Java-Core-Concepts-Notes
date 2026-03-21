
# Java Practice Questions

## 1. Strings

### 1.1 String Basics

#### Easy Level
1. Write a program to find the length of a string without using the `length()` method.
2. Check if a given string is empty or null.
3. Convert a string to uppercase and lowercase.
4. Compare two strings for equality (case-sensitive and case-insensitive).
5. Extract a substring from index 2 to 5 from a given string.
6. Concatenate two strings without using the `+` operator.
7. Find the character at a specific index in a string.
8. Check if a string starts with a specific prefix.
9. Check if a string ends with a specific suffix.
10. Replace all spaces in a string with underscores.

#### Medium Level
1. Reverse a string using iteration.
2. Check if a string is a palindrome.
3. Count the number of vowels and consonants in a string.
4. Remove all whitespace from a string.
5. Find the first non-repeated character in a string.
6. Count the occurrence of a specific character in a string.
7. Convert the first letter of each word to uppercase.
8. Remove duplicate characters from a string.
9. Check if two strings are anagrams.
10. Find all permutations of a string.

#### Hard Level
1. Implement string compression (e.g., "aaabbcc" → "a3b2c2").
2. Find the longest palindromic substring in a given string.
3. Implement a function to perform string rotation check.
4. Find all substrings of a string that are palindromes.
5. Implement the KMP pattern matching algorithm.
6. Convert a string to its equivalent integer (implement `atoi`).
7. Find the longest common substring between two strings.
8. Generate all possible subsequences of a string.
9. Implement wildcard pattern matching with `*` and `?`.
10. Find the minimum window substring containing all characters of another string.

### 1.2 StringBuilder and StringBuffer

#### Easy Level
1. Create a `StringBuilder` and append multiple strings to it.
2. Insert a string at a specific position using `StringBuilder`.
3. Delete characters from index 2 to 5 in a `StringBuilder`.
4. Reverse a string using `StringBuilder`.
5. Find the capacity of a `StringBuilder`.
6. Replace a substring in `StringBuilder`.
7. Convert `StringBuilder` to `String`.
8. Demonstrate the difference between `String` and `StringBuilder` in concatenation.
9. Create a `StringBuffer` and perform append operations.
10. Compare the performance of `String` vs `StringBuilder` for multiple concatenations.

#### Medium Level
1. Build a comma-separated string from an array using `StringBuilder`.
2. Implement a function to remove all occurrences of a character using `StringBuilder`.
3. Create a method to insert characters at alternate positions.
4. Demonstrate thread-safety difference between `StringBuilder` and `StringBuffer`.
5. Build a formatted string with dynamic values using `StringBuilder`.
6. Implement a function to trim leading and trailing spaces using `StringBuilder`.
7. Create a palindrome checker using `StringBuilder`.
8. Merge two strings alternately using `StringBuilder`.
9. Implement string tokenization using `StringBuilder`.
10. Build an HTML string dynamically using `StringBuilder`.

#### Hard Level
1. Implement a custom string builder class with basic operations.
2. Create a memory-efficient string concatenation utility for large datasets.
3. Implement undo/redo functionality for string operations using `StringBuilder`.
4. Build a text editor buffer simulation using `StringBuilder`.
5. Optimize string building operations for multi-threaded environments.
6. Implement a string diff algorithm using `StringBuilder`.
7. Create a template engine that replaces placeholders using `StringBuilder`.
8. Build a CSV generator with escape character handling.
9. Implement a string obfuscator using `StringBuilder`.
10. Create a performance benchmarking suite for string operations.

## 2. Collections

### 2.1 List (ArrayList, LinkedList, Vector)

#### Easy Level
1. Create an `ArrayList` and add 10 integers to it.
2. Remove an element at a specific index from an `ArrayList`.
3. Check if an `ArrayList` contains a specific element.
4. Find the size of a `LinkedList`.
5. Iterate through an `ArrayList` using a for-each loop.
6. Sort an `ArrayList` of integers in ascending order.
7. Create a `LinkedList` and add elements at the beginning and end.
8. Convert an array to an `ArrayList`.
9. Clear all elements from an `ArrayList`.
10. Get the first and last element from a `LinkedList`.

#### Medium Level
1. Remove all duplicate elements from an `ArrayList`.
2. Find the second largest element in an `ArrayList`.
3. Merge two `ArrayList` objects.
4. Reverse an `ArrayList` without using built-in methods.
5. Implement a custom sorting comparator for a list of objects.
6. Find common elements between two lists.
7. Partition a list into sublists of specific size.
8. Remove all elements from a list that satisfy a condition.
9. Implement a circular linked list using `LinkedList`.
10. Find the intersection of two lists.

#### Hard Level
1. Implement a thread-safe list wrapper.
2. Create a custom `ArrayList` implementation with auto-shrinking.
3. Implement LRU cache using `LinkedList` and `HashMap`.
4. Find the longest increasing subsequence in a list.
5. Implement a skip list data structure.
6. Solve the "Sliding Window Maximum" problem using lists.
7. Implement a multi-level nested list flattening algorithm.
8. Create a time-series data structure using lists.
9. Implement a custom iterator with filtering capabilities.
10. Build a memory-efficient list for storing billions of integers.

### 2.2 Set (HashSet, LinkedHashSet, TreeSet)

#### Easy Level
1. Create a `HashSet` and add elements to it.
2. Check if a `HashSet` contains a specific element.
3. Remove an element from a `TreeSet`.
4. Find the size of a `LinkedHashSet`.
5. Iterate through a `HashSet` and print all elements.
6. Convert a list to a set to remove duplicates.
7. Check if two sets are equal.
8. Find the first and last elements in a `TreeSet`.
9. Create a `TreeSet` with custom sorting order.
10. Clear all elements from a `HashSet`.

#### Medium Level
1. Find the union of two sets.
2. Find the intersection of two sets.
3. Find the difference between two sets.
4. Check if one set is a subset of another.
5. Remove all even numbers from a `TreeSet`.
6. Find duplicate elements in a list using `HashSet`.
7. Implement a method to find symmetric difference between sets.
8. Maintain insertion order while removing duplicates using `LinkedHashSet`.
9. Create a case-insensitive set for strings.
10. Find all unique characters in a string using `HashSet`.

#### Hard Level
1. Implement a custom `HashSet` with collision handling.
2. Create a multi-set (bag) data structure.
3. Implement a disjoint-set (union-find) data structure.
4. Solve the "Longest Consecutive Sequence" problem using sets.
5. Implement a Bloom filter for efficient membership testing.
6. Create a concurrent set with lock-free operations.
7. Implement set operations with lazy evaluation.
8. Build a fuzzy set for approximate matching.
9. Implement a sorted set with range query support.
10. Create a persistent set data structure (immutable with efficient updates).

### 2.3 Map (HashMap, LinkedHashMap, TreeMap)

#### Easy Level
1. Create a `HashMap` and add key-value pairs.
2. Retrieve a value from a `HashMap` using a key.
3. Check if a `HashMap` contains a specific key.
4. Remove a key-value pair from a `TreeMap`.
5. Iterate through all keys in a `HashMap`.
6. Iterate through all values in a `HashMap`.
7. Get the size of a `LinkedHashMap`.
8. Check if a map contains a specific value.
9. Replace a value for a specific key in a `HashMap`.
10. Create a `TreeMap` with natural ordering.

#### Medium Level
1. Count the frequency of each character in a string using `HashMap`.
2. Find the first non-repeating character using `LinkedHashMap`.
3. Merge two maps, combining values for duplicate keys.
4. Sort a `HashMap` by values.
5. Implement a two-sum problem solution using `HashMap`.
6. Group anagrams together using a map.
7. Find the top K frequent elements using `HashMap`.
8. Implement a simple cache using `LinkedHashMap`.
9. Create a map with case-insensitive keys.
10. Invert a map (swap keys and values).

#### Hard Level
1. Implement a custom `HashMap` from scratch.
2. Create an LRU cache using `LinkedHashMap`.
3. Implement a trie data structure using nested maps.
4. Build a bi-directional map (bidirectional key-value mapping).
5. Implement consistent hashing for distributed systems.
6. Create a multi-level nested map flattening utility.
7. Implement a time-based key-value store.
8. Build a concurrent hash map with lock striping.
9. Implement a probabilistic data structure (Count-Min Sketch) using maps.
10. Create a persistent map with versioning support.

### 2.4 Queue and Deque

#### Easy Level
1. Create a `Queue` using `LinkedList` and add elements.
2. Remove and retrieve the head of a queue.
3. Peek at the head of a queue without removing it.
4. Check if a queue is empty.
5. Create a `Deque` and add elements at both ends.
6. Remove elements from both ends of a `Deque`.
7. Use a `PriorityQueue` to store integers.
8. Poll all elements from a queue.
9. Add elements to a queue and check its size.
10. Create a queue of custom objects.

#### Medium Level
1. Implement a stack using two queues.
2. Implement a queue using two stacks.
3. Find the maximum element in a sliding window using `Deque`.
4. Implement a circular queue.
5. Create a priority queue with custom comparator.
6. Reverse the first K elements of a queue.
7. Implement an efficient queue that supports min/max operations.
8. Interleave the first half of a queue with the second half.
9. Generate binary numbers from 1 to N using a queue.
10. Implement breadth-first search using a queue.

#### Hard Level
1. Implement a lock-free concurrent queue.
2. Create a bounded blocking queue from scratch.
3. Implement a double-ended priority queue (min-max heap).
4. Build a k-way merge algorithm using priority queues.
5. Implement a queue with O(1) middle element access.
6. Create a persistent queue (immutable with efficient updates).
7. Implement a median-finding data structure using two priority queues.
8. Build a task scheduler using priority queues.
9. Implement a time-based priority queue.
10. Create a distributed queue with at-least-once delivery guarantees.

## 3. Streams

### 3.1 Stream Basics

#### Easy Level
1. Create a stream from a list of integers.
2. Print all elements of a stream using `forEach`.
3. Filter even numbers from a stream.
4. Count the number of elements in a stream.
5. Find the sum of all elements in a stream.
6. Convert a stream to a list.
7. Create a stream from an array.
8. Find the maximum element in a stream.
9. Find the minimum element in a stream.
10. Check if any element in a stream matches a condition.

#### Medium Level
1. Remove duplicate elements from a stream.
2. Sort a stream of strings in alphabetical order.
3. Convert all strings in a stream to uppercase.
4. Find the average of numbers in a stream.
5. Concatenate all strings in a stream with a delimiter.
6. Skip the first 5 elements and limit to the next 10.
7. Partition a stream into two groups based on a predicate.
8. FlatMap a list of lists into a single stream.
9. Find the first element that matches a condition.
10. Create an infinite stream and limit it.

#### Hard Level
1. Implement a custom collector for streams.
2. Use parallel streams to improve performance on large datasets.
3. Implement a stream pipeline with complex transformations.
4. Create a custom stream source.
5. Implement grouping and downstream collectors.
6. Build a MapReduce operation using streams.
7. Implement lazy evaluation with stream operations.
8. Create a stream with custom spliterator.
9. Optimize stream performance for memory-constrained environments.
10. Implement distributed stream processing.

### 3.2 Stream Operations (map, filter, reduce)

#### Easy Level
1. Use `map` to square all numbers in a stream.
2. Use `filter` to get all strings starting with 'A'.
3. Use `reduce` to find the sum of all integers.
4. Map a list of strings to their lengths.
5. Filter out null values from a stream.
6. Use `mapToInt` to convert objects to integers.
7. Chain multiple `filter` operations.
8. Use `reduce` to find the product of numbers.
9. Map objects to their string representations.
10. Filter elements based on multiple conditions.

#### Medium Level
1. Use `flatMap` to flatten a list of lists.
2. Implement word count using `map` and `reduce`.
3. Find the longest string using `reduce`.
4. Use `map` and `filter` to extract and transform data.
5. Implement a custom reduction operation.
6. Use `mapToDouble` for decimal calculations.
7. Chain `map`, `filter`, and `reduce` operations.
8. Find the concatenation of all strings using `reduce`.
9. Transform a stream of objects into a different type.
10. Implement conditional mapping based on predicates.

#### Hard Level
1. Implement parallel reduction with combiner functions.
2. Create a custom intermediate operation for streams.
3. Optimize stream pipelines for performance.
4. Implement stateful stream operations.
5. Build a complex ETL pipeline using streams.
6. Implement backpressure handling in stream processing.
7. Create a reusable stream operation library.
8. Implement windowed aggregations using streams.
9. Build a stream-based query engine.
10. Implement fault-tolerant stream processing.

### 3.3 Collectors

#### Easy Level
1. Collect stream elements into a list.
2. Collect stream elements into a set.
3. Join strings with a delimiter using `Collectors.joining()`.
4. Count elements using `Collectors.counting()`.
5. Find the average using `Collectors.averagingInt()`.
6. Collect elements into a map with key-value pairs.
7. Find the sum using `Collectors.summingInt()`.
8. Convert stream to an array.
9. Collect into a `LinkedList`.
10. Use `Collectors.toCollection()` for custom collections.

#### Medium Level
1. Group elements by a classifier using `Collectors.groupingBy()`.
2. Partition elements using `Collectors.partitioningBy()`.
3. Find min and max using collectors.
4. Use downstream collectors with grouping.
5. Create a frequency map using collectors.
6. Implement multi-level grouping.
7. Use `Collectors.mapping()` for transformations.
8. Collect into a concurrent map.
9. Use `Collectors.reducing()` for custom reductions.
10. Implement conditional collection.

#### Hard Level
1. Implement a custom collector from scratch.
2. Create a collector for complex aggregations.
3. Build a collector with finisher function.
4. Implement a parallel collector with proper combiners.
5. Create a collector for statistical summaries.
6. Implement a teeing collector for dual processing.
7. Build a collector for hierarchical data structures.
8. Create a memory-efficient collector for large datasets.
9. Implement a collector with short-circuiting.
10. Build a compositional collector framework.

### 3.4 Parallel Streams

#### Easy Level
1. Create a parallel stream from a list.
2. Compare sequential vs parallel stream execution time.
3. Use `parallelStream()` to process a large dataset.
4. Count elements in parallel.
5. Find the sum of elements using parallel streams.
6. Filter elements in parallel.
7. Check if parallel processing is being used.
8. Convert a sequential stream to parallel.
9. Convert a parallel stream to sequential.
10. Print elements from a parallel stream.

#### Medium Level
1. Implement thread-safe operations in parallel streams.
2. Analyze the performance benefits of parallel streams.
3. Handle thread safety issues in parallel stream operations.
4. Use `reduce` with identity and combiner for parallel execution.
5. Implement custom fork-join pool for parallel streams.
6. Debug parallel stream execution.
7. Avoid common pitfalls in parallel streams.
8. Implement aggregation in parallel streams.
9. Compare different parallel stream strategies.
10. Handle ordered vs unordered parallel streams.

#### Hard Level
1. Optimize parallel stream performance for specific hardware.
2. Implement custom spliterator for efficient parallel processing.
3. Build a work-stealing algorithm for parallel streams.
4. Analyze and fix parallel stream performance bottlenecks.
5. Implement adaptive parallelism based on data size.
6. Create a parallel stream framework for distributed systems.
7. Implement fault tolerance in parallel stream processing.
8. Build a monitoring system for parallel stream execution.
9. Optimize memory usage in parallel streams.
10. Implement dynamic parallelism adjustment based on system load.
