# Sorting and Searching Algorithms Implementation

A collection of classic sorting and searching algorithms implemented in JAVA programming languages. This repository serves as both a learning resource and a reference implementation for common algorithmic patterns.

## 🚀 Algorithms Included

### Sorting Algorithms

1. **Bubble Sort**
   - Time Complexity: O(n²)
   - Space Complexity: O(1)
   - A simple comparison-based sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they're in the wrong order.

2. **Selection Sort**
   - Time Complexity: O(n²)
   - Space Complexity: O(1)
   - Works by repeatedly finding the minimum element from the unsorted portion and placing it at the beginning.

3. **Insertion Sort**
   - Time Complexity: O(n²)
   - Space Complexity: O(1)
   - Builds the final sorted array one item at a time, by repeatedly inserting a new element into the sorted portion of the array.

4. **Quick Sort**
   - Time Complexity: O(n log n) average case, O(n²) worst case
   - Space Complexity: O(log n)
   - A divide-and-conquer algorithm that works by selecting a 'pivot' element and partitioning the array around it.

5. **Radix Sort**
   - Time Complexity: O(d * n) where d is the number of digits
   - Space Complexity: O(n)
   - A non-comparative integer sorting algorithm that sorts data with integer keys by grouping by individual digits.

### Searching Algorithms

1. **Binary Search**
   - Time Complexity: O(log n)
   - Space Complexity: O(1)
   - An efficient algorithm for finding an item in a sorted list by repeatedly dividing the search range in half.

2. **Linear Search**
   - Time Complexity: O(n)
   - Space Complexity: O(1)
   - A simple search algorithm that checks each element in the list until a match is found.

## 📊 Performance Comparison

| Algorithm       | Best Case  | Average Case | Worst Case | Space Complexity |
|----------------|------------|--------------|------------|------------------|
| Bubble Sort    | O(n)       | O(n²)        | O(n²)      | O(1)            |
| Selection Sort | O(n²)      | O(n²)        | O(n²)      | O(1)            |
| Insertion Sort | O(n)       | O(n²)        | O(n²)      | O(1)            |
| Quick Sort     | O(n log n) | O(n log n)   | O(n²)      | O(log n)        |
| Radix Sort     | O(n * d)   | O(n * d)     | O(n * d)   | O(n)            |
| Binary Search  | O(1)       | O(log n)     | O(log n)   | O(1)            |
| Linear Search  | O(1)       | O(n)         | O(n)       | O(1)            |

## 🛠️ Usage

Each algorithm is implemented in its own file. To use any algorithm:

1. Import the desired algorithm file
2. Create an array/list of elements
3. Call the corresponding function with your input

Example:
```python
from sorting.bubble_sort import bubble_sort

arr = [64, 34, 25, 12, 22, 11, 90]
sorted_arr = bubble_sort(arr)
print(sorted_arr)
```

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request
