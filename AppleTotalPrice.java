package Exe4_6;

class AppleTotalPrice implements TotalPrice{
 
	double a = 15.00; //if user buy more than 8 but less than 50,the price for apple will be 15.00
	double aA = 10.00 ;//if user buy more than 50, the price for apple will be 10.00
	
	public double totalPrice(int qq) {
		return a * qq;
	}
	
	public double totalPrice(int qq,double d) {
		return (aA * qq) * (1-d);
    }
}

class MangoTotalPrice implements TotalPrice{
	double m = 22.00;//if user buy more than 8 but less than 50,the price for apple will be 22.00
	double mM = 18.00;//if user buy more than 50, the price for apple will be 18.00
	
	public double totalPrice(int qq) {
		return m * qq;
	}
	
	public double totalPrice(int qq,double d) {
		return (mM * qq) * (1-d);
	}
}


class BlueberryTotalPrice implements TotalPrice{
	double b = 20.00 ;//if user buy more than 8 but less than 50,the price for apple will be 20.00
	double bB = 15.10 ;//if user buy more than 50, the price for apple will be 15.10
	
	public double totalPrice(int qq) {
		return b * qq;
	}
	
	public double totalPrice(int qq, double d) {
		return (bB * qq) * (1-d);
	}
}
