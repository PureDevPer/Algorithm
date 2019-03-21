
/**
 * Median-of-three Partitioning 
 * using Dutch National Flag Problem algorithm
 * 
 * @author Wooseok Kim
 *
 */
public class MedianOfThree {

	
	static int count = 0;
	
	/**
	 * The number of comparison done
	 * @return count
	 */
	public int numCount(){
		return count;
	}
	
	
	/**
	 * Partition arr[] in three parts
	 * 1. arr[1..p] - all elements < pivot
	 * 2. arr[p+1...mid-1] - all occurrences of pivot
	 * 3. arr[mid..r] - all elements > pivot
	 * 
	 * @param arr
	 * @param p
	 * @param r
	 * @return MedianOfThreePivot mtPivot
	 * 
	 */
	public static MedianOfThreePivot partition(int arr[], int p, int r){
        int mid = p;
        int x = arr[r];

        while (mid <= r) {
            if (arr[mid] > x) {
                int tmp = arr[mid];
                arr[mid] = arr[r];
                arr[r] = tmp;
                --r;
            }
            else if (arr[mid] < x) {
                int tmp = arr[p];
                arr[p] = arr[mid];
                arr[mid] = tmp;
                ++p; ++mid;
            }
            else {
                ++mid;
            }
            ++count;
        }


        MedianOfThreePivot mtPivot = new MedianOfThreePivot(p-1, mid);
        return mtPivot;
	}
	
	/**
	 * Divide: Partition the array arr[p...r] into two (possibly empty) 
	 * subarray arr[p...pivot i] and arr[pivot j...r]
	 * 
	 * Conquer: Sort the two subarrays arr[p..q-1] and arr[q+1..r] by recursive calls
	 * @param arr
	 * @param p
	 * @param r
	 */
	public void mtSort(int arr[], int p, int r){
        // base condition for 0, 1 elements
        if (p >= r) {
            return;
        }


        // Should work for 3 or more elements
        if (p - r == 1)
        {
            if (arr[p] < arr[r]) {
                int tmp = arr[p];
                arr[p] = arr[r];
                arr[r] = tmp;
            }
            return;
        }


        MedianOfThreePivot pivot = partition(arr, p, r);

        mtSort(arr, p, pivot.getI());
        mtSort(arr, pivot.getJ(), r);		
	}
}
