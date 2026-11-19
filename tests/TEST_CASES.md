# Test Cases – Student Marks Analyzer

The following test cases were executed to verify the program's functionality.

| No. | Test Scenario | Expected Result | Status |
|---|---|---|---|
| 1 | Normal input with two students having the same highest marks | Correct statistics and both highest-scoring students displayed | Passed |
| 2 | Student scores 0 marks | Zero accepted as valid marks | Passed |
| 3 | Student scores 100 marks | 100 accepted as valid marks | Passed |
| 4 | Negative marks or marks above 100 | Invalid marks rejected and input requested again | Passed |
| 5 | Zero students | No students available message displayed | Passed |
| 6 | Alphabetic input instead of a number | Invalid input handled and input requested again | Passed |
| 7 | Empty student name | Empty name rejected and input requested again | Passed |

## Testing Summary

- Total test scenarios: 7
- Passed: 7
- Failed: 0

The tests cover normal operation, boundary values, invalid input, and empty data.