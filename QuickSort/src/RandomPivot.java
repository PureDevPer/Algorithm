
/**
 * Random Pivot Point
 * @author Wooseok Kim
 *
 */
public class RandomPivot {

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
	public static int partition(int arr[], int p, int r){
		// x is pivot
		int x = arr[r];
		int i = p-1;
		for(int j=p; j<r; ++j){
			if(arr[j] <= x){
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
	 * By randomly sampling the range p, ..., r,
	 * the pivot element i = arr[r] is equally likely to be any of the r-p+1 elements 
	 * in the subarray
	 * 
	 * @param arr
	 * @param p
	 * @param r
	 * @return partition(arr, p, r)
	 */
	public static int randomPartition(int arr[], int p, int r){
		
		int i = (int)(Math.random()*(r-p+1)+p);
		
		// exchange arr[r] with arr[i]
		int tmp = arr[r];
		arr[r] = arr[i];
		arr[i] = tmp;
		
		return partition(arr, p, r);
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
	public void randomSort(int arr[], int p, int r){
		if (p<r){
			int q = randomPartition(arr, p, r);
			
			randomSort(arr, p, q-1);
			randomSort(arr, q+1, r);
		}
	}
}
