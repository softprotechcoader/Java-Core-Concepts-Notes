Sure! Here are some Java coding problems covering various string manipulation topics:

### Basic String Operations
1. **Reverse a String**
    - **Problem**: Write a function to reverse a given string.
    - **Example**: `Input: "hello"`, `Output: "olleh"`

2. **Check for Palindrome**
    - **Problem**: Determine if a string is a palindrome.
    - **Example**: `Input: "madam"`, `Output: true`

3. **Count Vowels and Consonants**
    - **Problem**: Count the number of vowels and consonants in a string.
    - **Example**: `Input: "hello"`, `Output: Vowels = 2, Consonants = 3`

4. **Remove Duplicate Characters**
    - **Problem**: Remove all duplicate characters from a string.
    - **Example**: `Input: "banana"`, `Output: "ban"`

5. **Check Anagrams**
    - **Problem**: Check if two strings are anagrams of each other.
    - **Example**: `Input: "listen", "silent"`, `Output: true`

6. **String Permutations**
    - **Problem**: Generate all permutations of a given string.
    - **Example**: `Input: "abc"`, `Output: ["abc", "acb", "bac", "bca", "cab", "cba"]`

7. **String Subsets**
    - **Problem**: Generate all subsets of a given string.
    - **Example**: `Input: "abc"`, `Output: ["", "a", "b", "c", "ab", "ac", "bc", "abc"]`

### Searching and Matching
8. **Find Substring**
    - **Problem**: Find the first occurrence of a substring within a string.
    - **Example**: `Input: "hello", "ll"`, `Output: 2`

9. **Count Substring Occurrences**
    - **Problem**: Count the number of times a substring appears in a string.
    - **Example**: `Input: "banana", "ana"`, `Output: 1`

10. **Longest Common Prefix**
    - **Problem**: Find the longest common prefix among a set of strings.
    - **Example**: `Input: ["flower","flow","flight"]`, `Output: "fl"`

11. **Longest Common Subsequence**
    - **Problem**: Find the longest common subsequence between two strings.
    - **Example**: `Input: "abcde", "ace"`, `Output: "ace"`

12. **String Matching (KMP Algorithm)**
    - **Problem**: Implement the Knuth-Morris-Pratt algorithm for string matching.
    - **Example**: `Input: "abxabcabcaby", "abcaby"`, `Output: 6`

13. **Find All Anagrams**
    - **Problem**: Find all anagrams of a string within another string.
    - **Example**: `Input: "cbaebabacd", "abc"`, `Output: [0, 6]`

### String Modifications
14. **Remove Spaces**
    - **Problem**: Remove all spaces from a string.
    - **Example**: `Input: "hello world"`, `Output: "helloworld"`

15. **Replace Characters**
    - **Problem**: Replace all occurrences of a character with another character in a string.
    - **Example**: `Input: "hello", 'l', 'y'`, `Output: "heyyo"`

16. **Compress String**
    - **Problem**: Compress a string using the counts of repeated characters.
    - **Example**: `Input: "aabcccccaaa"`, `Output: "a2b1c5a3"`

17. **Expand String**
    - **Problem**: Expand a compressed string.
    - **Example**: `Input: "a2b1c5a3"`, `Output: "aabcccccaaa"`

18. **Remove Given Character**
    - **Problem**: Remove a given character from a string.
    - **Example**: `Input: "hello", 'l'`, `Output: "heo"`

19. **Remove Special Characters**
    - **Problem**: Remove all special characters from a string.
    - **Example**: `Input: "he@llo!# "`, `Output: "hello"`

20. **URLify**
    - **Problem**: Replace all spaces in a string with `%20`.
    - **Example**: `Input: "Mr John Smith"`, `Output: "Mr%20John%20Smith"`

### Parsing and Tokenization
21. **Split String**
    - **Problem**: Split a string based on a given delimiter.
    - **Example**: `Input: "hello,world,java", ','`, `Output: ["hello", "world", "java"]`

22. **Count Words**
    - **Problem**: Count the number of words in a string.
    - **Example**: `Input: "Hello world"`, `Output: 2`

23. **Extract Numbers**
    - **Problem**: Extract all numbers from a string.
    - **Example**: `Input: "I have 2 apples and 3 bananas"`, `Output: [2, 3]`

24. **Extract Emails**
    - **Problem**: Extract all email addresses from a string.
    - **Example**: `Input: "Contact us at support@example.com and sales@example.com"`, `Output: ["support@example.com", "sales@example.com"]`

25. **Extract Unique Words**
    - **Problem**: Extract all unique words from a string.
    - **Example**: `Input: "hello world hello"`, `Output: ["hello", "world"]`

26. **Parse CSV**
    - **Problem**: Parse a CSV (Comma-Separated Values) string.
    - **Example**: `Input: "name,age,city\nJohn,30,New York\nJane,25,Los Angeles"`, `Output: [["name", "age", "city"], ["John", "30", "New York"], ["Jane", "25", "Los Angeles"]]`

### Advanced String Problems
27. **Longest Palindromic Substring**
    - **Problem**: Find the longest palindromic substring in a given string.
    - **Example**: `Input: "babad"`, `Output: "bab"`

28. **Longest Substring Without Repeating Characters**
    - **Problem**: Find the longest substring without repeating characters.
    - **Example**: `Input: "abcabcbb"`, `Output: "abc"`

29. **Zigzag Conversion**
    - **Problem**: Convert a given string to a zigzag pattern on a given number of rows.
    - **Example**: `Input: "PAYPALISHIRING", 3`, `Output: "PAHNAPLSIIGYIR"`