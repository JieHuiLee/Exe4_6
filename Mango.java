package Exe4_6;

import java.text.DecimalFormat;

public class Mango extends Apple { 
		
	private static DecimalFormat df2 = new DecimalFormat("#.##");
		
	private String region;//r
	private String color;//c
	private double vitaminC;//v
	
	public Mango(String name, double p, int q,String r,String c,double v) {//constructor for sub class with 4 arguments
		super(name,p,q);		
		this.region =r;
		this.color = c;
		this.vitaminC = v;
			
			
		switch(region) {
			case "Taiwan":			
				System.out.print(info("Taiwan","Vivid Yellow",36.4));
			break;
	    	case "Hawaii":
	    	
	    		System.out.print(info("Hawaii","Vivid Yellow", 40.2));		
			break;
			case "California ":
				
				System.out.print(info("California","Vivid Yellow",45.0));
			break;
			}
		}
		

		/*	System.out.println("You can get discount about" + dd.rateOfDiscount() + "%!"); //10%
			System.out.println("Total price (after discount): RM " + df2.format(totalPrice(pp)));
			*/
			
		public String info() { //overloading with no argument
			return "\nRegion\t: " + region
				   + "\nColor\t: " + color 
				   + "\nVitaminC: " + vitaminC +"\n";
		}
		
		public String info(String r, String c) { //overloading with 2 arguments
			return "\nRegion\t: " + r 
				   + "\nColor\t: " + c
				   + "\nVitaminC: " + vitaminC +"\n";
		}
		
		public String info(String r, String c,double v) { //overloading with 3 arguments
			return "\nRegion\t: " + r 
				  + "\nColor\t: " + c 
				  + "\nVitaminC: " + v +"\n";
		}
		
		public String toString() {//overriding method
			return "\nPrice per pcs: RM "+ price
				  +"\nQuantity     : " + quantity + " pcs"
				  +"\nYou can get discount about " + d + " %!"
				  +"\nThe " + name + " is 100% PURE!\n"
				  +"\nFunction: Mangoes are a great effective at lowering blood pressure.\n" ;
		}

	}// end for class Mango extends
