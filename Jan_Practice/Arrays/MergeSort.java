package Jan_Practice.Arrays;

public class MergeSort {

    int array[];
    int tempMergeArray[];
    int length;

    public static void main(String[] args) {
        int[] inputArray = { 48, 36, 13, 52, 19, 94, 21 };
        MergeSort ms = new MergeSort();
        ms.sortArray(inputArray);
        for (int k : inputArray) {
            System.out.print(k + " ");
        }
    }

    public void sortArray(int inputArray[]) {
        this.array = inputArray;
        this.length = inputArray.length;
        this.tempMergeArray = new int[length];
        divideArray(0, length - 1);
    }

    public void divideArray(int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            // this is for dividing the left hand side
            divideArray(start, middle);
            // this is for dividing the right hand
            divideArray(middle + 1, end);
            mergeSubArrays(start, middle, end);
        }
    }

    private void mergeSubArrays(int start, int middle, int end) {
        for (int i = start; i <= end; i++) {
            tempMergeArray[i] = array[i];
        }
        int i = start, j = middle + 1, k = start;
        while (i <= middle && j <= end) {
            if (tempMergeArray[i] <= tempMergeArray[j]) {
                array[k] = tempMergeArray[i];
                i++;
            } else {
                array[k] = tempMergeArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergeArray[i];
            k++;
            i++;
        }
    }
}
