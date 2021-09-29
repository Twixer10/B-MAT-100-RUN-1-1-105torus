package fr.twixer.torus.Utils;

public class Newton {
	
	int coef0;
	int coef1;
	int coef2;
	int coef3;
	int coef4;
	double xn2;
	double xn_one;
	double xn_two;
	double xn;
	int precision;
	public int getCoef0() {
		return coef0;
	}
	public void setCoef0(int coef0) {
		this.coef0 = coef0;
	}
	public int getCoef1() {
		return coef1;
	}
	public void setCoef1(int coef1) {
		this.coef1 = coef1;
	}
	public int getCoef2() {
		return coef2;
	}
	public void setCoef2(int coef2) {
		this.coef2 = coef2;
	}
	public int getCoef3() {
		return coef3;
	}
	public void setCoef3(int coef3) {
		this.coef3 = coef3;
	}
	public int getCoef4() {
		return coef4;
	}
	public void setCoef4(int coef4) {
		this.coef4 = coef4;
	}
	public double getXn2() {
		return xn2;
	}
	public void setXn2(double xn2) {
		this.xn2 = xn2;
	}
	public double getXn_one() {
		return xn_one;
	}
	public void setXn_one(double xn_one) {
		this.xn_one = xn_one;
	}
	public double getXn_two() {
		return xn_two;
	}
	public void setXn_two(double xn_two) {
		this.xn_two = xn_two;
	}
	public double getXn() {
		return xn;
	}
	public void setXn(double xn) {
		this.xn = xn;
	}
	public int getPrecision() {
		return precision;
	}
	public void setPrecision(int precision) {
		this.precision = precision;
	}
	public Newton(int coef0, int coef1, int coef2, int coef3, int coef4, double xn2, double xn_one, double xn_two,
			double xn, int precision) {
		super();
		this.coef0 = coef0;
		this.coef1 = coef1;
		this.coef2 = coef2;
		this.coef3 = coef3;
		this.coef4 = coef4;
		this.xn2 = xn2;
		this.xn_one = xn_one;
		this.xn_two = xn_two;
		this.xn = xn;
		this.precision = precision;
	}
	
	public void exe() {
		for (int i = 1; i < 300; ++i) {
			this.xn_one = (this.coef4 * Math.pow(this.xn2, 4)) + (this.coef3 * Math.pow(this.xn2, 3)) + (this.coef2 * Math.pow(this.xn2, 2)) + (this.coef1 * this.xn2) + this.coef0;
			this.xn_two = (4 * (this.coef4 * Math.pow(this.xn2, 3))) + (3 * (this.coef3 * Math.pow(this.xn2, 2))) + (2 * this.coef2 * this.xn2) + this.coef1;
			if (this.xn_two == 0) {
				System.out.println("Division by zero is not possible.");
				System.exit(84);
			}
			this.xn = this.xn2 - (this.xn_one / this.xn_two);
			if (Math.round(this.xn2 * Math.pow(10, this.precision)) == Math.round(this.xn * Math.pow(10, this.precision)))
				break;
			if (i == 1)
				System.out.printf("x = %.1f\n", this.xn);
			System.out.printf("x = %." + this.precision + "f\n", this.xn);
			this.xn2 = this.xn;
		}
		System.exit(0);
	}
	

}
