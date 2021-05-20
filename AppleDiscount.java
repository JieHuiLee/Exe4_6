package Exe4_6;

class AppleDiscount implements Discount{
	public double rateOfDiscount() { //same method as in rateOfDiscount
		return 0.08;//with body
	}
}//end class AppleDiscount


class MangoDiscount implements Discount{ 
	public double rateOfDiscount() { //same method as in rateOfDiscount
		return 0.10;//with body
	}
} //end class MangoDiscount
	

class BlueberryDiscount implements Discount{ 
	public double rateOfDiscount() { //same method as in rateOfDiscount
		return 0.15;//with body
	}
}//end class BlueberryDiscount
