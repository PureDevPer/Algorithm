
/**
 * Main Class
 * @author Wooseok Kim
 * 
 */
public class QuickMain {
	
	/**
	 * Calculate the average of the number of comparisons
	 * @param arr
	 * @return avg
	 */
	public static double avgComp(int arr[]){
		double avg;
		int tmp = 0;
		
		for(int i=0; i<arr.length; ++i){
			tmp = tmp + arr[i];
		}
		avg = tmp/arr.length;
		return avg;
	}

	/**
	 * Random Integer Number Generator
	 * @return ran
	 * 
	 */
	public static int RandomIntGen(){
		// 0-99
		int ran = (int)(Math.random()*100);
		return ran;
	}


	/**
	 * Run all the algorithms
	 * @param arr
	 * 
	 */
	public static void run(int arr[][]){
		int i,j;
		int origin[] = new int[1000];
		int basicQuicksort[] = new int[1000];
		int basicQuicksort_Rev[] = new int[1000];
		int randomPivot[] = new int[1000];
		int randomPivot_Rev[] = new int[1000];
		int medianOfThree[] = new int[1000];
		int medianOfThree_Rev[] = new int[1000];
		
		int cnt_basicQuicksort[] = new int[10];
		int cnt_basicQuicksort_Rev[] = new int[10];
		int cnt_ramdomPivot[] = new int[10];
		int cnt_randomPivot_Rev[] = new int[10];
		int cnt_medianOfThree[] = new int[10];
		int cnt_medianOfThree_Rev[] = new int[10];
		
		BasicQuicksort bq = new BasicQuicksort();
		BasicQuicksort_Rev bqRev = new BasicQuicksort_Rev();
		RandomPivot rp = new RandomPivot();
		RandomPivot_Rev rp_rev = new RandomPivot_Rev();
		MedianOfThree mt = new MedianOfThree();
		MedianOfThree_Rev mt_rev = new MedianOfThree_Rev();
		
		
		for(i=0; i<10; ++i){
			for(j=0; j<1000; ++j){
				origin[j] = arr[i][j];
				basicQuicksort[j] = arr[i][j];
				basicQuicksort_Rev[j] = arr[i][j];
				randomPivot[j] = arr[i][j];
				randomPivot_Rev[j] = arr[i][j];
				medianOfThree[j] = arr[i][j];
				medianOfThree_Rev[j] = arr[i][j];
			}
			
			cnt_basicQuicksort[i] = bq.numCount();
			cnt_basicQuicksort_Rev[i] = bqRev.numCount();
			cnt_ramdomPivot[i] = rp.numCount();
			cnt_randomPivot_Rev[i] = rp_rev.numCount();
			cnt_medianOfThree[i] = mt.numCount();
			cnt_medianOfThree_Rev[i] = mt_rev.numCount();
			
			System.out.println("*** " + (i+1) + " ***");
			
			System.out.println("*** Original List ***");
			printOutput(origin);
			
			bq.bqSort(basicQuicksort, 0, basicQuicksort.length-1);
			System.out.println("*** Basic QuickSort ***");
			printOutput(basicQuicksort);
			System.out.println("The number of comparisons: " + cnt_basicQuicksort[i]);
			
			bqRev.bqSort_Rev(basicQuicksort_Rev, 0, basicQuicksort_Rev.length-1);
			System.out.println("*** Basic QuickSort Reversed ***");
			printOutput(basicQuicksort_Rev);
			System.out.println("The number of comparisons: " + cnt_basicQuicksort_Rev[i]);
			
			rp.randomSort(randomPivot, 0, randomPivot.length-1);
			System.out.println("*** Random Pivot ***");
			printOutput(randomPivot);
			System.out.println("The number of comparisons: " + cnt_ramdomPivot[i]);
			
			rp_rev.randomSort(randomPivot_Rev, 0, randomPivot_Rev.length-1);
			System.out.println("*** Random Pivot Reversed ***");
			printOutput(randomPivot_Rev);
			System.out.println("The number of comparisons: " + cnt_randomPivot_Rev[i]);
			
			mt.mtSort(medianOfThree, 0, medianOfThree.length-1);
			System.out.println("*** Median Of Three Pivot ***");
			printOutput(medianOfThree);
			System.out.println("The number of comparisons: " + cnt_medianOfThree[i]);
			
			mt_rev.mtSort(medianOfThree_Rev, 0, medianOfThree_Rev.length-1);
			System.out.println("*** Median Of Three Pivot Reversed***");
			printOutput(medianOfThree_Rev);
			System.out.println("The number of comparisons: " + cnt_medianOfThree_Rev[i]);
			
			System.out.println("\n\n");
		}
		
		System.out.println("The Average of the number of comparisons");
		System.out.println("\tBasic Quicksort: " + avgComp(cnt_basicQuicksort));
		System.out.println("\tBasic Quicksort Reverse: " + avgComp(cnt_basicQuicksort_Rev));
		System.out.println("\tRandom Pivot Point: " + avgComp(cnt_ramdomPivot));
		System.out.println("\tRandom Pivot Point Reverse: " + avgComp(cnt_randomPivot_Rev));
		System.out.println("\tMedian Of Three Pivot: " + avgComp(cnt_medianOfThree));
		System.out.println("\tMedian Of Three Pivot Reverse: " + avgComp(cnt_medianOfThree_Rev));
	}
	

	/**
	 * Display Output
	 * @param arr
	 * 
	 */
	public static void printOutput(int arr[]){
		int n = arr.length;
		for(int i=0; i<n; ++i){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[10][1000];
		int i,j;
		
		// Make Random Integer Number
		for(i=0; i<10; ++i){
			for(j=0; j<1000; ++j){
				arr[i][j] = RandomIntGen();
			}
		}
		
		// Run the program
		run(arr);
		
	}

}
