
/**
 * Basic Quicksort reverse version
 * @author Wooseok Kim
 *
 */
public class BasicQuicksort_Rev {

	static int count = 0;
	
	/**
	 * The number of comparison done
	 * @return count
	 */
	public int numCount(){
		return count;
	}
	
	/**
	 * The key to the algorithm is partition
	 * which rearranges the subarray arr[p..r] in place
	 * @param arr
	 * @param p
	 * @param r
	 * @return i+1
	 */
	public int partition_Rev(int arr[], int p, int r){
		// x is pivot
		int x = arr[r];
		int i = p-1;
		
		for(int j=p; j<r; ++j){
			if(arr[j] > x){
				++i;
				
				// exchange arr[i] with arr[j]
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			++count;
		}
		
		// exchange arr[i+1] with A[r]
		int tmp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = tmp;
		
		return i+1;
	}
	
	/**
	 * Divide: Partition the array arr[p...r] into two (possibly empty) 
	 * subarray arr[p...q-1] and arr[q+1...r]
	 * 
	 * Conquer: Sort the two subarrays arr[p..q-1] and arr[q+1..r] by recursive calls
	 * @param arr
	 * @param p
	 * @param r
	 */
	public void bqSort_Rev(int arr[], int p, int r){
		if(p<r){
			// q is partitioning index
			int q = partition_Rev(arr, p, r);
			
			bqSort_Rev(arr, p, q-1);
			bqSort_Rev(arr, q+1, r);
		}
	}

}
