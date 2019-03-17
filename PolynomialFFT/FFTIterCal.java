
/**
 * Recursive FFT vs. Iterative FFT
 * Final Paper
 * @author wooseok kim
 *
 */
public class FFTIterCal {

	/**
	 * Reverse Bit Initialization
	 * @param ReverseBitArray
	 * @param logN
	 */
	public void ReverseBitInit(int[] ReverseBitArray, int logN) {
		for (int a = 0; a < ReverseBitArray.length; a++) {
			ReverseBitArray[a] = ReverseBit(a, logN);
		}
	}


	/**
	 * Shuffling of the bits
	 * @param i
	 * @param k
	 * @return ReverseBit(i / 2, k - 1)
	 */
	public int ReverseBit(int i, int k) {
		if (k == 0)
			return i;
		if (i % 2 == 1)
			return (int) (Math.pow(2, k - 1) + ReverseBit(i / 2, k - 1));
		else
			return ReverseBit(i / 2, k - 1);
	}


	/**
	 * Calculate itertive FFT
	 * @param a
	 * @param length
	 * @param omega
	 * @param rbsArray
	 * @param logN
	 * @return com[logN]
	 */
	public Complex[] FFTmultiplication(Complex[] a, int length, Complex[] omega, int[] rbsArray, int logN) {
		Complex[][] com = new Complex[logN + 1][length];

		for (int q = 0; q < length; q++) {
			com[0][rbsArray[q]] = new Complex(a[q].realNumber, a[q].imaginaryNumber);
		}

		int pow = length / 2;
		int size = 2;
		Complex odd = new Complex();
		for (int q = 1; q <= logN; q++) {
			for (int w = 0; w < length; w += size) {
				for (int e = 0; e < size / 2; e++) {
					com[q][e + w] = com[q - 1][e + w].add(odd);
					com[q][w + e + size / 2] = com[q - 1][e + w].subtract(odd);
				}
			}
			pow = pow / 2;
			size = size * 2;
		}
		return com[logN];
	}

}
