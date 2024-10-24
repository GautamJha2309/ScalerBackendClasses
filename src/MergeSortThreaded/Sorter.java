package MergeSortThreaded;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;

    Sorter(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() == 1) {
            return arrayToSort;
        }

        int mid = arrayToSort.size() / 2;
//        List<Integer> leftArray = arrayToSort.subList(0, mid);
//        List<Integer> rightArray = arrayToSort.subList(mid, arrayToSort.size());
//                              OR
        List<Integer> leftArray = new ArrayList<Integer>();
        List<Integer> rightArray = new ArrayList<Integer>();
        for(int i = 0; i < mid; i++) {
            leftArray.add(arrayToSort.get(i));
        }
        for(int i = mid + 1; i < arrayToSort.size(); i++) {
            rightArray.add(arrayToSort.get(i));
        }

        Sorter leftArraySorter = new Sorter(leftArray);
        Sorter rightArraySorter = new Sorter(rightArray);

//        Execute mergeSort via Threads
        ExecutorService ex = Executors.newFixedThreadPool(2);
//        callable : submit
//        runnable: execute

//        It will return future
        Future<List<Integer>> leftArrayFuture = ex.submit(leftArraySorter);
        Future<List<Integer>> rightArrayFuture = ex.submit(rightArraySorter);

        List<Integer> sortedLeftArray = leftArrayFuture.get();
        List<Integer> sortedRightArray = rightArrayFuture.get();

//        We have to wait for both the threads to get completed
//        Merge both list


        return mergeSortedArray(sortedLeftArray, sortedRightArray);
    }

    // Method to merge two sorted lists
    private List<Integer> mergeSortedArray(List<Integer> left, List<Integer> right) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        // Merge the two sorted lists into one sorted list
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                mergedList.add(left.get(i));
                i++;
            } else {
                mergedList.add(right.get(j));
                j++;
            }
        }

        // If there are remaining elements in the left list, add them
        while (i < left.size()) {
            mergedList.add(left.get(i));
            i++;
        }

        // If there are remaining elements in the right list, add them
        while (j < right.size()) {
            mergedList.add(right.get(j));
            j++;
        }

        return mergedList;
    }
}
