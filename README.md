# Two Sum Problem

## Description
This Java program finds two indices in an array such that the numbers at these indices sum up to a given target. The problem follows the classic "Two Sum" approach.

## Implementation Details
- The `twoSum` method iterates through the array and checks all pairs of numbers.
- It returns the indices of the two numbers that sum up to the target.
- If no such pair is found, an empty array is returned.

## Usage
1. Create an instance of the `Solution` class.
2. Call the `twoSum` method with an array of integers and a target sum.
3. The method returns an array containing the indices of the two numbers.

## Example
```java
Solution obj = new Solution();
int[] numbers = {2, 7, 11, 15};
int target = 17;
int[] result = obj.twoSum(numbers, target);
System.out.println("[" + result[0] + ", " + result[1] + "]");
```

### Output
```
[0, 3]
```

## Complexity Analysis
- **Time Complexity:** O(n²) in the worst case since it iterates through all pairs.
- **Space Complexity:** O(1) as no extra space is used apart from the output array.

## Improvements
- A HashMap-based approach can reduce the time complexity to O(n).

## Author
Aditya Chatterjee

