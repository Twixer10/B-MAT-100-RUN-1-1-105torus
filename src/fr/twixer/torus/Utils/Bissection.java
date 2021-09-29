package fr.twixer.torus.Utils;

public class Bissection {

	int coef0;
	int coef1;
	int coef2;
	int coef3;
	int coef4;
	double pt_one;
	double pt_two;
	double xm_one;
	double xm_two;
	double xm;
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
	public void setPrecision(int precision) {
		this.precision = precision;
	}
	public int getPrecision() {
		return precision;
	}
	public double getPt_one() {
		return pt_one;
	}
	public void setPt_one(double pt_one) {
		this.pt_one = pt_one;
	}
	public double getPt_two() {
		return pt_two;
	}
	public void setPt_two(double pt_two) {
		this.pt_two = pt_two;
	}
	public double getXm_one() {
		return xm_one;
	}
	public void setXm_one(double xm_one) {
		this.xm_one = xm_one;
	}
	public double getXm_two() {
		return xm_two;
	}
	public void setXm_two(double xm_two) {
		this.xm_two = xm_two;
	}
	public double getXm() {
		return xm;
	}
	public void setXm(double xm) {
		this.xm = xm;
	}

	public Bissection(int coef0, int coef1, int coef2, int coef3, int coef4, double pt_one, double pt_two,
			double xm_one, double xm_two, double xm, int precision) {
		super();
		this.coef0 = coef0;
		this.coef1 = coef1;
		this.coef2 = coef2;
		this.coef3 = coef3;
		this.coef4 = coef4;
		this.pt_one = pt_one;
		this.pt_two = pt_two;
		this.xm_one = xm_one;
		this.xm_two = xm_two;
		this.xm = xm;
		this.precision = precision;
	}
	
	public void exe() {
		for (int i = 1; i < 300; ++i) {
			xm = (this.pt_one + this.pt_two) / 2;
			if (i <= this.precision)
				System.out.printf("x = %." + i + "f\n", xm);
			else
				System.out.printf("x = %." + this.precision + "f\n", xm);
			this.xm_one = (this.coef4 * Math.pow(xm, 4)) + (this.coef3 * Math.pow(xm, 3)) + (this.coef2 * Math.pow(xm, 2)) + (this.coef1 * xm) + this.coef0;
			this.xm_two = (this.coef4 * Math.pow(pt_one, 4)) + (this.coef3 * Math.pow(pt_one, 3)) + (this.coef2 * Math.pow(pt_one, 2)) + (this.coef1 * pt_one) + this.coef0;
			if (xm_two * xm_one < 0)
				pt_two = xm;
			else
				pt_one = xm;
			if (Math.round(pt_one * Math.pow(10, this.precision)) == Math.round(pt_two * Math.pow(10, this.precision)))
				break;
		}
	}

}
