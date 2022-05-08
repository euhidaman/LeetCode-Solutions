**Pascal's Triangle**-->
Given an integer `numRows`, return the first numRows of **Pascal's triangle**.
In **Pascal's triangle**, each number is the sum of the two numbers directly above it.
​
Example-->
```
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
```
​
**My JAVA code **-->
```
class Solution {
public List<List<Integer>> generate(int numRows) {
// create a list of lists called 'triangle'
List<List<Integer>> triangle = new ArrayList<>();
// If the number of rows is 0, thn return empty triangle
if(numRows == 0)
return triangle;
// Create the first row of the triangle, and it will always have 1
List<Integer> first_row = new ArrayList<>();
first_row.add(1);  // So, add 1 to the first row