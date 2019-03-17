
/**
 * Recursive FFT vs. Iterative FFT
 * Final Paper
 * @author wooseok kim
 *
 */
public class Complex {

	protected double realNumber;
	protected double imaginaryNumber;
	
	public Complex() {
		
	}
	
	/**
	 * @param realNumber
	 * @param imaginaryNumber
	 */
	public Complex(double realNumber, double imaginaryNumber) {
		this.realNumber = realNumber;
		this.imaginaryNumber = imaginaryNumber;
	}
	
	/**
	 * @param c
	 * @return new Complex(addRealNum, addImaginaryNum)
	 */
	public Complex add(Complex c) {
		double addRealNum = realNumber + c.realNumber;
		double addImaginaryNum = imaginaryNumber + c.imaginaryNumber;
		return new Complex(addRealNum, addImaginaryNum);
	}
	
	/**
	 * @param c
	 * @return new Complex(subRealNum, subImaginaryNum)
	 */
	public Complex subtract(Complex c) {
		double subRealNum = realNumber - c.realNumber;
		double subImaginaryNum = imaginaryNumber - c.imaginaryNumber;
		return new Complex(subRealNum, subImaginaryNum);
	}
	
	/**
	 * @param c
	 * @return new Complex(realNum, imaginaryNum)
	 */
	public Complex multiplication(Complex c) {
		double realNum = (realNumber * c.realNumber) - (imaginaryNumber * c.imaginaryNumber);
		double imaginaryNum = (realNumber * c.realNumber) + (imaginaryNumber * c.imaginaryNumber);
		return new Complex(realNum, imaginaryNum);
	}
	

	/**
	 * @return the realNumber
	 */
	public double getRealNumber() {
		return realNumber;
	}

	/**
	 * @param realNumber the realNumber to set
	 */
	public void setRealNumber(double realNumber) {
		this.realNumber = realNumber;
	}

	/**
	 * @return the imaginaryNumber
	 */
	public double getImaginaryNumber() {
		return imaginaryNumber;
	}

	/**
	 * @param imaginaryNumber the imaginaryNumber to set
	 */
	public void setImaginaryNumber(double imaginaryNumber) {
		this.imaginaryNumber = imaginaryNumber;
	}
	
	
}
