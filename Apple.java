package Exe4_6;

import java.text.DecimalFormat;

public class Apple extends Fruit {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	protected double price,d;//p,discount
	protected int quantity;//q
	
	public Apple(String name, double p,int q) { //constructor with 3 arguments
		super(name); 
		this.price = p;	
		this.quantity = q; 	
		
		System.out.println(name);
		//System.out.println("Apple constructor is invoked");
		
		TotalPrice aTP = new AppleTotalPrice();
		TotalPrice mTP  =new MangoTotalPrice();
		TotalPrice bTP = new BlueberryTotalPrice();
	
		
		if (this.quantity < 8) {
			double tP = price * quantity; //formula to calculate the totalPrice(tP)
			System.out.println("If quantity LESS than 8, Total price: RM " + df2.format(tP));
		}
		   
		else if (this.quantity > 8 && this.quantity < 50) {
            //calculate the total price for each fruits with totalPrice(int qq)
			
			if(name == "Apple"|| name == "Red Apple" || name == "Green Apple"){
				System.out.println("If quantity MORE than 8, Total Price: RM" + df2.format(aTP.totalPrice(q)));
			
			} else if(name == "Mango") {
				System.out.println("If quantity MORE than 8, Total Price: RM" + df2.format(mTP.totalPrice(q)));
				
			} else if(name== "Blueberry"){
				System.out.println("If quantity MORE than 8, Total Price: RM" + df2.format(bTP.totalPrice(q)));
		
			} else {
				System.out.println("There is no more discount!!!"); //No any discount
			}
			System.out.println("You can get FREE Shipping!");
		}
		else { //else if (this.quantity >50){
			//calculate the total price for each fruits with totalPrice(int qq, double d)
			
			if(name == "Apple"|| name == "Red Apple" || name == "Green Apple"){
				Discount dA = new AppleDiscount(); //create new object for Apple
				d = dA.rateOfDiscount();
				System.out.println("If quantity MORE than 50, Total Price (after discount): RM" + df2.format(aTP.totalPrice(q,d)));
				System.out.println("You can get FREE Shipping and earn up to 50 Shoppee Coin!!!");
				
			} else if(name == "Mango") {
				Discount dM = new MangoDiscount(); //create new object for Mango
				d = dM.rateOfDiscount();
				System.out.println("If quantity MORE than 50, Total Price (after discount): RM" + df2.format(mTP.totalPrice(q,d)));
				System.out.println("You can get FREE Shipping and earn up to 50 Shoppee Coin!!!");
				
			} else if(name== "Blueberry"){
				Discount dB = new BlueberryDiscount(); //create new object for Blueberry
				d = dB.rateOfDiscount();
				System.out.println("If quantity MORE than 50, Total Price (after discount): RM" + df2.format(bTP.totalPrice(q,d)));
				System.out.println("You can get FREE Shipping and earn up to 50 Shoppee Coin!!!");
		} 	
		else 
			System.out.println("There is no more discount!!!"); //No any discount
	    }
	}
    
	public String toString() { //overriding method
		return "\nPrice per pcs: RM "+ price
		      +"\nQuantity     : " + quantity + " pcs"
		      +"\nYou can get discount about " + d + " %!"
			  +"\nThe " + name + " is 100% PURE!\n";
	}
	
}// end for class Apple extends

