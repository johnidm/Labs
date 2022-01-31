Insertion Sort is a simple sorting technique which was covered in previous challenges. Sometimes, arrays ay be too large for us to wait around for insertion sort to finish. Is there some other way we can calculate the number of shifts an insertion sort performs when sorting an array?
If k[i] is the number of elements over which the ith element of the array has to shift, then the total number of shifts will be k[1] + k[2] + .... + k[n] .

Example:
```
| Array     | Shifts |
|-----------|--------|
| [4,3,2,1] |        |
| [3,4,2,1] | 1      |
| [2,3,4,1] | 2      |
| [1,2,3,4] | 3      |

```