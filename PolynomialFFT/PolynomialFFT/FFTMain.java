
/**
 * Recursive FFT vs. Iterative FFT
 * Final Paper
 * @author wooseok kim
 *
 */
public class FFTMain {

	/**
	 * Run Recursive version
	 * @param coefficient
	 */
	static void RecursiveRunTime(int coefficient) {
		long startTime, endTime, avgRecTime = 0;

		for (int i = 0; i < 10; ++i) {
			startTime = System.currentTimeMillis();
			FFTRecursive FFTRec = new FFTRecursive();
			FFTRec.run(coefficient);
			endTime = System.currentTimeMillis() - startTime;
			avgRecTime = avgRecTime + endTime;
		}

		System.out.println("FFT Recursion Average Time of " + coefficient + ": " + avgRecTime / 10);
	}
	
	/**
	 * Run Iterative version
	 * @param coefficient
	 */
	static void IterativeRunTime(int coefficient) {
		long startTime, endTime, avgRecTime = 0;

		for (int i = 0; i < 10; ++i) {
			startTime = System.currentTimeMillis();
			FFTIterative FFTIter = new FFTIterative();
			FFTIter.run(coefficient);
			endTime = System.currentTimeMillis() - startTime;
			avgRecTime = avgRecTime + endTime;
		}

		System.out.println("FFT Iteration Average Time of " + coefficient + ": " + avgRecTime / 10);
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Recursive version
		for(int i=10;i<17;++i)
			RecursiveRunTime((int) Math.pow(2, i));
		
		System.out.println();
		
		// Iterative version
		for(int i=10;i<17;++i)
			IterativeRunTime((int) Math.pow(2, i));
	}

}
