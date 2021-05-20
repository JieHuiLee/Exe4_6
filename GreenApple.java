package Exe4_6;

public class GreenApple extends Apple { //sub class of Apple
	private String taste;//t
	private double pHValue;//pH
		
	public GreenApple(String name, double p,int q, String t, double pH) { //constructor for sub class with 5 arguments
		super(name,p,q);
		this.taste = t;	
		this.pHValue = pH;	
	}	

	public String getTaste() { //taste of greenApple
		return this.taste;
	}
		
	public double getpHValue() { //pHValue of greenApple
		return this.pHValue;
	 }		
	
	public String toString() {//overriding method
		return super.toString()
		    + "\nTaste\t: "+ getTaste()
			+ "\npH Value: "+ getpHValue() +"\n";			
	}
		
} // end for class GreenApple extends
