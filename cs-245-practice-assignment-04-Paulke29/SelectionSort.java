public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        int n = a.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }
}
