
/**
 * Recursive FFT vs. Iterative FFT
 * Final Paper
 * @author wooseok kim
 *
 */
public class FFTRecCal {

	/**
	 * Divide the polynomial into two arrays regarding odd and even indices
	 * @param a
	 * @param start
	 * @return split
	 */
	public Complex[] split(Complex[] a, int start) {

		Complex[] split = new Complex[a.length / 2];
		int i = 0;
		while (start < a.length) {
			split[i] = a[start];
			start = start + 2;
			i++;
		}

		return split;
	}


	/**
	 * Calculate the fourier transform
	 * @param a
	 * @param length
	 * @param pow
	 * @param omega
	 * @return f
	 */
	public Complex[] FFTmultiplication(Complex[] a, int length, int pow, Complex[] omega) {
		if (length == 1) {
			return a;
		}

		Complex[] a0Even = split(a, 0);
		Complex[] a1Odd = split(a, 1);

		// recursion
		Complex[] fftEven = FFTmultiplication(a0Even, length / 2, 2 * pow, omega);
		Complex[] fftOdd = FFTmultiplication(a1Odd, length / 2, 2 * pow, omega);
		Complex[] f = new Complex[length];
		// combining the solution
		for (int i = 0; i < length / 2; i++) {
			Complex temp = omega[i * pow].multiplication(fftOdd[i]);
			f[i] = fftEven[i].add(temp);
			f[i + (length / 2)] = fftEven[i].subtract(temp);

		}
		return f;
	}

}
