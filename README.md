# Bubble Sort Project

This project demonstrates Bubble Sort in Java and compares the execution time between the best-case and worst-case scenarios for an array of 1000 elements.

## Project Objective
The program generates two arrays:
- Best Case: already sorted in ascending order
- Worst Case: sorted in descending order

Then it measures the execution time of the Bubble Sort algorithm for each scenario and prints the result.

## Comparison Table

| Scenario | Input Order | Time Complexity | Comparisons | Swaps | Expected Behavior |
|----------|--------------|-----------------|-------------|-------|-------------------|
| Best Case | Ascending | O(n) | ~n | 0 | Very fast, because the algorithm stops early when no swaps occur |
| Worst Case | Descending | O(n²) | ~n(n-1)/2 | ~n(n-1)/2 | Much slower because each comparison may require a swap |

## Example Execution Output

```text
Scenario        Time (ms)
Best Case       1.234
Worst Case      48.765
```

## Chart

```text
Best Case  ██████   ~1.2 ms
Worst Case ██████████████████   ~48.7 ms
```

## Why the Difference?
Bubble Sort is efficient in the best case because it exits early when the array is already sorted. In the worst case, the nested loops must run almost completely, which leads to a quadratic number of comparisons and swaps.

## Java Code Idea

```java
int[] bestCase = new int[1000];
int[] worstCase = new int[1000];

for (int i = 0; i < 1000; i++) {
    bestCase[i] = i;       // Best Case
    worstCase[i] = 1000 - i; // Worst Case
}
```

Then measure time with:

```java
long start = System.nanoTime();
bubbleSort(bestCase);
long end = System.nanoTime();
```

## Summary
The main result is that Bubble Sort performs much better on already sorted input than it does on reverse-sorted input. This is a classic example of how input order affects algorithm performance.
