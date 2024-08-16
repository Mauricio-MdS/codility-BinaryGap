# BinaryGap

A binary gap within a positive integer `N` is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of `N`.

For example:
- The number `9` has a binary representation `1001` and contains a binary gap of length `2`.
- The number `529` has a binary representation `1000010001` and contains two binary gaps: one of length `4` and one of length `3`.
- The number `20` has a binary representation `10100` and contains one binary gap of length `1`.
- The number `15` has a binary representation `1111` and has no binary gaps.
- The number `32` has a binary representation `100000` and has no binary gaps.

## Task

Write a function:

```java
class Solution { 
    public int solution(int N); 
}
```
that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
Example

Given N = 1041, the function should return 5, because N has a binary representation 10000010001 and its longest binary gap is of length 5.

Given N = 32, the function should return 0, because N has a binary representation 100000 and thus no binary gaps.
## Assumptions

N is an integer within the range [1..2,147,483,647].

## Notes

The solution should be efficient, considering the large possible range of N.